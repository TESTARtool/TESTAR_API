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
		List<TestarFile> files = new ArrayList<TestarFile>();
		
		log.info("Get files of {} sequence", sequenceName);		
		TestarFile testarFile;
		
		
		File sequencelog = new File(TESTAR_PATH + "\\output\\logs\\" + sequenceName + ".log");
		if(sequencelog.exists()) {
			testarFile = new TestarFile();
			testarFile.content(FileUtils.readFileToByteArray(sequencelog));
			testarFile.setName(sequencelog.getName());
			files.add(testarFile);
		}
		
		File sequence = new File(TESTAR_PATH + "\\output\\sequences\\" + sequenceName);
		if(sequence.exists()) {
			testarFile = new TestarFile();
			testarFile.content(FileUtils.readFileToByteArray(sequence));
			testarFile.setName(sequence.getName());
			files.add(testarFile);
		}
		
		//TODO: HTML FILE
		
		
		return files;
	}

}
