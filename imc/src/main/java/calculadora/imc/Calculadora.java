package calculadora.imc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculadora {
	private String BAIXO_PESO_MUITO_GRAVE = "Baixo peso muito grave";
	private String BAIXO_PESO_GRAVE = "Baixo peso grave";
	private String BAIXO_PESO = "Baixo peso";
	private String PESO_NORMAl = "Peso normal";
	private String SOBREPESO = "Sobrepeso";
	private String OBESIDADE = "Obesidade";
	private String OBESIDADE_GRAU_1 = "Obesidade grau I";
	private String OBESIDADE_GRAU_2 = "Obesidade grau II";
	private String OBESIDADE_GRAU_3 = "Obesidade grau III (obesidade mórbida)";
	
	public String getImc(int idade, float peso, float altura, String sexo) {
		float imc = (peso/(altura * altura));
		float imcRounded =  this.round(imc, 2);
		String result = "";
		if(idade >=2 && idade < 20 && sexo == "M") {
			result = this.getMeninoSituacao(imcRounded);
		}
		else if(idade >=2 && idade < 20 && sexo == "F") {
			result = this.getMeninaSituacao(imcRounded);
		}
		else if(idade >= 20 && idade <= 65) {
			result = this.getAdultoSituacao(imcRounded);
		}
		else if(idade > 65 && sexo == "M") {
			result = this.getIdosoSituacao(imcRounded);
		}
		else if(idade > 65 && sexo == "F") {
			result = this.getIdosaSituacao(imcRounded);
		}
		
		return result;
	}
	
	public String getAdultoSituacao(float imc){
		String result = "";
		if(imc < 16) {
			result = this.BAIXO_PESO_MUITO_GRAVE;
		}
		else if(imc >= 16 && imc <= 16.99) {
			result = this.BAIXO_PESO_GRAVE;
		}
		else if(imc >= 17 && imc <= 18.49) {
			result = this.BAIXO_PESO;
		}
		else if(imc >= 18.50 && imc <= 24.99) {
			result = this.PESO_NORMAl;
		}
		else if(imc >= 25 && imc <= 29.99) {
			result = this.SOBREPESO;
		}
		else if(imc >= 30 && imc <= 34.99) {
			result = this.OBESIDADE_GRAU_1;
		}
		else if(imc >= 35 && imc <= 39.99) {
			result = this.OBESIDADE_GRAU_2;
		}
		else if(imc > 40) {
			result = this.OBESIDADE_GRAU_3;
		}
		
		return result;
	}
	
	public String getIdosoSituacao(float imc) {
		String result = "";
		if(imc < 21.9) {
			result = this.BAIXO_PESO;
		}
		else if(imc >= 22 && imc <= 27) {
			result = this.PESO_NORMAl;
		}
		else if(imc >= 27.1 && imc <= 30) {
			result = this.SOBREPESO;
		}
		else if(imc >= 30.1 && imc <= 35) {
			result = this.OBESIDADE_GRAU_1;
		}
		else if(imc >= 35.1 && imc <= 39.9) {
			result = this.OBESIDADE_GRAU_2;
		}
		else if(imc > 40) {
			result = this.OBESIDADE_GRAU_3;
		}
		
		return result;
	}
	
	public String getIdosaSituacao(float imc) {
		String result = "";
		if(imc < 21.9) {
			result = this.BAIXO_PESO;
		}
		else if(imc >= 22 && imc <= 27) {
			result = this.PESO_NORMAl;
		}
		else if(imc >= 27.1 && imc <= 32) {
			result = this.SOBREPESO;
		}
		else if(imc >= 32.1 && imc <= 37) {
			result = this.OBESIDADE_GRAU_1;
		}
		else if(imc >= 37.1 && imc <= 41.9) {
			result = this.OBESIDADE_GRAU_2;
		}
		else if(imc > 42) {
			result = this.OBESIDADE_GRAU_3;
		}
		
		return result;
	}
	
	public String getMeninoSituacao(float imc) {
		String result = "";
		if(imc < 20) {
			result = this.BAIXO_PESO;
		}
		else if(imc >= 20 && imc <= 26) {
			result = this.PESO_NORMAl;
		}
		else if(imc > 26 && imc <= 30) {
			result = this.SOBREPESO;
		}
		else if(imc >= 30.1) {
			result = this.OBESIDADE;
		}
		
		return result;
	}
	
	public String getMeninaSituacao(float imc) {
		String result = "";
		if(imc <= 19) {
			result = this.BAIXO_PESO;
		}
		else if(imc > 19 && imc <= 26.1) {
			result = this.PESO_NORMAl;
		}
		else if(imc > 26.1 && imc <= 31.1) {
			result = this.SOBREPESO;
		}
		else if(imc >= 32) {
			result = this.OBESIDADE;
		}
		
		return result;
	}
	
	private static float round(float value, int places) {
		NumberFormat formatter = NumberFormat.getInstance(Locale.US);
		formatter.setMaximumFractionDigits(places);
		formatter.setMinimumFractionDigits(places);
		Float formatedFloat = new Float(formatter.format(value));
		return formatedFloat;
	}
}
