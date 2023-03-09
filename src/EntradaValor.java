import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntradaValor extends JFrame {

	private JPanel contentPane;
	private JTextField moneda1;
	private JTextField moneda2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaValor frame = new EntradaValor();
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
	public EntradaValor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Conversor de Monedas");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(0, 0, 160));
		lblTitulo.setBounds(122, 10, 175, 18);
		contentPane.add(lblTitulo);
		
		final JComboBox comboMonedas = new JComboBox();
		comboMonedas.setModel(new DefaultComboBoxModel(new String[] {"Dólar a Euros", "Dólar a Libras esterlinas", "Dólar a Yen Japonés", "Dólar a Won sul coreano", "Euros a Dólar", "Libras esterlinas a Dólar", "Yen Japonés a Dólar", "Won sul coreano a Dólar"}));
		comboMonedas.setBounds(74, 69, 290, 21);
		contentPane.add(comboMonedas);
		
		JLabel lblNewLabel = new JLabel("Seleccione el tipo de cambio:");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setBounds(72, 46, 155, 13);
		contentPane.add(lblNewLabel);
		
		moneda1 = new JTextField();
		moneda1.setBounds(74, 127, 96, 19);
		contentPane.add(moneda1);
		moneda1.setColumns(10);
		
		final JLabel lblNewLabel_1 = new JLabel("Moneda Inicial ");
		lblNewLabel_1.setBounds(76, 110, 94, 13);
		contentPane.add(lblNewLabel_1);
		
		final JLabel Valor2 = new JLabel("");
		Valor2.setBounds(270, 110, 94, 13);
		contentPane.add(Valor2);
		
		moneda2 = new JTextField();
		moneda2.setColumns(10);
		moneda2.setBounds(268, 127, 96, 19);
		contentPane.add(moneda2);
		
		JButton boton_Convertir = new JButton("Convertir");
		boton_Convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item;
				double x, res;
				String campo= moneda1.getText();
				
				item=comboMonedas.getSelectedItem().toString();
				
				switch(item) {
				case "Dólar a Euros":
					
					ValidarNumero validar=new ValidarNumero ();
					x=Double.parseDouble(moneda1.getText());
					res=x*0.95;
					moneda2.setText(String.valueOf(res));
					Valor2.setText("Euros");
					lblNewLabel_1.setText("Dólar");
					break;
				
				case "Dólar a Libras esterlinas":
					x=Double.parseDouble(moneda1.getText());
					res=x*0.84;
					moneda2.setText(String.valueOf(res));
					Valor2.setText("Libras esterlinas");
					lblNewLabel_1.setText("Dólar");
					break;
				
				case "Dólar a Yen Japonés":
					x=Double.parseDouble(moneda1.getText());
					res=x*136.34;
					moneda2.setText(String.valueOf(res));
					Valor2.setText("Yen Japones");
					lblNewLabel_1.setText("Dólar");
					break;
				
				case "Dólar a Won sul coreano":
					x=Double.parseDouble(moneda1.getText());
					res=x*1320.72;
					moneda2.setText(String.valueOf(res));
					Valor2.setText("Won sul coreano");
					lblNewLabel_1.setText("Dólar");
					break;
				
				case "Euros a Dólar":
					x=Double.parseDouble(moneda1.getText());
					res=x*1.06;
					moneda2.setText(String.valueOf(res));
					Valor2.setText("Dólar  estadounidense");
					lblNewLabel_1.setText("Euros");
					break;
					
				case "Libras esterlinas a Dólar":
					x=Double.parseDouble(moneda1.getText());
					res=x*1.19;
					moneda2.setText(String.valueOf(res));
					Valor2.setText("Dólar estadounidense");
					lblNewLabel_1.setText("Libras esterlinas");
					break;
					
				case "Yen Japonés a Dólar":
					x=Double.parseDouble(moneda1.getText());
					res=x*0.0073;
					moneda2.setText(String.valueOf(res));
					Valor2.setText("Dólar estadounidense");
					lblNewLabel_1.setText("Yen Japonés");
					break;
					
				case "Won sul coreano a Dólar":
					x=Double.parseDouble(moneda1.getText());
					res=x*0.00076;
					moneda2.setText(String.valueOf(res));
					Valor2.setText("Dólar estadounidense");
					lblNewLabel_1.setText("Won sul coreano");
					
					break;
				
					
				
				
				}

			}
		});
		boton_Convertir.setBounds(74, 214, 96, 21);
		contentPane.add(boton_Convertir);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moneda2.setText("");
				moneda1.setText("");
			}
		});
		btnNewButton.setBounds(180, 214, 94, 21);
		contentPane.add(btnNewButton);
		
		JButton RegresarMenu = new JButton("Regresar");
		RegresarMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuPrincipal regresa=new menuPrincipal();
				regresa.setVisible(true);
				
			}
		});
		RegresarMenu.setBounds(284, 214, 94, 21);
		contentPane.add(RegresarMenu);
	}
}
