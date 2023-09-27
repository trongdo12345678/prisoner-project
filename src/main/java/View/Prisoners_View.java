package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import java.awt.CardLayout;
import javax.swing.JMenu;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.border.TitledBorder;
import com.toedter.calendar.JDateChooser;

import Valid.Check;
import database.DML;
import entity.HealthByPrisoner;
import entity.Prisoners;
import entity.RelativesByPrisoner;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Prisoners_View extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JPanel panel_prisoners;
	private JPanel panel_1;
	private JPanel panel_menu;
	private JPanel panel_content;
	private JLabel lbla;
	private JPanel panel_body;
	private JPanel panel_4;
	private JLabel lblB;
	private JLabel lblId;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_12;
	private JTextField txtPId;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtP;
	private JTextField txtN;
	private JTextField txtC;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JTextField txtR;
	private JTextField txtI;
	private JLabel lblNewLabel;
	private JPanel panel_choose;
	private JPanel panel_health;
	private JPanel panel_relatives;
	private JLabel lblMedicalHistory;
	private JTextField txtMH;
	private JLabel lblCurrentConditions;
	private JLabel lblAllergies;
	private JTextField txtCC;
	private JTextField txtA;
	private JLabel lblRelativeName;
	private JTextField txtRN;
	private JTextField txtCI;
	private JTextField txtRela;
	private JLabel lblContactInfo;
	private JLabel lblRelationship;
	private JDateChooser dob;
	private JDateChooser doe;
	private JDateChooser rd;
	private JPanel panel;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel_4;
	private JTextField txtCell;
	private JButton btnAdd;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JSeparator separator;
	private JMenuItem mntmWardens;
	private JMenuItem mntmCell;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prisoners_View frame = new Prisoners_View();
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
	public Prisoners_View() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		mnNewMenu_1 = new JMenu("all");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		separator = new JSeparator();
		mnNewMenu_1.add(separator);
		
		mntmWardens = new JMenuItem("Wardens");
		mnNewMenu_1.add(mntmWardens);
		
		mntmCell = new JMenuItem("Cell");
		mnNewMenu_1.add(mntmCell);
		
		mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel_prisoners = new JPanel();
		contentPane.add(panel_prisoners, "name_778613192996900");
		
		panel_menu = new JPanel();
		panel_menu.setBackground(new Color(64, 128, 128));
		
		panel_content = new JPanel();
		GroupLayout gl_panel_prisoners = new GroupLayout(panel_prisoners);
		gl_panel_prisoners.setHorizontalGroup(
			gl_panel_prisoners.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_prisoners.createSequentialGroup()
					.addComponent(panel_menu, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_content, GroupLayout.PREFERRED_SIZE, 1049, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_prisoners.setVerticalGroup(
			gl_panel_prisoners.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_prisoners.createSequentialGroup()
					.addGroup(gl_panel_prisoners.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_content, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_menu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
					.addContainerGap(102, Short.MAX_VALUE))
		);
		panel_content.setLayout(new CardLayout(0, 0));
		
		panel_body = new JPanel();
		panel_body.setBackground(new Color(192, 192, 192));
		panel_content.add(panel_body, "name_779238240691400");
		GridBagLayout gbl_panel_body = new GridBagLayout();
		gbl_panel_body.columnWidths = new int[]{30, 95, 195, 38, 100, 200, 100, 195, 0};
		gbl_panel_body.rowHeights = new int[]{20, 31, 39, 35, 38, 28, 39, 35, 35, 0, 20, 152, 0};
		gbl_panel_body.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_body.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_body.setLayout(gbl_panel_body);
		
		lblId = new JLabel("Prisonners ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 1;
		panel_body.add(lblId, gbc_lblId);
		
		txtPId = new JTextField();
		txtPId.setColumns(10);
		GridBagConstraints gbc_txtPId = new GridBagConstraints();
		gbc_txtPId.anchor = GridBagConstraints.NORTH;
		gbc_txtPId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPId.insets = new Insets(0, 0, 5, 5);
		gbc_txtPId.gridx = 2;
		gbc_txtPId.gridy = 1;
		panel_body.add(txtPId, gbc_txtPId);
		
		lblNewLabel_6 = new JLabel("Nationality");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 4;
		gbc_lblNewLabel_6.gridy = 1;
		panel_body.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtN = new JTextField();
		txtN.setColumns(10);
		GridBagConstraints gbc_txtN = new GridBagConstraints();
		gbc_txtN.anchor = GridBagConstraints.NORTH;
		gbc_txtN.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtN.insets = new Insets(0, 0, 5, 5);
		gbc_txtN.gridx = 5;
		gbc_txtN.gridy = 1;
		panel_body.add(txtN, gbc_txtN);
		
		lblNewLabel_12 = new JLabel("Punishment");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 6;
		gbc_lblNewLabel_12.gridy = 1;
		panel_body.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		txtP = new JTextField();
		txtP.setColumns(10);
		GridBagConstraints gbc_txtP = new GridBagConstraints();
		gbc_txtP.anchor = GridBagConstraints.SOUTH;
		gbc_txtP.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtP.insets = new Insets(0, 0, 5, 0);
		gbc_txtP.gridx = 7;
		gbc_txtP.gridy = 1;
		panel_body.add(txtP, gbc_txtP);
		
		lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setToolTipText("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		panel_body.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtFName = new JTextField();
		txtFName.setColumns(10);
		GridBagConstraints gbc_txtFName = new GridBagConstraints();
		gbc_txtFName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFName.insets = new Insets(0, 0, 5, 5);
		gbc_txtFName.gridx = 2;
		gbc_txtFName.gridy = 3;
		panel_body.add(txtFName, gbc_txtFName);
		
		lblNewLabel_7 = new JLabel("Gender");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 4;
		gbc_lblNewLabel_7.gridy = 3;
		panel_body.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 5;
		gbc_panel.gridy = 3;
		panel_body.add(panel, gbc_panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setOpaque(true);
		rdbtnMale.setBackground(new Color(192, 192, 192));
		rdbtnMale.setSelected(true);
		panel.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBackground(new Color(192, 192, 192));
		rdbtnFemale.setOpaque(true);
		panel.add(rdbtnFemale);
		
		lblNewLabel_13 = new JLabel("Religion");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 6;
		gbc_lblNewLabel_13.gridy = 3;
		panel_body.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		txtR = new JTextField();
		txtR.setColumns(10);
		GridBagConstraints gbc_txtR = new GridBagConstraints();
		gbc_txtR.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtR.insets = new Insets(0, 0, 5, 0);
		gbc_txtR.gridx = 7;
		gbc_txtR.gridy = 3;
		panel_body.add(txtR, gbc_txtR);
		
		lblNewLabel_2 = new JLabel("Last Name");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 5;
		panel_body.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtLName = new JTextField();
		txtLName.setColumns(10);
		GridBagConstraints gbc_txtLName = new GridBagConstraints();
		gbc_txtLName.anchor = GridBagConstraints.NORTH;
		gbc_txtLName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLName.insets = new Insets(0, 0, 5, 5);
		gbc_txtLName.gridx = 2;
		gbc_txtLName.gridy = 5;
		panel_body.add(txtLName, gbc_txtLName);
		
		lblNewLabel_8 = new JLabel("Conviction");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 4;
		gbc_lblNewLabel_8.gridy = 5;
		panel_body.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		GridBagConstraints gbc_txtC = new GridBagConstraints();
		gbc_txtC.anchor = GridBagConstraints.NORTH;
		gbc_txtC.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtC.insets = new Insets(0, 0, 5, 5);
		gbc_txtC.gridx = 5;
		gbc_txtC.gridy = 5;
		panel_body.add(txtC, gbc_txtC);
		
		lblNewLabel_14 = new JLabel("Image");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 6;
		gbc_lblNewLabel_14.gridy = 5;
		panel_body.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		txtI = new JTextField();
		txtI.setColumns(10);
		GridBagConstraints gbc_txtI = new GridBagConstraints();
		gbc_txtI.anchor = GridBagConstraints.NORTH;
		gbc_txtI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtI.insets = new Insets(0, 0, 5, 0);
		gbc_txtI.gridx = 7;
		gbc_txtI.gridy = 5;
		panel_body.add(txtI, gbc_txtI);
		
		lblNewLabel_3 = new JLabel("Birthday");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 7;
		panel_body.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		dob = new JDateChooser();
		dob.setDate(new Date());
		dob.setDateFormatString("dd/MM/yyyy");
		GridBagConstraints gbc_dob = new GridBagConstraints();
		gbc_dob.fill = GridBagConstraints.BOTH;
		gbc_dob.insets = new Insets(0, 0, 5, 5);
		gbc_dob.gridx = 2;
		gbc_dob.gridy = 7;
		panel_body.add(dob, gbc_dob);
		
		lblNewLabel_9 = new JLabel("dateOfEntry");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 4;
		gbc_lblNewLabel_9.gridy = 7;
		panel_body.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		doe = new JDateChooser();
		doe.setDate(new Date());
		doe.setDateFormatString("dd/MM/yyyy");
		GridBagConstraints gbc_doe = new GridBagConstraints();
		gbc_doe.fill = GridBagConstraints.BOTH;
		gbc_doe.insets = new Insets(0, 0, 5, 5);
		gbc_doe.gridx = 5;
		gbc_doe.gridy = 7;
		panel_body.add(doe, gbc_doe);
		
		lblNewLabel = new JLabel("releaseDate");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 6;
		gbc_lblNewLabel.gridy = 7;
		panel_body.add(lblNewLabel, gbc_lblNewLabel);
		
		rd = new JDateChooser();
		rd.setDate(new Date());
		rd.setDateFormatString("dd/MM/yyyy");
		GridBagConstraints gbc_rd = new GridBagConstraints();
		gbc_rd.insets = new Insets(0, 0, 5, 0);
		gbc_rd.fill = GridBagConstraints.BOTH;
		gbc_rd.gridx = 7;
		gbc_rd.gridy = 7;
		panel_body.add(rd, gbc_rd);
		
		lblNewLabel_4 = new JLabel("CEll ID");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 9;
		panel_body.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtCell = new JTextField();
		txtCell.setColumns(10);
		GridBagConstraints gbc_txtCell = new GridBagConstraints();
		gbc_txtCell.insets = new Insets(0, 0, 5, 5);
		gbc_txtCell.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCell.gridx = 2;
		gbc_txtCell.gridy = 9;
		panel_body.add(txtCell, gbc_txtCell);
		
		btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnNewButtonActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridx = 6;
		gbc_btnAdd.gridy = 9;
		panel_body.add(btnAdd, gbc_btnAdd);
		
		panel_choose = new JPanel();
		panel_choose.setBackground(new Color(192, 192, 192));
		
		panel_health = new JPanel();
		panel_health.setBorder(new TitledBorder(null, "Health", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gbl_panel_health = new GridBagLayout();
		gbl_panel_health.columnWidths = new int[] {10, 100, 200, 0};
		gbl_panel_health.rowHeights = new int[] {10, 40, 40, 40, 0};
		gbl_panel_health.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_health.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_health.setLayout(gbl_panel_health);
		
		lblMedicalHistory = new JLabel("Medical History");
		GridBagConstraints gbc_lblMedicalHistory = new GridBagConstraints();
		gbc_lblMedicalHistory.insets = new Insets(0, 0, 5, 5);
		gbc_lblMedicalHistory.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblMedicalHistory.gridx = 1;
		gbc_lblMedicalHistory.gridy = 1;
		panel_health.add(lblMedicalHistory, gbc_lblMedicalHistory);
		
		txtMH = new JTextField();
		txtMH.setColumns(10);
		GridBagConstraints gbc_txtMH = new GridBagConstraints();
		gbc_txtMH.anchor = GridBagConstraints.NORTH;
		gbc_txtMH.insets = new Insets(0, 0, 5, 0);
		gbc_txtMH.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMH.gridx = 2;
		gbc_txtMH.gridy = 1;
		panel_health.add(txtMH, gbc_txtMH);
		
		lblCurrentConditions = new JLabel("Current Conditions");
		GridBagConstraints gbc_lblCurrentConditions = new GridBagConstraints();
		gbc_lblCurrentConditions.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblCurrentConditions.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentConditions.gridx = 1;
		gbc_lblCurrentConditions.gridy = 2;
		panel_health.add(lblCurrentConditions, gbc_lblCurrentConditions);
		
		txtCC = new JTextField();
		txtCC.setColumns(10);
		GridBagConstraints gbc_txtCC = new GridBagConstraints();
		gbc_txtCC.anchor = GridBagConstraints.NORTH;
		gbc_txtCC.insets = new Insets(0, 0, 5, 0);
		gbc_txtCC.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCC.gridx = 2;
		gbc_txtCC.gridy = 2;
		panel_health.add(txtCC, gbc_txtCC);
		
		lblAllergies = new JLabel("Allergies");
		GridBagConstraints gbc_lblAllergies = new GridBagConstraints();
		gbc_lblAllergies.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblAllergies.insets = new Insets(0, 0, 0, 5);
		gbc_lblAllergies.gridx = 1;
		gbc_lblAllergies.gridy = 3;
		panel_health.add(lblAllergies, gbc_lblAllergies);
		
		txtA = new JTextField();
		txtA.setColumns(10);
		GridBagConstraints gbc_txtA = new GridBagConstraints();
		gbc_txtA.anchor = GridBagConstraints.NORTH;
		gbc_txtA.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtA.gridx = 2;
		gbc_txtA.gridy = 3;
		panel_health.add(txtA, gbc_txtA);
		
		panel_relatives = new JPanel();
		panel_relatives.setBorder(new TitledBorder(null, "Relatives", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gbl_panel_relatives = new GridBagLayout();
		gbl_panel_relatives.columnWidths = new int[]{0, 100, 200, 0};
		gbl_panel_relatives.rowHeights = new int[]{20, 40, 40, 40, 0};
		gbl_panel_relatives.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_relatives.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_relatives.setLayout(gbl_panel_relatives);
		
		lblRelativeName = new JLabel("Relative Name");
		GridBagConstraints gbc_lblRelativeName = new GridBagConstraints();
		gbc_lblRelativeName.insets = new Insets(0, 0, 5, 5);
		gbc_lblRelativeName.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblRelativeName.gridx = 1;
		gbc_lblRelativeName.gridy = 1;
		panel_relatives.add(lblRelativeName, gbc_lblRelativeName);
		
		txtRN = new JTextField();
		txtRN.setColumns(10);
		GridBagConstraints gbc_txtRN = new GridBagConstraints();
		gbc_txtRN.anchor = GridBagConstraints.NORTH;
		gbc_txtRN.insets = new Insets(0, 0, 5, 0);
		gbc_txtRN.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRN.gridx = 2;
		gbc_txtRN.gridy = 1;
		panel_relatives.add(txtRN, gbc_txtRN);
		
		lblContactInfo = new JLabel("Contact Info");
		GridBagConstraints gbc_lblContactInfo = new GridBagConstraints();
		gbc_lblContactInfo.insets = new Insets(0, 0, 5, 5);
		gbc_lblContactInfo.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblContactInfo.gridx = 1;
		gbc_lblContactInfo.gridy = 2;
		panel_relatives.add(lblContactInfo, gbc_lblContactInfo);
		
		txtCI = new JTextField();
		txtCI.setColumns(10);
		GridBagConstraints gbc_txtCI = new GridBagConstraints();
		gbc_txtCI.anchor = GridBagConstraints.NORTH;
		gbc_txtCI.insets = new Insets(0, 0, 5, 0);
		gbc_txtCI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCI.gridx = 2;
		gbc_txtCI.gridy = 2;
		panel_relatives.add(txtCI, gbc_txtCI);
		
		lblRelationship = new JLabel("Relationship");
		GridBagConstraints gbc_lblRelationship = new GridBagConstraints();
		gbc_lblRelationship.insets = new Insets(0, 0, 0, 5);
		gbc_lblRelationship.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblRelationship.gridx = 1;
		gbc_lblRelationship.gridy = 3;
		panel_relatives.add(lblRelationship, gbc_lblRelationship);
		
		txtRela = new JTextField();
		txtRela.setColumns(10);
		GridBagConstraints gbc_txtRela = new GridBagConstraints();
		gbc_txtRela.anchor = GridBagConstraints.NORTH;
		gbc_txtRela.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRela.gridx = 2;
		gbc_txtRela.gridy = 3;
		panel_relatives.add(txtRela, gbc_txtRela);
		GroupLayout gl_panel_choose = new GroupLayout(panel_choose);
		gl_panel_choose.setHorizontalGroup(
			gl_panel_choose.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_choose.createSequentialGroup()
					.addComponent(panel_health, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_relatives, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_choose.setVerticalGroup(
			gl_panel_choose.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_health, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_relatives, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
		);
		panel_choose.setLayout(gl_panel_choose);
		GridBagConstraints gbc_panel_choose = new GridBagConstraints();
		gbc_panel_choose.anchor = GridBagConstraints.NORTH;
		gbc_panel_choose.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_choose.gridwidth = 7;
		gbc_panel_choose.gridx = 1;
		gbc_panel_choose.gridy = 11;
		panel_body.add(panel_choose, gbc_panel_choose);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 0, 128));
		panel_content.add(panel_4, "name_779241662204000");
		
		lbla = new JLabel("    ADD");
		lbla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabelMouseClicked(e);
			}
		});
		lbla.setForeground(new Color(255, 255, 255));
		lbla.setOpaque(true);
		lbla.setBackground(new Color(0, 0, 0));
		lbla.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		lblB = new JLabel("   SHOW");
		lblB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblBMouseClicked(e);
			}
		});
		lblB.setOpaque(true);
		lblB.setForeground(Color.WHITE);
		lblB.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblB.setBackground(Color.BLACK);
		GroupLayout gl_panel_menu = new GroupLayout(panel_menu);
		gl_panel_menu.setHorizontalGroup(
			gl_panel_menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_menu.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel_menu.createParallelGroup(Alignment.LEADING)
						.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbla, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_panel_menu.setVerticalGroup(
			gl_panel_menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_menu.createSequentialGroup()
					.addGap(18)
					.addComponent(lbla, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(526, Short.MAX_VALUE))
		);
		panel_menu.setLayout(gl_panel_menu);
		panel_prisoners.setLayout(gl_panel_prisoners);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, "name_778615520662200");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1176, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 530, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
	}
	protected void lblNewLabelMouseClicked(MouseEvent e) {
		panel_body.show(true);
		panel_4.show(false);
		
	}
	protected void lblBMouseClicked(MouseEvent e) {
		panel_body.show(false);
		panel_4.show(true);
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) throws SQLException {		
		
		String id=txtPId.getText();
		String firstName=txtFName.getText();
		String lastName= txtLName.getText();
		String gender;
		String nationality= txtN.getText();
		String cellId=txtCell.getText();
		String conviction=txtC.getText();
		String punishment= txtP.getText();
		String religion= txtR.getText();
		String image=txtI.getText();
		String medicalHistory=txtMH.getText();
		String currentConditions=txtCC.getText();
		String allergies=txtA.getText();
		String relativeName=txtRN.getText();
		String contactInfo=txtCI.getText();
		String relationship=txtRela.getText();
		Date datedob=dob.getDate();
		Date datedoe=doe.getDate();
		Date daterd=rd.getDate();
		
		if(Check.checkNull(id)==false &&
			Check.checkNull(firstName)==false &&
			Check.checkNull(lastName)==false &&
			Check.checkNull(nationality)==false &&
			Check.checkNull(cellId)==false &&
			Check.checkNull(conviction)==false &&
			Check.checkNull(punishment)==false &&
			Check.checkNull(religion)==false &&
			Check.checkNull(medicalHistory)==false &&
			Check.checkNull(currentConditions)==false &&
			Check.checkNull(allergies)==false &&
			Check.checkNull(relativeName)==false &&
			Check.checkNull(contactInfo)==false &&
			Check.checkNull(relationship)==false ) {		
				if(Check.checkNumber1(id)==true && Check.checkNumber1(cellId)==true) {
					if(Check.checkString(firstName)==true &&
						Check.checkString(lastName)==true &&
						Check.checkString(nationality)==true &&
						Check.checkString(conviction)==true &&
						Check.checkString(punishment)==true &&
						Check.checkString(religion)==true &&
						Check.checkString(medicalHistory)==true &&
						Check.checkString(allergies)==true &&
						Check.checkString(relativeName)==true &&
						Check.checkString(contactInfo)==true &&
						Check.checkString(currentConditions)==true ) {
						
						Prisoners pr=new Prisoners();
						pr.setDateOfBirth(LocalDate.ofInstant(datedob.toInstant(), ZoneId.systemDefault()));
						pr.setDateOfEntry(LocalDate.ofInstant(datedoe.toInstant(), ZoneId.systemDefault()));
						pr.setReleaseDate(LocalDate.ofInstant(daterd.toInstant(), ZoneId.systemDefault()));
						if(rdbtnMale.isSelected()) {
							 pr.setIsMale("nam");
						}else {pr.setIsMale("nu");}
						pr.setId(Integer.parseInt(id));
						pr.setFirstName(firstName);
						pr.setLastName(lastName);
						pr.setNationality(nationality);
						pr.setCellId(Integer.parseInt(cellId));
						pr.setConviction(conviction);
						pr.setPunishment(punishment);
						pr.setReligion(religion);
						pr.setImage(image);
						DML.insertPrisoner(pr);
						
						RelativesByPrisoner rb=new RelativesByPrisoner();	
						rb.setId(Integer.parseInt(id));
						rb.setRelativeName(relativeName);
						rb.setContactInfo(contactInfo);
						rb.setRelationship(relationship);
						DML.insertRelative(rb);
						
						HealthByPrisoner hp=new HealthByPrisoner();
						hp.setId(Integer.parseInt(id));
						hp.setAllergies(allergies);
						hp.setCurrentConditions(currentConditions);
						hp.setMedicalHistory(medicalHistory);
						DML.insertHealth(hp);
						
					}else {JOptionPane.showMessageDialog(this, "Except for prisoner id and cell id everything does not contain numbers","ERROR",JOptionPane.ERROR_MESSAGE);}
				} else {JOptionPane.showMessageDialog(this, "Prisoner ID and cell ID must be numeric","ERROR",JOptionPane.ERROR_MESSAGE);}
		} else {JOptionPane.showMessageDialog(this, "Please do not leave information blank","ERROR",JOptionPane.ERROR_MESSAGE);}
			
		
			
		
	}
}
