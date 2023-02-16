package Aula03;

public class MainCaneta01Alula4 {

	public static void main(String[] args) {
		
		Caneta01Alula3 c1 = new Caneta01Alula3();
		
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5; 	PRIVADO!!!
		c1.carga = 85;
		//c1.tampada = false;
		
		c1.destampar();
			
		c1.status();
		
		c1.rabiscar();
		
		
	}

}
