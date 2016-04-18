package principal;

import figuras.Figura;
import figuras.Linha;

public class FerramentaLinha extends Ferramenta {

	@Override
	public Figura criaFigura(int x1, int y1, int x2, int y2) {
		return new Linha(x1, y1, x2, y2);
	}

	@Override
	public String getNome() {
		return "Linha";
	}

}
