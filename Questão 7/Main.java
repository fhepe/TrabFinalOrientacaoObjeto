package br.edu.unoesc.smo.aulaOO.exemploInterface;

public class Main {

	public static void main(String[] args) {
		Calculadora calculaSoma = new Soma();
		System.out.println(calculaSoma.calcular(2.00, 5.00));

		Calculadora calculaSubtracao = new Subtracao();
		System.out.println(calculaSubtracao.calcular(10.00, 5.00));
	}

}
