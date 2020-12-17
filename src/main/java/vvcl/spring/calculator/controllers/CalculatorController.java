package vvcl.spring.calculator.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vvcl.spring.calculator.services.CalculatorService;

@RequestMapping(value = "/calculator", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@CrossOrigin("http://localhost:4200")
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/current")
    public int currentNum() {
        return calculatorService.currentBase();
    }

    @PostMapping("/add")
    public int add(@RequestParam int num) {
        return calculatorService.add(num);
    }

    @PostMapping("/accumulate")
    public int accumulate(@RequestParam int num){
        return calculatorService.accumulate(num);
    }

    @PostMapping("/subtract")
    public int substract(@RequestParam int num) {
        return calculatorService.substract(num);
    }

    @PostMapping("/accumulateS")
    public int accumulateS(@RequestParam int num){
        return calculatorService.accumulateS(num);
    }

}
