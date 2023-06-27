import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public  class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displayarea;
	private  int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD, 19));
		lblNewLabel.setBounds(196, 24, 211, 20);
		contentPane.add(lblNewLabel);
		
		length = new JTextField();
		length.setForeground(new Color(0, 128, 64));
		length.setBackground(new Color(255, 255, 255));
		length.setFont(new Font("Sitka Text", Font.BOLD, 15));
		length.setBounds(274, 72, 220, 33);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CREATE STACK BUTTON
			  size=Integer.valueOf(length.getText());
				s=new int[size];
				String message="Stack of Size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		stack.setForeground(new Color(128, 0, 128));
		stack.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		stack.setBounds(274, 116, 190, 46);
		contentPane.add(stack);
		
		JLabel lblEnterStackLength = new JLabel("ENTER STACK LENGTH");
		lblEnterStackLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterStackLength.setForeground(new Color(128, 0, 0));
		lblEnterStackLength.setFont(new Font("SimSun-ExtB", Font.BOLD, 19));
		lblEnterStackLength.setBounds(35, 72, 211, 33);
		contentPane.add(lblEnterStackLength);
		
		JLabel lblEnterAnElemeent = new JLabel("ENTER AN ELEMEENT");
		lblEnterAnElemeent.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAnElemeent.setForeground(new Color(128, 0, 0));
		lblEnterAnElemeent.setFont(new Font("SimSun-ExtB", Font.BOLD, 19));
		lblEnterAnElemeent.setBounds(35, 173, 211, 33);
		contentPane.add(lblEnterAnElemeent);
		
		element = new JTextField();
		element.setForeground(new Color(0, 128, 64));
		element.setFont(new Font("Sitka Text", Font.BOLD, 15));
		element.setColumns(10);
		element.setBackground(Color.WHITE);
		element.setBounds(245, 173, 190, 33);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUSH BUTTON
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push successfull");
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(128, 0, 128));
		push.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		push.setBounds(478, 173, 153, 33);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//POP BUTTON
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Pop is not possible");
					
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+s[top]);
					--top;
				}
			}
		});
		pop.setForeground(new Color(128, 0, 128));
		pop.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		pop.setBounds(274, 235, 153, 33);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY BUTTON
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=top;i>=0;i--) {
						msg=msg+" "+s[i];
					}
					displayarea.setText(msg);	
				}
				
			}
		});
		display.setForeground(new Color(128, 0, 128));
		display.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		display.setBounds(274, 279, 153, 33);
		contentPane.add(display);
		
		displayarea = new JTextField();
		displayarea.setForeground(new Color(0, 128, 64));
		displayarea.setFont(new Font("Sitka Text", Font.BOLD, 15));
		displayarea.setColumns(10);
		displayarea.setBackground(Color.WHITE);
		displayarea.setBounds(142, 323, 444, 33);
		contentPane.add(displayarea);
	}
}
