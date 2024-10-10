package apps;

public abstract class ServicoDeMensagemInstantanea {

	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void ValidarConectadoInternet() {
			System.out.println("Validando se está  conectado internet");
		}
	
}
