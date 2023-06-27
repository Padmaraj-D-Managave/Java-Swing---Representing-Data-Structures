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
public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField displayarea;
	class Node{
		int data;
		Node link;
	}
	Node first;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLE LINKED LIST DATA STRUCTURE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD, 19));
		lblNewLabel.setBounds(138, 22, 397, 39);
		contentPane.add(lblNewLabel);
		
		elementrear = new JTextField();
		elementrear.setForeground(new Color(0, 128, 64));
		elementrear.setBackground(new Color(255, 255, 255));
		elementrear.setFont(new Font("Sitka Text", Font.BOLD, 15));
		elementrear.setBounds(268, 72, 189, 33);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
		
		JButton LINKEDLIST = new JButton("DELETE FRONT");
		LINKEDLIST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete front
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "deleted element is "+first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "deleted element is "+first.data);
					first=first.link;
				}
			}
		});
		LINKEDLIST.setForeground(new Color(128, 0, 128));
		LINKEDLIST.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		LINKEDLIST.setBounds(268, 235, 189, 33);
		contentPane.add(LINKEDLIST);
		
		JLabel lblEnterQueueLength = new JLabel("ENTER THE ELEMENT");
		lblEnterQueueLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterQueueLength.setForeground(new Color(128, 0, 0));
		lblEnterQueueLength.setFont(new Font("SimSun-ExtB", Font.BOLD, 19));
		lblEnterQueueLength.setBounds(35, 72, 242, 33);
		contentPane.add(lblEnterQueueLength);
		
		JLabel lblEnterAnElemeent = new JLabel("ENTER AN ELEMEENT");
		lblEnterAnElemeent.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAnElemeent.setForeground(new Color(128, 0, 0));
		lblEnterAnElemeent.setFont(new Font("SimSun-ExtB", Font.BOLD, 19));
		lblEnterAnElemeent.setBounds(47, 131, 211, 33);
		contentPane.add(lblEnterAnElemeent);
		
		elementfront = new JTextField();
		elementfront.setForeground(new Color(0, 128, 64));
		elementfront.setFont(new Font("Sitka Text", Font.BOLD, 15));
		elementfront.setColumns(10);
		elementfront.setBackground(Color.WHITE);
		elementfront.setBounds(268, 136, 190, 33);
		contentPane.add(elementfront);
		
		JButton insert = new JButton("INSERT REAR");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT rear
				Node temp;
				int elem=Integer.valueOf(elementrear.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
				}else {
					temp=first;
					while(temp.link !=null) {
						temp=temp.link;
					}
					temp.link=newnode;
					
				}
				JOptionPane.showMessageDialog(contentPane, "inserted element is "+elem);
				elementrear.setText("");
			}
		
		});
		insert.setForeground(new Color(128, 0, 128));
		insert.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		insert.setBounds(478, 72, 151, 33);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE REAR");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE BUTTON
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else {
					temp=first;
					while(temp.link.link !=null) {
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link=null;
				}
			}
		});
		delete.setForeground(new Color(128, 0, 128));
		delete.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		delete.setBounds(268, 191, 189, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY LINKED LIST ");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY BUTTON
				Node temp;
				
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}else if(first.link==null) {
					displayarea.setText(Integer.toString(first.data));
				}
				temp=first;
				String msg="";
				while(temp!=null) {
					msg=msg+" "+temp.data;
					temp=temp.link;
				}
				displayarea.setText(msg);
			}
		});
		display.setForeground(new Color(128, 0, 128));
		display.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		display.setBounds(198, 279, 317, 33);
		contentPane.add(display);
		
		displayarea = new JTextField();
		displayarea.setForeground(new Color(0, 128, 64));
		displayarea.setFont(new Font("Sitka Text", Font.BOLD, 15));
		displayarea.setColumns(10);
		displayarea.setBackground(Color.WHITE);
		displayarea.setBounds(142, 323, 444, 33);
		contentPane.add(displayarea);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.setHorizontalAlignment(SwingConstants.LEADING);
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert front
				int elem=Integer.valueOf(elementfront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
				}
				else {
					newnode.link=first;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "inserted element is "+elem);
				elementfront.setText("");
			}
		});
		btnInsertFront.setForeground(new Color(128, 0, 128));
		btnInsertFront.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		btnInsertFront.setBounds(478, 131, 153, 33);
		contentPane.add(btnInsertFront);
	}
}
