package es.prodevelop.testar.api;

import java.io.BufferedInputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Execution {

	private static final Logger log = LoggerFactory.getLogger(Execution.class);
	
	public static void main(String[] args) {
		
		try {
			Process process = Runtime.getRuntime().exec(args);
			
			//Process process = Runtime.getRuntime().exec(command);
			InputStream inputstream = process.getInputStream();
			BufferedInputStream inputStream = new BufferedInputStream(inputstream);
			
			log.info("process output: {}", IOUtils.toString(inputStream, "UTF-8"));
			
		} catch (Exception e) {
			log.error("Error no controlado", e);
		}
	}
}
