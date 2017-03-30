package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class AltaSocio extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AltaSocio dialog = new AltaSocio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AltaSocio() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnNuevoSocio = new JButton("NUEVO SOCIO");
			btnNuevoSocio.setBounds(162, 71, 107, 23);
			contentPanel.add(btnNuevoSocio);
		}
		{
			JButton btnSocio = new JButton("BORRAR SOCIO");
			btnSocio.setBounds(162, 105, 117, 23);
			contentPanel.add(btnSocio);
		}
		{
			JButton btnConsultasSocio = new JButton("CONSULTAS SOCIO");
			btnConsultasSocio.setBounds(148, 139, 135, 23);
			contentPanel.add(btnConsultasSocio);
		}
		{
			JLabel lblGestionSocio = new JLabel("Gestion Socio");
			lblGestionSocio.setBounds(162, 38, 109, 22);
			lblGestionSocio.setFont(new Font("Times New Roman", Font.BOLD, 18));
			contentPanel.add(lblGestionSocio);
		}
	}

}
