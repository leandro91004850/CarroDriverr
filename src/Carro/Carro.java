package Carro;

import java.util.Scanner;

public class Carro {
	Scanner teclado = new Scanner(System.in);
	// atributos do carro
	private boolean ligar;
	private int andar;
	private boolean chave;
	private boolean portas;
	private float combustivel;
	private String statusCar;
	private int km;
	
		
	public void Chaves(){
		System.out.print("Você tem a chave do carro: [1-chave/0-semChave]");
		int chave = teclado.nextInt();
		if(chave == 1){ 
		this.setChave(true);
		}else {
			this.setChave(false);
		}
	}
	
	public void PortasFechadas() {
		System.out.print("As portas estão fechadas: [1-sim/0-Nao]");
		int portas = teclado.nextInt();
		if(portas == 1) {
		this.setPortas(true);
		}else {
			this.setPortas(false);
		}
	}
	
	public void aumentaVelocidade() {
		System.out.print("Aumenta velocidade do carro: [1-sim/0-Nao]");
		int velocidade = teclado.nextInt();
		if(velocidade == 1) {
		this.setAndar(this.getAndar() + 5 );
		this.setCombustivel(this.getCombustivel() - 0.5f);
		}
		
	}
	
	public void funcionarCarro() {
				
		if(this.chave == true && this.combustivel > 0 && this.portas != false) {
			System.out.println("\n\n************************************************");
			System.out.println(this.getstatusCar());
			System.out.println("Velocidade: " +getAndar() +" KmH");
			System.out.println("KmH percorridos: " +getKm() +" Km");
			System.out.println("Combustivel: "+getCombustivel() +" Litros");
			System.out.println("\n\n************************************************");
		
			}
				else {
				System.out.println("\n\n************************************************");
				System.out.println("Carro desligado");
				System.out.println(this.getstatusCar());
				System.out.println("\n\n************************************************");
			}
		}
	
	
	public void abastecer (){
		System.out.print("Deseja abastecer o carro: [1-sim/0-Nao]");
		int combustivel = teclado.nextInt();
		if(combustivel == 1) {
		this.setCombustivel(this.getCombustivel() + 1);
		}
	}
	
	public void kmPercorridos() {
		if(this.getAndar() > 10) {
			this.setKm(this.getKm() + 8);
		}else {
			this.setKm(this.getKm()+0);
		}
	}
	
	
	// método construtor
	public Carro(int andar, float combustivel, int km) {
		this.andar = andar;
		this.combustivel = combustivel;
		this.km = km;
		
	}
		
		
	//  métodos gets e sets
	public boolean getLigar() {
		return ligar;
	}
	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public boolean getChave() {
		return chave;
		
	}
	public void setChave(boolean chave) {
		this.chave = chave;
		this.setstatusCar();
	}
	public boolean getPortas() {
		return portas;
	}
	public void setPortas(boolean portas) {
		this.portas = portas;
		this.setstatusCar();
	}
	public float getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
		this.setstatusCar();
	}
	public String getstatusCar() {
		return statusCar;
	}
	private void setstatusCar() {
		if(this.chave == true && this.combustivel > 0 && this.portas != false) {
			this.statusCar = "carro esta pronto para dirigir";
			}else if(this.chave == false && this.combustivel > 0){
				this.statusCar = "você nao tem a chave, não pode dirigir";
				}else if(this.portas != true) {
					this.statusCar = "as portas do carro não estão fechadas";
					}else {
						this.statusCar = "você está sem gasolina";
			}
		}
	
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
}
