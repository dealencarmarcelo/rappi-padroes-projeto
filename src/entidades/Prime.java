package entidades;

public class Prime implements Multiplicador {

	@Override
	public int calcularPontos(int pontos) {
		return  pontos * 2;
	}
}