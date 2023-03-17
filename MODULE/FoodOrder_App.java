public class FoodOrder_App
{
   
 static String restaurant_name="Bluemoon";;
 static short no_of_dishes=5;
 static double price=534.30;
  

short order_id=21001;
 
double discount_amt=30.45;
  

public static void order_details()
{

    
  FoodOrder_App f1= new  FoodOrder_App();
  System.out.println("Resturant name:"+restaurant_name);
   System.out.println("Number of dishes that we ordered:"+no_of_dishes);
  System.out.println("Price of the dishes in Rs:"+price);
  System.out.println("Discount given for the food in Rs:"+f1.discount_amt);
  System.out.println("Order id of the food:"+f1.order_id);
}


public void delivery_person(String address,int wait_chrgs)
{

 order_details();
 System.out.println("Address of the customer :"+address);
 System.out.println("wait charges of the food in Rs:"+wait_chrgs);

}

public void  zomato_partner()
{  

delivery_person("Venkatramana Colony,Plotno:201,flatno:-23",50);

 byte food_rating,delivery_rating,hygenic_rating;

food_rating=4;
delivery_rating=5;
hygenic_rating=3;

System.out.println("Food rating:"+food_rating);
System.out.println("Delivery Rating:"+delivery_rating);
System.out.println("Hygenic Rating:"+hygenic_rating);
} 


public static void main (String args[])
{
   FoodOrder_App f4=new FoodOrder_App();
    f4.zomato_partner();
}


}

  


  