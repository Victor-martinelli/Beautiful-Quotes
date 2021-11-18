package com.victor.beautifulQuotes.service;

import com.victor.beautifulQuotes.constants.QuoteType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {

    @Autowired
    private HashMap<QuoteType, List<String>> quotes;

    private Random rand = new Random();

    public String getQuote(QuoteType type){

        //Get one of the quotes and simply return a random
        List<String> typeQuotes = quotes.get(type);

        return typeQuotes.get(rand.nextInt(typeQuotes.size()));
    }
}
