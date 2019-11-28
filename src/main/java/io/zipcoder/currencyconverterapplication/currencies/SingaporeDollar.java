package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    CurrencyType type = CurrencyType.SINGAPORE_DOLLAR;


    public CurrencyType getType() {
        return type;
    }
}
