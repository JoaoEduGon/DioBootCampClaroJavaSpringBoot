package apps;

public class MSNMensagem extends ServicoDeMensagemInstantanea {

	public void enviarMensagem() {
		ValidarConectadoInternet();
		System.out.println("Enviar mensagem pelo MSN ");
	}

	public void receberMensagem() {
		System.out.println("Receber mensagem pelo MSN");
	}

}
