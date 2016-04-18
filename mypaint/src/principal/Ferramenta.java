package principal;

import figuras.Figura;

public abstract class Ferramenta {

	public abstract Figura criaFigura(int x1, int y1, int x2, int y2);

	public abstract String getNome();

	public boolean ehFerramentaPadrao() {
		return false;
	}

}
