package Notas;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Notas extends JFrame {

	private JPanel contentPane;
	private JTextField tfnota;
	private String cadenas1="", cadenas3;
	Archivo archi=new Archivo();
	Archivo leer =new Archivo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notas frame = new Notas();
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
	public Notas() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Guardar = new JButton("Guardar");
		Guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadenas1=cadenas1+tfnota.getText().toString()+"\n";
				archi.guardar(cadenas1);
			}
		});
		Guardar.setBounds(29, 46, 89, 23);
		contentPane.add(Guardar);
		
		tfnota = new JTextField();
		tfnota.setBounds(32, 95, 86, 20);
		contentPane.add(tfnota);
		tfnota.setColumns(10);
		
		JButton btnNewButton = new JButton("Actualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Archivo archi=new Archivo();
				//cadenas1=cadenas1+tfnota.getText().toString()+"\n";
				
				archi.guardar(cadenas3);
				
			}
	
		
		});
		btnNewButton.setBounds(29, 133, 89, 23);
		contentPane.add(btnNewButton);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(128, 45, 161, 139);
		contentPane.add(textArea);
		
		JButton LeerDatos = new JButton("Leer datos");
		LeerDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cadenas2="";
				
				ArrayList<String> Datos=leer.leer();
				for(String elemento:Datos) {
					cadenas2=cadenas2+elemento+"\n";
				}
				
				textArea.setText(cadenas2);
				//cadenas3=textArea.getText();
			
			}
		});
		LeerDatos.setBounds(29, 161, 89, 23);
		contentPane.add(LeerDatos);
		setTitle("Notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 320);
		
	}
}
