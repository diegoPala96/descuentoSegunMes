import static org.junit.Assert.assertTrue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtdia;
	private JLabel lblrespuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	@SuppressWarnings("unused")
	public Principal() {
		Control control= new Control();
	
	 System.out.println( control.calcularPromedio(1, 500, 20) );

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDiaDelMes = new JLabel("dia del mes (1-31)");
		lblDiaDelMes.setBounds(10, 25, 103, 14);
		contentPane.add(lblDiaDelMes);
	
		
		txtdia = new JTextField();

		txtdia.setBounds(147, 22, 86, 20);
		contentPane.add(txtdia);
		txtdia.setColumns(10);
		
		lblrespuesta = new JLabel("%");
		lblrespuesta.setBounds(147, 53, 125, 14);
		contentPane.add(lblrespuesta);
		
		JButton btnok = new JButton("OK");
		btnok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				



				lblrespuesta.setText(control.calcularRecargo(txtdia.getText())+"");
				txtdia.setText("");
			}
		});
		btnok.setBounds(248, 21, 89, 23);
		contentPane.add(btnok);
	}
}
