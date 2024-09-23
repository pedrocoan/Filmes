package expoo3.com;

// Nessa classe vai ser instanciado os metodos da outra classe/*
public class Aplicacacaofilme {

	public static void main(String[] args) {
		
		//Criando o objeto e atribuindo os valores /*
		Filme f1 = new Filme();
		f1.settitulo("Massacre da seera eletrica");
		f1.setduracaominutos("90 minutos");
		f1.setgenero("Terror");
		
		//Imprimindo na tela/*
		System.out.println(f1.gettitulo());
		System.out.println(f1.getgenero());
		System.out.println(f1.getduracaominutos());

	}

}
