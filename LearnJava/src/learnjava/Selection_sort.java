package learnjava;

public class Selection_sort {
    
    
    int [] arr = {3,2,4,7,6,1,8,0,9};
    public void sortarray(){
        

        for(int i=0; i<arr.length;i++)
        {
            for (int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
