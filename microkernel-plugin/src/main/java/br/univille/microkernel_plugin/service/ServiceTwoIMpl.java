package br.univille.microkernel_plugin.service;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.univille.microkernel_interface.service.DefaultService;

@Service
public class ServiceTwoIMpl implements DefaultService{

    @Override
    public HttpStatus doWork(HashMap<String, Object> params) {
        
        System.out.println("Service Two" +params);
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

}
