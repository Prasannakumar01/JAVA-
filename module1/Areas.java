package javaprogramsexercise;

public class Areas
{

 static int length=10,breadth=5,height=15,radius=12,  areaR ;

  static float pie=3.14f,areaC;
		static  double areaT;


public static void  areaofRectangle()
{

      areaR=length*breadth;
  	System.out.println(" Area of Rectangle:"+areaR);
}

public static  void areaofTriangle()
{
   
     areaT=0.5*breadth*height;
 	System.out.println("Area of Triangle:"+areaT);
}

public static  void areaofCircle()
{

    areaC=pie*radius*radius;
  System.out.println("Area of Circle:"+areaC);
}

public static void main(String args[])
{
    areaofRectangle();
    areaofTriangle();
	areaofCircle();
}

}