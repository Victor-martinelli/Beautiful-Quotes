package com.victor.beautifulQuotes.service;

import com.victor.beautifulQuotes.constants.QuoteType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class QuoteService {

    private HashMap<QuoteType, List<String>> quotes;


    //TODO: CREATE BEAN METHOD SOMEWHERE IN UTIL CLASS THAT WILL POPULATE THE ABOVE ATTRIBUTE
    public QuoteService(){

    }

    public String getQuote(QuoteType type){

    }



}
