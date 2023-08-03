package conversorDeMoedas.entities;

public class ConversorDollar {
    public static final double IOF = 6;
   public double dollarValue;
    public double quantityDollar;

    public static double convertDollar(double dollar,double quantity){
        return (dollar*quantity) *IOF /100 +(quantity*dollar);

    }

}


