import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuPrincipal frame = new menuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tipo de Conversor");
		lblTitulo.setBounds(5, 5, 426, 17);
		lblTitulo.setForeground(new Color(0, 0, 160));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo);
		
		final JComboBox combo1 = new JComboBox();
		combo1.setModel(new DefaultComboBoxModel(new String[] {"Conversor de moneda", "Conversor de peso"}));
		combo1.setBounds(71, 65, 253, 17);
		contentPane.add(combo1);
		
		JLabel lblNewLabel = new JLabel("Seleccione el tipo de Conversión:");
		lblNewLabel.setBounds(29, 32, 236, 13);
		contentPane.add(lblNewLabel);
		
		JButton bEntrar = new JButton("Ingresar");
		bEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item;
				item=combo1.getSelectedItem().toString();
				
				if (item.equalsIgnoreCase("Conversor de moneda")) {
					EntradaValor ventana1= new EntradaValor();
					ventana1.setVisible(true);
				
				}else {
					if (item.equalsIgnoreCase("Conversor de peso")) {
						VentanaPeso ventana2= new VentanaPeso();
						ventana2.setVisible(true);
						
				}	
						
				}
			}

			
		});
		bEntrar.setBounds(71, 134, 103, 26);
		contentPane.add(bEntrar);
		
		JButton bSalir = new JButton("Salir");
		bSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		bSalir.setBounds(245, 137, 79, 26);
		contentPane.add(bSalir);
	}
}
