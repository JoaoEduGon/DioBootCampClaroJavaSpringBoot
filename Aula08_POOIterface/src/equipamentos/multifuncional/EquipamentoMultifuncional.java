package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora  {
	public void copiar() {
		System.out.println("COPIANDO EQUIPAMENTO MULTIFUNCIONAL");
	}
	public void digitalizar() {		
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTFUNCIONAL");
	}
	public void imprimir() {	
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
	}	
}
