package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class BarraDeFerramentas extends JToolBar {

	private static final long serialVersionUID = -8292143412476774295L;

	private ButtonGroup grupo;
	private final GerenciadorDeEventos ge;

	public BarraDeFerramentas(GerenciadorDeEventos gerenciadorDeEventos) {
		super("Barra de Ferramentas");
		this.ge = gerenciadorDeEventos;
		this.grupo = new ButtonGroup();

		Ferramenta[] ferramentas = new Ferramenta[] {
				new FerramentaRetangulo(),
				new FerramentaElipse(),
				new FerramentaLinha() 
		};
		for (Ferramenta f : ferramentas) {
			criarBotao(f);
		}

		JButton botaoLimpar = new JButton("Limpar");
		botaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ge.limpaAreaDeDesenho();
			}
		});
		this.add(botaoLimpar);
		
		this.setFloatable(false);
	}

	private JRadioButton criarBotao(final Ferramenta ferramenta) {
		JRadioButton botao = new JRadioButton(ferramenta.getNome());
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ge.setFerramenta(ferramenta);
			}
		});
		grupo.add(botao);
		this.add(botao);
		if (ferramenta.ehFerramentaPadrao()) {
			botao.getModel().setSelected(true);
			ge.setFerramenta(ferramenta);
		}
		return botao;
	}

}
