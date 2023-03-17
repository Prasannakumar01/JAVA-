
package module1;
//method return type

class ArmstrongReturnType
{
    public int arm()
    {
  int arm=0,rem, num;
  int temp=num;
  
   while(num>0)
   {
    rem=num%10;
    arm=arm+rem*rem*rem;
    num=num/10;
   }
  if(temp==arm)
{
   return "armstrong number";
else
 return "not a armstrong number";
    }
}
}

    public static void main(String[] args) 
    { 
 ArmstrongReturnType a = new ArmstrongReturnType();
a.arm();
    }

}
