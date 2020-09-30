package com.mapsa.springcloudservicecurrency.controller;

import com.mapsa.springcloudservicecurrency.model.CurrencyValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("currency")
public class CurrencyController {

    @GetMapping()
    public CurrencyValue getCurrencies()
    {
        return new CurrencyValue().setId(1).setName("btc").setValue("12000");
    }

}
