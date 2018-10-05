package br.com.gleibsonalves.github.java.se;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class tela1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela1 frame = new tela1();
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
	public tela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel painelPrincipal = new JPanel();
		contentPane.add(painelPrincipal, BorderLayout.NORTH);
		painelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel painelSuper = new JPanel();
		painelSuper.setBackground(SystemColor.inactiveCaption);
		painelPrincipal.add(painelSuper, BorderLayout.NORTH);
		painelSuper.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gleibson Alves\\git\\eclipse.java.se.point_of_sales\\Img\\logo.png"));
		painelSuper.add(lblNewLabel);
		
		JPanel painelLogo = new JPanel();
		painelLogo.setBackground(SystemColor.inactiveCaption);
		painelLogo.setForeground(SystemColor.inactiveCaption);
		painelSuper.add(painelLogo, BorderLayout.EAST);
		painelLogo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("            ");
		lblNewLabel_1.setForeground(SystemColor.inactiveCaption);
		painelLogo.add(lblNewLabel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_2 = new JLabel("             ");
		painelLogo.add(lblNewLabel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_3 = new JLabel("                         ");
		painelLogo.add(lblNewLabel_3, BorderLayout.EAST);
		
		JPanel painelElementoLogin = new JPanel();
		painelElementoLogin.setBackground(SystemColor.inactiveCaption);
		painelLogo.add(painelElementoLogin, BorderLayout.CENTER);
		painelElementoLogin.setLayout(new GridLayout(0, 4, 15, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Tipo:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		painelElementoLogin.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Login:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		painelElementoLogin.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Senha");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		painelElementoLogin.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("     ");
		painelElementoLogin.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecionar", "Admin", "Usuario"}));
		painelElementoLogin.add(comboBox);
		
		textField = new JTextField();
		painelElementoLogin.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		painelElementoLogin.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		painelElementoLogin.add(btnNewButton);
		
		JPanel painelCentral = new JPanel();
		painelPrincipal.add(painelCentral, BorderLayout.WEST);
		painelCentral.setLayout(new BorderLayout(0, 0));
		
		JPanel painelInf = new JPanel();
		painelPrincipal.add(painelInf, BorderLayout.SOUTH);
		painelInf.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
}
