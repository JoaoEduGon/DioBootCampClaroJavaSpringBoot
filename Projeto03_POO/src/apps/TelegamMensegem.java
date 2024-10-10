package apps;

public class TelegamMensegem extends ServicoDeMensagemInstantanea {

	public void enviarMensagem() {
		ValidarConectadoInternet();
		System.out.println("Enviar mensagem pelo Telegram ");
	}

	public void receberMensagem() {
		System.out.println("Receber mensagem pelo Telegram");
	}

}
