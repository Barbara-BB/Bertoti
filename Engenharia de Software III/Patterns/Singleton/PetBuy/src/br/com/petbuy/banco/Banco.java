package br.com.petbuy.banco;

public class Banco {
	static private Banco instance = null;
	
	private Banco() {}
	static Banco getInstance ()
	{
		if (instance == null)
			instance = new Banco();
		return instance;
	}
	
	public static void main (String args [])
	{
		Banco carregar1 = Banco.getInstance();
		Banco carregar2 = Banco.getInstance();
		System.out.println(carregar1);
		System.out.println(carregar2);
	}

}
