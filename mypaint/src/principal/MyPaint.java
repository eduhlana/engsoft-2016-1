package principal;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPaint extends JFrame {

	private static final long serialVersionUID = 9090561553377008406L;

	public static void main(String[] args) {
		new MyPaint();
	}

	public MyPaint() {
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho();

		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos(areaDeDesenho);
		areaDeDesenho.addMouseListener(gerenciador);
		areaDeDesenho.addMouseMotionListener(gerenciador);
		
		BarraDeFerramentas barraDeFerramentas = new BarraDeFerramentas(gerenciador);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		painelPrincipal.add(areaDeDesenho, BorderLayout.CENTER);
		painelPrincipal.add(barraDeFerramentas, BorderLayout.PAGE_START);

		this.setContentPane(painelPrincipal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
