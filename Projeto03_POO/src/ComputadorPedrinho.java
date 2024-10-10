import apps.FacebookMensegem;
import apps.MSNMensagem;
import apps.ServicoDeMensagemInstantanea;
import apps.TelegamMensegem;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		
		ServicoDeMensagemInstantanea smi = null;
		
		String appEcolido="fcb";
		
		if (appEcolido.equals("msn")) 
			smi = new MSNMensagem();
		else if(appEcolido.equals("fcb"))
			smi = new FacebookMensegem();
		else if (appEcolido.equals("tlg"))
		    smi = new TelegamMensegem();
		    
		    smi.enviarMensagem();
		    smi.receberMensagem();
		
		   
	}

}
