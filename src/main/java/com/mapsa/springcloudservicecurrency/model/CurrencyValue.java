package com.mapsa.springcloudservicecurrency.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CurrencyValue {

    int id;
    String name;
    String value;

}
