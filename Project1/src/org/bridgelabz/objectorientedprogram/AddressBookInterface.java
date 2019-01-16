package org.bridgelabz.objectorientedprogram;

import java.util.List;

public interface AddressBookInterface {
	public boolean operation(List<Person> arrayRead);
	public void add();
	public void edit();
	public void delete();
	public void sortByName();
	public void sortByZip();
	public void print(List<Person> listprint);
}
