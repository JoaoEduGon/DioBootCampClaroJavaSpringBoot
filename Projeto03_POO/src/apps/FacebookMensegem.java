package apps;

public class FacebookMensegem extends ServicoDeMensagemInstantanea {
	

	public void enviarMensagem() {
		ValidarConectadoInternet();
		System.out.println("Enviar mensagem pelo Facebook ");
	}

	public void receberMensagem() {
		System.out.println("Receber mensagem pelo Facebook");
	}

}
