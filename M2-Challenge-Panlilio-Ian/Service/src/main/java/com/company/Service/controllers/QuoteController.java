package com.company.Service.controllers;

import com.company.Service.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    Random rand = new Random();

    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote(1, "Nelson Mandela", "The greatest glory in living lies not in never falling, but in rising every time we fall."),
            new Quote(2, "Walt Disney", "The way to get started is to quit talking and begin doing."),
            new Quote(3, "Steve Jobs", "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking."),
            new Quote(4, "Eleanor Roosevelt", "If life were predictable it would cease to be life, and be without flavor."),
            new Quote(5, "John Lennon", "Life is what happens when you're busy making other plans."),
            new Quote(6, "Benjamin Franklin", "Tell me and I forget. Teach me and I remember. Involve me and I learn."),
            new Quote(7, "Aristotle", "It is during our darkest moments that we must focus to see the light."),
            new Quote(8, "Anne Frank", "Whoever is happy will make others happy too."),
            new Quote(9, "Sun Tzu", "All warfare is based on deception."),
            new Quote(10, "Albert Einstein", "I have no special talent. I am only passionately curious.")
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote() {
        int randomQuoteIndex = rand.nextInt(quoteList.size());
        return quoteList.get(randomQuoteIndex);
    }
}
