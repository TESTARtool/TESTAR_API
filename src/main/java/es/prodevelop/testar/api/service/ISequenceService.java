package es.prodevelop.testar.api.service;

import java.io.IOException;
import java.util.List;

import es.prodevelop.testar.api.model.TestarFile;

public interface ISequenceService {

	public List<TestarFile> getFiles(String sequenceName) throws IOException;	
}

