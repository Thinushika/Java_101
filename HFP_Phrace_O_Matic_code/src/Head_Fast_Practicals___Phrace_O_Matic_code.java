
public class Head_Fast_Practicals___Phrace_O_Matic_code {

   
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
        String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","laveraged","aligned","targeted","shared","cooperative","accelarated"};
        String[] wordListThree = {"proces","tipping-point","solution","architecture","core-competency","strategy","mindshare","portal","space","vision","paradigm","mission"};
        
        int onelength = wordListOne.length;
        int twolength = wordListTwo.length;
        int threelength = wordListThree.length;
        
        //if want to print...
        System.out.println(wordListOne.length +" words in the list");
        System.out.println(wordListTwo.length +" words in the list");
        System.out.println(wordListThree.length +" words in the list");
        System.out.println(" ");
        
        int rand1 = (int)(Math.random()*onelength);
        int rand2 = (int)(Math.random()*twolength);
        int rand3 = (int)(Math.random()*threelength);
        
        String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
        
        System.out.println("What we need is a "+ phrase);
    }
    
}
