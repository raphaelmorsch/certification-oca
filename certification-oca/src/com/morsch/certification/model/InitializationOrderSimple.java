package com.morsch.certification.model;

public class InitializationOrderSimple {
	
	//em quarto, iniciamos as vari�vies de inst�ncia
	private String name = "Torchie";
	
	//em quinto, inciamos os instance initializers, na ordem que se apresenta no arquivo
	{
		System.out.println(name);
	}
	
	//primeiro inicializam-se as vari�veis est�ticas...em ordem no arquivo
	private static int COUNT = 0;
	
	//segundo inicializam-se os static initializers...em ordem no arquivo
	static {
		System.out.println(COUNT);
	}
	
	//em sexto este instance initializer por conta da ordem na qual ele se apresenta no arquivo
	{
		COUNT++;
		System.out.println(COUNT);
	}
	
	//por �ltimo se incializa o construtor default
	public InitializationOrderSimple() {
		System.out.println("constructor");
	}
	
	//em terceiro, ap�s as vari�veis e inicializadores est�ticos, o m�todo main pode come�ar...
	public static void main(String[] args) {
		System.out.println("ready to construct");
		// no momento em que se instancia podemos chamar as vari�veis de instancia
		new InitializationOrderSimple();
	}

}
