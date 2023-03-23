package tests;
// refatorar= reestruturas mantendo sua funcionalidade
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.ResultadoImc;


public class CalculadoraImcTestes {
	
	@Before
	public void setup(){
	
	}
	//IDOSO
		
		@Test
		public void testeIdosoBaixoPesoLimiteSuperior() {
			Assert.assertEquals("Baixo peso", ResultadoImc.calcularImc(1.79, 70, 65, "M"));
		}
		//
		@Test
		public void testeIdosoPesoNormalLimiteInferior() {
			Assert.assertEquals("Peso normal", ResultadoImc.calcularImc(1.783, 70, 65, "M"));
		}
		@Test
		public void testeIdosoPesoNormalLimiteSuperior() {
			Assert.assertEquals("Peso normal", ResultadoImc.calcularImc(1.54, 64, 65, "M"));
		}
		//
		@Test
		public void testeIdosoSobrepesoLimiteInferior() {
			Assert.assertEquals("Sobrepeso", ResultadoImc.calcularImc(1.6071, 70, 65, "M"));
		}
		@Test
		public void testeIdosoSobrepesoLimiteSuperior() {
			Assert.assertEquals("Sobrepeso", ResultadoImc.calcularImc(1.8076, 98, 65, "M"));
		}
		//
		@Test
		public void testeIdosoObesidadeGrau1LimiteInferior() {
		Assert.assertEquals("Obesidade grau I", ResultadoImc.calcularImc(1.6102, 83, 65, "M"));
		}
		
		public void testeIdosoObesidadeGrau1LimiteSuperior() {
			Assert.assertEquals("Obesidade grau I", ResultadoImc.calcularImc(1.594, 94, 65, "M"));
		}
		//
		@Test
		public void testeIdosoObesidadeGrau2LimiteInferior() {
			Assert.assertEquals("Obesidade grau II", ResultadoImc.calcularImc(1.802, 114, 65, "M"));
		}
		@Test
		public void testeIdosoObesidadeGrau2LimiteSuperior() {
			Assert.assertEquals("Obesidade grau II", ResultadoImc.calcularImc(1.7052, 116, 65, "M"));
		}
		//
		@Test
		public void testeIdosoObesidadeGrau3MorbidaLimiteInferior() {
			Assert.assertEquals("Obesidade grau III (obesidade mórbida)", ResultadoImc.calcularImc(1.702, 116, 65, "M"));
		}
		//IDOSA
		@Test
		public void testeIdosaBaixoPesoLimiteSuperior() {
			Assert.assertEquals("Baixo peso", ResultadoImc.calcularImc(1.79, 70, 65, "F"));
		}
		//
		@Test
		public void testeIdosaPesoNormalLimiteInferior() {
			Assert.assertEquals("Peso normal", ResultadoImc.calcularImc(1.783, 70, 65, "F"));
		}
		@Test
		public void testeIdosaPesoNormalLimiteSuperior() {
			Assert.assertEquals("Peso normal", ResultadoImc.calcularImc(1.54, 64, 65, "F"));
		}
		//
		@Test
		public void testeIdosaSobrepesoLimiteInferior() {
			Assert.assertEquals("Sobrepeso", ResultadoImc.calcularImc(1.6071, 70, 65, "F"));
		}
		@Test
		public void testeIdosaSobrepesoLimiteSuperior() {
			Assert.assertEquals("Sobrepeso", ResultadoImc.calcularImc(1.601, 82, 65, "F"));
		}
		//
		@Test
		public void testeIdosaObesidadeGrau1LimiteInferior() {
			Assert.assertEquals("Obesidade grau I", ResultadoImc.calcularImc(1.608, 83, 65, "F"));
		}
		@Test
		public void testeIdosaObesidadeGrau1LimiteSuperior() {
			Assert.assertEquals("Obesidade grau I", ResultadoImc.calcularImc(1.6025, 95, 65, "F"));
		}
		//
		@Test
		public void testeIdosaObesidadeGrau2LimiteInferior() {
			Assert.assertEquals("Obesidade grau II", ResultadoImc.calcularImc(1.6001, 95, 65, "F"));
		}
		@Test
		public void testeIdosaObesidadeGrau2LimiteSuperior() {
			Assert.assertEquals("Obesidade grau II", ResultadoImc.calcularImc(1.6056, 108, 65, "F"));
		}
		//
		
