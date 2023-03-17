public class Transport
{
public static void Bus (String bustype,String From,String To, String dateofJourney,int seatno )
      {
            System.out.println("Bus Type:"+bustype);
            System.out.println("From city:"+From);
            System.out.println("To City:"+To);
            System.out.println("Date of Journey:"+dateofJourney);
            System.out.println("seat Numbers:"+seatno);
             System.out.println();
        }

public static void Bus(String trainname,String coachtype,String dateofJourney,int seatno, String From,String To)

        {
            System.out.println("Train Name:"+trainname);
            System.out.println("coach type:"+coachtype); 
            System.out.println("Date of Journey:"+dateofJourney);
            System.out.println("Seat number:"+seatno);
            System.out.println("From city:"+From);
            System.out.println("To city:"+To);
            System.out.println();
         }


/*public static void Bus(String flightname,String coachtype,String dateofJourney,int seatno, String From,String To)
        {
            System.out.println("Flight name:"+flightname);
            System.out.println("coach type:"+coachtype);
            System.out.println("Date of Journey:"+dateofJourney);
            System.out.println("Seat number:"+seatno);
            System.out.println("From city:"+From);
            System.out.println("To city:"+To); 
            System.out.println();
         } */
  
public static void main(String args[])

{

   Bus("Sleeper","Kadapa","Hyderabad","27-08-2022",2);
   Bus("samparkranthi","Ac-Sleeper","28-08-2022",04,"Hyderabad","Bangalore");
  // Bus("Indigo","Business","29-08-2022",01,"Goa","Chennai");
}

}