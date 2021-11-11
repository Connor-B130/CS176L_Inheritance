package labproject6.persons;

public class Employee extends Person
{
	String numOff;
	double sal;
	
	public String getOfficeNumber() 
	{
		return numOff;
	}
	public void setOfficeNumber(String officeNumber) 
	{
		numOff = officeNumber;
	}
	public double getSalary() 
	{
		return sal;
	}
	public void setSalary(double salarySet) 
	{
		sal = salarySet;
	}
	public String toString()
	{
		return getClass() + "\nname: " + name + "\nOffice Number : "+ numOff + "\nSalary: " + sal;
	}
}