package com.heider.currencyconverter.models;

import java.util.Scanner;

public class Choice {

    public void show(Conversion conversion,int index,int index2, String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a convertir: ");
        double value = sc.nextDouble();
        double result = conversion.calculateAmount(conversion.possible().get(index),conversion.possible().get(index2),value);
        System.out.println(value+"["+conversion.possible().get(index)+"] en "+name+ " son " +result+"["+conversion.possible().get(index2)+"]");

    }
}
