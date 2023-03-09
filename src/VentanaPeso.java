import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;

public class VentanaPeso extends JFrame {

	private JPanel contentPane;
	private JTextField peso1;
	private JTextField peso2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPeso frame = new VentanaPeso();
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
	public VentanaPeso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloPeso = new JLabel("Conversor de Peso");
		lblTituloPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPeso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTituloPeso.setBounds(171, 32, 307, 27);
		contentPane.add(lblTituloPeso);
		
		final JComboBox comboPeso = new JComboBox();
		comboPeso.setModel(new DefaultComboBoxModel(new String[] {"Libras a Kilos", "Kilos a Libras", "Kilos en la Tierra a Kilos en la Luna","Kilos en la Tierra a Kilos en Mercurio", "Kilos en la Tierra a Kilos en Júpiter"}));
		comboPeso.setBounds(205, 108, 252, 21);
		contentPane.add(comboPeso);
		
		final JLabel lblPeso1 = new JLabel("Peso Inicial");
		lblPeso1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPeso1.setBounds(63, 160, 125, 21);
		contentPane.add(lblPeso1);
		
		peso1 = new JTextField();
		peso1.setText(" ");
		peso1.setBounds(240, 161, 96, 19);
		contentPane.add(peso1);
		peso1.setColumns(10);
		
		final JLabel pfinal = new JLabel("Peso final");
		pfinal.setBounds(63, 253, 155, 13);
		contentPane.add(pfinal);
		
		JButton bconvertirPeso = new JButton("Convertir");
		bconvertirPeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item;
				double x, res;
				
				item=comboPeso.getSelectedItem().toString();
				
				switch(item) {
				case "Libras a Kilos":
					x=Double.parseDouble(peso1.getText());
					res=x*0.453592;
					peso2.setText(String.valueOf(res));
					lblPeso1.setText("Libras");
					pfinal.setText("Kilos");
					break;
					
				case "Kilos a Libras":
					x=Double.parseDouble(peso1.getText());
					res=x*2.20462;
					peso2.setText(String.valueOf(res));
					lblPeso1.setText("Kilos");
					pfinal.setText("Libras");
					break;
				
				case "Kilos en la Tierra a Kilos en la Luna":
					x=Double.parseDouble(peso1.getText());
					res=x*0.1667;
					peso2.setText(String.valueOf(res));
					lblPeso1.setText("Kilos en la Tierra");
					pfinal.setText("Kilos en la Luna");
					break;
					
				case "Kilos en la Tierra a Kilos en Mercurio":
					x=Double.parseDouble(peso1.getText());
					res=x*0.3778;
					peso2.setText(String.valueOf(res));
					lblPeso1.setText("Kilos en la Tierra");
					pfinal.setText("Kilos en Mercurio");
					break;
				
				case "Kilos en la Tierra a Kilos en Júpiter":
					x=Double.parseDouble(peso1.getText());
					res=x*2.527;
					peso2.setText(String.valueOf(res));
					lblPeso1.setText("Kilos en la Tierra");
					pfinal.setText("Kilos en Júpiter" );
					break;
				
				}
				
			}
		});
		bconvertirPeso.setBounds(498, 108, 103, 21);
		contentPane.add(bconvertirPeso);
		
		peso2 = new JTextField();
		peso2.setEditable(false);
		peso2.setText("");
		peso2.setBounds(240, 250, 155, 19);
		contentPane.add(peso2);
		peso2.setColumns(10);
		
		JButton bRegresar = new JButton("Regresar");
		bRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				menuPrincipal menuInicial=new menuPrincipal();
				menuInicial.setVisible(true);
				
				
				
			}
		});
		bRegresar.setBounds(498, 209, 103, 21);
		contentPane.add(bRegresar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peso1.setText("");
				peso2.setText("");
				
			}
		});
		btnLimpiar.setBounds(498, 160, 103, 21);
		contentPane.add(btnLimpiar);
	}
}
