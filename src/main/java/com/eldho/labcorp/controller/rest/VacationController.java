package com.eldho.labcorp.controller.rest;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.eldho.labcorp.service.VacationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/rest")
public class VacationController {

    private static final Logger logger = LogManager.getLogger(VacationController.class);

    @Autowired
    VacationService vacationService;

    @RequestMapping(path = "/work", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Integer> work(@RequestParam(value = "workDays", defaultValue = "0") int workDays) {
    	logger.log(Level.INFO, "Received request to record work: {}", workDays);
    	vacationService.work();
        return new ResponseEntity<Integer>(workDays, HttpStatus.OK);
    }

}
