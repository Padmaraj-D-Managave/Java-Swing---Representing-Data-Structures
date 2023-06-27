import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 171, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel datastructure = new JLabel("CHOOSE DATA STRUCTURE");
		datastructure.setForeground(new Color(128, 0, 0));
		datastructure.setFont(new Font("Arial", Font.BOLD, 16));
		datastructure.setBounds(182, 37, 219, 19);
		contentPane.add(datastructure);
		
		JButton array = new JButton("ARRAY");
		array.setFont(new Font("Constantia", Font.BOLD, 13));
		array.setForeground(new Color(255, 0, 255));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//press array open windows 
				new Array().setVisible(true);
			}
		});
		array.setBounds(200, 85, 213, 39);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// press stack open windows
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(255, 0, 128));
		stack.setFont(new Font("Constantia", Font.BOLD, 13));
		stack.setBounds(76, 142, 119, 39);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// press queue windows open
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(255, 0, 128));
		queue.setFont(new Font("Constantia", Font.BOLD, 13));
		queue.setBounds(425, 139, 110, 39);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// circular queue open windows
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(255, 0, 128));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 13));
		cqueue.setBounds(76, 256, 207, 46);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLY LINKEDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// single linkled list windows open
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(255, 0, 128));
		sll.setFont(new Font("Constantia", Font.BOLD, 13));
		sll.setBounds(351, 255, 184, 47);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKEDLIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// double linked list windows open 
				
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(new Color(255, 0, 128));
		dll.setFont(new Font("Constantia", Font.BOLD, 13));
		dll.setBounds(200, 349, 219, 48);
		contentPane.add(dll);
	}
}
