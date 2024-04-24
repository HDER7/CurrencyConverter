package com.heider.currencyconverter.models;

import java.util.List;
import java.util.Scanner;

public class Choice {

    public void show(Conversion conversion,int index,int index2, String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a convertir: ");
        double value = sc.nextDouble();
        List<String> possible = conversion.possible();
        double result = conversion.calculateAmount(possible.get(index),possible.get(index2),value);
        System.out.println(value+"["+possible.get(index)+"] en "+name+ " son " +result+"["+possible.get(index2)+"]");

    }
}
