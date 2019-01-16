package org.bridgelabz.objectorientedprogram;

public class InventoryFactory {
	private String inventoryname;
	private int inventorynumber;
	private int inventoryvalue;
	 
	 public InventoryFactory()
	 {
		 
	 }
	 
	 public InventoryFactory(String inventoryname,int inventorynumber,int inventoryvalue)
	 {
		 this.inventoryname=inventoryname;
		 this.inventorynumber=inventorynumber;
		 this.inventoryvalue=inventoryvalue;
	 }
	 
	 	public void setinventoryname(String inventoryname)
		{
			this.inventoryname=inventoryname;
		}
		
		public void setinventorynumber(int inventorynumber)
		{
			this.inventorynumber=inventorynumber;
		}
		
		public void setinventoryvalue(int inventoryvalue)
		{
			this.inventoryvalue=inventoryvalue;
		}
		
		
		public String getinventoryname()
		{
			return this.inventoryname;
		}
		
		public int getinventorynumber()
		{
			return this.inventorynumber;
		}
		
		public int getinventoryvalue()
		{
			return this.inventoryvalue;
		}

}
