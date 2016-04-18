package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import figuras.Figura;

public class AreaDeDesenho extends JPanel {

	private static final long serialVersionUID = 6297758630055886097L;

	private List<Figura> figuras;
	private Figura sombra = null;

	public AreaDeDesenho() {
		this.figuras = new ArrayList<Figura>();
		this.setPreferredSize(new Dimension(600, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// desenha algumas figuras
		for (Figura f : figuras) {
			f.desenha(g);
		}
		if (this.sombra != null) {
			this.sombra.desenha(g);
		}
	}

	public void adicionaFigura(Figura f) {
		this.figuras.add(f);
	}

	public void setSombra(Figura sombra) {
		this.sombra = sombra;
	}

	public void limpa() {
		this.figuras.clear();
	}
}
