package classmanagement;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.*;


public class project implements ActionListener{

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField resultField;
	DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project window = new project();
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
		public project() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			
			frame = new JFrame();
			frame.getContentPane().setBackground(SystemColor.info);
			frame.getContentPane().setForeground(SystemColor.info);
			frame.setBounds(100, 100, 1315, 772);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Automation Traffic Light System");
			lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 32));
			lblNewLabel.setBounds(351, 33, 664, 115);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1_1 = new JLabel("01 st Lane");
			lblNewLabel_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
			lblNewLabel_1_1.setBounds(113, 230, 273, 54);
			frame.getContentPane().add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_1_2 = new JLabel("03 rd Lane");
			lblNewLabel_1_1_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
			lblNewLabel_1_1_2.setBounds(113, 342, 273, 54);
			frame.getContentPane().add(lblNewLabel_1_1_2);
			
			textField1 = new JTextField();
			textField1.setBounds(278, 245, 61, 32);
			frame.getContentPane().add(textField1);
			textField1.setColumns(10);
			
			textField2 = new JTextField();
			textField2.setColumns(10);
			textField2.setBounds(278, 299, 61, 33);
			frame.getContentPane().add(textField2);
			
			textField3 = new JTextField();
			textField3.setColumns(10);
			textField3.setBounds(278, 357, 61, 32);
			frame.getContentPane().add(textField3);
			
			textField4 = new JTextField();
			textField4.setColumns(10);
			textField4.setBounds(278, 415, 61, 32);
			frame.getContentPane().add(textField4);
			
			JLabel lblNewLabel_1 = new JLabel("Vehicle Count Of Each Lane");
			lblNewLabel_1.setBounds(93, 158, 273, 62);
			frame.getContentPane().add(lblNewLabel_1);
			lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
			
			JButton btnNewButton = new JButton("OK");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(0, 0, 0));
			btnNewButton.setBounds(278, 475, 61, 38);
			frame.getContentPane().add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					calculate();
				}
			});
			
			
			//result
			resultField = new JTextField();
			resultField.setBounds(113, 500, 100, 50);
			frame.getContentPane().add(resultField);
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(500, 221, 455, 429);
			frame.getContentPane().add(panel_1);
			
			JLabel lblNewLabel_1_1_2_1 = new JLabel("02 nd Lane");
			lblNewLabel_1_1_2_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
			lblNewLabel_1_1_2_1.setBounds(113, 293, 273, 54);
			frame.getContentPane().add(lblNewLabel_1_1_2_1);
			
			JLabel lblNewLabel_1_1_2_2 = new JLabel("04 th Lane");
			lblNewLabel_1_1_2_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
			lblNewLabel_1_1_2_2.setBounds(113, 406, 273, 54);
			frame.getContentPane().add(lblNewLabel_1_1_2_2);
			model = new DefaultTableModel();
			Object[] coloumn= {"1","2","3","4"};
			final Object[] row = new Object[4];
			model.setColumnIdentifiers(coloumn);
			
		}
		@Override
		public void actionPerformed(ActionEvent e){
			calculate();
		}
		public void calculate(){
			
			int lane1 = Integer.valueOf(textField1.getText());
			int lane2 = Integer.valueOf(textField2.getText());
			int lane3 = Integer.valueOf(textField3.getText());
			int lane4 = Integer.valueOf(textField4.getText());

			int max = 0;

			
			int result = lane1 + lane2 + lane3 + lane4;

			
			resultField.setText(String.valueOf(result));
			
		}
	}
