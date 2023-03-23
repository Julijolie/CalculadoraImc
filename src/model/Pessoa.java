package model;

public class Pessoa {
	    private String sexo;
	    private short idade;
	    private float altura;
	    private float peso;
	    private double imc;

	    public String getSexo() {
	        return sexo;
	    }

	    public short getIdade() {
	        return idade;
	    }

	    public float getAltura() {
	        return altura;
	    }

	    public float getPeso() {
	        return peso;
	    }

	    public double getImc() {
	        return imc;
	    }
	    
	    public Pessoa(String sexo, short idade, float altura, float peso) {
	        this.sexo = sexo;
	        this.idade = idade;
	        this.altura = altura;
	        this.peso = peso;
	        this.imc = CalculadoraImc.calculaImc(peso, altura);
	    }
	    
	    
	    	//feminino-idoso
	    public String getCondicaoCorporal() {
	        String condicaoCorporal = "Indefinida";
	        if (this.idade>= 65.0 && sexo.equals("F")) {
	            if (this.imc < 21.9f) {
	                condicaoCorporal = "Baixo peso";
	            }
	    		else if(22f<=this.imc && this.imc<= 27f) {
	    			condicaoCorporal = "Peso normal";
	    		}
	    		else if(27f<=this.imc && this.imc<= 32f) {
	    			condicaoCorporal = "Sobrepeso";
	    		}
	    		else if(32.1f<=this.imc && this.imc<= 37) {
	    			condicaoCorporal = "Obesidade grau I";
	    		}
	    		else if(37.1f<=this.imc && this.imc<=41.9) {
	    			condicaoCorporal = "Obesidade grau II";
	    		}
	    		else if(this.imc>=42) {
	    			condicaoCorporal = "Obesidade grau III (obesidade mórbida)";
	    		}
	    	}		
	            // masculino-idoso
	        else if (this.idade>= 65.0 && sexo.equals("M")) {
	        	if (this.imc < 21.9f) {
		            condicaoCorporal = "Baixo peso";
		            }
	        	else if(22f<=this.imc && this.imc<= 27f) {
	        		condicaoCorporal = "Peso normal";
		    	}
		    	else if(27.1f<=this.imc && this.imc<= 30f) {
		    		condicaoCorporal = "Sobrepeso";
		    	}
		    	else if(30.1f<=this.imc && this.imc<= 35) {
		    		condicaoCorporal = "Obesidade grau I";
		    	}
		    	else if(35.1f<=this.imc && this.imc<= 39.9) {
		    		condicaoCorporal = "Obesidade grau II";
		    	}
		    	else if(this.imc>=40) {
		    		condicaoCorporal = "Obesidade grau III (obesidade mórbida)";
		    	}
		    }
	        	//adulto-sexo não importa
	        else if (this.idade<65.0) {
	        	if (this.imc < 16.0f) {
	        		condicaoCorporal = "Baixo peso muito grave";
	    		}
	    		else if(16<=this.imc && this.imc<= 16.99) {
	    			condicaoCorporal = "Baixo peso grave";
	    		}
	    		else if(17<=this.imc && this.imc<= 18.49) {
	    			condicaoCorporal = "Baixo peso";
	    		}
	    		else if(18.50<=this.imc && this.imc<=24.99) {
	    			condicaoCorporal = "Peso normal";
	    		}
	    		else if(25<=this.imc && this.imc<= 29.99) {
	    			condicaoCorporal = "Sobrepeso";
	    		}
	    		else if(30<=this.imc && this.imc<= 34.99) {
	    			condicaoCorporal = "Obesidade grau I ";
	    		}
	    		else if(35<=this.imc && this.imc<= 39.99) {
	    			condicaoCorporal = "Obesidade grau II";
	    		}
	    		else if(this.imc>=40) {
	    			condicaoCorporal = "Obesidade grau III (obesidade mórbida";
	    		}
		    }
			return condicaoCorporal;
	    }
}

