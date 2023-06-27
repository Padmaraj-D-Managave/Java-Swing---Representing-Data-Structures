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
public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField displayarea;
	class Node{
		int data;
		Node prelink;
		Node nextlink;
	}
	Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
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
				// DELETE FRONT
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else {
						first=first.nextlink;
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.prelink.data);
					first.prelink=null;
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
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
				}else {
					temp=first;
					while(temp.nextlink !=null) {
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					
				}
				JOptionPane.showMessageDialog(contentPane, "inserted element is "+elem);
				elementrear.setText("");
			}
		});
		insert.setForeground(new Color(128, 0, 128));
		insert.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		insert.setBounds(478, 72, 153, 33);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE REAR");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE REAR
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first=null;
				}
				else {
					temp=first;
					while(temp.nextlink.nextlink !=null) {
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.nextlink.data);
					temp.nextlink=null;
					}
			}
		});
		delete.setForeground(new Color(128, 0, 128));
		delete.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		delete.setBounds(268, 191, 189, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY FORWARD ");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DISPLAY FORWARD
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}else if(first.nextlink==null) {
					displayarea.setText(Integer.toString(first.data));
				}
				temp=first;
				String msg="";
				while(temp!=null) {
					msg=msg+" "+temp.data;
					temp=temp.nextlink;
				}
				displayarea.setText(msg);
				
			}
		});
		display.setForeground(new Color(128, 0, 128));
		display.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		display.setBounds(123, 279, 202, 33);
		contentPane.add(display);
		
		displayarea = new JTextField();
		displayarea.setForeground(new Color(0, 128, 64));
		displayarea.setFont(new Font("Sitka Text", Font.BOLD, 15));
		displayarea.setColumns(10);
		displayarea.setBackground(Color.WHITE);
		displayarea.setBounds(104, 330, 513, 33);
		contentPane.add(displayarea);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert front
				int elem=Integer.valueOf(elementfront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
				}
				else {
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "inserted element is "+elem);
				elementfront.setText("");
			}
		});
		btnInsertFront.setForeground(new Color(128, 0, 128));
		btnInsertFront.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		btnInsertFront.setBounds(476, 131, 170, 33);
		contentPane.add(btnInsertFront);
		
		JButton btnDisplayBackward = new JButton("DISPLAY BACKWARD ");
		btnDisplayBackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY BACKWARD
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}else if(first.nextlink==null) {
					displayarea.setText(Integer.toString(first.data));
				}
				temp=first;
				String msg="";
				while(temp.nextlink!=null) {
					temp=temp.nextlink;
				}
				while(temp!=null) {
					msg=msg+" "+temp.data;
					temp=temp.prelink;
				}
				displayarea.setText(msg);
				
			}
		});
		btnDisplayBackward.setForeground(new Color(128, 0, 128));
		btnDisplayBackward.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		btnDisplayBackward.setBounds(367, 279, 231, 33);
		contentPane.add(btnDisplayBackward);
	}
}
