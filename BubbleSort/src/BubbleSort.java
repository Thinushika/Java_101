class BubbleSort{
    
	public  void Sort(int arr[])
	{
		//i=25,1,6,30,10
		for(int i=0;i<arr.length;i++)//outer loop
		{
                    //j= 0,1,2,3,4
			for(int j=0;j<arr.length-1-i;j++)//inner loop
			{
                            //0>1  //(25>1)
                            if(arr[j]>arr[j+1])
                            {
                                    int temp;
                                    temp=arr[j];// temp=0
                                    arr[j]=arr[j+1];//0=1  //25 is going to 1 cell
                                    arr[j+1]=temp; //1 is going to 0 cell
                            }
			}
		}
	}

	public	void print(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+" ");
			}
		}
                
        public static void main(String[] args) {
 
		int []arr={25,1,6,30,10};
		BubbleSort obj=new BubbleSort();
		obj.Sort(arr);
		obj.print(arr);
	}
}
