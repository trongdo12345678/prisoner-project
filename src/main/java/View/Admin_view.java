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
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Valid.Check;
import database.DML;
import entity.Account;
import entity.HealthByPrisoner;
import entity.Prisoners;
import entity.RelativesByPrisoner;
import entity.Wardens;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Admin_view extends JFrame {

	private JPanel contentPane;
	private JPanel panel_prisoners;
	private JPanel panel_account;
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
	private JScrollPane scrollPane;
	private JPanel CreateAcc;
	private JLabel lblPassword;
	private JLabel lblNewLabel_5;
	private JTextField txtPass;
	private JTextField txtUser;
	private JButton btnAddAccount;
	private JButton btnShow;
	private JButton btnDeleteAll;
	private JLabel lblWad;
	private JTextField txtWardens;
	private JPanel panel_about;
	private JTable table_showAccount;
	private JPanel panel_chooseWardens;
	private JPanel panel_showmore;
	private JPanel panel_showless;
	private JScrollPane scrollPane_1;
	private JTable table_showWardens;
	private JButton btnShowmore;
	private JScrollPane scrollPane_2;
	private JTable table_showWardensMore;
	private JButton btnShowless;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnAction;
	private JTextField textField;
	private JLabel lblNewLabel_10;
	private JPanel panel_wardens;
	private JScrollPane scrollPane_3;
	private JTable table_showWardenHight;
	private JButton btnShowWardensHight;
	private JTextField textField_1;
	private JLabel lblNewLabel_11;
	private JButton btnShow_1;
	private static boolean check;
	private int count;
	private JPanel panel_1;
	private JPanel panel_2;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		check=false;
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_view frame = new Admin_view();
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
	public Admin_view() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 749);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("a");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnNewMenuActionPerformed(e);
			}
		});
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mntmNewMenuItemActionPerformed(e);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
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
		
		panel_account = new JPanel();
		panel_account.setBackground(new Color(0, 64, 64));
		contentPane.add(panel_account, "name_778615520662200");
		
		scrollPane = new JScrollPane();
		
		CreateAcc = new JPanel();
		CreateAcc.setBorder(new TitledBorder(null, "Create Account", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		CreateAcc.setBackground(new Color(0, 64, 64));
		
		btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeleteAllActionPerformed(e);
			}
		});
		btnDeleteAll.setBackground(Color.RED);
		
		panel_chooseWardens = new JPanel();
		GridBagLayout gbl_CreateAcc = new GridBagLayout();
		gbl_CreateAcc.columnWidths = new int[]{78, 38, 102, 0, 0};
		gbl_CreateAcc.rowHeights = new int[]{29, 29, 29, 38, 0};
		gbl_CreateAcc.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_CreateAcc.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		CreateAcc.setLayout(gbl_CreateAcc);
		
		lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_5.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 0;
		CreateAcc.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUser.setColumns(10);
		GridBagConstraints gbc_txtUser = new GridBagConstraints();
		gbc_txtUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUser.insets = new Insets(0, 0, 5, 5);
		gbc_txtUser.gridwidth = 2;
		gbc_txtUser.gridx = 1;
		gbc_txtUser.gridy = 0;
		CreateAcc.add(txtUser, gbc_txtUser);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassword.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 1;
		CreateAcc.add(lblPassword, gbc_lblPassword);
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPass.setColumns(10);
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.insets = new Insets(0, 0, 5, 5);
		gbc_txtPass.gridwidth = 2;
		gbc_txtPass.gridx = 1;
		gbc_txtPass.gridy = 1;
		CreateAcc.add(txtPass, gbc_txtPass);
		
		lblWad = new JLabel("Wardens ID");
		lblWad.setForeground(new Color(255, 255, 255));
		lblWad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWad.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblWad = new GridBagConstraints();
		gbc_lblWad.insets = new Insets(0, 0, 5, 5);
		gbc_lblWad.gridx = 0;
		gbc_lblWad.gridy = 2;
		CreateAcc.add(lblWad, gbc_lblWad);
		
		btnAddAccount = new JButton("ADD");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddAccountActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		txtWardens = new JTextField();
		txtWardens.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtWardens.setColumns(10);
		GridBagConstraints gbc_txtWardens = new GridBagConstraints();
		gbc_txtWardens.anchor = GridBagConstraints.WEST;
		gbc_txtWardens.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWardens.insets = new Insets(0, 0, 5, 5);
		gbc_txtWardens.gridwidth = 2;
		gbc_txtWardens.gridx = 1;
		gbc_txtWardens.gridy = 2;
		CreateAcc.add(txtWardens, gbc_txtWardens);
		
		btnShow_1 = new JButton("...");
		btnShow_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnShow_1ActionPerformed(e);
			}
		});
		btnShow_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		GridBagConstraints gbc_btnShow_1 = new GridBagConstraints();
		gbc_btnShow_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnShow_1.gridx = 3;
		gbc_btnShow_1.gridy = 2;
		CreateAcc.add(btnShow_1, gbc_btnShow_1);
		btnAddAccount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddAccount.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btnAddAccount = new GridBagConstraints();
		gbc_btnAddAccount.fill = GridBagConstraints.BOTH;
		gbc_btnAddAccount.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddAccount.gridwidth = 2;
		gbc_btnAddAccount.gridx = 0;
		gbc_btnAddAccount.gridy = 3;
		CreateAcc.add(btnAddAccount, gbc_btnAddAccount);
		
		btnShow = new JButton("SHOW");
		btnShow.setBackground(new Color(64, 128, 128));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShow.setFont(new Font("SansSerif", Font.PLAIN, 15));
		GridBagConstraints gbc_btnShow = new GridBagConstraints();
		gbc_btnShow.insets = new Insets(0, 0, 0, 5);
		gbc_btnShow.fill = GridBagConstraints.BOTH;
		gbc_btnShow.gridx = 2;
		gbc_btnShow.gridy = 3;
		CreateAcc.add(btnShow, gbc_btnShow);
		panel_chooseWardens.setLayout(new CardLayout(0, 0));
		
		panel_showmore = new JPanel();
		panel_showmore.setBackground(new Color(0, 64, 64));
		
		panel_chooseWardens.add(panel_showmore, "name_943127986314400");
		
		scrollPane_1 = new JScrollPane();
		
		btnShowmore = new JButton("Show More");
		btnShowmore.setBackground(new Color(128, 128, 128));
		btnShowmore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowmoreActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GroupLayout gl_panel_showmore = new GroupLayout(panel_showmore);
		gl_panel_showmore.setHorizontalGroup(
			gl_panel_showmore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showmore.createSequentialGroup()
					.addGap(45)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnShowmore, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(526, Short.MAX_VALUE))
		);
		gl_panel_showmore.setVerticalGroup(
			gl_panel_showmore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showmore.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_showmore.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnShowmore, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
					.addContainerGap(7, Short.MAX_VALUE))
		);
		
		table_showWardens = new JTable();
		scrollPane_1.setViewportView(table_showWardens);
		panel_showmore.setLayout(gl_panel_showmore);
		
		panel_showless = new JPanel();
		panel_showless.setBackground(new Color(0, 64, 64));
		panel_chooseWardens.add(panel_showless, "name_943130024779200");
		
		scrollPane_2 = new JScrollPane();
		
		btnShowless = new JButton("Show less");
		btnShowless.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnShowlessActionPerformed(e);
			}
		});
		GroupLayout gl_panel_showless = new GroupLayout(panel_showless);
		gl_panel_showless.setHorizontalGroup(
			gl_panel_showless.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_showless.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 1060, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnShowless, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_panel_showless.setVerticalGroup(
			gl_panel_showless.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_showless.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_panel_showless.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnShowless, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(scrollPane_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
					.addGap(7))
		);
		
		table_showWardensMore = new JTable();
		scrollPane_2.setViewportView(table_showWardensMore);
		panel_showless.setLayout(gl_panel_showless);
		
		table_showAccount = new JTable();
		table_showAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table_showAccountMouseClicked(e);
					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		scrollPane.setViewportView(table_showAccount);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(0, 128, 0));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnUpdateActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(255, 0, 0));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeleteActionPerformed(e);
			}
		});
		
		btnAction = new JButton("Action");
		btnAction.setBackground(new Color(64, 128, 128));
		btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnActionActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Search");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_10.setBackground(Color.BLACK);
		
		panel_wardens = new JPanel();
		panel_wardens.setForeground(new Color(255, 255, 255));
		panel_wardens.setBackground(new Color(0, 64, 64));
		panel_wardens.setBorder(new TitledBorder(null, "Wardens", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 64, 64));
		GroupLayout gl_panel_account = new GroupLayout(panel_account);
		gl_panel_account.setHorizontalGroup(
			gl_panel_account.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_account.createSequentialGroup()
					.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_account.createSequentialGroup()
							.addGap(46)
							.addComponent(CreateAcc, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnDeleteAll, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_chooseWardens, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_account.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_account.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_account.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAction, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(panel_wardens, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_account.setVerticalGroup(
			gl_panel_account.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_account.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_account.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_account.createSequentialGroup()
							.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel_account.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_account.createSequentialGroup()
									.addComponent(btnAction, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
						.addComponent(panel_wardens, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_chooseWardens, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
						.addComponent(CreateAcc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDeleteAll, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
					.addGap(119))
		);
		
		scrollPane_3 = new JScrollPane();
		
		btnShowWardensHight = new JButton("SHOW");
		btnShowWardensHight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowWardensHightActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		
		lblNewLabel_11 = new JLabel("Search");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_11.setBackground(Color.BLACK);
		GroupLayout gl_panel_wardens = new GroupLayout(panel_wardens);
		gl_panel_wardens.setHorizontalGroup(
			gl_panel_wardens.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_wardens.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_wardens.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_wardens.createSequentialGroup()
							.addComponent(btnShowWardensHight, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_wardens.setVerticalGroup(
			gl_panel_wardens.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_wardens.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_wardens.createParallelGroup(Alignment.LEADING)
						.addComponent(btnShowWardensHight, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_wardens.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textField_1, Alignment.LEADING)
							.addComponent(lblNewLabel_11, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		table_showWardenHight = new JTable();
		scrollPane_3.setViewportView(table_showWardenHight);
		panel_wardens.setLayout(gl_panel_wardens);
		panel_account.setLayout(gl_panel_account);
		
		panel_about = new JPanel();
		contentPane.add(panel_about, "name_941689144277200");
		GridBagLayout gbl_panel_about = new GridBagLayout();
		gbl_panel_about.columnWidths = new int[]{0, 0};
		gbl_panel_about.rowHeights = new int[]{0, 0};
		gbl_panel_about.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_about.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_about.setLayout(gbl_panel_about);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(219, 219, 219));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel_about.add(panel_2, gbc_panel_2);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1185, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 702, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
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
	protected void btnAddAccountActionPerformed(ActionEvent e) throws SQLException {
		String user=txtUser.getText();
		String pass=txtPass.getText();
		String wardensId=txtWardens.getText();
			Account ac=new Account();
			if(Check.checkNull(user)== false && Check.checkNull(pass)==false) {
				if(Check.checkNumber1(wardensId)==true) {
					ac.setWarden_id(Integer.parseInt(wardensId));
					if(Check.checkExistUser(user)==0) {
						if(Check.checkExistPass(pass)==0) {
							if(Check.checkExistWardenIdAccount(ac.getWarden_id())==0) {
								Wardens wd=new Wardens();
								count=0;
								DML.selectTableWardens().forEach(wr->{
									count=wr.getWardenId();
								});
								DML.selectTableWardens().forEach(wr->{
									if(wr.getWardenId()==ac.getWarden_id()) {
										if(ac.getWarden_id()<=count ) {
											if(wr.getPosition().equals("Hight")) {
												ac.setUsername(user);
												ac.setPassword(pass);
												try {
													DML.insertAccount(ac);
												} catch (SQLException e1) {
													JOptionPane.showMessageDialog(this, "Warden not exits","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);
												}
												JOptionPane.showMessageDialog(this, "Success","Thong Bao",JOptionPane.INFORMATION_MESSAGE);
												txtUser.setText(null);
												txtPass.setText(null);
												txtWardens.setText(null);
											}else {JOptionPane.showMessageDialog(this, "low","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);}
										}else {JOptionPane.showMessageDialog(this, "Warden not exits","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);}
									}
								});	
							}else {JOptionPane.showMessageDialog(this, "Warden ID is exists","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);}
						}else {JOptionPane.showMessageDialog(this, "Password is exists","ERROR",JOptionPane.ERROR_MESSAGE);txtPass.setText(null);}
					}else {JOptionPane.showMessageDialog(this, "Username is exists","ERROR",JOptionPane.ERROR_MESSAGE);txtUser.setText(null);}
				}else {JOptionPane.showMessageDialog(this, "Warden ID is not numberic and >0","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);}
			}else {JOptionPane.showMessageDialog(this, "Please do not leave it blank");}
		
	}
	protected void btnShowActionPerformed(ActionEvent e) throws SQLException {
		showDataAccount();
	}
	public void showDataAccount() throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Accound Id");
		model.addColumn("Warden Id");
		model.addColumn("UserName");
		model.addColumn("Password");
		model.addColumn("Active");
		
		DML.selectTableAccount().forEach(ac->{
			model.addRow(new Object[] {ac.getAccount_id(),ac.getWarden_id(),ac.getUsername(),ac.getPassword(),ac.getActive()});
		});
		table_showAccount.setModel(model);
	}
	protected void table_showAccountMouseClicked(MouseEvent e) throws NumberFormatException, SQLException {
		int a=table_showAccount.getSelectedRow();
		int warden=(int) table_showAccount.getValueAt((int) a, 1);
		
		showDataWardensLess(warden);
		showDataWardensMore(warden);
	}
	protected void btnShowlessActionPerformed(ActionEvent e) {
		panel_showless.show(false);
		panel_showmore.show(true);
		
	}
	protected void btnShowmoreActionPerformed(ActionEvent e) throws SQLException {
		panel_showless.show(true);
		panel_showmore.show(false);	
	}
	
	public void showDataWardensLess(int a) throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Warden Id");
		model.addColumn("Name");
		model.addColumn("Gender");
		model.addColumn("Position");
		model.addColumn("Areas Id");
		
		DML.selectTableWardensbyID(a).forEach(wd->{
			model.addRow(new Object[] {wd.getWardenId(),wd.getLastLame(),wd.getIsMale(),wd.getPosition(),wd.getAreas_id()});
		});
		table_showWardens.setModel(model);
	}
	public void showDataWardensMore(int a) throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Warden Id");
		model.addColumn("First Name");
		model.addColumn("last_name");
		model.addColumn("date_of_birth");
		model.addColumn("gender");
		model.addColumn("phone Number");
		model.addColumn("email");
		model.addColumn("address");
		model.addColumn("Position");
		model.addColumn("start Date");
		model.addColumn("day_off");
		model.addColumn("is_Working");
		model.addColumn("salary");
		model.addColumn("Areas Id");
		
		DML.selectTableWardensbyID(a).forEach(wd->{
			model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastLame(),wd.getDateOfBirth(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getPosition(),wd.getStartDate(),wd.getDay_off(),wd.getIs_Working(),wd.getSalary(),wd.getAreas_id()});
		});
		table_showWardensMore.setModel(model);
	}
	
	public void showDataWardensHight() throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Warden Id");
		model.addColumn("last_name");
		model.addColumn("gender");
		model.addColumn("phone Number");
		model.addColumn("Position");
		model.addColumn("Areas Id");
		
		DML.selectTableWardens().forEach(wd->{
			if(wd.getPosition().equals("Hight")) {
				model.addRow(new Object[] {wd.getWardenId(),wd.getLastLame(),wd.getIsMale(),wd.getPhoneNumber(),wd.getPosition(),wd.getAreas_id()});
			}	
		});
		table_showWardenHight.setModel(model);
	}
	
	protected void btnDeleteActionPerformed(ActionEvent e) {
		try {
			int a=table_showAccount.getSelectedRow();
			int id= (int) table_showAccount.getValueAt( a, 0);
			DML.deleteByID(id, "Account", "account_id");
			showDataAccount();
		} catch (Exception e2) {
			
		}
		
	}
	protected void btnDeleteAllActionPerformed(ActionEvent e) {
	}
	protected void btnActionActionPerformed(ActionEvent e) throws SQLException {
		try {
			String key="a";
			String Pass=null;
			Account ac=new Account();
			int column=table_showAccount.getSelectedRow();
			int idAccount=(int) table_showAccount.getValueAt((int) column, 0);
			ac.setAccount_id(idAccount);
			String input= JOptionPane.showInputDialog(Pass);
			if(input.equals(key)) {
				DML.selectTableAccount().forEach(acc->{
					if(acc.getAccount_id()==idAccount) {
						if(acc.getActive()==0) {
							ac.setActive(1);
							JOptionPane.showMessageDialog(this, "Turn on Active");
						}else {ac.setActive(0);JOptionPane.showMessageDialog(this, "Turn of Active");}
					}
				});
				DML.alterActive(ac);;
			}else {JOptionPane.showMessageDialog(this, "Pass is not true","ERROR",JOptionPane.ERROR_MESSAGE);}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}
	protected void btnShow_1ActionPerformed(ActionEvent e) {
		if(check==false) {
			check=true;
			panel_wardens.setVisible(check);
		}else {check=false;panel_wardens.setVisible(check);}

	}
	protected void btnShowWardensHightActionPerformed(ActionEvent e) throws SQLException {
		showDataWardensHight();
	}
	protected void btnUpdateActionPerformed(ActionEvent e) throws SQLException {
		Account ac=new Account();
		int a=table_showAccount.getSelectedRow();
		int warden_id=(int) Integer.parseInt((String) table_showAccount.getValueAt((int) a, 1));
		int account_id=(int) Integer.parseInt((String) table_showAccount.getValueAt((int) a, 0));
		String pass=table_showAccount.getValueAt((int) a, 3).toString();
		ac.setAccount_id(account_id);
		ac.setWarden_id(warden_id);
		ac.setPassword(pass);
		JOptionPane.showMessageDialog(this,account_id+" "+warden_id+" "+pass,"ERROR",JOptionPane.ERROR_MESSAGE);
		//DML.UpdateAccount(ac);
		
	}
	protected void mnNewMenuActionPerformed(ActionEvent e) {
		panel_prisoners.show(false);
		panel_account.show(true);
		panel_prisoners.setVisible(false);
		panel_account.setVisible(true);
	}
	protected void mntmNewMenuItemActionPerformed(ActionEvent e) {
		panel_prisoners.show(false);
		panel_account.show(true);
	}
}

