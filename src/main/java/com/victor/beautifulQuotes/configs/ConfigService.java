package com.victor.beautifulQuotes.configs;

import com.victor.beautifulQuotes.constants.QuoteConstants;
import com.victor.beautifulQuotes.constants.QuoteType;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ConfigService {

    @Bean
    public HashMap<QuoteType, List<String>> populateMapsQuotes(){
        HashMap<QuoteType, List<String>> quotes = new HashMap<>();

        //Add all the quotes
        quotes.put(QuoteType.BREAKUP, List.of(QuoteConstants.BREAKUP_QUOTES));

        return quotes;
    }
}
