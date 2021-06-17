class SelectionSort {

	public void selectionSort(int arr[])
            {
            int  min;
            int index=0;
            
            for(int i=0; i<arr.length-1; i++) // outer loop //25,2,6,30,10 = 0,1,2,3,4
            {
            min = i; // minimum
            for(int j=i+1; j<arr.length; j++) // inner loop
                //2        25
            if(arr[j] < arr[min] ) {// if min greater,
                     //2
                min = j; 
                    //1      // we have a new min
                index=j;
            }
             swap(i, index,arr); // swap them
            } // end for(out)
            } // end selectionSort()
        
        public void swap(int one, int two,int arr[])
        {              // 25
           int temp = arr[one];
            arr[one] = arr[two];//25 = 2 change cell
             arr[two] = temp;//2 = 25 change cell
                    
        }
        
        
        public	void print(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+" ");
			}
		}
    public static void main(String[] args) {
        
            	int []arr={25,2,6,30,10};
		SelectionSort obj=new SelectionSort();
		obj.selectionSort(arr);
		obj.print(arr);
    }
    
}
