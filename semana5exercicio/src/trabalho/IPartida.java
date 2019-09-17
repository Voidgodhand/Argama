package trabalho;

public interface IPartida {
	public abstract void iniciarPartida();
	public void mostrarResultado(String nomeLocal, String nomeVisitante);
	public void finalizarPartida(Time t1, Time t2);
}
