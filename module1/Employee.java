public class Employee
{ 
 String empname;
 int empid;
int empsalary;
String empdesg;

public Employee(String employeeName,int employeeId,int employeeSalary,String employeeDesignation )
  {
       empname= employeeName;
       empid=employeeId;
       empsalary=employeeSalary;
       empdesg=employeeDesignation;
}

public static void main(String args[])

{
   Employee e1=new Employee(" Prasanna Kumar",1012090,41000,"Automation Engineer");
System.out.println(e1.empname+" " +e1.empid+" " +e1.empsalary+" " +e1.empdesg);
Employee e2=new Employee("Bharath Kumar",109223,51000,"HR");
System.out.println(e2.empname+" " +e2.empid+" " +e2.empsalary+" " +e2.empdesg);
Employee e3=new Employee("Bramhanada Reddy", 1019222,31000,"Developer");
System.out.println(e3.empname+" " +e3.empid+" " +e3.empsalary+" " +e3.empdesg);
}

}
     