package BeerSong;

public class Head_Fast_Practicals___BeerSong {

    
    public static void main(String[] args) {
         
         //declare no of beers and word "bottle"
         int beerNum = 99;
         String word ="bottles";
         //while it is not 0 run the code
         while(beerNum > 0){
         //if 1 bottle word should be singular
         if (beerNum == 1){
             word = "bottle";
         }
         //otherwise simply print the sentences
         System.out.println(beerNum + " "+word+ " of beer on the wall");
         System.out.println(beerNum +" "+word+ " of beer");
         System.out.println("Take one down");
         System.out.println("Pass it around");
         System.out.println(" ");
         //reduce the 1 bottle
         beerNum = beerNum -1;
         // again if bottle !=0 print no of bottles
         if (beerNum >0){
             System.out.println(beerNum + " "+word+ " of beer on the wall");
             System.out.println(" ");
             //else print no bottle and end
         }else{
             System.out.println("No more bottles of beer on the wall");
         }
         
         
       }
         
     
    }
    
}
