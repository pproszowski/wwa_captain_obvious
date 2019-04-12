package wwa.captainobvious.recommendations.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wwa.captainobvious.recommendations.common.dtos.CartDto;

@RestController
@RequestMapping(path = "api/cart")
public interface CartController {

    @GetMapping
    CartDto get();
}
