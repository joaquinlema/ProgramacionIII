package juego;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Window_Inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_Inicio window = new Window_Inicio();
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
	public Window_Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 27, 127, 71);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(136, 27, 127, 71);
		frame.getContentPane().add(btn2);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 97, 127, 71);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 167, 127, 71);
		frame.getContentPane().add(btn7);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(262, 27, 127, 71);
		frame.getContentPane().add(btn3);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(136, 97, 127, 71);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(262, 97, 127, 71);
		frame.getContentPane().add(btn6);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(136, 167, 127, 71);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("\"\"");
		btn9.setBounds(262, 167, 127, 71);
		frame.getContentPane().add(btn9);
		
		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTiempo.setBounds(10, 275, 57, 22);
		frame.getContentPane().add(lblTiempo);
		
		JLabel lblTiempoCont = new JLabel("0");
		lblTiempoCont.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTiempoCont.setBounds(72, 281, 46, 14);
		frame.getContentPane().add(lblTiempoCont);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenuItem mntmNuevoJuego = new JMenuItem("Nuevo Juego");
		mnInicio.add(mntmNuevoJuego);
		
		JSeparator separator = new JSeparator();
		mnInicio.add(separator);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnInicio.add(mntmSalir);
		
		
	}
}
