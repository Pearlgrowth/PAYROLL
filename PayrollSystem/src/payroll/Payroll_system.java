package payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payroll_system {

	private JFrame frame;
	private JTextField textFieldEmpName;
	private JTextField textFieldRph;
	private JTextField textFieldhourPerDay;
	private JLabel nodw;
	private JTextField textFieldnumberOfDaysWorked;
	private JTextField textFieldgrossSalary;
	private JTextField Tax;
	private JLabel health;
	private JTextField textFieldHealth;
	private JTextField textFieldSSS;
	private JTextField totalDeduction;
	private JTextField grossSalary;
	private JTextField textFielddeduction;
	private JTextField textFieldnetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll_system window = new Payroll_system();
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
	public Payroll_system() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1025, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(273, 10, 313, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel employeeName = new JLabel("Employee Name:");
		employeeName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		employeeName.setBounds(53, 75, 108, 13);
		frame.getContentPane().add(employeeName);
		
		textFieldEmpName = new JTextField();
		textFieldEmpName.setBounds(187, 73, 126, 19);
		frame.getContentPane().add(textFieldEmpName);
		textFieldEmpName.setColumns(10);
		
		JLabel ratePerHour = new JLabel("Rate Per Hour:");
		ratePerHour.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ratePerHour.setBounds(63, 104, 96, 13);
		frame.getContentPane().add(ratePerHour);
		
		textFieldRph = new JTextField();
		textFieldRph.setBounds(187, 102, 126, 19);
		frame.getContentPane().add(textFieldRph);
		textFieldRph.setColumns(10);
		
		JLabel hpd = new JLabel("Hour Per Day:");
		hpd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		hpd.setBounds(65, 140, 96, 13);
		frame.getContentPane().add(hpd);
		
		textFieldhourPerDay = new JTextField();
		textFieldhourPerDay.setBounds(187, 138, 126, 19);
		frame.getContentPane().add(textFieldhourPerDay);
		textFieldhourPerDay.setColumns(10);
		
		nodw = new JLabel("Number of days worked:");
		nodw.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nodw.setBounds(10, 180, 148, 13);
		frame.getContentPane().add(nodw);
		
		textFieldnumberOfDaysWorked = new JTextField();
		textFieldnumberOfDaysWorked.setBounds(187, 178, 126, 19);
		frame.getContentPane().add(textFieldnumberOfDaysWorked);
		textFieldnumberOfDaysWorked.setColumns(10);
		
		JLabel gs = new JLabel("GROSS SALARY:");
		gs.setFont(new Font("Verdana", Font.BOLD, 17));
		gs.setBounds(0, 236, 166, 13);
		frame.getContentPane().add(gs);
		
		textFieldgrossSalary = new JTextField();
		textFieldgrossSalary.setEditable(false);
		textFieldgrossSalary.setBounds(187, 230, 126, 19);
		frame.getContentPane().add(textFieldgrossSalary);
		textFieldgrossSalary.setColumns(10);
		
		JLabel ds = new JLabel("DEDUCTION OF SALARY:");
		ds.setForeground(new Color(255, 0, 0));
		ds.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ds.setBounds(373, 73, 240, 13);
		frame.getContentPane().add(ds);
		
		JLabel tax = new JLabel("TAX 15% of Monthly Wage");
		tax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tax.setBounds(357, 104, 181, 17);
		frame.getContentPane().add(tax);
		
		Tax = new JTextField();
		Tax.setEditable(false);
		Tax.setBounds(556, 102, 96, 19);
		frame.getContentPane().add(Tax);
		Tax.setColumns(10);
		
		health = new JLabel("PhilHealth 5%");
		health.setFont(new Font("Tahoma", Font.PLAIN, 13));
		health.setBounds(433, 133, 105, 26);
		frame.getContentPane().add(health);
		
		textFieldHealth = new JTextField();
		textFieldHealth.setEditable(false);
		textFieldHealth.setBounds(556, 138, 96, 19);
		frame.getContentPane().add(textFieldHealth);
		textFieldHealth.setColumns(10);
		
		JLabel SSS = new JLabel("SSS 2%");
		SSS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		SSS.setBounds(461, 180, 105, 13);
		frame.getContentPane().add(SSS);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setEditable(false);
		textFieldSSS.setBounds(556, 178, 96, 19);
		frame.getContentPane().add(textFieldSSS);
		textFieldSSS.setColumns(10);
		
		JLabel deduction = new JLabel("TOTAL DEDUCTION:");
		deduction.setFont(new Font("Verdana", Font.BOLD, 17));
		deduction.setBounds(354, 236, 232, 13);
		frame.getContentPane().add(deduction);
		
		totalDeduction = new JTextField();
		totalDeduction.setEditable(false);
		totalDeduction.setBounds(556, 237, 96, 19);
		frame.getContentPane().add(totalDeduction);
		totalDeduction.setColumns(10);
		
		JLabel salary = new JLabel("Gross Salary:");
		salary.setFont(new Font("Tahoma", Font.PLAIN, 13));
		salary.setBounds(766, 104, 90, 13);
		frame.getContentPane().add(salary);
		
		grossSalary = new JTextField();
		grossSalary.setEditable(false);
		grossSalary.setBounds(905, 102, 96, 19);
		frame.getContentPane().add(grossSalary);
		grossSalary.setColumns(10);
		
		JLabel deduction2 = new JLabel("Deduction:");
		deduction2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		deduction2.setBounds(776, 157, 96, 13);
		frame.getContentPane().add(deduction2);
		
		textFielddeduction = new JTextField();
		textFielddeduction.setEditable(false);
		textFielddeduction.setBounds(905, 155, 96, 19);
		frame.getContentPane().add(textFielddeduction);
		textFielddeduction.setColumns(10);
		
		JLabel ns = new JLabel("NET SALARY:");
		ns.setFont(new Font("Verdana", Font.BOLD, 17));
		ns.setBounds(748, 243, 138, 13);
		frame.getContentPane().add(ns);
		
		textFieldnetSalary = new JTextField();
		textFieldnetSalary.setEditable(false);
		textFieldnetSalary.setBounds(905, 237, 96, 19);
		frame.getContentPane().add(textFieldnetSalary);
		textFieldnetSalary.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hpd, nodw,ratePerHour,gs;
				employeeName.getText();
				hpd=Integer.valueOf(textFieldhourPerDay.getText());
				nodw=Integer.valueOf(textFieldnumberOfDaysWorked.getText());
				ratePerHour=Integer.valueOf(textFieldRph.getText());
				gs=hpd * nodw * ratePerHour;
				textFieldgrossSalary.setText(String.valueOf(gs));
				double tax=0.15* gs;
				Tax.setText(String.valueOf(tax));
				double health= 0.05* gs;
				textFieldHealth.setText(String.valueOf(health));
				double SSS= 0.02* gs;
				textFieldSSS.setText(String.valueOf(SSS));
				double deduction= tax+health+SSS;
				totalDeduction.setText(String.valueOf(deduction));
				grossSalary.setText(String.valueOf(gs));
				textFielddeduction.setText(String.valueOf(deduction));
				double ns= gs- deduction;
				textFieldnetSalary.setText(String.valueOf(ns));	
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(51, 153, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(399, 308, 139, 35);
		frame.getContentPane().add(btnNewButton);
	}

}

