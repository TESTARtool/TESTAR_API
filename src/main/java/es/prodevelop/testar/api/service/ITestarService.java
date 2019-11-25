package es.prodevelop.testar.api.service;

import es.prodevelop.testar.api.model.Params;
import es.prodevelop.testar.api.model.ReturnExecution;

public interface ITestarService {
	
	public ReturnExecution execute (Params params) throws Exception;
	
}
