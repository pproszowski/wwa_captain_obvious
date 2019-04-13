package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wwa.captainobvious.recommendations.web.dtos.RecommendationDto;

import java.util.List;

@RestController
@RequestMapping(path = "api/recommendation")
@CrossOrigin(origins = "http://localhost:4200")
public interface RecommendationsController {

    @GetMapping
    RecommendationDto get(@RequestParam List<Integer> itemsIds);
}
