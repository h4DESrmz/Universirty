package StudentMgmtSys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;

public class UserSide extends JFrame {
	Connection con=null;
	ResultSet r=null;
	PreparedStatement pstm=null;
	String sql;
	JPanel jpanel1, jpanel2, jpanel3, jpanel4;
	JLabel lbl;
	Label label1;
	JButton jButton1, jButton2, jButton3, jButton4;
	JScrollPane jScrollPanel;
	JTable jTable1;
	JTextField jTextField1;

	public UserSide() {
		// TODO Auto-generated constructor stub
		initComponents();
		con = dbconnect.java_db();
		Toolkit tk = this.getToolkit();
		Dimension size = tk.getScreenSize();
		this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
		this.setResizable(false);
		setTitle("Student Management System");
		updatetable();

	}

	private void updatetable() {
		try {

			String sql = "select form_id as 'Form ID', batch_no as 'Batch', student_id as 'Student ID', first_name as 'FirstName', middle_name as 'MiddleName', last_name as 'LastName', email as 'Email', contact as 'Contact', dob as 'DOB', father_name as 'FatherName', mother_name as 'MotherName', permanent_add as 'Permanenet Addr', temporary_add as 'Temp Addr', particular_school as 'Course1', name_of_school as 'Remarks1', percentage_school as 'Sessionals1', passed_year_school as 'Fianls1', particular_higherschool as 'Course2', name_of_higherschool as 'Remarks2', percentage_higherschool as 'Sessionals2', passed_year_higherschool as 'Finals2', image  from infoTable";

			pstm = con.prepareStatement(sql);
			r = pstm.executeQuery();
			jTable1.setModel(DbUtils.resultSetToTableModel(r));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {
				r.close();
				pstm.close();

			} catch (Exception e) {

			}
		}
	}


	void initComponents() {
		jpanel1 = new JPanel();
		label1 = new Label();
		jpanel2 = new JPanel();
		jpanel3 = new JPanel();
		jpanel4 = new JPanel();
		jTextField1=new JTextField();
		lbl = new JLabel();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jButton4 = new JButton();
		jScrollPanel = new JScrollPane();
		jTable1 = new JTable();

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jpanel2.setBackground(new Color(0, 139, 139));

		lbl.setFont(new Font("Tahoma", 1, 14));
		lbl.setText("Search Student By ID");

		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jTextField1.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				jTextField1KeyReleased(evt);
			}
		});

		jButton1.setBackground(new Color(255, 250, 250));
		jButton1.setFont(new Font("Tahoma", 1, 14));
		jButton1.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/logout.png"))); // NOI18N
		jButton1.setText("Logout");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new Color(255, 250, 250));
		jButton2.setFont(new Font("Tahoma", 1, 14));
		jButton2.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/ppl.png"))); // NOI18N
		jButton2.setText("Show Individual");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new Color(255, 250, 250));
		jButton3.setFont(new Font("Tahoma", 1, 14)); // NOI18N
		jButton3.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/erase.png"))); // NOI18N
		jButton3.setText("Reset");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		GroupLayout jPanel2Layout = new GroupLayout(jpanel2);
		jpanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(
						jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel2Layout.createSequentialGroup().addGap(69, 69, 69)
												.addComponent(lbl, GroupLayout.PREFERRED_SIZE, 162,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 385,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 129,
														Short.MAX_VALUE)
												.addComponent(jButton2).addGap(18, 18, 18)
												.addComponent(jButton3).addGap(18, 18, 18).addComponent(jButton1,
														GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
												.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 39,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton2)
						.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jTextField1)).addContainerGap()));

		jpanel1.setBackground(new Color(0, 153, 255));

		jButton4.setIcon(new ImageIcon(UserSide.class.getResource("/StudentMgmtSys/smsHEADERFINAL.jpg"))); // NOI18N

		GroupLayout jPanel1Layout = new GroupLayout(jpanel1);
		jpanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		jpanel3.setBackground(new Color(51, 153, 255));

		GroupLayout jPanel3Layout = new GroupLayout(jpanel3);
		jpanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));

		GroupLayout jPanel4Layout = new GroupLayout(jpanel4);
		jpanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 63, Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 812, Short.MAX_VALUE));

		jTable1.setBackground(new Color(0, 206, 209));
		jTable1.setFont(new Font("Tahoma", 0, 14)); // NOI18N
		jTable1.setModel(
				new DefaultTableModel(
			new Object[][] {
				{new Integer(1), new Integer(2071), new Integer(7), "aaa", "", "aaa", "sasas@sth.com", "9845555555", "2014-11-19", "xyz", "abc", "htd", "npl", "dsd", "awsa", "hajkl", "lkjh", "69", "59", "2068", "2070", null},
				{new Integer(30052021), new Integer(2019), new Integer(213), "rameez", "", "fazal", "rmz@mail.com", "1234567", "2001-05-14", "Fazal", "Fahmeeda", "abx xyz 123", "zz", "inter", "matric", "sre", "mps", "64", "78", "2017", "2015", null},
			},
			new String[] {
				"Form ID", "batch_no", "student_id", "first_name", "middle_name", "last_name", "email", "contact", "dob", "father_name", "mother_name", "permanent_add", "temporary_add", "particular_school", "particular_higherschool", "name_of_school", "name_of_higherschool", "percentage_school", "percentage_higherschool", "passed_year_school", "passed_year_higherschool", "image"
			}
		));
		jTable1.setIntercellSpacing(new Dimension(2, 5));
		jScrollPanel.setViewportView(jTable1);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(1122, 1122, 1122)
						.addComponent(jpanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jpanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(jpanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jpanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jScrollPanel));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jpanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jpanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(15, 15, 15)
						.addComponent(jScrollPanel, GroupLayout.PREFERRED_SIZE, 743, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jpanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jpanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(823, 823, 823)));
		pack();
	}

	private void jTextField1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jButton1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		new smslog();
		dispose();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jTextField1KeyReleased(KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyReleased
		// TODO add your handling code here:
		try {
			String sql = "select * from infoTable where student_id = ? ";

			pstm = con.prepareStatement(sql);
			pstm.setString(1, jTextField1.getText());
			r = pstm.executeQuery();
			jTable1.setModel(DbUtils.resultSetToTableModel(r));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {

				r.close();
				pstm.close();

			} catch (Exception e) {
				

			}

		}

	}// GEN-LAST:event_jTextField1KeyReleased

	private void jButton3ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:

		updatetable();
		jTextField1.setText("");
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:

		new UserIndividual().setVisible(true);
		dispose();
	}// GEN-LAST:event_jButton2ActionPerformed

	public static void main(String args[]) {

		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(UserSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UserSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UserSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UserSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserSide().setVisible(true);
			}
		});
	}

}
