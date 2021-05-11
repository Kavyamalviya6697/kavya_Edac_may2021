import java.util.*;
public class LeapYear {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
   
    System.out.print("enter a year : ");
    int y = sc.nextInt();
    
    boolean flag = false;

 
    if (y % 4 == 0) 
    {

       if (y % 100 == 0) 
       
       {
    	   if (y % 400 == 0)
          
    		   flag = true;
			   
			else
          
				flag = false;
		}
      
      
		else
			flag = true;
    }
    
    else
      flag = false;



    if (flag==true)
      System.out.println("leap year");
    else
      System.out.println( "not a leap year");
  }
}
