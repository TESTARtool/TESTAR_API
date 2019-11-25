package es.prodevelop.testar.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.prodevelop.testar.api.model.TestarFile;
import es.prodevelop.testar.api.service.ISequenceService;
import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-05T15:16:04.078Z")

@Controller
public class SequencesApiController implements SequencesApi {

    private static final Logger log = LoggerFactory.getLogger(SequencesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    ISequenceService sequenceService;

    @org.springframework.beans.factory.annotation.Autowired
    public SequencesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<TestarFile>> getSequenceFiles(@ApiParam(value = "",required=true) @PathVariable("sequenceId") String sequenceId) {
        //String accept = request.getHeader("Accept");
        
        try {        		
        	return new ResponseEntity<List<TestarFile>>(sequenceService.getFiles(sequenceId), HttpStatus.OK);
        
        } catch (Exception e) {
            log.error("Internal error", e);
            return new ResponseEntity<List<TestarFile>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

}
