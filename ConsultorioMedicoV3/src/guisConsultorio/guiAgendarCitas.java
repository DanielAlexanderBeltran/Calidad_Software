package guisConsultorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import com.toedter.calendar.JCalendar;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.CompoundBorder;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import com.toedter.calendar.JDayChooser;
import javax.swing.JMenuBar;
import javax.swing.JLayeredPane;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiAgendarCitas {

	private JFrame frmAgendarCitasMdicas;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiAgendarCitas window = new guiAgendarCitas();
					window.frmAgendarCitasMdicas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guiAgendarCitas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgendarCitasMdicas = new JFrame();
		frmAgendarCitasMdicas.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\wsPrgII2015-A\\ConsultorioMedico\\Iconos\\icons8-libro-de-salud-64.png"));
		frmAgendarCitasMdicas.setTitle("AGENDAR CITAS M\u00C9DICAS");
		frmAgendarCitasMdicas.setBounds(100, 100, 672, 498);
		frmAgendarCitasMdicas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgendarCitasMdicas.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(358, 52, 1, 1);
		frmAgendarCitasMdicas.getContentPane().add(layeredPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(333, 52, 261, 150);
		frmAgendarCitasMdicas.getContentPane().add(tabbedPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		tabbedPane_1.addTab("Citas M\u00E9dicas Registradas", null, table, null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(23, 35, 279, 162);
		frmAgendarCitasMdicas.getContentPane().add(tabbedPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{},
				{},
				{},
			},
			new String[] {
			}
		));
		tabbedPane.addTab("Pacientes", null, table_1, null);
		
		JButton btnNewButton = new JButton("Registar Cita M\u00E9dica");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(23, 320, 155, 23);
		frmAgendarCitasMdicas.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reagendar Cita Medica");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(188, 320, 143, 23);
		frmAgendarCitasMdicas.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar Cita");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(358, 320, 137, 23);
		frmAgendarCitasMdicas.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.setBounds(505, 320, 89, 23);
		frmAgendarCitasMdicas.getContentPane().add(btnNewButton_3);
	}
}
