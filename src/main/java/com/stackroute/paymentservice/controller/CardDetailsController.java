package com.stackroute.paymentservice.controller;


import com.stackroute.paymentservice.domain.CardDetails;
import com.stackroute.paymentservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
@CrossOrigin
public class CardDetailsController {

    @Autowired
    private CardService cardService;

    public CardDetailsController(CardService cardService){
        this.cardService=cardService;
    }



    @PostMapping("/cardDetails")
    public ResponseEntity<?> saveCardDetails(@RequestBody CardDetails cardDetails){
        CardDetails cardDetails1 = cardService.saveCardDetails(cardDetails);
        ResponseEntity responseEntity=new ResponseEntity<Object>(cardDetails1, HttpStatus.CREATED);
        return responseEntity;

    }


}
