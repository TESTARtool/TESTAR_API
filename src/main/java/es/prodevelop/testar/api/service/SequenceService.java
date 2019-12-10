package es.prodevelop.testar.api.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import es.prodevelop.testar.api.model.TestarFile;

@Service
public class SequenceService implements ISequenceService {

	private static final Logger log = LoggerFactory.getLogger(SequenceService.class);
	
	private static final String TESTAR_PATH = "C:\\testar\\bin";
	
	@Override
	public List<TestarFile> getFiles(String sequenceName) throws IOException {		
		List<TestarFile> files = new ArrayList<>();
		
		log.info("Get files of {} sequence", sequenceName);		
		TestarFile testarFile;
		
		
		File sequencelog = new File(TESTAR_PATH + "\\output\\logs\\" + sequenceName + ".log");
		if(sequencelog.exists()) {
			testarFile = new TestarFile();
			testarFile.content(FileUtils.readFileToString(sequencelog, "UTF-8"));
			testarFile.setName(sequencelog.getCanonicalPath());
			files.add(testarFile);
		}
		
		File sequenceTestar = new File(TESTAR_PATH + "\\output\\sequences\\" + sequenceName + ".testar");
		if(sequenceTestar.exists()) {
			testarFile = new TestarFile();
			testarFile.content("Replayable File");
			testarFile.setName(sequenceTestar.getCanonicalPath());
			files.add(testarFile);
		}
		
		File sequenceHtml = new File(TESTAR_PATH + "\\output\\htmls\\" + sequenceName + ".html");
		if(sequenceHtml.exists()) {
			testarFile = new TestarFile();
			testarFile.content(FileUtils.readFileToString(sequenceHtml, "UTF-8"));
			testarFile.setName(sequenceHtml.getCanonicalPath());
			files.add(testarFile);
		}
		
		
		return files;
	}

}
