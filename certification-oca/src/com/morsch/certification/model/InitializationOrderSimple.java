package com.morsch.certification.model;

public class InitializationOrderSimple {
	
	//em quarto, iniciamos as variávies de instância
	private String name = "Torchie";
	
	//em quinto, inciamos os instance initializers, na ordem que se apresenta no arquivo
	{
		System.out.println(name);
	}
	
	//primeiro inicializam-se as variáveis estáticas...em ordem no arquivo
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
	
	//por último se incializa o construtor default
	public InitializationOrderSimple() {
		System.out.println("constructor");
	}
	
	//em terceiro, após as variáveis e inicializadores estáticos, o método main pode começar...
	public static void main(String[] args) {
		System.out.println("ready to construct");
		// no momento em que se instancia podemos chamar as variáveis de instancia
		new InitializationOrderSimple();
	}

}
