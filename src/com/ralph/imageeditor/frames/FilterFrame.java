package com.ralph.imageeditor.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ralph.imageeditor.Main;
import com.ralph.imageeditor.Workspace;
import com.ralph.imageeditor.filters.Brightness;
import com.ralph.imageeditor.filters.Filter;
import com.ralph.imageeditor.layers.ImageLayer;
import com.ralph.imageeditor.layers.Layer;

import ro.itschool.pixels.Image;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FilterFrame extends JFrame {

	private JPanel contentPane;
	private JTextField Photo;
	private JTextField value;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilterFrame frame = new FilterFrame();
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
	public FilterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Apply filter");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(300, 29, 258, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Photo link:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 132, 70, 24);
		contentPane.add(lblNewLabel_1);
		
		Photo = new JTextField();
		Photo.setBounds(90, 137, 223, 19);
		contentPane.add(Photo);
		Photo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Filter:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(42, 183, 38, 13);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(90, 181, 133, 21);
		contentPane.add(comboBox);
		comboBox.addItem("Choose");
		comboBox.addItem("Brightness");
		comboBox.addItem("Contrast");
		comboBox.addItem("Greyscale");
		comboBox.addItem("Invert");
		comboBox.addItem("Saturation");
		
		JLabel lblNewLabel_3 = new JLabel("Value:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(35, 235, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		value = new JTextField();
		value.setBounds(90, 234, 96, 19);
		contentPane.add(value);
		value.setColumns(10);
		
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=Integer.parseInt(value.getText());
				String s=Photo.getText();
				
				//Layer l=new ImageLayer(0,0,Main.im2);
				//Workspace ws=new Workspace(l.getWidth(),l.getHeight());
				if(comboBox.getSelectedItem().toString().equals("Brightness")) {
					Filter f=new Brightness(i);
					//l.setFilter(f);
					
					//try {
						//ws.save("test.png");
					//} //catch (IOException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					//}
					
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(349, 374, 108, 39);
		contentPane.add(btnNewButton);
	}

}
