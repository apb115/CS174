import java.security.InvalidParameterException;

public class Employee {
	//=============================================== Properties
		private String job;
		private int id;
		private String lastName;
		private int yearsWorked;
		private int salary;
	//=============================================== Constructors
		

	//=============================================== Methods

	//=============================================== Getters / Setters
		
		public String getJob()		{	return job;			}
		public int getId() 	   		{	return id;	    	}
		public String getLastName() {	return lastName;	}
		public int getYearsWorked() {	return yearsWorked;	}
		public int getSalary() 		{	return salary;		}
		
		public void setJob(String job) 				{	this.job = job;					}
		public void setId(int id) 					{	this.id = id;					}
		public void setLastName(String lastName) 	{	this.lastName = lastName;		}
		public void setYearsWorked(int yearsWorked) {	this.yearsWorked = yearsWorked;	}
		
		public void setSalary(int salary) {
			if (salary < 25000 || salary > 200000) throw new InvalidParameterException("Salary " + salary + " is too much money!");
			this.salary = salary;	
			
		}
		
		
}
