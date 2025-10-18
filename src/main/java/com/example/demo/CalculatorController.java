package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Ошибка: деление на ноль!";
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }

}