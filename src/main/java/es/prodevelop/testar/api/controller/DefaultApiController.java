package es.prodevelop.testar.api.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.prodevelop.testar.api.model.Params;
import es.prodevelop.testar.api.model.ReturnExecution;
import es.prodevelop.testar.api.service.ITestarService;
import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-05T15:16:04.078Z")

@Controller
public class DefaultApiController implements DefaultApi {

    private static final Logger log = LoggerFactory.getLogger(DefaultApiController.class);

    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;
    
    @Autowired
    ITestarService testarService;
    

    @org.springframework.beans.factory.annotation.Autowired
    public DefaultApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ReturnExecution> execute(@ApiParam(value = "Inventory item to add"  )  @Valid @RequestBody Params params) {
        String accept = request.getHeader("Accept");
        
        if (accept != null && accept.contains("application/json")) {
            try {
                
            	return new ResponseEntity<ReturnExecution>(testarService.execute(params), HttpStatus.OK);
                
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReturnExecution>(HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (Exception e) {
            	log.error("Internal error", e);
                return new ResponseEntity<ReturnExecution>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
        }

        return new ResponseEntity<ReturnExecution>(HttpStatus.BAD_REQUEST);
    }

}
