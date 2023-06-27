import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class Array extends JFrame {

	private JPanel contentPane;
	private int arr[];
	private JTextField alength;
	private JTextField element;
	private JTextField position;
	private JTextField deleteposition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setBackground(new Color(64, 0, 128));
		lblNewLabel.setBounds(237, 11, 294, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 128, 128));
		lblNewLabel_1.setFont(new Font("Corbel Light", Font.BOLD, 17));
		lblNewLabel_1.setBounds(64, 61, 283, 39);
		contentPane.add(lblNewLabel_1);
		
		JButton createarray = new JButton("CREATE ARRAY");
		createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create array
				int len=Integer.valueOf(alength.getText());
				arr=new int[len];
				String message="Array of Size "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createarray.setBackground(new Color(0, 255, 255));
		createarray.setFont(new Font("Sitka Text", Font.BOLD, 15));
		createarray.setForeground(new Color(128, 64, 0));
		createarray.setBounds(306, 121, 250, 39);
		contentPane.add(createarray);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_2.setForeground(new Color(255, 128, 128));
		lblNewLabel_2.setFont(new Font("SimSun", Font.BOLD, 17));
		lblNewLabel_2.setBounds(10, 170, 233, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("POSITION");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(255, 128, 128));
		lblNewLabel_2_1.setFont(new Font("SimSun", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(376, 171, 104, 46);
		contentPane.add(lblNewLabel_2_1);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// array insert
				int ele=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(position.getText());
				arr[pos]=ele;
				String message="Insert element "+ele+" at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				position.setText("");
			}
		});
		insert.setForeground(new Color(128, 0, 64));
		insert.setFont(new Font("Sitka Text", Font.BOLD, 15));
		insert.setBackground(new Color(0, 255, 255));
		insert.setBounds(620, 173, 125, 39);
		contentPane.add(insert);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("DELETE POSITION");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(new Color(255, 128, 128));
		lblNewLabel_2_1_1.setFont(new Font("SimSun", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBounds(10, 240, 201, 39);
		contentPane.add(lblNewLabel_2_1_1);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// array delete
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Deleted element at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				position.setText("");
			}
		});
		delete.setForeground(new Color(128, 64, 0));
		delete.setFont(new Font("Sitka Text", Font.BOLD, 15));
		delete.setBackground(new Color(0, 255, 255));
		delete.setBounds(489, 243, 140, 39);
		contentPane.add(delete);
		
		JTextArea DISPLAYAREA = new JTextArea();
		DISPLAYAREA.setFont(new Font("Monospaced", Font.PLAIN, 16));
		DISPLAYAREA.setForeground(new Color(255, 0, 128));
		DISPLAYAREA.setBackground(Color.LIGHT_GRAY);
		DISPLAYAREA.setBounds(118, 352, 595, 39);
		contentPane.add(DISPLAYAREA);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 0, 30, 22);
		contentPane.add(comboBox);
		
		JButton display = new JButton("DISPLAY ARRAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// display array element
				String msg="";
				for(int i=0;i<arr.length;i++) {
					msg=msg+" "+arr[i];
				}
				DISPLAYAREA.setText(msg);
			}
		});
		display.setForeground(new Color(128, 64, 0));
		display.setFont(new Font("Sitka Text", Font.BOLD, 15));
		display.setBackground(new Color(0, 255, 255));
		display.setBounds(314, 293, 242, 39);
		contentPane.add(display);
		
		alength = new JTextField();
		alength.setHorizontalAlignment(SwingConstants.CENTER);
		alength.setFont(new Font("SimSun", Font.BOLD, 16));
		alength.setBounds(403, 61, 310, 39);
		contentPane.add(alength);
		alength.setColumns(10);
		
		element = new JTextField();
		element.setHorizontalAlignment(SwingConstants.CENTER);
		element.setFont(new Font("SimSun", Font.BOLD, 16));
		element.setColumns(10);
		element.setBounds(242, 170, 134, 39);
		contentPane.add(element);
		
		position = new JTextField();
		position.setHorizontalAlignment(SwingConstants.CENTER);
		position.setFont(new Font("SimSun", Font.BOLD, 16));
		position.setColumns(10);
		position.setBounds(476, 170, 134, 39);
		contentPane.add(position);
		
		deleteposition = new JTextField();
		deleteposition.setHorizontalAlignment(SwingConstants.CENTER);
		deleteposition.setFont(new Font("SimSun", Font.BOLD, 16));
		deleteposition.setColumns(10);
		deleteposition.setBounds(221, 240, 202, 39);
		contentPane.add(deleteposition);
	}
}
