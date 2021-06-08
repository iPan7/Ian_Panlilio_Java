package com.company.Service.controllers;

import com.company.Service.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DefinitionController {
    Random rand = new Random();

    private static List<Definition> definitionList = new ArrayList<>(Arrays.asList(
            new Definition(1, "Atrocity", "An extremely wicked or cruel act, typically one involving physical violence or injury."),
            new Definition(2, "Fanatical", "Filled with excessive and single-minded zeal."),
            new Definition(3, "Pensive", "Engaged in, involving, or reflecting deep or serious thought."),
            new Definition(4, "Respite", "A short period of rest or relief from something difficult or unpleasant."),
            new Definition(5, "Discordant", "Disagreeing or incongruous."),
            new Definition(6, "Eloquent", "Fluent or persuasive in speaking or writing."),
            new Definition(7, "Encompass", "Surround and have or hold within."),
            new Definition(8, "Invincible", "Too powerful to be defeated or overcome."),
            new Definition(9, "Imperceptible", "Impossible to perceive."),
            new Definition(10, "Lucid", "Expressed clearly; easy to understand.")
    ));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getRandomDefinition() {
        int randomDefinitionIndex = rand.nextInt(definitionList.size());
        return definitionList.get(randomDefinitionIndex);
    }

}
