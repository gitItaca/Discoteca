package DI2021.Discoteca.GUI;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MisAlbums {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MisAlbums window = new MisAlbums();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MisAlbums() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 250, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(35, 92, 62, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Año");
		lblNewLabel_1.setBounds(35, 117, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Artista");
		lblNewLabel_2.setBounds(35, 142, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Formato");
		lblNewLabel_3.setBounds(35, 167, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(97, 89, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(97, 114, 96, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(97, 139, 96, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(97, 164, 96, 20);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("ATRAS");
		btnNewButton.setBounds(10, 205, 102, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAdelante = new JButton("ADELANTE");
		btnAdelante.setBounds(122, 205, 106, 38);
		frame.getContentPane().add(btnAdelante);
		
		JButton btnClose = new JButton("X");
		btnClose.setBorderPainted(false);
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options = {"Close", "Cancel"};
                int m = JOptionPane.showOptionDialog(frame, "¿Está seguro de que quiere salir?", "Salir del programa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
                if (m == 0) {
                    System.exit(0);
                }
				//CerrarVentanaConfirmar.main(null);
			}
		});

		btnClose.setBounds(193, 0, 57, 52);
		frame.getContentPane().add(btnClose);
		
		
	}
}
