package module1;
public class Car
{
 String cname,ccolour,cmodel;
int ccapacity ;
double cprice;

public Car(String cname,String ccolour)
{    
   this.cname=cname;
   this.ccolour=ccolour;
}
public Car(String cname,String ccolour,double cprice)
{  
   this. cname=cname;
   this.ccolour=ccolour;
   this.cprice=cprice;
}
public Car(String cname, String ccolour,double cprice,int ccapacity,String cmodel)
{ 
   this.cname=cname;
   this.ccolour=ccolour;
   this.cprice=cprice;
   this.ccapacity=ccapacity;
   this.cmodel=cmodel;
}

public static void main( String args[])
{
  Car c1=new Car("Lamborghini","Ash");
System.out.println(c1.cname);
System.out.println(c1.ccolour);

Car c2=new Car("Ferrari", "Red",3004387.56);
System.out.println(c2.cname);
System.out.println(c2.ccolour);
System.out.println(c2.cprice);

Car c3=new Car("Auston Martin","Black",5300233.35,2,"Sports");
System.out.println(c3.cname);
System.out.println(c3.ccolour);
System.out.println(c3.cprice);
System.out.println(c3.ccapacity);
System.out.println(c3.cmodel);


}

}