package calculadora.imc;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TesteImc {
	String BAIXO_PESO_MUITO_GRAVE = "Baixo peso muito grave";
	String BAIXO_PESO_GRAVE = "Baixo peso grave";
	String BAIXO_PESO = "Baixo peso";
	String PESO_NORMAl = "Peso normal";
	String SOBREPESO = "Sobrepeso";
	String OBESIDADE = "Obesidade";
	String OBESIDADE_GRAU_1 = "Obesidade grau I";
	String OBESIDADE_GRAU_2 = "Obesidade grau II";
	String OBESIDADE_GRAU_3 = "Obesidade grau III (obesidade mórbida)";
	Calculadora calculadora;
	
	@Before
	public void setup() {
		this.calculadora = new Calculadora();
	}
	
	@Test
	public void imcAdultoBaixoPesoMuitoGraveTeste() {
		Assert.assertEquals(this.BAIXO_PESO_MUITO_GRAVE, this.calculadora.getImc(20, 30.0f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoBaixoPesoGraveMinimoTeste() {
		Assert.assertEquals(this.BAIXO_PESO_GRAVE, this.calculadora.getImc(23, 46.3f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoBaixoPesoGraveMaximoTeste() {
		Assert.assertEquals(this.BAIXO_PESO_GRAVE, this.calculadora.getImc(23, 49.1f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoBaixoPesoMinimoTeste() {
		Assert.assertEquals(this.BAIXO_PESO, this.calculadora.getImc(22, 49.2f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoBaixoPesoMaximoTeste() {
		Assert.assertEquals(this.BAIXO_PESO, this.calculadora.getImc(22, 53.4f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoPesoNormalMinimoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(21, 53.5f, 1.70f, "F"));
	}
	
	@Test
	public void imcAdultoPesoNormalMaximoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(21, 72.2f, 1.70f, "F"));
	}
	
	@Test
	public void imcAdultoSobrepesoMinimoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(65, 72.3f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoSobrepesoMaximoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(65, 86.6f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoObesidadePrimeiroGrauMinimoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_1, this.calculadora.getImc(64, 86.7f, 1.70f, "F"));
	}
	
	@Test
	public void imcAdultoObesidadePrimeiroGrauMaximoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_1, this.calculadora.getImc(64, 101.1f, 1.70f, "F"));
	}
	
	@Test
	public void imcAdultoObesidadeSegundoGrauMinimoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_2, this.calculadora.getImc(63, 101.2f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoObesidadeSegundoGrauMaximoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_2, this.calculadora.getImc(63, 115.5f, 1.70f, "M"));
	}
	
	@Test
	public void imcAdultoObesidadeTerceiroGrauTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_3, this.calculadora.getImc(62, 115.7f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosoBaixoPesoTeste() {
		Assert.assertEquals(this.BAIXO_PESO, this.calculadora.getImc(70, 50.0f, 1.75f, "M"));
	}
	
	@Test
	public void imcIdosoPesoNormalMinimoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(70, 63.6f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosoPesoNormalMaximoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(70, 78f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosoSobrepesoMinimoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(70, 78.4f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosoSobrepesoMaximoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(70, 86.7f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosoObesidadePrimeiroGrauMinimoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_1, this.calculadora.getImc(70, 87f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosoObesidadePrimeiroGrauMaximoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_1, this.calculadora.getImc(70, 101.1f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosoObesidadeSegundoGrauMinimoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_2, this.calculadora.getImc(70, 102f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosoObesidadeSegundoGrauMaximoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_2, this.calculadora.getImc(70, 112.9f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosoObesidadeTerceiroGrauTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_3, this.calculadora.getImc(70, 150.0f, 1.70f, "M"));
	}
	
	@Test
	public void imcIdosaBaixoPesoTeste() {
		Assert.assertEquals(this.BAIXO_PESO, this.calculadora.getImc(70, 50.0f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaPesoNormalMinimoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(70, 63.6f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaPesoNormalMaximoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(70, 78f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaSobrepesoMinimoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(70, 78.4f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaSobrepesoMaximoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(70, 92.4f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaObesidadePrimeiroGrauMinimoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_1, this.calculadora.getImc(75, 92.8f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaObesidadePrimeiroGrauMaximoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_1, this.calculadora.getImc(75, 106.9f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaObesidadeSegundoGrauMinimoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_2, this.calculadora.getImc(75, 107.3f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaObesidadeSegundoGrauMaximoTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_2, this.calculadora.getImc(75, 118.0f, 1.70f, "F"));
	}
	
	@Test
	public void imcIdosaObesidadeTerceiroGrauTeste() {
		Assert.assertEquals(this.OBESIDADE_GRAU_3, this.calculadora.getImc(75, 150.0f, 1.70f, "F"));
	}
	
	@Test
	public void imcMeninoBaixoPesoTeste() {
		Assert.assertEquals(this.BAIXO_PESO, this.calculadora.getImc(10, 44.0f, 1.55f, "M"));
	}
	
	@Test
	public void imcMeninoPesoNormalMinimoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(10, 48.1f, 1.55f, "M"));
	}
	
	@Test
	public void imcMeninoPesoNormalMaximoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(10, 62.4f, 1.55f, "M"));
	}
	
	@Test
	public void imcMeninoSobrepesoMinimoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(10, 62.9f, 1.55f, "M"));
	}
	
	@Test
	public void imcMeninoSobrepesoMaximoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(10, 72f, 1.55f, "M"));
	}
	
	@Test
	public void imcMeninoObesidadeTeste() {
		Assert.assertEquals(this.OBESIDADE, this.calculadora.getImc(10, 90f, 1.55f, "M"));
	}
	
	@Test
	public void imcMeninABaixoPesoTeste() {
		Assert.assertEquals(this.BAIXO_PESO, this.calculadora.getImc(10, 44.9f, 1.55f, "F"));
	}
	
	@Test
	public void imcMeninaPesoNormalMinimoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(10, 45.7f, 1.55f, "F"));
	}
	
	@Test
	public void imcMeninaPesoNormalMaximoTeste() {
		Assert.assertEquals(this.PESO_NORMAl, this.calculadora.getImc(10, 62.4f, 1.55f, "F"));
	}
	
	@Test
	public void imcMeninaSobrepesoMinimoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(10, 62.7f, 1.55f, "F"));
	}
	
	@Test
	public void imcMeninaSobrepesoMaximoTeste() {
		Assert.assertEquals(this.SOBREPESO, this.calculadora.getImc(10, 74.7f, 1.55f, "F"));
	}
	
	@Test
	public void imcMeninaObesidadeTeste() {
		Assert.assertEquals(this.OBESIDADE, this.calculadora.getImc(10, 90f, 1.55f, "F"));
	}
}
