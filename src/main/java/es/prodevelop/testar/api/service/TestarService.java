package es.prodevelop.testar.api.service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.threeten.bp.OffsetDateTime;

import es.prodevelop.testar.api.model.Params;
import es.prodevelop.testar.api.model.ReturnExecution;

@Service
public class TestarService implements ITestarService {

	private static final Logger log = LoggerFactory.getLogger(TestarService.class);
	
	@Override
	public ReturnExecution execute(Params params) throws Exception {
		
		/*
		 * testar sse=web_generic Mode=Generate Sequences=5 SequenceLength=50 
		 * 		ShowVisualSettingsDialogOnStartup=false 
		 * 		SuspiciousTitles=".*[eE]rror.*|.*[eE]xcep[ct]i[o?]n.*" 
		 */
		ReturnExecution returnExecution = new ReturnExecution();
		returnExecution.setStartDate(OffsetDateTime.now());
		
		log.info("params[{}]", params);
		
		List<String> commands = new ArrayList<>();
		
		/*commands.add("cmd");
		commands.add("/K");
		commands.add("cd");
		commands.add("c:\\testar\\bin");		
		commands.add("&&");*/
		
		commands.add("testar.bat");
		
		if (StringUtils.isNotEmpty(params.getSse())) {
			commands.add("sse="+params.getSse());
		}
		
		if (StringUtils.isNotEmpty(params.getMode())) {
			commands.add("Mode="+params.getMode());
		}
		
		if (StringUtils.isNotEmpty(params.getSutConnector())) {
			commands.add("SUTConnector="+params.getSutConnector());
		}
		
		if (StringUtils.isNotEmpty(params.getSutConnectorValue())) {
			String path = params.getSutConnectorValue();
			path = path.replace(File.separator, File.separator+File.separator);
			commands.add("SUTConnectorValue=\""+path+"\"");
		}
		
		if (params.getSequences() != null) {
			commands.add("Sequences="+params.getSequences());
		}
		
		if (params.getSequenceLength() != null) {
			commands.add("SequenceLength="+params.getSequenceLength());
		}
		
		if (StringUtils.isNotEmpty(params.getSuspiciousTitles())) {
			commands.add("SuspiciousTitles=\""+params.getSuspiciousTitles()+"\"");
		}
		
		if (StringUtils.isNotEmpty(params.getClickFilter())) {
			commands.add("ClickFilter=\""+params.getClickFilter()+"\"");
		}
		
		commands.add("ShowVisualSettingsDialogOnStartup=false");
		
		/*if (params.getTestCaseName() != null) {
			commands.add("TestCaseName="+params.getTestCaseName());
		}*/

		//TODO: sequenceFileName
		
		String[] commadsArray = commands.toArray(new String[0]);
		
		for (String string : commadsArray) {
			log.info(string);
		}		
		
		Process process = Runtime.getRuntime().exec(commadsArray);
		
		/*int exitValue = process.waitFor();
		if (exitValue != 0) {
			log.error("Abnormal process termination");
		}*/
		InputStream inputstream = process.getInputStream();
		BufferedInputStream inputStream = new BufferedInputStream(inputstream);		
		String exitmessage = IOUtils.toString(inputStream, "UTF-8");
		
		log.info("process output: {}", exitmessage);
		
		BufferedReader br = new BufferedReader(new StringReader(exitmessage));
		String line = br.readLine();		
		
		while(line != null){
         	log.info("line: {}", line);             
         	String[] words = StringUtils.split(line, " ");
         	String sequencename = "";
         	 
         	for (int i = 0; i < words.length; i++) {
         		String word = words[i];
				if ("Generate".equals(word)) {
					sequencename = words[i+1];
					log.info("found sequencename: {}", sequencename);
					returnExecution.addSequencesItem(sequencename);
				}
			}
         	line = br.readLine();
        }
			
		returnExecution.setMessage(exitmessage);		
		returnExecution.setEndDate(OffsetDateTime.now());
		return returnExecution;
	}

}
