1public class Grocery_App
{

static String itemname="Toothbrush"; 
static String brandname="Colgate";

  
double amount=45.32;
int quantity=1;


public static void customer_order()
{
   System.out.println("Item that I have purchased:"+itemname);
   System.out.println("Brand name of the item:"+brandname);

   Grocery_App  g1=new Grocery_App();
   System.out.println("Amount of the product:"+g1.amount);
   System.out.println("Quantity of the product:"+g1.quantity);
}

public void delivery_partner()
{  
    int mask_charges=10;
    int sanitise_charges=5;

System.out.println("charges for the mask:"+mask_charges);
System.out.println("Sanitise charges:"+sanitise_charges);
}

public static void main(String args[])
{
      customer_order();
   
   Grocery_App g2=new Grocery_App();
     g2.delivery_partner();
}

}
