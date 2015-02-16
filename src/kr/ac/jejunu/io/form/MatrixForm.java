package kr.ac.jejunu.io.form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kr.ac.jejunu.io.cal.RandomGenertor;

@SuppressWarnings("serial")
public class MatrixForm extends JFrame implements ActionListener {
	private String[] myArray = new String[] { "Interger", "Float", "Double",
			"String" };
	private JTable jt;
	private JScrollPane jp;
	private JButton jb;
	private RandomGenertor rg;
	private DefaultTableModel model;
	private JComboBox jc;

	public MatrixForm(int row, int column) {
		// rg = new RandomGenertor();

		super("Test");

		TableForm tf = new TableForm();
		jc = new JComboBox(myArray);

		String Matrix[][] = new String[column][row];
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				Matrix[i][j] = "" + i + j;
			}
		}

		String subjects[] = new String[row];
		Arrays.fill(subjects, "title");

		model = new DefaultTableModel(Matrix, subjects);

		jt = new JTable(model);
		jp = new JScrollPane(jt);

		makeJButton("·£´ý", this);
		setLayout(new FlowLayout());
		setSize(400, 300);
		setVisible(true);
		add(jc);
		add(jp);
	}

	public JButton makeJButton(String name, ActionListener listener) {

		jb = new JButton(name);
		jb.addActionListener(listener);
		add(jb);
		return jb;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton j = (JButton) e.getSource();
		if (j == jb) {
		}
	}
}
