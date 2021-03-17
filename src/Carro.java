
public class Carro {
	/**
	 * Atributos de: 
	 * consumo
	 * quantidade do Combustivel
	 * capacidade do Deposito
	 */
	static private final double consumo=5.5; // litros por 100 klm
	
	private double quantidadeCombustivel;
	private double capacidadeDeposito;
	
	// Construtor por defeito 
	/**
	 * Estado do carro 
	 * 
	 * 
	 */
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 
	/**
	 * Atributos de: 
	 * quantidade do Combustivel capacidade do Deposito para comparar o Consumo
	 * capacidade do Deposito para ver o quanto pode receber
	 * @return
	 */

	public static double getConsumo() {
		return consumo;
	}

	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// Métodos 
	
	public void meterCombustivel( double quantidade) { 		
		
		/**
		 * Testar se Transborda o depósito
		 * 
		 */
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	
	// atestar o depósito
	/**
	 *  capacidade do Deposito - quantidade do Combustivel
	 * @return
	 */
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	
	// distancia em klm
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente não percorre qualquer distancia 
			// ou anda até parar porque fica sem combustível 
			return false;
		}
			
			
	}
	
	public boolean parar() {
		
		// se estiver a andar pára 
		// falta a flag que indica se o carro está em andamento
		return true;
	}
	
	// kmCombustivel( )    
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
