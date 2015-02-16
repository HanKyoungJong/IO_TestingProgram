package kr.ac.jejunu.io.form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import kr.ac.jejunu.io.form.MatrixForm;

@SuppressWarnings("serial")
public class TableForm extends JFrame implements ActionListener {
	private JButton jb;
	private JComboBox jc, a, b;
	private Object column[] = { "1", "2", "3", "4", "5" };
	private Object row[] = { "1", "2", "3", "4", "5" };

	public void showForm() {
		a = makeJComboBox(row);
		b = makeJComboBox(column);
		makeJButton("»Æ¿Œ", this);
	}

	public TableForm() {
		super("Test");

		showForm();

		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JComboBox makeJComboBox(Object name[]) {
		jc = new JComboBox(name);
		add(jc);
		return jc;

	}

	public JButton makeJButton(String name, ActionListener listener) {

		jb = new JButton(name);
		jb.addActionListener(listener);
		add(jb);
		return jb;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton b1 = (JButton) e.getSource();
		if (b1 == jb) {
			int to = Integer.parseInt(a.getSelectedItem().toString());
			int to1 = Integer.parseInt(b.getSelectedItem().toString());
			MatrixForm mf = new MatrixForm(to, to1);
		}

	}
}