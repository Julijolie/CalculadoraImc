package model;
import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pessoa pessoa;
	
		System.out.println("Altura em metros: ");
		float altura=teclado.nextFloat();
		
		System.out.println("Peso em quilos: ");
		float peso=teclado.nextFloat();
		
		System.out.println("Digite sua idade: ");
		short idade = teclado.nextShort();
		
		System.out.println("Digite o seu sexo: M para masculino e F para feminino.");
		String sexo=teclado.toString().toUpperCase();
		
		pessoa = new Pessoa(sexo,idade,altura,peso);
		
		System.out.println(pessoa.getCondicaoCorporal());
		
		teclado.close();
	
		
	}

}
