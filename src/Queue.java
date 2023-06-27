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
public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displayarea;
	private int q[];
	private int size;
	private int rear=-1;
	private int front=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
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
		
		JButton Queue = new JButton("CREATE QUEUE");
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CREATE queue BUTTON
				  size=Integer.valueOf(length.getText());
					q=new int[size];
					JOptionPane.showMessageDialog(contentPane, "Queue of Size "+size+" created");
			}
		});
		Queue.setForeground(new Color(128, 0, 128));
		Queue.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		Queue.setBounds(278, 123, 172, 39);
		contentPane.add(Queue);
		
		JLabel lblEnterQueueLength = new JLabel("ENTER QUEUE LENGTH");
		lblEnterQueueLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterQueueLength.setForeground(new Color(128, 0, 0));
		lblEnterQueueLength.setFont(new Font("SimSun-ExtB", Font.BOLD, 19));
		lblEnterQueueLength.setBounds(35, 72, 211, 33);
		contentPane.add(lblEnterQueueLength);
		
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
		element.setBounds(260, 173, 190, 33);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT BUTTON
				int elem;
				if(rear==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					++rear;
					q[rear]=elem;
					JOptionPane.showMessageDialog(contentPane, "Insert element is "+q[rear]);
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(128, 0, 128));
		insert.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		insert.setBounds(478, 173, 153, 33);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE BUTTON
				String msg = "";
				if(rear==-1 ||rear <front) {
					displayarea.setText("");
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}else {
					JOptionPane.showMessageDialog(contentPane, "Deletion element is "+q[front]);
					++front;
					for(int i=front;i<=rear;i++) {
						msg = msg+" "+q[i];
					}
					displayarea.setText(msg);
					
				}
			}
		});
		delete.setForeground(new Color(128, 0, 128));
		delete.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		delete.setBounds(274, 235, 153, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY BUTTON
				String msg="";
				if(rear==-1 || front>rear) {
					
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					
				}else {
					for(int i=front;i<=rear;i++) {
						msg = msg +" "+q[i];
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
