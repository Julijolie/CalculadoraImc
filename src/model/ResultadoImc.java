package model;

public class ResultadoImc {

	public static String calcularImc(double altura, double peso, int idade, String sexo) {
		String condicaoCorporal = "Indefinida";
		double imc = CalculadoraImc.calculaImc(peso, altura);
        if (idade> 65.0 && sexo.equals("feminino")) {
            if (imc < 21.9f) {
                condicaoCorporal = "Baixo peso";
            }
    		else if(22f<=imc && imc<= 27f) {
    			condicaoCorporal = "Peso normal";
    		}
    		else if(27f<=imc && imc<= 32f) {
    			condicaoCorporal = "Sobrepeso";
    		}
    		else if(32.1f<=imc && imc<= 37) {
    			condicaoCorporal = "Obesidade grau I";
    		}
    		else if(37.1f<=imc && imc< 42) {
    			condicaoCorporal = "Obesidade grau II";
    		}
    		else if(imc>=42) {
    			condicaoCorporal = "Obesidade grau III";
    		}
    	}		
            // masculino-idoso
        else if (idade> 65.0 && sexo.equals("masculino")) {
        	if (imc < 22f) {
	                condicaoCorporal = "Baixo peso";
	            }
        	else if(22f<=imc && imc<= 27f) {
        		condicaoCorporal = "Peso normal";
	    	}
	    	else if(27.1f<=imc && imc<= 30f) {
	    		condicaoCorporal = "Sobrepeso";
	    	}
	    	else if(30.1f<=imc && imc<= 35) {
	    		condicaoCorporal = "Obesidade grau I";
	    	}
	    	else if(35.1f<=imc && imc< 40) {
	    		condicaoCorporal = "Obesidade grau II";
	    	}
	    	else if(imc>=40) {
	    		condicaoCorporal = "Obesidade grau III";
	    	}
	    }
        	//adulto-sexo não importa
        else if (idade<=65.0) {
        	if (imc <= 16.0f) {
        		condicaoCorporal = "Baixo peso muito grave";
    		}
    		else if(16<=imc && imc<= 16.99) {
    			condicaoCorporal = "Baixo peso grave";
    		}
    		else if(17<=imc && imc<= 18.49) {
    			condicaoCorporal = "Baixo peso";
    		}
    		else if(18.50<=imc && imc<=24.99) {
    			condicaoCorporal = "Peso normal";
    		}
    		else if(25<=imc && imc<= 29.99) {
    			condicaoCorporal = "Sobrepeso";
    		}
    		else if(30<=imc && imc<= 34.99) {
    			condicaoCorporal = "Obesidade grau I";
    		}
    		else if(35<=imc && imc<= 39.99) {
    			condicaoCorporal = "Obesidade grau II";
    		}
    		else if(imc>=40) {
    			condicaoCorporal = "Obesidade grau III";
    		}
	    }
        System.out.println(condicaoCorporal);
		return condicaoCorporal;
	}

}
