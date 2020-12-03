package vvcl.spring.calculator.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vvcl.spring.calculator.services.CalculatorService;

@RequestMapping(value = "/substractor", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class SubstractorController {

    private CalculatorService calculatorService;

    public SubstractorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/current")
    public int currentNum() {
        return calculatorService.currentBase();
    }

    @PostMapping("/substract")
    public int substract(@RequestParam int num) {
        return calculatorService.substract(num);
    }

    @PostMapping("/accumulateS")
    public int accumulateS(@RequestParam int num){
        return calculatorService.accumulateS(num);
    }
}
