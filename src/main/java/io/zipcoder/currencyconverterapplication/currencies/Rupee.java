package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    CurrencyType type = CurrencyType.RUPEE;


    public CurrencyType getType() {
        return type;
    }
}
