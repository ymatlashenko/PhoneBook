package front;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import db.DS;
import db.DS_H2;
import db.Person;

public class TModel extends AbstractTableModel 
{
	private static final long serialVersionUID = 1L;

	DS ds = new DS_H2();		
	ArrayList<Person> pp = null;

	public void setDS() 
	{
		ds = new DS_H2();
		pp = ds.read();
	}

	public TModel() 
	{	
		pp = ds.read();
	}

	@Override
	public String getColumnName(int column) 
	{
		String[] str = {"Id","FName","LName","Age"};
		return str[column];
	}

	@Override
	public int getRowCount() 
	{
		return pp.size();
	}

	@Override
	public int getColumnCount() 
	{
		return 4;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) 
	{
		Person p = pp.get(rowIndex);

		Object ret = null;

		switch (columnIndex) 
		{
		case 0: ret = p.id;    break;
		case 1: ret = p.fName; break;
		case 2: ret = p.lName; break;
		case 3: ret = p.age;   break;
		}

		return ret;
	}

}
