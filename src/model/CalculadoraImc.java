package model;

public class CalculadoraImc {
	public static double calculaImc(double peso, double altura){
		if(altura==0.00f || peso==0.00f) {
			System.out.println("Altura e peso não podem ser zero.");
		}
			return peso/(altura*altura);
		}
}
