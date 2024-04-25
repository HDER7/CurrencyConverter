import com.heider.currencyconverter.models.Choice;
import com.heider.currencyconverter.models.Conversion;
import com.heider.currencyconverter.models.Record;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversion conversion = new Conversion();
        Choice choice = new Choice();
        String C ;

        while (true){
            System.out.println("""
                    ***************************************************************
                    ----------------------Conversor De Moneda----------------------
                    
                    1) Dolar => Peso Argentino
                    2) Peso Argentino => Dolar
                    3) Dolar => Real Brasileño
                    4) Real Brasileño => Dolar
                    5) Dolar => Peso Colombiano
                    6) Peso Colombiano => Dolar
                    7) Historial
                    8) Salir
                        Elija una opcion
                    *************************************************************** \n""");
            int o = scanner.nextInt();
            switch (o){
                case 1:
                    C = choice.doConversion(conversion,0,7,"Peso Argentino");
                    System.out.println(C);
                    new Record().addRecord(C);
                    break;
                case 2:
                    C = choice.doConversion(conversion,7,0,"Dolar");
                    System.out.println(C);
                    new Record().addRecord(C);
                    break;
                case 3:
                    C = choice.doConversion(conversion,0,20,"Real Brasileño");
                    System.out.println(C);
                    new Record().addRecord(C);
                    break;
                case 4:
                    C = choice.doConversion(conversion,20,0,"Dolar");
                    System.out.println(C);
                    new Record().addRecord(C);
                    break;
                case 5:
                    C = choice.doConversion(conversion,0,31,"Peso Colombiano");
                    System.out.println(C);
                    new Record().addRecord(C);
                    break;
                case 6:
                    C = choice.doConversion(conversion,31,0,"Dolar");
                    System.out.println(C);
                    new Record().addRecord(C);
                    break;
                case 7:
                    new Record().showRecords();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }

    }
}