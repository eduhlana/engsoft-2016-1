package principal;

import figuras.Elipse;
import figuras.Figura;

public class FerramentaElipse extends Ferramenta {

	@Override
	public Figura criaFigura(int x1, int y1, int x2, int y2) {
		return new Elipse(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
	}

	@Override
	public String getNome() {
		return "Elipse";
	}
}
