
package figuras;

import java.awt.Graphics;

public class Elipse extends Figura {

	private int altura;
	private int largura;

	public Elipse(int x, int y, int largura, int altura) {
		super(x, y);
		this.altura = altura;
		this.largura = largura;
	}

	public String imprime() {
		return "Elipse[X:" + this.x + ",Y:" + this.y + ",l:" + this.largura + ",a:" + this.altura + "]";
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

	@Override
	public void desenha(Graphics g) {
		g.drawOval(x, y, largura, altura);
	}
	
}

