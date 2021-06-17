package learnjava;

import java.util.Arrays;


public class learnArray 
{
    public void printArray()
    {       //print simple array
        int[] numArray = {2,4,6,1,5,9,7};       //define the array
        System.out.println("Array is: "+Arrays.toString(numArray));      //print the array
                                                            //to print the array must convert it into String
    }
    
    
    public void printPA()
    {
        int [] fArray = {12,58,69,12,35,68,45,15,69,48,95};
        
        for(int i=0; i<fArray.length;i++)
        {     //should add arrayName.length to read compleate array
            System.out.println(i+" number: "+fArray[i]);
        }
        
        
        for(int i=0; i<fArray.length;i++)
        {
            System.out.println(fArray[i]+"X 2 : "+fArray[i]*2);
        }
    }
    
    public void decendingArray()
    {
        int [] DArray = {12,58,69,12,35,68,45,15,69,48,95};
        System.out.println("DArray: "+Arrays.toString(DArray));
        for(int i=0;i<DArray.length;i++)
        {   //12,58,69,12,35,68,45,15,69,48,95
            
            
            for(int j=0;j<DArray.length-1-i;j++)
            {   //0,1,2,3,4,5,6,7,8,9
                
                if(DArray[j]>DArray[j+1])
                {    
                    
                    int temp;
                    temp = DArray[j];
                    DArray[j] = DArray[j+1];
                    DArray[j+1] = temp;     
                }
                
            }
        }
        System.out.println("Sorted DArray: ");
        for(int i=0;i<DArray.length;i++)        //to print the array
        {
            System.out.print(DArray[i]+" ");        //output is: 12,12,15,35,45,48,58,68,69,69,95
        }
    }
    
    
    public void reversearray()
    {
      int [] arrA = {11,22,33,44,55,66,77,88,99};
      
      for(int i=0;i<arrA.length;i++)
      {
          System.out.print(arrA[i]+" ");
      }
      for(int i=0;i<arrA.length;i++)
      {
          
      }
    }
    
    
}
