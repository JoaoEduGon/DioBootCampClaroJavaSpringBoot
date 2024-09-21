
package ControleTv;

public class SmartTV {
			
	    boolean ligada=false;
		int Canal = 1;
		int Volume = 25;	
		
		
		public void mudarCanal(int novoCanal) {
			Canal = novoCanal;
		}
		
		public void aumentarCanal() {
			Volume++;			
		}
		
		public void aumentarDiminuir() {
			Volume--;			
		}
		
		public void aumentarVolume() {
			Volume++;			
			System.out.println("Aumentando volume para :" + Volume);
		}
		
		public void diminuirVolume() {
			Volume--;			
			System.out.println("Diminuindo volume para :" + Volume);
		}
			
		public void ligar() {
			ligada=true;	
		}

		public void desligar() {
			ligada=false;
		}
	}




