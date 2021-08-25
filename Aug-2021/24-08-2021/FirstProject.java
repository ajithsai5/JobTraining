import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

interface EmployeeList {
	  public Map<String, Integer> getEmployeeList();
	  public void printEmployee();
	}


class Employee implements EmployeeList {
		  public Map<String, Integer> getEmployeeList() {
			  Map<String, Integer> namelist= new HashMap<String, Integer>(); 
			  namelist.put("Zara", new Integer(001732457));
		      namelist.put("Mahnaz",new Integer(001732451));
		      namelist.put("Ayan", new Integer(001732453));
		      namelist.put("Daisy", new Integer(001732327));
			  return(namelist);
		  }
		  public void printEmployee(Map<String, Integer> namelist) {
			  for (Map.Entry<String, Integer> me : namelist.entrySet()) {
		            System.out.print("Employee Name : Employee ID= "+me.getKey() + ": ");
		            System.out.println(me.getValue());
		        }
		  }
}
	
public class FirstProject{	
	public static void main(String[] args) {
		Employee Emp=new Employee();
		Map<String, Integer> namelist=Emp.getEmployeeList();
		Emp.printEmployee(namelist);
	  }
}