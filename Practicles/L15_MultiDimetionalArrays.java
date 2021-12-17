public class L15_MultiDimetionalArrays {
    public static void main(String[] args) {

        // 2D array
        int[][] a = {{1,2,3},
        {-4,-5,6,9},
        {7}};
        
        System.out.println("Using for loop for 2D array: ");
        for (int i = 0; i <a.length; ++i){
            for (int j = 0; j < a[i].length; ++j){
                System.out.println(a[i][j]);
            }
        }
        System.out.println("Using for each loop for 2D array: ");
        for (int [] innerArray :a){
            for (int data: innerArray){
                System.out.println(data);
            }
        }

        // 3D array
        int [][][] test = {
            {
                {1,-2,3},
                {2,3,4}
            },
            {
                {-4, -5, 6, 9},
                {1},
                {2,3}
            }
        };
        System.out.println("Using for each loop for 3D array: ");
        for (int[][] array2D :test){
            for (int[] array1D: array2D){
                for(int item: array1D){
                    System.out.println(item);
                }
            }
        }
    }
}
