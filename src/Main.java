import com.heider.currencyconverter.models.Choice;
import com.heider.currencyconverter.models.Conversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversion conversion = new Conversion();
        Choice choice = new Choice();

        while (true){
            System.out.println("""
                    ***************************************************************
                    ----------------------Conversor De Moneda----------------------
                    
                    1) Dolar => Peso Argentino
                    2) Peso Argentino => Dolar
                    3) Dolar => Real Brasileño
                    4) Brasileño => Dolar
                    5) Dolar => Peso Colombiano
                    6) Peso Colombiano => Dolar
                    7) Salir
                        Elija una opcion
                    *************************************************************** \n""");
            int o = scanner.nextInt();
            switch (o){
                case 1:
                    choice.show(conversion,0,7,"Peso Argentino");
                    break;
                case 2:
                    choice.show(conversion,7,0,"Dolar");
                    break;
                case 3:
                    choice.show(conversion,0,20,"Real Brasileño");
                    break;
                case 4:
                    choice.show(conversion,20,0,"Dolar");
                    break;
                case 5:
                    choice.show(conversion,0,31,"Peso Colombiano");
                    break;
                case 6:
                    choice.show(conversion,31,0,"Dolar");
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }

    }
}