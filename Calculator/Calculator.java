import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 242, 372);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 212, 45);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Row 1
		
		JButton btnbs = new JButton("\uF0E7");
		btnbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnbs.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btnbs.setBounds(10, 61, 50, 50);
		frmCalculator.getContentPane().add(btnbs);
		
		JButton btnclr = new JButton("C");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclr.setBounds(64, 61, 50, 50);
		frmCalculator.getContentPane().add(btnclr);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPer.setBounds(118, 61, 50, 50);
		frmCalculator.getContentPane().add(btnPer);
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnP.setBounds(172, 61, 50, 50);
		frmCalculator.getContentPane().add(btnP);
		
		//Row 2
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn7.getText();
				textField.setText(EnterNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 115, 50, 50);
		frmCalculator.getContentPane().add(btn7);
				
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn8.getText();
				textField.setText(EnterNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(64, 115, 50, 50);
		frmCalculator.getContentPane().add(btn8);
				
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn9.getText();
				textField.setText(EnterNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(118, 115, 50, 50);
		frmCalculator.getContentPane().add(btn9);
				
		JButton btnM = new JButton("-");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnM.setBounds(172, 115, 50, 50);
		frmCalculator.getContentPane().add(btnM);
		
		//Row 3
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn4.getText();
				textField.setText(EnterNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 169, 50, 50);
		frmCalculator.getContentPane().add(btn4);
				
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn5.getText();
				textField.setText(EnterNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(64, 169, 50, 50);
		frmCalculator.getContentPane().add(btn5);
				
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn6.getText();
				textField.setText(EnterNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(118, 169, 50, 50);
		frmCalculator.getContentPane().add(btn6);
				
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(172, 169, 50, 50);
		frmCalculator.getContentPane().add(btnMul);
		
		//Row 4
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn1.getText();
				textField.setText(EnterNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 223, 50, 50);
		frmCalculator.getContentPane().add(btn1);
				
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn2.getText();
				textField.setText(EnterNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(64, 223, 50, 50);
		frmCalculator.getContentPane().add(btn2);
				
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn3.getText();
				textField.setText(EnterNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(118, 223, 50, 50);
		frmCalculator.getContentPane().add(btn3);
				
		JButton btnD = new JButton("/");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnD.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnD.setBounds(172, 223, 50, 50);
		frmCalculator.getContentPane().add(btnD);
		
		//Row 5
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn0.getText();
				textField.setText(EnterNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 277, 50, 50);
		frmCalculator.getContentPane().add(btn0);
				
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btndot.getText();
				textField.setText(EnterNum);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(64, 277, 50, 50);
		frmCalculator.getContentPane().add(btndot);
				
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(118, 277, 50, 50);
		frmCalculator.getContentPane().add(btnPM);
				
		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btneq.setFont(new Font("Tahoma", Font.BOLD, 20));
		btneq.setBounds(172, 277, 50, 50);
		frmCalculator.getContentPane().add(btneq);
	}
}

