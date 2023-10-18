package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultRowSorter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import Valid.Check;
import dao.AreasDAO;
import dao.CellDao;
import dao.PrisonersDao;
import database.DML;
import entity.Account;
import entity.HealthByPrisoner;
import entity.P_C_A;
import entity.Prisoners;
import entity.RelativesByPrisoner;
import entity.Wardens;

import javax.swing.event.AncestorEvent;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;
import java.awt.Insets;
import java.awt.Point;

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
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Addmin_view extends JFrame {

	private JPanel contentPane;
	private JPanel panel_Body;
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
	private JPanel panel_Add;
	private JScrollPane scrollPane_4;
	private JButton btnShowP;
	private JPanel panel_3;
	private JLabel lblNewLabel_12;
	private JLabel lblShowLN;
	private JLabel lblShowPID;
	private JLabel lblLN;
	private JTable table_showP;
	private JPanel panel_4;
	private JLabel lblGender;
	private JLabel lblShowGender;
	private JLabel lblImage;
	private JLabel lblH;
	private JLabel lblR;
	private JPanel north;
	private JPanel center;
	private JLabel lblIn4;
	private JLabel lblHE;
	private JLabel lblRE;
	private JPanel panel_addP;
	private JPanel panel_6;
	private JPanel panel_9;
	private JPanel panel_5;
	private JLabel lblPrisonerID;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel nationality;
	private JTextField txtPId;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtN;
	private JLabel lblCellId;
	private JLabel lblConviction_1;
	private JLabel lblPunishment_1;
	private JLabel lblReligion_1;
	private JTextField txtCell;
	private JTextField txtC;
	private JTextField txtP;
	private JTextField txtR;
	private JLabel lblPrisonerID_8;
	private JLabel lblPrisonerID_9;
	private JLabel lblPrisonerID_10;
	private JDateChooser dob;
	private JDateChooser doe;
	private JDateChooser rd;
	private JButton btnAddP;
	private JLabel lblGender1;
	private JRadioButton male;
	private JRadioButton Female;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnPrevious;
	private JTextField textField;
	private JButton btnNext;
	private JPanel panel_10;
	private JTextField textSN;
	private JLabel lblNewLabel_4;
	private JTextField txtSS;
	private JLabel lblNewLabel_7;
	private JTextField textField_5;
	private JLabel lblNewLabel_8;
	private JPanel panel;
	private JLabel lblFN;
	private JLabel lblShowFN;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel dsd;
	private JLabel lblNewLabel_13;
	private JLabel lblShowA;
	private JLabel lblShowC;
	private JLabel lblShowF;
	private JLabel lblShowPID_4;
	private JPanel panel_PBody;
	private JPanel panel_PHeader;
	private JButton btnShowArea;
	private JPanel panel_PFooter;
	private JPanel panel_PArea;
	private JPanel panel_Showmore;
	private JScrollPane scrollPane_Area;
	private JTable tableShowA;
	private JScrollPane scrollPane_Showmore;
	private JTable tableGetInfobyArea;
	private JPanel panel_ShowH;
	private JPanel panel_ShowR;
	private JPanel panel_North;
	private JLabel lblNewLabel_20;
	private JPanel panel_West;
	private static int x;
	private static int y;
	private Point mouseDownPont = null;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_11;
	private JLabel lblNewLabel_1;
	private JPanel panel_13;
	private JLabel lblNewLabel_5;
	private JLabel label;
	private JLabel lblP;
	private JLabel lblW;
	private JLabel lblA;
	private JLabel lblN1;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblN2;
	private JLabel lblAc;
	private JButton btnDelete1;
	private JButton btnChange;
	private JPanel panel_12;
	private JComboBox comboBox;
	private JLabel label_1;
	private JLabel lblPID;
	private JLabel lblAreas;
	private JLabel lblCellNumber;
	private JTextField textField_1;
	private JComboBox comboBoxChange;
	private JTextField textField_2;
	private JButton btnChange_1;
	private JLabel lblCellId_1;
	private JComboBox comboBox_1;
	private JSeparator separator;
	private JPanel panel_14;
	private JLabel lblPrisonerID_1;
	private JTextField txtShowUpdateID;
	private JLabel lblFirstName_1;
	private JTextField txtShowUpdateFN;
	private JLabel lblLastName_1;
	private JTextField txtShowUpdateLN;
	private JLabel nationality_1;
	private JTextField txtShowUpdateN;
	private JLabel lblaaaa;
	private JTextField txtShowUpdateC;
	private JLabel lblPunishment;
	private JTextField txtShowUpdateP;
	private JLabel lblReligion;
	private JTextField txtShowUpdateR;
	private JLabel lblGender1_1;
	private JRadioButton male_1;
	private JRadioButton Female_1;
	private JLabel lblPrisonerID_2;
	private JDateChooser ShowUpdateRD;
	private JLabel lblPrisonerID_3;
	private JDateChooser ShowUpdateDOE;
	private JLabel lblPrisonerID_4;
	private JDateChooser ShowUpdateDOB;
	private JButton UpdateP;
	private JLabel lblNewLabel_3;
	private JButton btnShow;
	
	private int areaid=0;

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
	 * @throws SQLException 
	 */
	public Addmin_view() throws SQLException {
		setBackground(new Color(192, 192, 192));
		setTitle("Manages Prisons");
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1395, 750);
		
		addMouseMotionListener((MouseMotionListener) new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				thisMouseDragged(e);
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				thisMousePressed(e);
			}
		});
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 40, 40));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		
		panel_Body = new JPanel();
		panel_Body.setBorder(null);
		panel_Body.setBackground(new Color(192, 192, 192));
		panel_Body.setLayout(new CardLayout(0, 0));
		
		panel_prisoners = new JPanel();
		panel_prisoners.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_prisoners.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_prisoners, "name_1038379110987700");
		panel_prisoners.setLayout(new BorderLayout(0, 0));
		
		panel_PNorth = new JPanel();
		panel_PNorth.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		panel_PNorth.setBackground(new Color(0, 40, 40));
		panel_prisoners.add(panel_PNorth, BorderLayout.NORTH);
		panel_PNorth.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblShowP = new JLabel("PRISONERS");
		lblShowP.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowP.setToolTipText("");
		lblShowP.setForeground(new Color(255, 255, 255));
		lblShowP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblShowPMouseClicked(e);
			}
		});
		lblShowP.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblShowP.setLabelFor(this);
		lblShowP.setOpaque(true);
		lblShowP.setBackground(new Color(64, 128, 128));
		panel_PNorth.add(lblShowP);
		
		lblH = new JLabel("HEALTH");
		lblH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblHMouseClicked(e);
			}
		});
		lblH.setForeground(new Color(255, 255, 255));
		lblH.setOpaque(true);
		lblH.setBackground(new Color(0, 64, 64));
		lblH.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		panel_PNorth.add(lblH);
		
		lblR = new JLabel("RELATIVES");
		lblR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblRMouseClicked(e);
			}
		});
		lblR.setForeground(new Color(255, 255, 255));
		lblR.setBackground(new Color(0, 64, 64));
		lblR.setOpaque(true);
		lblR.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		panel_PNorth.add(lblR);
		
		lblAddP = new JLabel("ADD");
		lblAddP.setForeground(new Color(255, 255, 255));
		lblAddP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblAddPMouseClicked(e);
			}
		});
		lblAddP.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblAddP.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddP.setBackground(new Color(0, 64, 64));
		lblAddP.setOpaque(true);
		panel_PNorth.add(lblAddP);
		
		panel_PCenter = new JPanel();
		panel_PCenter.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
		panel_prisoners.add(panel_PCenter, BorderLayout.CENTER);
		panel_PCenter.setLayout(new CardLayout(0, 0));
		
		panel_ShowP = new JPanel();
		panel_ShowP.setBorder(null);
		panel_ShowP.setEnabled(false);
		panel_ShowP.setBackground(new Color(0, 40, 40));
		panel_PCenter.add(panel_ShowP, "name_1109174382688600");
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBorder(null);
		scrollPane_4.getViewport().setBackground(new Color(0,40,40));
		
		panel_3 = new JPanel();
		panel_3.setForeground(new Color(255, 255, 255));
		panel_3.setBorder(new TitledBorder(null, "Prioner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_3.setBackground(new Color(0, 40, 40));
		
		table_showP = new JTable();

		table_showP.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "First Name", "Last Name", "Birthday", "Nationality", "Gender", "New column", "Date of Entry", "Release Date", "New column", "New column", "New column"
			}
		));
		table_showP.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_showP.getColumnModel().getColumn(1).setPreferredWidth(53);
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
		lblNewLabel_12.setBackground(new Color(97, 158, 123));
		
		lblShowPID = new JLabel("");
		lblShowPID.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPID.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowPID.setForeground(new Color(255, 255, 255));
		lblShowPID.setBackground(new Color(97, 158, 123));
		lblShowPID.setOpaque(true);
		
		lblLN = new JLabel("Last Name");
		lblLN.setForeground(new Color(255, 255, 255));
		lblLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblLN.setBackground(new Color(97, 158, 123));
		lblLN.setOpaque(true);
		
		lblShowLN = new JLabel("");
		lblShowLN.setForeground(new Color(255, 255, 255));
		lblShowLN.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowLN.setBackground(new Color(97, 158, 123));
		lblShowLN.setOpaque(true);
		
		panel_4 = new JPanel();
		
		lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setOpaque(true);
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setBackground(new Color(0, 128, 64));
		
		lblShowGender = new JLabel("");
		lblShowGender.setOpaque(true);
		lblShowGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowGender.setForeground(new Color(255, 255, 255));
		lblShowGender.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowGender.setBackground(new Color(0, 128, 64));
		
		lblImage = new JLabel("");
		lblImage.setBackground(new Color(0, 0, 0));
		
		lblFN = new JLabel("First Name");
		lblFN.setOpaque(true);
		lblFN.setHorizontalAlignment(SwingConstants.CENTER);
		lblFN.setForeground(new Color(255, 255, 255));
		lblFN.setBackground(new Color(0, 128, 64));
		
		lblShowFN = new JLabel("");
		lblShowFN.setOpaque(true);
		lblShowFN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowFN.setForeground(new Color(255, 255, 255));
		lblShowFN.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowFN.setBackground(new Color(0, 128, 64));
		
		lblNewLabel_9 = new JLabel("Area");
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBackground(new Color(97, 158, 123));
		
		lblNewLabel_10 = new JLabel("Cell");
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBackground(new Color(0, 128, 64));
		
		dsd = new JLabel("Floor");
		dsd.setOpaque(true);
		dsd.setHorizontalAlignment(SwingConstants.CENTER);
		dsd.setForeground(new Color(255, 255, 255));
		dsd.setBackground(new Color(97, 158, 123));
		
		lblNewLabel_13 = new JLabel("Prisoner ID");
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_13.setBackground(new Color(0, 128, 64));
		
		lblShowA = new JLabel("");
		lblShowA.setOpaque(true);
		lblShowA.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowA.setForeground(new Color(255, 255, 255));
		lblShowA.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowA.setBackground(new Color(97, 158, 123));
		
		lblShowC = new JLabel("");
		lblShowC.setOpaque(true);
		lblShowC.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowC.setForeground(new Color(255, 255, 255));
		lblShowC.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowC.setBackground(new Color(0, 128, 64));
		
		lblShowF = new JLabel("");
		lblShowF.setOpaque(true);
		lblShowF.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowF.setForeground(new Color(255, 255, 255));
		lblShowF.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowF.setBackground(new Color(97, 158, 123));
		
		lblShowPID_4 = new JLabel("");
		lblShowPID_4.setOpaque(true);
		lblShowPID_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPID_4.setForeground(new Color(255, 255, 255));
		lblShowPID_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowPID_4.setBackground(new Color(0, 128, 64));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowGender, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowPID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblLN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowLN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblFN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowFN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(dsd, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblShowA, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addComponent(lblShowC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblShowF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblShowPID_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(8, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
												.addComponent(lblShowPID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblShowFN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblFN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
										.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
											.addComponent(lblShowA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblShowC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblLN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblShowLN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(dsd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblShowF, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(lblShowPID_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblShowGender, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap())
		);
		panel_4.setLayout(new CardLayout(0, 0));
		panel_3.setLayout(gl_panel_3);
		
		panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "SEARCH", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_10.setBackground(new Color(0, 40, 40));
		
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
		
		textSN = new JTextField();
		textSN.setColumns(10);
		
		lblNewLabel_4 = new JLabel("CELL NUMBER");
		lblNewLabel_4.setForeground(Color.WHITE);
		
		txtSS = new JTextField();
		txtSS.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		txtSS.setColumns(10);
		
		lblNewLabel_7 = new JLabel("SEARCH");
		lblNewLabel_7.setForeground(Color.WHITE);
		
		comboBox = new JComboBox();
		comboBox.addItem("ALL");
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox.addItem(p.getAreaName());
		});
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(textSN, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSS, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtSS, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_10.setLayout(gl_panel_10);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "PAGE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 40, 40));
		
		btnDelete1 = new JButton("Delete");
		btnDelete1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDelete1ActionPerformed(e);
			}
		});
		btnDelete1.setForeground(Color.WHITE);
		btnDelete1.setBackground(Color.BLACK);
		
		btnChange = new JButton("Change");
		btnChange.setForeground(Color.WHITE);
		btnChange.setBackground(Color.BLACK);
		
		panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 40, 40));
		panel_12.setBorder(new TitledBorder(null, "Change Cell", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		GroupLayout gl_panel_ShowP = new GroupLayout(panel_ShowP);
		gl_panel_ShowP.setHorizontalGroup(
			gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1028, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
								.addGroup(gl_panel_ShowP.createSequentialGroup()
									.addGap(6)
									.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
										.addComponent(btnShowP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDelete1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnChange, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))))
					.addGap(83))
		);
		gl_panel_ShowP.setVerticalGroup(
			gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addGap(26)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addGap(6)
							.addComponent(btnShowP, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDelete1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnChange, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 173, Short.MAX_VALUE)
						.addComponent(panel_12, 0, 0, Short.MAX_VALUE))
					.addGap(110))
		);
		
		label_1 = new JLabel("New label");
		
		lblPID = new JLabel("Prioner ID");
		lblPID.setOpaque(true);
		lblPID.setHorizontalAlignment(SwingConstants.CENTER);
		lblPID.setForeground(Color.WHITE);
		lblPID.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPID.setBackground(new Color(0, 128, 64));
		
		lblAreas = new JLabel("Areas");
		lblAreas.setOpaque(true);
		lblAreas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreas.setForeground(Color.WHITE);
		lblAreas.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAreas.setBackground(new Color(0, 128, 64));
		
		lblCellNumber = new JLabel("Cell Number");
		lblCellNumber.setOpaque(true);
		lblCellNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellNumber.setForeground(Color.WHITE);
		lblCellNumber.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCellNumber.setBackground(new Color(0, 128, 64));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		comboBoxChange = new JComboBox();
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		btnChange_1 = new JButton("Change");
		btnChange_1.setForeground(Color.WHITE);
		btnChange_1.setBackground(new Color(255, 0, 0));
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnChange_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_12.createSequentialGroup()
							.addComponent(lblCellNumber, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_12.createSequentialGroup()
							.addComponent(lblAreas, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxChange, 0, 177, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_12.createSequentialGroup()
							.addComponent(lblPID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBoxChange)
						.addComponent(lblAreas, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCellNumber, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnChange_1, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
		);
		panel_12.setLayout(gl_panel_12);
		
		btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNextActionPerformed(e);
			}
		});
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		lblNewLabel_8 = new JLabel("/");
		lblNewLabel_8.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPreviousActionPerformed(e);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(btnPrevious, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPrevious, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8)))
		);
		panel.setLayout(gl_panel);
		panel_ShowP.setLayout(gl_panel_ShowP);
		
		panel_Add = new JPanel();
		panel_Add.setBackground(new Color(0, 40, 40));
		panel_PCenter.add(panel_Add, "name_1109176343531900");
		panel_Add.setLayout(new BorderLayout(0, 0));
		
		north = new JPanel();
		panel_Add.add(north, BorderLayout.NORTH);
		north.setLayout(new GridLayout(0, 3, 0, 0));
		
		lblIn4 = new JLabel("Iformation");
		lblIn4.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblIn4.setHorizontalAlignment(SwingConstants.CENTER);
		north.add(lblIn4);
		
		lblHE = new JLabel("Health");
		lblHE.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblHE.setHorizontalAlignment(SwingConstants.CENTER);
		north.add(lblHE);
		
		lblRE = new JLabel("Relative");
		lblRE.setHorizontalAlignment(SwingConstants.CENTER);
		lblRE.setFont(new Font("SansSerif", Font.PLAIN, 18));
		north.add(lblRE);
		
		center = new JPanel();
		panel_Add.add(center, BorderLayout.CENTER);
		center.setLayout(new CardLayout(0, 0));
		
		panel_addP = new JPanel();
		panel_addP.setBackground(new Color(0, 40, 40));
		center.add(panel_addP, "name_1645143809796900");
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(64, 128, 128));
		panel_5.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		btnAddP = new JButton("ADD");
		btnAddP.setBackground(new Color(0, 0, 0));
		btnAddP.setForeground(new Color(255, 255, 255));
		btnAddP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddPActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		separator = new JSeparator();
		
		panel_14 = new JPanel();
		panel_14.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_14.setBackground(new Color(64, 128, 128));
		
		lblFirstName_1 = new JLabel("First Name");
		lblFirstName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName_1.setForeground(Color.WHITE);
		
		txtShowUpdateFN = new JTextField();
		txtShowUpdateFN.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateFN.setColumns(10);
		
		lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName_1.setForeground(Color.WHITE);
		
		txtShowUpdateLN = new JTextField();
		txtShowUpdateLN.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateLN.setColumns(10);
		
		nationality_1 = new JLabel("Nationality");
		nationality_1.setHorizontalAlignment(SwingConstants.CENTER);
		nationality_1.setForeground(Color.WHITE);
		
		txtShowUpdateN = new JTextField();
		txtShowUpdateN.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateN.setColumns(10);
		
		lblaaaa = new JLabel("Conviction");
		lblaaaa.setHorizontalAlignment(SwingConstants.CENTER);
		lblaaaa.setForeground(Color.WHITE);
		
		txtShowUpdateC = new JTextField();
		txtShowUpdateC.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateC.setColumns(10);
		
		lblPunishment = new JLabel("Punishment");
		lblPunishment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunishment.setForeground(Color.WHITE);
		
		txtShowUpdateP = new JTextField();
		txtShowUpdateP.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateP.setColumns(10);
		
		lblReligion = new JLabel("Religion");
		lblReligion.setHorizontalAlignment(SwingConstants.CENTER);
		lblReligion.setForeground(Color.WHITE);
		
		txtShowUpdateR = new JTextField();
		txtShowUpdateR.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateR.setColumns(10);
		
		lblGender1_1 = new JLabel("Gender");
		lblGender1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender1_1.setForeground(Color.WHITE);
		
		male_1 = new JRadioButton("Male");
		
		Female_1 = new JRadioButton("Female");
		Female_1.setSelected(true);
		
		lblPrisonerID_2 = new JLabel("release Date");
		lblPrisonerID_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_2.setForeground(Color.WHITE);
		
		ShowUpdateRD = new JDateChooser();
		
		lblPrisonerID_3 = new JLabel("Date Of Entry");
		lblPrisonerID_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_3.setForeground(Color.WHITE);
		
		ShowUpdateDOE = new JDateChooser();
		
		lblPrisonerID_4 = new JLabel("Date Of Birth");
		lblPrisonerID_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_4.setForeground(Color.WHITE);
		
		ShowUpdateDOB = new JDateChooser();
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(0, 40, 40));
		lblNewLabel_3.setOpaque(true);
		
		lblPrisonerID_1 = new JLabel("Prisoner ID");
		lblPrisonerID_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_1.setForeground(Color.WHITE);
		
		txtShowUpdateID = new JTextField();
		txtShowUpdateID.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateID.setColumns(10);
		
		btnShow = new JButton("Show");
		btnShow.setForeground(Color.WHITE);
		btnShow.setBackground(Color.BLACK);
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addComponent(btnShow, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_14.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblPrisonerID_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtShowUpdateID, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
					.addGap(84)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_14.createSequentialGroup()
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createSequentialGroup()
									.addComponent(lblFirstName_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtShowUpdateFN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_14.createSequentialGroup()
									.addComponent(lblLastName_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtShowUpdateLN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_14.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
									.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
										.addComponent(lblGender1_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
										.addComponent(nationality_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_14.createSequentialGroup()
											.addComponent(male_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(Female_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtShowUpdateN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
									.addGap(6)))
							.addGroup(gl_panel_14.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_14.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPrisonerID_4, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPrisonerID_3, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblaaaa, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
								.addGroup(gl_panel_14.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblPunishment, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(6))))
						.addGroup(gl_panel_14.createSequentialGroup()
							.addComponent(lblReligion, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtShowUpdateR, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblPrisonerID_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addGap(6)))
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addComponent(ShowUpdateDOB, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_14.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(ShowUpdateRD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(ShowUpdateDOE, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
						.addComponent(txtShowUpdateC, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtShowUpdateP, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
					.addGap(73))
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_14.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtShowUpdateFN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblFirstName_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblPrisonerID_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(ShowUpdateDOB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtShowUpdateLN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblLastName_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblPrisonerID_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(ShowUpdateDOE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createSequentialGroup()
									.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblReligion, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPrisonerID_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtShowUpdateR, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
										.addComponent(nationality_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblaaaa, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtShowUpdateC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtShowUpdateN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
								.addComponent(ShowUpdateRD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_14.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createSequentialGroup()
									.addComponent(lblPrisonerID_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtShowUpdateID, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnShow, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
						.addComponent(male_1)
						.addComponent(Female_1)
						.addComponent(lblGender1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPunishment, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtShowUpdateP, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_14.setLayout(gl_panel_14);
		
		UpdateP = new JButton("Update");
		UpdateP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdatePActionPerformed(e);
			}
		});
		UpdateP.setForeground(Color.WHITE);
		UpdateP.setBackground(Color.BLACK);
		GroupLayout gl_panel_addP = new GroupLayout(panel_addP);
		gl_panel_addP.setHorizontalGroup(
			gl_panel_addP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_addP.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel_addP.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
						.addGroup(gl_panel_addP.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_addP.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_addP.createSequentialGroup()
									.addComponent(btnAddP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(separator, GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(UpdateP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 1026, GroupLayout.PREFERRED_SIZE))))
					.addGap(27))
		);
		gl_panel_addP.setVerticalGroup(
			gl_panel_addP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_addP.createSequentialGroup()
					.addGap(32)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_addP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_addP.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddP, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_addP.createSequentialGroup()
							.addGap(45)
							.addGroup(gl_panel_addP.createParallelGroup(Alignment.LEADING)
								.addComponent(UpdateP, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))))
					.addGap(17)
					.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		lblPrisonerID = new JLabel("Prisoner ID");
		lblPrisonerID.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID.setForeground(new Color(255, 255, 255));
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setForeground(Color.WHITE);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setForeground(Color.WHITE);
		
		nationality = new JLabel("Nationality");
		nationality.setHorizontalAlignment(SwingConstants.CENTER);
		nationality.setForeground(Color.WHITE);
		
		txtPId = new JTextField();
		txtPId.setHorizontalAlignment(SwingConstants.LEFT);
		txtPId.setColumns(10);
		
		txtFName = new JTextField();
		txtFName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFName.setColumns(10);
		
		txtLName = new JTextField();
		txtLName.setHorizontalAlignment(SwingConstants.LEFT);
		txtLName.setColumns(10);
		
		txtN = new JTextField();
		txtN.setHorizontalAlignment(SwingConstants.LEFT);
		txtN.setColumns(10);
		
		lblCellId = new JLabel("Cell");
		lblCellId.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellId.setForeground(Color.WHITE);
		
		lblConviction_1 = new JLabel("Conviction");
		lblConviction_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblConviction_1.setForeground(Color.WHITE);
		
		lblPunishment_1 = new JLabel("Punishment");
		lblPunishment_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunishment_1.setForeground(Color.WHITE);
		
		lblReligion_1 = new JLabel("Religion");
		lblReligion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReligion_1.setForeground(Color.WHITE);
		
		txtCell = new JTextField();
		txtCell.setHorizontalAlignment(SwingConstants.LEFT);
		txtCell.setColumns(10);
		
		txtC = new JTextField();
		txtC.setHorizontalAlignment(SwingConstants.LEFT);
		txtC.setColumns(10);
		
		txtP = new JTextField();
		txtP.setHorizontalAlignment(SwingConstants.LEFT);
		txtP.setColumns(10);
		
		txtR = new JTextField();
		txtR.setHorizontalAlignment(SwingConstants.LEFT);
		txtR.setColumns(10);
		
		lblPrisonerID_8 = new JLabel("Date Of Birth");
		lblPrisonerID_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_8.setForeground(Color.WHITE);
		
		lblPrisonerID_9 = new JLabel("Date Of Entry");
		lblPrisonerID_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_9.setForeground(Color.WHITE);
		
		lblPrisonerID_10 = new JLabel("release Date");
		lblPrisonerID_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_10.setForeground(Color.WHITE);
		
		dob = new JDateChooser();
		
		doe = new JDateChooser();
		
		rd = new JDateChooser();
		
		lblGender1 = new JLabel("Gender");
		lblGender1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender1.setForeground(Color.WHITE);
		
		male = new JRadioButton("Male");
		buttonGroup.add(male);
		
		Female = new JRadioButton("Female");
		buttonGroup.add(Female);
		Female.setSelected(true);
		
		lblCellId_1 = new JLabel("Area");
		lblCellId_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellId_1.setForeground(Color.WHITE);
		
		comboBox_1 = new JComboBox();
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_1.addItem(p.getAreaName());
		});
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPrisonerID, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPId, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtFName, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtLName, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(nationality, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
					.addGap(41)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblConviction_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtC, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPunishment_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtP, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblReligion_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtR, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblGender1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(male, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Female, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addGap(48)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPrisonerID_10, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPrisonerID_9, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(doe, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPrisonerID_8, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(dob, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblCellId, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCell, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCellId_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPrisonerID, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPId, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtLName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(nationality, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGender1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(male)
								.addComponent(Female))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConviction_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPunishment_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtP, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblReligion_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtR, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPrisonerID_8, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(dob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPrisonerID_9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(doe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPrisonerID_10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(rd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblCellId, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtCell, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblCellId_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		panel_addP.setLayout(gl_panel_addP);
		
		panel_6 = new JPanel();
		center.add(panel_6, "name_1645145942555400");
		
		panel_9 = new JPanel();
		center.add(panel_9, "name_1645148070302300");
		
		panel_ShowH = new JPanel();
		panel_PCenter.add(panel_ShowH, "name_263096476421599");
		
		panel_ShowR = new JPanel();
		panel_PCenter.add(panel_ShowR, "name_263100679818000");
		
		panel_wardens = new JPanel();
		panel_Body.add(panel_wardens, "name_1038381311328100");
		
		panel_cell = new JPanel();
		panel_Body.add(panel_cell, "name_1038383305611800");
		
		panel_areas = new JPanel();
		panel_Body.add(panel_areas, "name_1038385072255100");
		
		panel_PBody = new JPanel();
		
		panel_PHeader = new JPanel();
		
		panel_PFooter = new JPanel();
		GroupLayout gl_panel_areas = new GroupLayout(panel_areas);
		gl_panel_areas.setHorizontalGroup(
			gl_panel_areas.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_areas.createSequentialGroup()
					.addGroup(gl_panel_areas.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_areas.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_PHeader, GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE))
						.addComponent(panel_PBody, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
						.addComponent(panel_PFooter, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_areas.setVerticalGroup(
			gl_panel_areas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_areas.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_PHeader, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_PBody, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(panel_PFooter, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
		);
		
		panel_PArea = new JPanel();
		
		panel_Showmore = new JPanel();
		GroupLayout gl_panel_PBody = new GroupLayout(panel_PBody);
		gl_panel_PBody.setHorizontalGroup(
			gl_panel_PBody.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_PBody.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_PArea, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_Showmore, GroupLayout.PREFERRED_SIZE, 544, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_PBody.setVerticalGroup(
			gl_panel_PBody.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_PBody.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_PBody.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_Showmore, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_PArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		scrollPane_Showmore = new JScrollPane();
		GroupLayout gl_panel_Showmore = new GroupLayout(panel_Showmore);
		gl_panel_Showmore.setHorizontalGroup(
			gl_panel_Showmore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Showmore.createSequentialGroup()
					.addComponent(scrollPane_Showmore, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_panel_Showmore.setVerticalGroup(
			gl_panel_Showmore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Showmore.createSequentialGroup()
					.addComponent(scrollPane_Showmore, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tableGetInfobyArea = new JTable();
		scrollPane_Showmore.setViewportView(tableGetInfobyArea);
		panel_Showmore.setLayout(gl_panel_Showmore);
		
		scrollPane_Area = new JScrollPane();
		GroupLayout gl_panel_PArea = new GroupLayout(panel_PArea);
		gl_panel_PArea.setHorizontalGroup(
			gl_panel_PArea.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_PArea.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_Area, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_PArea.setVerticalGroup(
			gl_panel_PArea.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_PArea.createSequentialGroup()
					.addComponent(scrollPane_Area, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		tableShowA = new JTable();
		scrollPane_Area.setViewportView(tableShowA);
		panel_PArea.setLayout(gl_panel_PArea);
		panel_PBody.setLayout(gl_panel_PBody);
		
		btnShowArea = new JButton("Show");
		btnShowArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowAreaActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GroupLayout gl_panel_PHeader = new GroupLayout(panel_PHeader);
		gl_panel_PHeader.setHorizontalGroup(
			gl_panel_PHeader.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_PHeader.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnShowArea, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(925, Short.MAX_VALUE))
		);
		gl_panel_PHeader.setVerticalGroup(
			gl_panel_PHeader.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_PHeader.createSequentialGroup()
					.addComponent(btnShowArea, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_PHeader.setLayout(gl_panel_PHeader);
		panel_areas.setLayout(gl_panel_areas);
		
		panel_account = new JPanel();
		panel_account.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_account.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_account, "name_1038386697681100");
		
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
		scrollPane.setBorder(null);
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
				.addGroup(Alignment.TRAILING, gl_panel_showMore.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_showMore.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
						.addComponent(btnShowmore, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
					.addGap(12))
		);
		
		table_showless = new JTable();
		table_showless.setBorder(null);
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
		scrollPane_3.setBorder(null);
		
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
					.addGroup(gl_panel_showLess.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(ShowLess, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
					.addGap(12))
		);
		
		table_showmore = new JTable();
		table_showmore.setBorder(null);
		table_showmore.setEnabled(false);
		table_showmore.setRowSelectionAllowed(false);
		table_showmore.setForeground(new Color(255, 255, 255));
		table_showmore.setBackground(new Color(0, 64, 64));
		scrollPane_3.setViewportView(table_showmore);
		panel_showLess.setLayout(gl_panel_showLess);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(null);
		scrollPane_2.getViewport().setBackground(new Color(0,40,40));
		contentPane.setLayout(new BorderLayout(0, 0));
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
		panel_Body.add(panel_7, "name_1038388635795000");
		
		panel_8 = new JPanel();
		panel_Body.add(panel_8, "name_1038390434654900");
		contentPane.add(panel_Body);
		
		panel_North = new JPanel();
		panel_North.setBackground(new Color(0, 40, 40));
		contentPane.add(panel_North, BorderLayout.NORTH);
		
		lblNewLabel_20 = new JLabel("X");
		lblNewLabel_20.setForeground(new Color(255, 255, 255));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_20MouseClicked(e);
			}
		});
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setBackground(new Color(255, 0, 0));
		GroupLayout gl_panel_North = new GroupLayout(panel_North);
		gl_panel_North.setHorizontalGroup(
			gl_panel_North.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_North.createSequentialGroup()
					.addContainerGap(1361, Short.MAX_VALUE)
					.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_North.setVerticalGroup(
			gl_panel_North.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_20, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
		);
		panel_North.setLayout(gl_panel_North);
		
		panel_West = new JPanel();
		panel_West.setBackground(new Color(0, 64, 64));
		contentPane.add(panel_West, BorderLayout.WEST);
		panel_West.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 40, 40));
		panel_West.add(panel_2, BorderLayout.NORTH);
		
		lblNewLabel_1 = new JLabel("Manages Prisons");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		lblNewLabel_1.setBackground(new Color(0, 40, 40));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 40, 40));
		panel_West.add(panel_11, BorderLayout.SOUTH);
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 40, 40));
		panel_West.add(panel_13, BorderLayout.CENTER);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblP = new JLabel("Prioners");
		lblP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPMouseClicked(e);
			}
		});
		lblP.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setForeground(new Color(255, 255, 255));
		lblP.setBackground(new Color(0, 64, 64));
		lblP.setOpaque(true);
		panel_13.add(lblP);
		
		lblW = new JLabel("Wardens");
		lblW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblWMouseClicked(e);
			}
		});
		lblW.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblW.setHorizontalAlignment(SwingConstants.CENTER);
		lblW.setForeground(new Color(255, 255, 255));
		lblW.setBackground(new Color(0, 64, 64));
		lblW.setOpaque(true);
		panel_13.add(lblW);
		
		lblA = new JLabel("Areas && Cell");
		lblA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblAMouseClicked(e);
			}
		});
		lblA.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setForeground(new Color(255, 255, 255));
		lblA.setBackground(new Color(0, 64, 64));
		lblA.setOpaque(true);
		panel_13.add(lblA);
		
		lblAc = new JLabel("Account");
		lblAc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblAcMouseClicked(e);
			}
		});
		lblAc.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblAc.setHorizontalAlignment(SwingConstants.CENTER);
		lblAc.setForeground(new Color(255, 255, 255));
		lblAc.setBackground(new Color(0, 64, 64));
		lblAc.setOpaque(true);
		panel_13.add(lblAc);
		
		lblN1 = new JLabel("New label");
		lblN1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblN1MouseClicked(e);
			}
		});
		lblN1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblN1.setHorizontalAlignment(SwingConstants.CENTER);
		lblN1.setForeground(new Color(255, 255, 255));
		lblN1.setBackground(new Color(0, 64, 64));
		lblN1.setOpaque(true);
		panel_13.add(lblN1);
		
		lblN2 = new JLabel("New label");
		lblN2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblN2MouseClicked(e);
			}
		});
		lblN2.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblN2.setHorizontalAlignment(SwingConstants.CENTER);
		lblN2.setForeground(new Color(255, 255, 255));
		lblN2.setBackground(new Color(0, 64, 64));
		lblN2.setOpaque(true);
		panel_13.add(lblN2);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBackground(new Color(0, 40, 40));
		lblNewLabel_17.setOpaque(true);
		panel_13.add(lblNewLabel_17);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBackground(new Color(0, 40, 40));
		lblNewLabel_16.setOpaque(true);
		panel_13.add(lblNewLabel_16);
		
		label = new JLabel("");
		label.setBackground(new Color(0, 40, 40));
		label.setOpaque(true);
		panel_13.add(label);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(0, 40, 40));
		lblNewLabel_5.setOpaque(true);
		panel_13.add(lblNewLabel_5);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 40, 40));
		contentPane.add(panel_1, BorderLayout.SOUTH);
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
									count=(wr.getWardenId());
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
	public void showDataWardensLess(int warden) throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Warden Id");
		model.addColumn("Name");
		model.addColumn("Gender");
		model.addColumn("Position");
		
		DML.selectTableWardens().forEach(wd->{
			if(wd.getWardenId()==warden) {
				model.addRow(new Object[] {wd.getWardenId(),wd.getLastName(),wd.getIsMale(),wd.getPosition()});}
		});
		table_showless.setModel(model);
	}
	public void showDataWardensMore(int a) throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("Gender");
		model.addColumn("Phone");
		model.addColumn("Email");
		model.addColumn("Address");
		model.addColumn("Start Day");
		model.addColumn("Be Working");
		model.addColumn("Area");
		model.addColumn("Shift");

		
		DML.selectTableWardens().forEach(wd->{
			if(wd.getWardenId()==a) {
				model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastName(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getStartDate(),wd.getIs_Working(),wd.getAreaName(),wd.getShiftType()});
			}
			
		});
		table_showmore.setModel(model);
		
		table_showmore.getColumnModel().getColumn(0).setMinWidth(40);
		table_showmore.getColumnModel().getColumn(0).setPreferredWidth(40);
		table_showmore.getColumnModel().getColumn(0).setMaxWidth(100);
	}
	
	public void showDataWardensHight() throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Gender");
		model.addColumn("Phone");
		model.addColumn("Position");
		model.addColumn("Area");
		model.addColumn("Shift");
		
		DML.selectTableWardens().forEach(l1->{
			if(( l1.getPosition().equals("Hight"))) {
				model.addRow(new Object[] {l1.getWardenId(),l1.getLastName(),l1.getIsMale(),l1.getPhoneNumber(),l1.getPosition(),l1.getAreaName(),l1.getShiftType()});
			}	
		});
		table_showWardensHight.setModel(model);
		table_showWardensHight.getColumnModel().getColumn(0).setMinWidth(40);
		table_showWardensHight.getColumnModel().getColumn(0).setPreferredWidth(40);
		table_showWardensHight.getColumnModel().getColumn(0).setMaxWidth(100);
		
		table_showWardensHight.getColumnModel().getColumn(4).setMinWidth(70);
		table_showWardensHight.getColumnModel().getColumn(4).setPreferredWidth(70);
		table_showWardensHight.getColumnModel().getColumn(4).setMaxWidth(70);
		
		table_showWardensHight.getColumnModel().getColumn(2).setMinWidth(50);
		table_showWardensHight.getColumnModel().getColumn(2).setPreferredWidth(50);
		table_showWardensHight.getColumnModel().getColumn(2).setMaxWidth(50);
		
		table_showWardensHight.getColumnModel().getColumn(3).setMinWidth(100);
		table_showWardensHight.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_showWardensHight.getColumnModel().getColumn(3).setMaxWidth(100);
		
		table_showWardensHight.getColumnModel().getColumn(5).setMinWidth(60);
		table_showWardensHight.getColumnModel().getColumn(5).setPreferredWidth(60);
		table_showWardensHight.getColumnModel().getColumn(5).setMaxWidth(60);
		
		table_showWardensHight.getColumnModel().getColumn(1).setMinWidth(70);
		table_showWardensHight.getColumnModel().getColumn(1).setPreferredWidth(70);
		table_showWardensHight.getColumnModel().getColumn(1).setMaxWidth(100);
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
	protected void btnShowPActionPerformed(ActionEvent e) throws SQLException {
		ShowP();
	}
	public void ShowP() throws SQLException {
		DefaultTableModel model=new DefaultTableModel() {
//			public boolean isCellEditTable(int row,int col) {
//				switch(col) {
//				case 0:return true;
//				default:return false;
//				}
//			}
		};
		model.addColumn("ID");
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("dateOfBirth");
		model.addColumn("nationality");
		model.addColumn("isMale");
		model.addColumn("dateOfEntry");
		model.addColumn("releaseDate");
		model.addColumn("conviction");
		model.addColumn("punishment");
		model.addColumn("religion");
		String b=textSN.getText();
		String selectedValue = (String) comboBox.getSelectedItem();
				
		if(Check.checkNull(b)==true) {
			if(selectedValue.equals("ALL")) {
				DML.selectTablePrioners().forEach(p->{
					model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});
				});
			} else {
				DML.selectTablePrioners().forEach(p->{
					if(p.getAreaName().equals(selectedValue)) {
						model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});
					}
				});
			}
		}else {
			if(selectedValue.equals("ALL")) {
				DML.selectTablePrioners().forEach(p->{
					if(p.getCellNumber()==Integer.parseInt(b)) {
						model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});	
					}
				});
			} else {
				DML.selectTablePrioners().forEach(p->{
					if(p.getAreaName().equals(selectedValue)&& p.getCellNumber()==Integer.parseInt(b)) {
						model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});
					}
				});
			}
		}
		
		table_showP.setModel(model);
		String find=txtSS.getText();
		DefaultRowSorter<?,?> soter= (DefaultRowSorter<?, ?>) table_showP.getRowSorter();
		soter.setRowFilter(RowFilter.regexFilter(find));
		soter.setSortKeys(null);
		table_showP.getColumn("ID").setMinWidth(10);
		table_showP.getColumn("ID").setWidth(20);
		table_showP.getColumn("ID").setMaxWidth(100);
		
		
	}
	
	protected void table_showPMouseClicked(MouseEvent e) throws SQLException {
		int a=table_showP.getSelectedRow();
		int P=(int) table_showP.getValueAt((int) a, 0);
	

		DML.selectTablePrioners().forEach(p->{
			if(P==p.getId()){
				lblShowPID.setText(String.valueOf(p.getId()));			
				lblShowLN.setText(p.getLastName());
				lblShowFN.setText(p.getFirstName());
				lblShowF.setText(String.valueOf(p.getFloor_N()));
				lblShowC.setText(String.valueOf(p.getCellNumber()));
				lblShowA.setText(p.getAreaName().toString());
				lblShowGender.setText(p.getIsMale().toString());
				
				lblImage.setIcon(
						new ImageIcon(
								new ImageIcon(
									p.getImage()
								)
								.getImage()
								.getScaledInstance(112, 138, Image.SCALE_SMOOTH)));
			}
		});
	}
	protected void btnSearchActionPerformed(ActionEvent e) throws SQLException {
		
	}
	protected void lblShowPMouseClicked(MouseEvent e) {
		lblShowP.setBackground(new Color(64, 128, 128));
		lblAddP.setBackground(new Color(0, 64, 64));
		lblR.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(0, 64, 64));
		panel_ShowP.show(true);
		panel_Add.show(false);
		panel_ShowH.show(false);
		panel_ShowR.show(false);
		
	}
	protected void lblAddPMouseClicked(MouseEvent e) {
		lblR.setBackground(new Color(0, 64, 64));
		lblAddP.setBackground(new Color(64, 128, 128));
		lblShowP.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(0, 64, 64));		
		panel_ShowP.show(false);
		panel_Add.show(true);
		panel_ShowH.show(false);
		panel_ShowR.show(false);
		
	}
	protected void lblHMouseClicked(MouseEvent e) {
		lblR.setBackground(new Color(0, 64, 64));
		lblAddP.setBackground(new Color(0, 64, 64));
		lblShowP.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(64, 128, 128));
		panel_ShowH.show(true);
		panel_ShowR.show(false);
		panel_ShowP.show(false);
		panel_Add.show(false);
		
	}
	protected void lblRMouseClicked(MouseEvent e) {
		lblR.setBackground(new Color(64, 128, 128));
		lblAddP.setBackground(new Color(0, 64, 64));
		lblShowP.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(0, 64, 64));
		panel_ShowH.show(false);
		panel_ShowR.show(true);
		panel_ShowP.show(false);
		panel_Add.show(false);
	}
	protected void btnAddPActionPerformed(ActionEvent e) throws SQLException {
		String id=txtPId.getText();
		String firstName=txtFName.getText();
		String lastName= txtLName.getText();
		String gender;
		String nationality= txtN.getText();
		String cell=txtCell.getText();
		String conviction=txtC.getText();
		String punishment= txtP.getText();
		String religion= txtR.getText();
		String image=null;//txtI.getText();
		String area=(String) comboBox_1.getSelectedItem();	
//		String medicalHistory=txtMH.getText();
//		String currentConditions=txtCC.getText();
//		String allergies=txtA.getText();
//		String relativeName=txtRN.getText();
//		String contactInfo=txtCI.getText();
//		String relationship=txtRela.getText();
		Date datedob=dob.getDate();
		Date datedoe=doe.getDate();
		Date daterd=rd.getDate();
		
//		Check.checkNull(medicalHistory)==false &&
//				Check.checkNull(currentConditions)==false &&
//				Check.checkNull(allergies)==false &&
//				Check.checkNull(relativeName)==false &&
//				Check.checkNull(contactInfo)==false &&
//				Check.checkNull(relationship)==false 
		
//		Check.checkString(medicalHistory)==true &&
//				Check.checkString(allergies)==true &&
//				Check.checkString(relativeName)==true &&
//				Check.checkString(contactInfo)==true &&
//				Check.checkString(currentConditions)==true
		if(Check.checkNull(id)==false &&
			Check.checkNull(firstName)==false &&
			Check.checkNull(lastName)==false &&
			Check.checkNull(nationality)==false &&
			Check.checkNull(cell)==false &&
			Check.checkNull(conviction)==false &&
			Check.checkNull(punishment)==false &&
			Check.checkNull(religion)==false) {		
				if(Check.checkNumber1(id)==true && Check.checkNumber1(cell)==true) {
					if(Check.checkString(firstName)==true &&
						Check.checkString(lastName)==true &&
						Check.checkString(nationality)==true &&
						Check.checkString(conviction)==true &&
						Check.checkString(punishment)==true &&
						Check.checkString(religion)==true  ) {
						
						Prisoners pr=new Prisoners();
						AreasDAO.selectTableAreas().forEach(p->{
							if(area.equals(p.getAreaName())) {
								areaid=p.getAreaId();
							}
						});
						CellDao.selectTableCell().forEach(p->{
							if(areaid==p.getAreaId()&& Integer.parseInt(cell)==p.getCellNumber()) {
								System.out.println(p.getCellId());
								pr.setCellId(p.getCellId());
							} else {
								System.out.println("fdsfd");
							}
						});
						pr.setDateOfBirth(LocalDate.ofInstant(datedob.toInstant(), ZoneId.systemDefault()));
						pr.setDateOfEntry(LocalDate.ofInstant(datedoe.toInstant(), ZoneId.systemDefault()));
						pr.setReleaseDate(LocalDate.ofInstant(daterd.toInstant(), ZoneId.systemDefault()));
						if(male.isSelected()) {
							 pr.setIsMale("nam");
						}else {pr.setIsMale("nu");}
						pr.setId(Integer.parseInt(id));
						pr.setFirstName(firstName);
						pr.setLastName(lastName);
						pr.setNationality(nationality);
						pr.setConviction(conviction);
						pr.setPunishment(punishment);
						pr.setReligion(religion);
						pr.setImage(image);
//						PrisonersDao.insertPrisoner(pr);
						System.out.println(pr);
					}else {JOptionPane.showMessageDialog(this, "Except for prisoner id and cell id everything does not contain numbers","ERROR",JOptionPane.ERROR_MESSAGE);}
				} else {JOptionPane.showMessageDialog(this, "Prisoner ID and cell ID must be numeric","ERROR",JOptionPane.ERROR_MESSAGE);}
		} else {JOptionPane.showMessageDialog(this, "Please do not leave information blank","ERROR",JOptionPane.ERROR_MESSAGE);}
			
		
	}
	protected void btnPreviousActionPerformed(ActionEvent e) {
	}
	protected void btnNextActionPerformed(ActionEvent e) {
	}
	protected void btnShowAreaActionPerformed(ActionEvent e) throws SQLException {
		ShowArea();
	}
	
	public void ShowArea() throws SQLException {
		DefaultTableModel model=new DefaultTableModel() {
			public boolean isCellEditTable(int row,int col) {
				switch(col) {
				case 0:return false;
				default:return true;
				}
			}
		};
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Description");
		model.addColumn("Location description");
		AreasDAO.selectTableAreas().forEach(p->{
			model.addRow(new Object[] {p.getAreaId(),p.getAreaName(),p.getDescription(),p.getAreasLocationDescription()});
		});
		tableShowA.setModel(model);
		
	}
	protected void lblNewLabel_20MouseClicked(MouseEvent e) {
		this.setVisible(false);
	}
	protected void thisMousePressed(MouseEvent e) {
		mouseDownPont = e.getPoint();
	}
	protected void thisMouseDragged(MouseEvent e) {
		Point cur = e.getLocationOnScreen();
		this.setLocation(cur.x - mouseDownPont.x , cur.y - mouseDownPont.y);
		
	}
	protected void lblPMouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(64,128,128));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(0,64,64));
		lblN2.setBackground(new Color(0,64,64));
		panel_prisoners.show(true);
		panel_cell.show(false);
		panel_account.show(false);
		panel_areas.show(false);
		panel_7.show(false);
		panel_8.show(false);
		lblShowP.setBackground(new Color(64,128,128));
		lblR.setBackground(new Color(0, 64, 64));
		lblAddP.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(0, 64, 64));

		panel_ShowP.show(true);
		panel_Add.show(false);
		panel_ShowH.show(false);
		panel_ShowR.show(false);
		
	}
	protected void lblWMouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(64,128,128));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(0,64,64));
		lblN2.setBackground(new Color(0,64,64));
		panel_prisoners.show(false);
		panel_cell.show(true);
		panel_account.show(false);
		panel_areas.show(false);
		panel_7.show(false);
		panel_8.show(false);
	}
	protected void lblAMouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(64,128,128));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(0,64,64));
		lblN2.setBackground(new Color(0,64,64));
		panel_prisoners.show(false);
		panel_cell.show(false);
		panel_account.show(false);
		panel_areas.show(true);
		panel_7.show(false);
		panel_8.show(false);
	}
	protected void lblAcMouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(64,128,128));
		lblN1.setBackground(new Color(0,64,64));
		lblN2.setBackground(new Color(0,64,64));
		panel_prisoners.show(false);
		panel_cell.show(false);
		panel_account.show(true);
		panel_areas.show(false);
		panel_7.show(false);
		panel_8.show(false);
	}
	protected void lblN1MouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(64,128,128));
		lblN2.setBackground(new Color(0,64,64));
		panel_prisoners.show(false);
		panel_cell.show(false);
		panel_account.show(false);
		panel_areas.show(false);
		panel_7.show(true);
		panel_8.show(false);
	}
	protected void lblN2MouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(0,64,64));
		lblN2.setBackground(new Color(64,128,128));
		panel_prisoners.show(false);
		panel_cell.show(false);
		panel_account.show(false);
		panel_areas.show(false);
		panel_7.show(false);
		panel_8.show(true);
	}
	protected void btnDelete1ActionPerformed(ActionEvent e) {
	}
	protected void UpdatePActionPerformed(ActionEvent e) {
	}
}


