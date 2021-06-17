class MergeSort{
	void merge(int[] left,int[] right,int[] arr){
		int lsize=left.length;//left side size
		int rsize=right.length;//right side size
		int i=0,j=0,k=0;
                    //0<4     && 0<4
		while(i<lsize && j<rsize){      //left 3,6,8,2    //right 1,66,7,82
			 //3<1 //6<66
                    if(left[i]<right[j]){
                                 // 0 = 3
				arr[k]=left[i];
				i++; //0+1
			}
			else{   // 0 = 1 
				arr[k]=right[j];
				j++;//0+1
			}
			k++;//0+1
		}   //1<4
		while(j<rsize){
                      //   1 = 1(1)
			arr[k]=right[j];
			j++;//1+1
			k++;//1+1
		}
                    //1<4
		while(i<lsize){
                     //  2=1
			arr[k]=left[i];
			i++;//1+1
			k++;//2+1ssss
		}
		
	}
	void devider(int[] para){
		 int size=para.length;
		 if(size<2)
			 return;
		 
		 int mid=size/2;
		 int[] left=new int[mid];
		 int[] right=new int[size-mid];
		 
		 for(int i=0;i<mid;i++){
			 left[i]=para[i];
		 }
		 for(int i=mid;i<size;i++){
			 right[i-mid]=para[i];
		 }
		 
		 devider(left);
		 devider(right);
		 merge(left,right,para);
	}
	void print(int [] arrp){
		for(int i=0;i<arrp.length;i++){
			System.out.print(arrp[i]+" ");
		}
	}
	public static void main(String[] ar){
		int[] inArray={3,6,8,2,1,66,7,82};
		MergeSort sorter=new MergeSort();
		sorter.devider(inArray);
		sorter.print(inArray);
		
		
	}
	
}