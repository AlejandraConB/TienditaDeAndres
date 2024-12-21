package Tienda;

public class CalculadoraImpuesto {

    private double totalImpuesto = 0;

    public void calculaImpuesto(Tributable tributable) {
        totalImpuesto += tributable.calculaImpuesto();
    }

}