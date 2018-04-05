package com.zl.page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class MenuManagerPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MenuManagerPanel() {
		setLayout(null);
		setSize(637, 405);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 617, 352);
		add(scrollPane);
		
		//TODO ����˵��б�
		MenuTableModel menuTableModel = new MenuTableModel(null);
		menuTableModel.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				//TODO ����������޸�ʱ���浽���ݿ�
			}
		});
		JTable table = new JTable(menuTableModel);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0\u7528\u6237");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuTableModel.addMenu();
			}
		});
		btnNewButton.setBounds(534, 10, 93, 23);
		add(btnNewButton);

	}
	
	private class MenuTableModel extends AbstractTableModel{

		List list = null;
		
		public MenuTableModel(List list) {
			this.list = list;
		}

		public void addMenu() {
			// TODO Auto-generated method stub
		}

		@Override
		public int getRowCount() {
			return list.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
