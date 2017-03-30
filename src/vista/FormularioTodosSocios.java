package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.ControladorSocio;
import modelo.Socio;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class FormularioTodosSocios extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private ControladorSocio controladorSocio;
	private JTable tabla;
	
	
	
	public ControladorSocio getControladorSocio() {
		return controladorSocio;
	}



	public void setControladorSocio(ControladorSocio controladorSocio) {
		this.controladorSocio = controladorSocio;
	}



	public FormularioTodosSocios(JDialog parent, boolean modal) {
		
		super(parent,modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(69, 29, 291, 185);
		contentPanel.add(scrollPane);
		
		tabla = new JTable();
		tabla.setBounds(69, 29, 291, 183);
		contentPanel.add(tabla);
	}



	public void rellenarTabla(ArrayList<Socio> socios) {
		
		DefaultTableModel dtm= new DefaultTableModel();
		
		String[] cabeceras= {"NOMBRE", "APELLIDOS", "POBLACION"};
		dtm.setColumnIdentifiers(cabeceras);
		for (Socio socio:socios){
			String[] fila={socio.getNombre(),socio.getApellido(),socio.getPoblacion()};
			dtm.addRow(fila);
		}
		tabla.setModel(dtm);
		
		TableRowSorter<DefaultTableModel> modeloOrdenado=new TableRowSorter<DefaultTableModel>();
		tabla.setRowSorter(modeloOrdenado);
		
		
		
	}
}
