
package Carro;

public class Manutencao {
	

	private int desgastePneus;
	private int desgasteFreios;
	private int motor;
	private int farois; //ggas
	
	
	public void ManutencaoPneus() {
		
	}
	
	
	
	
	 //  MÉTODO DESNECESSÁRIO
	// método construtor
	public Manutencao(int motor, int farois, int desgastePneus) {
		this.motor = motor;
		this.farois = farois;
		this.desgastePneus = desgastePneus;
		
	}
	
	
	
	public int getDesgastePneus() {
		return desgastePneus;
	}
	public void setDesgastePneus(int desgastePneus) {
		this.desgastePneus = desgastePneus;
	}
	public int getDesgasteFreios() {
		return desgasteFreios;
	}
	public void setDesgasteFreios(int desgasteFreios) {
		this.desgasteFreios = desgasteFreios;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}
	public int getFarois() {
		return farois;
	}
	public void setFarois(int farois) {
		this.farois = farois;
	}
	
	
	
}

