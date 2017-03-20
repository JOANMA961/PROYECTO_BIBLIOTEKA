package vista.socio;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorSocio;
import vista.Principal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionSocio extends JDialog {


	private final JPanel contentPanel = new JPanel();


	
	private ControladorSocio  controladorSocio;
	private Component consultas;
	private AbstractButton nuevo;

	
	
	public ControladorSocio getControladorSocio() {
		return controladorSocio;
	}



	public void setControladorSocio(ControladorSocio controladorSocio) {
		this.controladorSocio = controladorSocio;
	}


	/**
	 * Create the dialog.
	 */
	public GestionSocio(Principal principal, boolean modal) {
		super(principal, modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 261);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JButton nuevo = new JButton("NUEVO SOCIO");
			nuevo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					controladorSocio.abrirFormularioSocio();
				}
			});
			nuevo.setBounds(25, 71, 189, 23);
			contentPanel.add(nuevo);
			{
				JButton borrar = new JButton("BORRAR SOCIO");
				borrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						controladorSocio.abrirFormDeBorrado();
					}
				});
				borrar.setBounds(25, 105, 189, 23);
				contentPanel.add(borrar);
			}
			{
				JButton modificar = new JButton("MODIFICAR SOCIOS");
				modificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						controladorSocio.abrirFormDeModificar();
					}
				});
				
				modificar.setBounds(25, 139, 189, 23);
				contentPanel.add(modificar);
			}
			
		}
	}


}
