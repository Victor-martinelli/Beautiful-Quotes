package com.victor.beautifulQuotes.homeController;

import com.victor.beautifulQuotes.constants.QuoteType;
import com.victor.beautifulQuotes.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainScreenController {

    @Autowired
    private QuoteService quoteService;

    @RequestMapping
    public String mainScreen(){
        return quoteService.getQuote(QuoteType.BREAKUP);
    }
}
