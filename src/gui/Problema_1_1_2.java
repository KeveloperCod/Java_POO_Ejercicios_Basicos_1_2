package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import semana_01.Filmacion;

public class Problema_1_1_2  extends JFrame {

	private JPanel contentPane;
	private JTextArea txtReporte;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_1_1_2 frame = new Problema_1_1_2();
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
	public Problema_1_1_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			txtReporte = new JTextArea();
			txtReporte.setBounds(10, 76, 480, 310);
			contentPane.add(txtReporte);
		}
		{
			btnCalcular = new JButton("Resultado");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//Declarando y creando un objeto de tipo Docente
					Filmacion d= new Filmacion();
					  //Ingresamos datos fijos
					  d.codigo = 123;
					  d.titulo = "Shrek";
					  d.duracionMinutos = 120;
					  d.soles = 90;	 
					  //Visutalice todos sus datos 
					  imprimir("DirMen  :   " + d);
					  imprimir("Codigo  :   " + d.codigo);
					  imprimir("Nombre  :   " + d.titulo);
					  imprimir("Ducacion Minutos  :   " + d.duracionMinutos);
					  imprimir("Precio en soles  :   " + d.soles);
					  imprimir("Precio en dolares  :   " + d.precioDolares() + "\n"+"\n ");
					  
					  
					  
					  
					// Crear otro Filmacion
					  Filmacion d2= new Filmacion();
					  //Ingresamos datos fijos
					  d2.codigo = 1234;
					  d2.titulo = "Panico";
					  d2.duracionMinutos = 120;
					  d2.soles = 240;	 
					   //Visutalice todos sus datos 
						  imprimir("DirMen  :   " + d2);
						  imprimir("Codigo  :   " + d2.codigo);
						  imprimir("Nombre  :   " + d2.titulo);
						  imprimir("Ducacion Minutos  :   " + d2.duracionMinutos);
						  imprimir("Precio en soles  :   " + d2.soles);
						  imprimir("Precio en dolares  :   " + d2.precioDolares());
  

				}		
				
				
				
				
				 void imprimir(String s) {
					 
					 txtReporte.append(s + "\n");
					 
				}
			});
			btnCalcular.setBounds(202, 30, 89, 23);
			contentPane.add(btnCalcular);
		}
	}
}
