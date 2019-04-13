package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wwa.captainobvious.recommendations.web.dtos.CartDto;

@RestController
@RequestMapping(path = "api/cart")
@CrossOrigin(origins = "http://localhost:4200")
public interface CartController {

    @GetMapping
    CartDto get();
}
