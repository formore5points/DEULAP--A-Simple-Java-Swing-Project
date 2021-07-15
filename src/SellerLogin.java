import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SellerLogin {

	JFrame frmLogIn;
	private JTextField txtUserName;
	private JPasswordField passwordField;
    private JButton btnLogIn;
	
	public SellerLogin() 
	{
		frmLogIn = new JFrame();
		frmLogIn.setTitle("Log in");
		frmLogIn.setBounds(100, 100, 316, 197);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("Username: ");
		lblUserName.setBounds(55, 31, 78, 14);
		frmLogIn.getContentPane().add(lblUserName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(143, 28, 86, 20);
		txtUserName.setColumns(10);
		frmLogIn.getContentPane().add(txtUserName);
		
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(55, 65, 78, 14);
		frmLogIn.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 59, 86, 20);
		frmLogIn.getContentPane().add(passwordField);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(txtUserName.getText().equals("erkan") &&
						passwordField.getText().equals("gok"))
				{					
					frmLogIn.setVisible(false);
					Seller_Selection s=new Seller_Selection();
					s.setVisible(true);
				}
				else if(txtUserName.getText().equals("kadir") &&
						passwordField.getText().equals("adali"))
				{
						frmLogIn.setVisible(false);
						Seller_Selection s=new Seller_Selection();
						s.setVisible(true);
				}
				else
				{
					txtUserName.setText("");
					passwordField.setText("");
					JOptionPane.showMessageDialog(frmLogIn, "Wrong password or user name");

				}
			}
		});
		btnLogIn.setBounds(140, 105, 89, 23);
		frmLogIn.getContentPane().add(btnLogIn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectionScreen s=new SelectionScreen();
				frmLogIn.setVisible(false);
				s.setVisible(true);
			}
		});
		btnBack.setBounds(0, 0, 89, 23);
		frmLogIn.getContentPane().add(btnBack);
		
		
	}
}
