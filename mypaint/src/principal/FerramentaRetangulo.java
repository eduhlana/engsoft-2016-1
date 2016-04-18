package principal;

import figuras.Figura;
import figuras.Retangulo;

public class FerramentaRetangulo extends Ferramenta {

	@Override
	public Figura criaFigura(int x1, int y1, int x2, int y2) {
		return new Retangulo(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
	}

	@Override
	public String getNome() {
		return "Retangulo";
	}

	public boolean ehFerramentaPadrao() {
		return true;
	}
}