		public void testeIdosaObesidadeGrau3MorbidaLimiteInferior() {
			Assert.assertEquals("Obesidade grau III (obesidade mórbida)", ResultadoImc.calcularImc(1.529, 98.2, 65, "F"));
		}
		
	//ADULTO- SEXO NÃO IMPORTA
	@Test
	public void testeAdultoBaixoPesoMuitoGraveLimiteInferior() {
		Assert.assertEquals("Baixo peso muito grave", ResultadoImc.calcularImc(1.70, 46, 20, "F"));
	}
	//
	@Test
	public void testeAdultoBaixoPesoGraveLimiteInferior() {
		Assert.assertEquals("Baixo peso grave", ResultadoImc.calcularImc(1.71, 47, 20, "F"));
	}
	@Test
	public void testeAdultoBaixoPesoGraveLimiteSuperior() {
		Assert.assertEquals("Baixo peso grave", ResultadoImc.calcularImc(1.70, 49, 20, "F"));
	}
	//
	@Test
	public void testeAdultoBaixoPesoLimiteInferior() {
		Assert.assertEquals("Baixo peso", ResultadoImc.calcularImc(1.66, 47, 20, "F"));
	}
	@Test
	public void testeAdultoBaixoPesoLimiteSuperior() {
		Assert.assertEquals("Baixo peso", ResultadoImc.calcularImc(1.60, 47, 20, "F"));
	}
	//
	@Test
	public void testeAdultoPesoNormalLimiteInferior() {
		Assert.assertEquals("Peso normal", ResultadoImc.calcularImc(1.69, 53 , 20, "F"));
	}
	@Test
	public void testeAdultoPesoNormalLimiteSuperior() {
		Assert.assertEquals("Peso normal", ResultadoImc.calcularImc(1.70, 72, 20, "F"));
	}
	//
	@Test
	public void testeAdultoSobrepesoLimiteInferior() {
		Assert.assertEquals("Sobrepeso", ResultadoImc.calcularImc(1.612, 65, 20, "F"));
	}
	@Test
	public void testeAdultoSobrepesoLimiteSuperior() {
		Assert.assertEquals("Sobrepeso", ResultadoImc.calcularImc(1.55, 72, 20, "F"));
	}
	@Test
	public void testeAdultoObesidadeGrau1LimiteInferior() {
		Assert.assertEquals("Obesidade grau I", ResultadoImc.calcularImc(1.64, 81, 20, "F"));
	}
	@Test
	public void testeAdultoObesidadeGrau1LimiteSuperior() {
		Assert.assertEquals("Obesidade grau I", ResultadoImc.calcularImc(1.5402, 83 , 20, "F"));
	}
	//
	@Test
	public void testeAdultoObesidadeGrau2LimiteInferior() {
		Assert.assertEquals("Obesidade grau II", ResultadoImc.calcularImc(1.51, 80 , 20, "F"));
	}
	@Test
	public void testeAdultoObesidadeGrau2LimiteSuperior() {
		Assert.assertEquals("Obesidade grau II", ResultadoImc.calcularImc(1.59, 101 , 20, "F"));
	}
	//
	@Test
	public void testeAdultoObesidadeGrau3MorbidaLimiteSuperior() {
		Assert.assertEquals("Obesidade grau III (obesidade mórbida)", ResultadoImc.calcularImc(1.54 , 95, 20, "F"));
	}
	
	
}

