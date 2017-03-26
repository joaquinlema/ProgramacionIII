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
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window_Inicio {

	private JFrame frame;
	private int[][] posNum;
	private ArrayList<JButton> botones;
	private int cantMov;
	/**
	 * Launch the application.
	 */
	public static void newScreen(String nom) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_Inicio window = new Window_Inicio(nom);
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
	public Window_Inicio(String nom) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		initialize(nom);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String nom) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 415, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTiempo.setBounds(195, -1, 57, 16);
		frame.getContentPane().add(lblTiempo);
		
		JLabel lblJugador = new JLabel("Jugador:");
		lblJugador.setBounds(10, 0, 57, 14);
		frame.getContentPane().add(lblJugador);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(63, 0, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setText(nom);
		
		JLabel lblMov = new JLabel("Mov:");
		lblMov.setBounds(305, 0, 46, 14);
		frame.getContentPane().add(lblMov);
		
		JLabel lblContMov = new JLabel("0");
		lblContMov.setBounds(331, 0, 46, 14);
		frame.getContentPane().add(lblContMov);		
		
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
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(262, 167, 127, 71);
		frame.getContentPane().add(btn9);
		btn9.setVisible(false);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenuItem mntmNuevoJuego = new JMenuItem("Nuevo Juego");
		mntmNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window_Inicio nuevo = new Window_Inicio(nom);
				frame.dispose();
				nuevo.frame.setVisible(true);
			}
		});
		
		mnInicio.add(mntmNuevoJuego);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		
		mnInicio.add(mntmSalir);
		
		JSeparator separator = new JSeparator();
		mnInicio.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 18, 379, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 249, 379, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnArriba = new JButton("Arriba");
		btnArriba.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9.setVisible(true);
				aumentarMov(lblContMov);
			}
		});
		btnArriba.setBounds(161, 262, 77, 23);
		frame.getContentPane().add(btnArriba);
		
		JButton btnAbajo = new JButton("Abajo");
		btnAbajo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9.setVisible(true);
				aumentarMov(lblContMov);
			}
		});
		btnAbajo.setBounds(161, 308, 77, 23);
		frame.getContentPane().add(btnAbajo);
		
		JButton btnIzquierda = new JButton("Izquierda");
		btnIzquierda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9.setVisible(true);
				aumentarMov(lblContMov);
			}
		});
		btnIzquierda.setBounds(109, 285, 89, 23);
		frame.getContentPane().add(btnIzquierda);
		
		JButton btnDerecha = new JButton("Derecha");
		btnDerecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9.setVisible(true);
				aumentarMov(lblContMov);
			}
		});
		btnDerecha.setBounds(196, 285, 89, 23);
		frame.getContentPane().add(btnDerecha);
		
		cargarBtnVal(btn1, btn2, btn4, btn7, btn3, btn5, btn6, btn8, btn9);
		
		cargarMatriz();
		
	}

	//crea matriz para las posiciones de los numeros y los carga con los valores de cada boton
	private void cargarMatriz() {
		posNum = new int[3][3];
		int k =0;
		for (int i = 0; i < posNum.length; i++) {
			for (int j = 0; j < posNum.length; j++) {
				posNum[i][j] = Integer.parseInt(valorBtn(k));
				k++;
			}
		}
	}

	private String valorBtn(int k) {
		return botones.get(k).getText();
	}
	
	private int sumarMov(){
		return cantMov++;
	}
	
	private void aumentarMov(JLabel lblContMov) {
		lblContMov.setText(""+sumarMov());
	}

	private void cargarBtnVal(JButton btn1, JButton btn2, JButton btn4, JButton btn7, JButton btn3, JButton btn5,
			JButton btn6, JButton btn8, JButton btn9) {
		botones = new ArrayList<>();
		botones.add(btn1);
		botones.add(btn2);
		botones.add(btn3);
		botones.add(btn4);
		botones.add(btn5);
		botones.add(btn6);
		botones.add(btn7);
		botones.add(btn8);
		botones.add(btn9);
	}
}
