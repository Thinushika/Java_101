class InsertSort{
	
	public void insertionSort(int []a){
		for (int i=1;i<a.length;i++){  // outer loop //denotes unsorted part
			int current=a[i];
			int hole =i; // place of variable 0,1,2,3,4
                   //1>0&&0>0     
            while(hole>0 && a[hole-1]>current) //if true one of them
            {  //denotes sorted part
                      //1   = 0
                    a[hole] = a[hole-1];
                    //1 = 0
                    hole=hole-1;
			}
			a[hole]=current;//1 is the current value
		}
	}
	
	public void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}
	
	public static void main(String args[]){
	int a[]={4,3,1,6,2};
	InsertSort ob=new InsertSort();
		ob.insertionSort(a);
		ob.print(a);
	}
	
}