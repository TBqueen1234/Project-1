import java.util.Scanner;
public class Project1
{
   public static void main(String [] args)
   {
      Scanner Comp = new Scanner(System.in);
      /* Setting the Gup to zero 
         and User input clock speed
         setting GPU to what user inputs
      */
     
      double userGPU = 0; 
      System.out.println("enter the clock speed (in Megahertz) of their processor (CPU)");
      userGPU = Comp.nextDouble();
      
      //Enter Line
         Comp.nextLine();
         
      /* Setting CPU to zero
         User input ther Procceser speed
         Setting CPu to user input
      */
      
      double userCPU = 0; // setting GPU to zero
      System.out.println("enter the number of cores that their processor (CPU) has");
       userCPU = Comp.nextDouble();
       
       //Menu Diplay options
       System.out.println("Enter 1, 2, 3, 4 \n to which Mattches the resoulation to your mouniter");
       System.out.println("\n 1.)1280 x 720 \n 2.)1920 x 1080 \n 3.)2560 x 1440 \n 4.)3840 x 2160 ");

    }
}