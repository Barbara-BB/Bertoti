package strategypattern;

public class Sun {

	public static void main(String[] args) {
		
		Cliente Sun = new Coelho();
		sub.setTemperamento(new TemperamentoDramatico());
		sun.verTemperamento();
		
		System.out.println("--------------------------------");
		
		//agora o joao criou uma empresa
		sun.setTemperamento(new TemperamentoArisco());
		sun.verTemperamento();
	
		
	}
	
}
