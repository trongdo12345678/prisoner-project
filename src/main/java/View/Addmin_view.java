package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultRowSorter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import Valid.Check;
import dao.PrisonersDao;
import database.DML;
import entity.Account;
import entity.Wardens;

import javax.swing.event.AncestorEvent;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.RowFilter;

import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Addmin_view extends JFrame {

	private JPanel contentPane;
	private JPanel panel_menu;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblPrisoners;
	private JLabel lblNewLabel_1;
	private JLabel lblWardens;
	private JLabel lblCellForPrisoners;
	private JLabel lblAreas;
	private JLabel lblAccount;
	private JLabel lbl1_5;
	private JLabel lbl1_6;
	private JPanel panel_prisoners;
	private JPanel panel_wardens;
	private JPanel panel_cell;
	private JPanel panel_areas;
	private JPanel panel_account;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel CreateAcc;
	private JLabel lblNewLabel;
	private JTextField txtUser;
	private JLabel lblPassword;
	private JTextField txtPass;
	private JLabel lblWad;
	private JTextField txtWardens;
	private JButton btnAddAccount;
	private JButton btnShowAccount;
	private JScrollPane scrollPane;
	private JButton btnShowmore;
	private JTextField textField_3;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane_1;
	private JButton btnAction;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JScrollPane scrollPane_2;
	private JPanel panel_showMoreLess;
	private JPanel panel_showWardenHight;
	private JPanel panel_showMore;
	private JPanel panel_showLess;
	private JTable table_showless;
	private JScrollPane scrollPane_3;
	private JButton ShowLess;
	private JTable table_showmore;
	private int count;
	private JTable table_showAccount;
	private JButton btnShowWardensHight;
	
	private Boolean check;
	private JTable table_showWardensHight;
	private JPanel panel_PNorth;
	private JPanel panel_PCenter;
	private JLabel lblShowP;
	private JLabel lblAddP;
	private JPanel panel_ShowP;
	private JPanel panel_AddP;
	private JScrollPane scrollPane_4;
	private JPanel panel;
	private JButton btnShowP;
	private JButton btnDeleteShow;
	private JButton btnUpdateP;
	private JPanel panel_3;
	private JLabel lblBD;
	private JLabel lblNewLabel_12;
	private JLabel lblShowLN;
	private JLabel lblFN;
	private JLabel lblShowFN;
	private JLabel lblShowPID;
	private JLabel lblLN;
	private JLabel lblShowBD;
	private JTable table_showP;
	private JPanel panel_4;
	private JPanel panel_PrisonIN4;
	private JPanel panel_PrisonRelavte;
	private JPanel panel_PrisonHealth;
	private JLabel lblRD;
	private JLabel lblDOE;
	private JLabel lblGender;
	private JLabel lblNation;
	private JLabel lblShowRD;
	private JLabel lblReligion;
	private JLabel lblShowDOE;
	private JLabel lblPunishment;
	private JLabel lblConviction;
	private JLabel lblShowN;
	private JLabel lblCellID;
	private JLabel lblShowC;
	private JLabel lblShowRE;
	private JLabel lblShowPu;
	private JLabel lblShowCellID;
	private JLabel lblShowGender;
	private JTextField txtSearchAll;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JLabel lblNewLabel_4;

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
					Addmin_view frame = new Addmin_view();
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
	public Addmin_view() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel_menu = new JPanel();
		panel_menu.setMaximumSize(new Dimension(32747, 32767));
		panel_menu.setBackground(new Color(0, 40, 40));
		contentPane.add(panel_menu, BorderLayout.WEST);
		
		lblPrisoners = new JLabel("PRISONERS");
		lblPrisoners.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisoners.setForeground(new Color(255, 255, 255));
		lblPrisoners.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPrisonersMouseClicked(e);
			}
		});
		lblPrisoners.setBackground(new Color(240, 240, 240));
		lblPrisoners.setFont(new Font("Arial", Font.ITALIC, 18));
		
		lblWardens = new JLabel("WARDENS");
		lblWardens.setHorizontalAlignment(SwingConstants.CENTER);
		lblWardens.setForeground(new Color(255, 255, 255));
		lblWardens.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblWardensMouseClicked(e);
			}
		});
		lblWardens.setFont(new Font("Arial", Font.ITALIC, 18));
		lblWardens.setBackground(UIManager.getColor("Button.background"));
		
		lblCellForPrisoners = new JLabel("CELL");
		lblCellForPrisoners.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellForPrisoners.setForeground(new Color(255, 255, 255));
		lblCellForPrisoners.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCellForPrisonersMouseClicked(e);
			}
		});
		lblCellForPrisoners.setFont(new Font("Arial", Font.ITALIC, 18));
		lblCellForPrisoners.setBackground(UIManager.getColor("Button.background"));
		
		lblAreas = new JLabel("AREAS");
		lblAreas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreas.setForeground(new Color(255, 255, 255));
		lblAreas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblAreasMouseClicked(e);
			}
		});
		lblAreas.setFont(new Font("Arial", Font.ITALIC, 18));
		lblAreas.setBackground(UIManager.getColor("Button.background"));
		
		lblAccount = new JLabel("ACCOUNT");
		lblAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccount.setForeground(new Color(255, 255, 255));
		lblAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblAccountMouseClicked(e);
			}
		});
		
		lblAccount.setFont(new Font("Arial", Font.ITALIC, 18));
		lblAccount.setBackground(UIManager.getColor("Button.background"));
		
		lbl1_5 = new JLabel("New label");
		lbl1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_5.setForeground(new Color(255, 255, 255));
		lbl1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl1_5MouseClicked(e);
			}
		});
		lbl1_5.setFont(new Font("Arial", Font.ITALIC, 18));
		lbl1_5.setBackground(UIManager.getColor("Button.background"));
		
		lbl1_6 = new JLabel("New label");
		lbl1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1_6.setForeground(new Color(255, 255, 255));
		lbl1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl1_6MouseClicked(e);
			}
		});
		lbl1_6.setFont(new Font("Arial", Font.ITALIC, 18));
		lbl1_6.setBackground(UIManager.getColor("Button.background"));
		GroupLayout gl_panel_menu = new GroupLayout(panel_menu);
		gl_panel_menu.setHorizontalGroup(
			gl_panel_menu.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_menu.createSequentialGroup()
					.addGroup(gl_panel_menu.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbl1_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(lbl1_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(lblAccount, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(lblAreas, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(lblCellForPrisoners, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(lblWardens, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(lblPrisoners, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_menu.setVerticalGroup(
			gl_panel_menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_menu.createSequentialGroup()
					.addGap(40)
					.addComponent(lblPrisoners, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWardens, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCellForPrisoners, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAreas, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAccount, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lbl1_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(lbl1_6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(221, Short.MAX_VALUE))
		);
		panel_menu.setLayout(gl_panel_menu);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		lblNewLabel_1 = new JLabel("New label");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(149)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1082, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new CardLayout(0, 0));
		
		panel_prisoners = new JPanel();
		panel_prisoners.setBackground(new Color(0, 40, 40));
		panel_2.add(panel_prisoners, "name_1038379110987700");
		panel_prisoners.setLayout(new BorderLayout(0, 0));
		
		panel_PNorth = new JPanel();
		panel_prisoners.add(panel_PNorth, BorderLayout.NORTH);
		panel_PNorth.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblShowP = new JLabel("SHOW");
		lblShowP.setFont(new Font("SansSerif", Font.PLAIN, 25));
		lblShowP.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowP.setLabelFor(this);
		lblShowP.setOpaque(true);
		lblShowP.setBackground(new Color(64, 128, 128));
		panel_PNorth.add(lblShowP);
		
		lblAddP = new JLabel("ADD");
		lblAddP.setFont(new Font("SansSerif", Font.PLAIN, 25));
		lblAddP.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddP.setBackground(new Color(64, 128, 128));
		lblAddP.setOpaque(true);
		panel_PNorth.add(lblAddP);
		
		panel_PCenter = new JPanel();
		panel_PCenter.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
		panel_prisoners.add(panel_PCenter, BorderLayout.CENTER);
		panel_PCenter.setLayout(new CardLayout(0, 0));
		
		panel_ShowP = new JPanel();
		panel_ShowP.setBackground(new Color(0, 40, 40));
		panel_PCenter.add(panel_ShowP, "name_1109174382688600");
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBorder(null);
		scrollPane_4.getViewport().setBackground(new Color(0,40,40));
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 40, 40));
		
		btnShowP = new JButton("Show");
		btnShowP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowPActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowP.setForeground(Color.WHITE);
		btnShowP.setBackground(Color.BLACK);
		
		btnDeleteShow = new JButton("Delete");
		btnDeleteShow.setForeground(Color.WHITE);
		btnDeleteShow.setBackground(Color.BLACK);
		
		btnUpdateP = new JButton("Update");
		btnUpdateP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdatePActionPerformed(e);
			}
		});
		btnUpdateP.setForeground(Color.WHITE);
		btnUpdateP.setBackground(Color.BLACK);
		
		panel_3 = new JPanel();
		panel_3.setForeground(new Color(255, 255, 255));
		panel_3.setBorder(new TitledBorder(null, "Prisoner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_3.setBackground(new Color(0, 40, 40));
		
		table_showP = new JTable();
		table_showP.setAutoCreateRowSorter(true);
		table_showP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table_showPMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table_showP.setSelectionBackground(new Color(0, 128, 64));
		table_showP.setForeground(new Color(255, 255, 255));
		table_showP.setBackground(new Color(0, 64, 64));
		scrollPane_4.setViewportView(table_showP);
		
		lblNewLabel_12 = new JLabel("Prisoner ID");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBackground(new Color(0, 128, 64));
		
		lblShowPID = new JLabel("");
		lblShowPID.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPID.setFont(new Font("Arial", Font.PLAIN, 20));
		lblShowPID.setForeground(new Color(255, 255, 255));
		lblShowPID.setBackground(new Color(0, 128, 64));
		lblShowPID.setOpaque(true);
		
		lblLN = new JLabel("Last Name");
		lblLN.setForeground(new Color(0, 0, 0));
		lblLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblLN.setBackground(new Color(255, 255, 255));
		lblLN.setOpaque(true);
		
		lblShowLN = new JLabel("");
		lblShowLN.setForeground(new Color(0, 0, 0));
		lblShowLN.setFont(new Font("Arial", Font.PLAIN, 20));
		lblShowLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowLN.setBackground(new Color(255, 255, 255));
		lblShowLN.setOpaque(true);
		
		panel_4 = new JPanel();
		
		lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setOpaque(true);
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setBackground(new Color(0, 128, 64));
		
		lblCellID = new JLabel("Cell ID");
		lblCellID.setForeground(new Color(0, 0, 0));
		lblCellID.setOpaque(true);
		lblCellID.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellID.setBackground(new Color(255, 255, 255));
		
		lblShowCellID = new JLabel("");
		lblShowCellID.setOpaque(true);
		lblShowCellID.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowCellID.setForeground(new Color(0, 0, 0));
		lblShowCellID.setFont(new Font("Arial", Font.PLAIN, 20));
		lblShowCellID.setBackground(new Color(255, 255, 255));
		
		lblShowGender = new JLabel("");
		lblShowGender.setOpaque(true);
		lblShowGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowGender.setForeground(new Color(255, 255, 255));
		lblShowGender.setFont(new Font("Arial", Font.PLAIN, 20));
		lblShowGender.setBackground(new Color(0, 128, 64));
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(0, 128, 64));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(55)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblLN, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCellID, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblShowCellID, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
						.addComponent(lblShowGender, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
						.addComponent(lblShowLN, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
						.addComponent(lblShowPID, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowPID, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblShowLN, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowGender, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowCellID, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblLN, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCellID, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_4.setLayout(new CardLayout(0, 0));
		
		panel_PrisonIN4 = new JPanel();
		panel_PrisonIN4.setBackground(new Color(0, 40, 40));
		panel_4.add(panel_PrisonIN4, "name_1281743397844900");
		
		lblRD = new JLabel("Release Date");
		lblRD.setForeground(new Color(0, 0, 0));
		lblRD.setOpaque(true);
		lblRD.setHorizontalAlignment(SwingConstants.CENTER);
		lblRD.setBackground(new Color(255, 255, 255));
		
		lblDOE = new JLabel("Date of Entry");
		lblDOE.setForeground(new Color(255, 255, 255));
		lblDOE.setBackground(new Color(0, 128, 64));
		lblDOE.setOpaque(true);
		lblDOE.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNation = new JLabel("Nation");
		lblNation.setForeground(new Color(255, 255, 255));
		lblNation.setBackground(new Color(0, 128, 64));
		lblNation.setOpaque(true);
		lblNation.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblShowRD = new JLabel("");
		lblShowRD.setOpaque(true);
		lblShowRD.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowRD.setForeground(new Color(0, 0, 0));
		lblShowRD.setFont(new Font("Arial", Font.PLAIN, 20));
		lblShowRD.setBackground(new Color(255, 255, 255));
		
		lblReligion = new JLabel("Religion");
		lblReligion.setForeground(new Color(0, 0, 0));
		lblReligion.setBackground(new Color(255, 255, 255));
		lblReligion.setOpaque(true);
		lblReligion.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblShowDOE = new JLabel("");
		lblShowDOE.setBackground(new Color(0, 128, 64));
		lblShowDOE.setOpaque(true);
		lblShowDOE.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowDOE.setForeground(new Color(255, 255, 255));
		lblShowDOE.setFont(new Font("Arial", Font.PLAIN, 20));
		
		lblPunishment = new JLabel("Punishment");
		lblPunishment.setForeground(new Color(255, 255, 255));
		lblPunishment.setOpaque(true);
		lblPunishment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunishment.setBackground(new Color(0, 128, 64));
		
		lblConviction = new JLabel("Conviction");
		lblConviction.setForeground(new Color(0, 0, 0));
		lblConviction.setBackground(new Color(255, 255, 255));
		lblConviction.setOpaque(true);
		lblConviction.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblShowN = new JLabel("");
		lblShowN.setBackground(new Color(0, 128, 64));
		lblShowN.setOpaque(true);
		lblShowN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowN.setForeground(new Color(255, 255, 255));
		lblShowN.setFont(new Font("Arial", Font.PLAIN, 20));
		
		lblShowC = new JLabel("");
		lblShowC.setBackground(new Color(255, 255, 255));
		lblShowC.setOpaque(true);
		lblShowC.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowC.setForeground(new Color(0, 0, 0));
		lblShowC.setFont(new Font("Arial", Font.PLAIN, 20));
		
		lblShowRE = new JLabel("");
		lblShowRE.setBackground(new Color(255, 255, 255));
		lblShowRE.setOpaque(true);
		lblShowRE.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowRE.setForeground(new Color(0, 0, 0));
		lblShowRE.setFont(new Font("Arial", Font.PLAIN, 20));
		
		lblShowPu = new JLabel("");
		lblShowPu.setOpaque(true);
		lblShowPu.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPu.setForeground(new Color(255, 255, 255));
		lblShowPu.setFont(new Font("Arial", Font.PLAIN, 20));
		lblShowPu.setBackground(new Color(0, 128, 64));
		
		lblFN = new JLabel("First Name");
		lblFN.setForeground(new Color(0, 0, 0));
		lblFN.setBackground(new Color(255, 255, 255));
		lblFN.setHorizontalAlignment(SwingConstants.CENTER);
		lblFN.setOpaque(true);
		
		lblShowFN = new JLabel("");
		lblShowFN.setBackground(new Color(255, 255, 255));
		lblShowFN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowFN.setForeground(new Color(0, 0, 0));
		lblShowFN.setFont(new Font("Arial", Font.PLAIN, 20));
		lblShowFN.setOpaque(true);
		
		lblBD = new JLabel("BirthDay");
		lblBD.setForeground(new Color(255, 255, 255));
		lblBD.setBackground(new Color(0, 128, 64));
		lblBD.setHorizontalAlignment(SwingConstants.CENTER);
		lblBD.setOpaque(true);
		
		lblShowBD = new JLabel("");
		lblShowBD.setBackground(new Color(0, 128, 64));
		lblShowBD.setFont(new Font("Arial", Font.PLAIN, 20));
		lblShowBD.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowBD.setForeground(new Color(255, 255, 255));
		lblShowBD.setOpaque(true);
		GroupLayout gl_panel_PrisonIN4 = new GroupLayout(panel_PrisonIN4);
		gl_panel_PrisonIN4.setHorizontalGroup(
			gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
							.addComponent(lblNation, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowN, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblBD, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowBD, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel_PrisonIN4.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
								.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
										.addComponent(lblDOE, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblShowDOE, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
										.addComponent(lblRD, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblShowRD, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
										.addComponent(lblReligion, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblShowC, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
									.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
										.addComponent(lblPunishment, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblShowPu, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
							.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
								.addComponent(lblFN, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblShowFN, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblConviction, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblShowRE, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
					.addGap(5))
		);
		gl_panel_PrisonIN4.setVerticalGroup(
			gl_panel_PrisonIN4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_PrisonIN4.createSequentialGroup()
					.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNation, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addComponent(lblShowN, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addComponent(lblBD, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
						.addComponent(lblShowBD, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFN, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblShowFN, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
							.addComponent(lblConviction, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblShowRE, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowDOE, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDOE, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPunishment, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowPu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_PrisonIN4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblReligion, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRD, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowRD, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowC, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(85))
		);
		panel_PrisonIN4.setLayout(gl_panel_PrisonIN4);
		
		panel_PrisonRelavte = new JPanel();
		panel_4.add(panel_PrisonRelavte, "name_1281745534341700");
		
		panel_PrisonHealth = new JPanel();
		panel_4.add(panel_PrisonHealth, "name_1281747283968800");
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_ShowP = new GroupLayout(panel_ShowP);
		gl_panel_ShowP.setHorizontalGroup(
			gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnShowP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnUpdateP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDeleteShow, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 978, GroupLayout.PREFERRED_SIZE)
					.addGap(194))
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 1130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(156, Short.MAX_VALUE))
		);
		gl_panel_ShowP.setVerticalGroup(
			gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addComponent(btnShowP, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeleteShow, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUpdateP, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		txtSearchAll = new JTextField();
		txtSearchAll.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtSearchAllKeyPressed(e);
			}
		});
		txtSearchAll.setColumns(10);
		
		lblNewLabel_3 = new JLabel("New label");
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(txtSearchAll, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(630, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtSearchAll, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		panel_ShowP.setLayout(gl_panel_ShowP);
		
		panel_AddP = new JPanel();
		panel_AddP.setBackground(new Color(0, 40, 40));
		panel_PCenter.add(panel_AddP, "name_1109176343531900");
		GroupLayout gl_panel_AddP = new GroupLayout(panel_AddP);
		gl_panel_AddP.setHorizontalGroup(
			gl_panel_AddP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1133, Short.MAX_VALUE)
		);
		gl_panel_AddP.setVerticalGroup(
			gl_panel_AddP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 614, Short.MAX_VALUE)
		);
		panel_AddP.setLayout(gl_panel_AddP);
		
		panel_wardens = new JPanel();
		panel_2.add(panel_wardens, "name_1038381311328100");
		
		panel_cell = new JPanel();
		panel_2.add(panel_cell, "name_1038383305611800");
		
		panel_areas = new JPanel();
		panel_2.add(panel_areas, "name_1038385072255100");
		
		panel_account = new JPanel();
		panel_account.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_account.setBackground(new Color(0, 40, 40));
		panel_2.add(panel_account, "name_1038386697681100");
		
		CreateAcc = new JPanel();
		CreateAcc.setBorder(new TitledBorder(null, "Create Account", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		CreateAcc.setBackground(new Color(0, 40, 40));
		GridBagLayout gbl_CreateAcc = new GridBagLayout();
		gbl_CreateAcc.columnWidths = new int[]{78, 38, 102, 64, 20, 20, 20, 0, 0, 0};
		gbl_CreateAcc.rowHeights = new int[]{20, 40, 40, 40, 0, 0};
		gbl_CreateAcc.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_CreateAcc.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		CreateAcc.setLayout(gbl_CreateAcc);
		
		lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		CreateAcc.add(lblNewLabel, gbc_lblNewLabel);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUser.setColumns(10);
		GridBagConstraints gbc_txtUser = new GridBagConstraints();
		gbc_txtUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUser.gridwidth = 5;
		gbc_txtUser.insets = new Insets(0, 0, 5, 5);
		gbc_txtUser.gridx = 1;
		gbc_txtUser.gridy = 1;
		CreateAcc.add(txtUser, gbc_txtUser);
		
		btnAddAccount = new JButton("ADD");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddAccountActionPerformed(e);
				} catch (HeadlessException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddAccount.setForeground(new Color(255, 255, 255));
		btnAddAccount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddAccount.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnAddAccount = new GridBagConstraints();
		gbc_btnAddAccount.fill = GridBagConstraints.BOTH;
		gbc_btnAddAccount.gridwidth = 3;
		gbc_btnAddAccount.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddAccount.gridx = 6;
		gbc_btnAddAccount.gridy = 1;
		CreateAcc.add(btnAddAccount, gbc_btnAddAccount);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassword.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 2;
		CreateAcc.add(lblPassword, gbc_lblPassword);
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPass.setColumns(10);
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.gridwidth = 5;
		gbc_txtPass.insets = new Insets(0, 0, 5, 5);
		gbc_txtPass.gridx = 1;
		gbc_txtPass.gridy = 2;
		CreateAcc.add(txtPass, gbc_txtPass);
		
		btnShowAccount = new JButton("SHOW");
		btnShowAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowAccountActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowAccount.setForeground(new Color(255, 255, 255));
		
		btnShowAccount.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnShowAccount.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnShowAccount = new GridBagConstraints();
		gbc_btnShowAccount.gridwidth = 3;
		gbc_btnShowAccount.fill = GridBagConstraints.BOTH;
		gbc_btnShowAccount.insets = new Insets(0, 0, 5, 0);
		gbc_btnShowAccount.gridx = 6;
		gbc_btnShowAccount.gridy = 2;
		CreateAcc.add(btnShowAccount, gbc_btnShowAccount);
		
		lblWad = new JLabel("Wardens ID");
		lblWad.setForeground(Color.WHITE);
		lblWad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWad.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblWad = new GridBagConstraints();
		gbc_lblWad.insets = new Insets(0, 0, 5, 5);
		gbc_lblWad.gridx = 0;
		gbc_lblWad.gridy = 3;
		CreateAcc.add(lblWad, gbc_lblWad);
		
		txtWardens = new JTextField();
		txtWardens.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtWardens.setColumns(10);
		GridBagConstraints gbc_txtWardens = new GridBagConstraints();
		gbc_txtWardens.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWardens.gridwidth = 5;
		gbc_txtWardens.insets = new Insets(0, 0, 5, 5);
		gbc_txtWardens.gridx = 1;
		gbc_txtWardens.gridy = 3;
		CreateAcc.add(txtWardens, gbc_txtWardens);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Search");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBackground(Color.BLACK);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(10, 6));
		scrollPane_1.setBorder(null);
		scrollPane_1.setForeground(new Color(255, 255, 255));
		scrollPane_1.getViewport().setBackground(new Color(0,40,40));
		
		btnAction = new JButton("Action");
		btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnActionActionPerformed(e);
			}
		});
		btnAction.setForeground(new Color(255, 255, 255));
		btnAction.setBackground(new Color(0, 0, 0));
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeleteActionPerformed(e);
			}
		});
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(0, 0, 0));
		
		btnUpdate = new JButton("Update");
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(0, 0, 0));
		
		panel_showMoreLess = new JPanel();
		panel_showMoreLess.setOpaque(false);
		panel_showMoreLess.setBackground(new Color(0, 40, 40));
		
		panel_showWardenHight = new JPanel();
		
		panel_showWardenHight.setBorder(new TitledBorder(null, "Show Wardens High", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_showWardenHight.setForeground(new Color(0, 40, 40));
		panel_showWardenHight.setBackground(new Color(0, 40, 40));
		GroupLayout gl_panel_account = new GroupLayout(panel_account);
		gl_panel_account.setHorizontalGroup(
			gl_panel_account.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_account.createSequentialGroup()
					.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_account.createSequentialGroup()
							.addGap(44)
							.addComponent(CreateAcc, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_account.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_panel_account.createSequentialGroup()
								.addGap(47)
								.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_account.createSequentialGroup()
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
									.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
									.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnAction, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_showWardenHight, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.LEADING, gl_panel_account.createSequentialGroup()
								.addContainerGap()
								.addComponent(panel_showMoreLess, GroupLayout.PREFERRED_SIZE, 1105, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel_account.setVerticalGroup(
			gl_panel_account.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_account.createSequentialGroup()
					.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_account.createSequentialGroup()
							.addGap(13)
							.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_account.createSequentialGroup()
									.addGroup(gl_panel_account.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_panel_account.createSequentialGroup()
									.addGap(92)
									.addComponent(btnAction, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_account.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_showWardenHight, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_showMoreLess, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(CreateAcc, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addGap(108))
		);
		
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
		btnShowWardensHight.setForeground(Color.WHITE);
		btnShowWardensHight.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnShowWardensHight.setBackground(Color.BLACK);
		GridBagConstraints gbc_btnShowWardensHight = new GridBagConstraints();
		gbc_btnShowWardensHight.fill = GridBagConstraints.BOTH;
		gbc_btnShowWardensHight.gridwidth = 3;
		gbc_btnShowWardensHight.insets = new Insets(0, 0, 5, 5);
		gbc_btnShowWardensHight.gridx = 6;
		gbc_btnShowWardensHight.gridy = 3;
		CreateAcc.add(btnShowWardensHight, gbc_btnShowWardensHight);
		
		table_showAccount = new JTable() {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
	            Component comp = super.prepareRenderer(renderer, row, column);
	            Color alternateColor = new Color(200, 201, 210);
	            Color whiteColor = Color.WHITE;
	            Color bg = comp.getBackground();
	            if(!comp.getBackground().equals(getSelectionBackground())) {
	               Color c = (row % 2 == 0 ? alternateColor : whiteColor);
	               comp.setBackground(bg);
	               c = null;
	            }
	            return comp;
	         }
		};
		table_showAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table_showAccountMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table_showAccount.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table_showAccount.setGridColor(new Color(128, 128, 64));
		table_showAccount.setForeground(new Color(255, 255, 255));
		table_showAccount.setSelectionForeground(new Color(255, 255, 255));
		table_showAccount.setSelectionBackground(new Color(0, 128, 64));
		table_showAccount.setBackground(new Color(0, 64, 64));
		scrollPane_1.setViewportView(table_showAccount);
		panel_showMoreLess.setLayout(new CardLayout(0, 0));
		
		panel_showMore = new JPanel();
		panel_showMore.setBackground(new Color(0, 40, 40));
		panel_showMoreLess.add(panel_showMore, "name_1043142193808600");
		
		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBackground(new Color(64, 128, 128));
		
		btnShowmore = new JButton("Show More");
		btnShowmore.setForeground(new Color(255, 255, 255));
		btnShowmore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnShowmoreActionPerformed(e);
			}
		});
		btnShowmore.setBackground(new Color(0, 0, 0));
		GroupLayout gl_panel_showMore = new GroupLayout(panel_showMore);
		gl_panel_showMore.setHorizontalGroup(
			gl_panel_showMore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showMore.createSequentialGroup()
					.addGap(39)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnShowmore, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addGap(505))
		);
		gl_panel_showMore.setVerticalGroup(
			gl_panel_showMore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showMore.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_showMore.createParallelGroup(Alignment.LEADING)
						.addComponent(btnShowmore, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGap(10))
		);
		
		table_showless = new JTable();
		table_showless.setEnabled(false);
		table_showless.setRowSelectionAllowed(false);
		table_showless.setBackground(new Color(0, 64, 64));
		table_showless.setForeground(new Color(255, 255, 255));
		scrollPane.setViewportView(table_showless);
		panel_showMore.setLayout(gl_panel_showMore);
		
		panel_showLess = new JPanel();
		panel_showLess.setBackground(new Color(0, 40, 40));
		panel_showMoreLess.add(panel_showLess, "name_1043145970182400");
		
		scrollPane_3 = new JScrollPane();
		
		ShowLess = new JButton("Show Less");
		ShowLess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowLessActionPerformed(e);
			}
		});
		ShowLess.setForeground(Color.WHITE);
		ShowLess.setBackground(Color.BLACK);
		GroupLayout gl_panel_showLess = new GroupLayout(panel_showLess);
		gl_panel_showLess.setHorizontalGroup(
			gl_panel_showLess.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_showLess.createSequentialGroup()
					.addContainerGap(39, Short.MAX_VALUE)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 952, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ShowLess, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
		);
		gl_panel_showLess.setVerticalGroup(
			gl_panel_showLess.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showLess.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_showLess.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(ShowLess, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		
		table_showmore = new JTable();
		table_showmore.setEnabled(false);
		table_showmore.setRowSelectionAllowed(false);
		table_showmore.setForeground(new Color(255, 255, 255));
		table_showmore.setBackground(new Color(0, 64, 64));
		scrollPane_3.setViewportView(table_showmore);
		panel_showLess.setLayout(gl_panel_showLess);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(null);
		scrollPane_2.getViewport().setBackground(new Color(0,40,40));
		GroupLayout gl_panel_showWardenHight = new GroupLayout(panel_showWardenHight);
		gl_panel_showWardenHight.setHorizontalGroup(
			gl_panel_showWardenHight.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_showWardenHight.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_showWardenHight.setVerticalGroup(
			gl_panel_showWardenHight.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showWardenHight.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table_showWardensHight = new JTable();
		table_showWardensHight.setForeground(new Color(255, 255, 255));
		table_showWardensHight.setBackground(new Color(0, 64, 64));
		table_showWardensHight.setEnabled(false);
		scrollPane_2.setViewportView(table_showWardensHight	);
		panel_showWardenHight.setLayout(gl_panel_showWardenHight);
		panel_account.setLayout(gl_panel_account);
		
		panel_7 = new JPanel();
		panel_2.add(panel_7, "name_1038388635795000");
		
		panel_8 = new JPanel();
		panel_2.add(panel_8, "name_1038390434654900");
	}
	
	

	protected void lblPrisonersMouseClicked(MouseEvent e) {
		panel_account.show(false);
		panel_prisoners.show(true);
		panel_wardens.show(false);
		panel_areas.show(false);
		panel_cell.show(false);
		panel_7.show(false);
		panel_8.show(false);
	}
	protected void lblWardensMouseClicked(MouseEvent e) {
		panel_account.show(false);
		panel_prisoners.show(false);
		panel_wardens.show(true);
		panel_areas.show(false);
		panel_cell.show(false);
		panel_7.show(false);
		panel_8.show(false);
	}
	protected void lblCellForPrisonersMouseClicked(MouseEvent e) {
		panel_account.show(false);
		panel_prisoners.show(false);
		panel_wardens.show(false);
		panel_areas.show(false);
		panel_cell.show(true);
		panel_7.show(false);
		panel_8.show(false);
	}
	protected void lblAreasMouseClicked(MouseEvent e) {
		panel_account.show(false);
		panel_prisoners.show(true);
		panel_wardens.show(false);
		panel_areas.show(false);
		panel_cell.show(false);
		panel_7.show(false);
		panel_8.show(false);
	}
	protected void lblAccountMouseClicked(MouseEvent e) {
		panel_account.show(true);
		panel_prisoners.show(false);
		panel_wardens.show(false);
		panel_areas.show(false);
		panel_cell.show(false);
		panel_7.show(false);
		panel_8.show(false);
		panel_showWardenHight.show(false);
	}
	protected void lbl1_5MouseClicked(MouseEvent e) {
		panel_account.show(false);
		panel_prisoners.show(false);
		panel_wardens.show(false);
		panel_areas.show(false);
		panel_cell.show(false);
		panel_7.show(false);
		panel_8.show(true);
	}
	protected void lbl1_6MouseClicked(MouseEvent e) {
		panel_account.show(false);
		panel_prisoners.show(true);
		panel_wardens.show(false);
		panel_areas.show(false);
		panel_cell.show(false);
		panel_7.show(true);
		panel_8.show(false);
	}
	protected void btnShowmoreActionPerformed(ActionEvent e) {

		panel_showLess.show(true);
		panel_showMore.show(false);
	}
	protected void ShowLessActionPerformed(ActionEvent e) {
		panel_showLess.show(false);
		panel_showMore.show(true);
		
	}
	protected void btnShowWardensHightActionPerformed(ActionEvent e) throws SQLException {
		panel_showWardenHight.setVisible(true);
		showDataWardensHight();
		
	}
	protected void btnAddAccountActionPerformed(ActionEvent e) throws HeadlessException, SQLException {
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
	protected void btnShowAccountActionPerformed(ActionEvent e) throws SQLException {
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
	protected void table_showAccountMouseClicked(MouseEvent e) throws SQLException {
		int a=table_showAccount.getSelectedRow();
		int warden=(int) table_showAccount.getValueAt((int) a, 1);
		
		showDataWardensLess(warden);
		showDataWardensMore(warden);
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
		table_showless.setModel(model);
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
		model.addColumn("is_Working");
		model.addColumn("Areas Id");
		
		DML.selectTableWardensbyID(a).forEach(wd->{
			model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastLame(),wd.getDateOfBirth(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getPosition(),wd.getStartDate(),wd.getIs_Working(),wd.getAreas_id()});
		});
		table_showmore.setModel(model);
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
		table_showWardensHight.setModel(model);
	}
	
	protected void btnActionActionPerformed(ActionEvent e) 
	{
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
	protected void btnDeleteActionPerformed(ActionEvent e) {
		try {
			int a=table_showAccount.getSelectedRow();
			int id= (int) table_showAccount.getValueAt( a, 0);
			DML.deleteByID(id, "Account", "account_id");
			showDataAccount();
		} catch (Exception e2) {
			
		}
	}
	protected void btnUpdatePActionPerformed(ActionEvent e) {
		int a=table_showP.getSelectedRow();
		String FN=(String) table_showP.getValueAt((int) a, 1);
		String LN=(String) table_showP.getValueAt((int) a, 2);
		String FN=(String) table_showP.getValueAt((int) a, 3);
		String FN=(String) table_showP.getValueAt((int) a, 4);
		String FN=(String) table_showP.getValueAt((int) a, 5);
		String FN=(String) table_showP.getValueAt((int) a, 6);
		String FN=(String) table_showP.getValueAt((int) a, 7);
		String FN=(String) table_showP.getValueAt((int) a, 8);
		String FN=(String) table_showP.getValueAt((int) a, 9);
		String FN=(String) table_showP.getValueAt((int) a, 10);
		

	}
	protected void btnShowPActionPerformed(ActionEvent e) throws SQLException {
		ShowP();
	}
	public void ShowP() throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("id");
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("dateOfBirth");
		model.addColumn("nationality");
		model.addColumn("isMale");
		model.addColumn("dateOfEntry");
		model.addColumn("releaseDate");
		model.addColumn("cellId");
		model.addColumn("conviction");
		model.addColumn("punishment");
		model.addColumn("religion");
		PrisonersDao.selectTablePrisoners().forEach(p->{
			model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getCellId(),p.getConviction(),p.getPunishment(),p.getReligion()});
		});
		table_showP.setModel(model);
	}
	
	protected void table_showPMouseClicked(MouseEvent e) throws SQLException {
		int a=table_showP.getSelectedRow();
		int P=(int) table_showP.getValueAt((int) a, 0);
	

		PrisonersDao.selectTablePrisoners().forEach(p->{
			if(P==p.getId()){
				lblShowPID.setText(String.valueOf(p.getId()));
				lblShowFN.setText(p.getFirstName().toString());
				lblShowLN.setText(p.getFirstName().toString());
				lblShowBD.setText(p.getDateOfBirth().toString());
				lblShowN.setText(p.getNationality().toString());
				lblShowGender.setText(p.getIsMale().toString());
				lblShowDOE.setText(p.getDateOfEntry().toString());
				lblShowRD.setText(p.getReleaseDate().toString());
				lblShowCellID.setText(String.valueOf(p.getCellId()));
				lblShowC.setText(p.getConviction().toString());
				lblShowPu.setText(p.getPunishment().toString());
				lblShowRE.setText(p.getReligion().toString());
			}
		});
	}
	protected void btnSearchActionPerformed(ActionEvent e) throws SQLException {
		String all=txtSearchAll.getText();
		String areas=txtSearchAreas.getText();
		String cell=txtSearchCell.getText();
		
		if(Check.checkNull(all)==false) {
			PrisonersDao.selectTablePrisoners().forEach(p->{
				if(p.)
			});
		}
		
	}
	protected void txtSearchAllKeyPressed(KeyEvent e) {
		String find=txtSearchAll.getText();
		DefaultRowSorter<?,?> soter= (DefaultRowSorter<?, ?>) table_showP.getRowSorter();
		soter.setRowFilter(RowFilter.regexFilter(find));
		soter.setSortKeys(null);
	}
}


