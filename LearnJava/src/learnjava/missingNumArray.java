package learnjava;

import java.util.Scanner;

/*How to find missing number in integer array of 1 to 10*/

public class missingNumArray 
{
         
//sum 0f continuous integers can find using n(n-1)/2
    //check array is a missing num array or not
    //if (missing array)
            //search number by num above formula is true or not
            // when that formula is becoming false that array value is the missing number
    
    public void missingNum()
    {
        //int []arr = {0,1,2,3,4,5,6,7,8,10,11};
        int n,sum = 0,sumofindex = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of elements in array here: ");
        
        n=s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter all elements of array here: ");
        
        for (int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
            sum = sum+a[i];
            
        }
        System.out.println("Sum: "+sum);
    }
}
 