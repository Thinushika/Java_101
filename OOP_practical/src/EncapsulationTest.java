class EncapsulationTest {
    private String Book_name;
    private int Book_ID;
    private String Book_Author;
    private Double Book_Price;
    
    void setBook_name(String Name){
        this.Book_name = Name;
    }
    void setBook_ID(int ID){
        this.Book_ID = ID;
    }  
    void setBook_Author(String Author){
        this.Book_Author = Author;
    }    
    void setBook_Price(Double Price){
        this.Book_Price = Price;
    }
    
     public String getName(){
          return Book_name;
      }
     public String getAuthor(){
          return Book_Author;
      }
     public Double getPrice(){
          return Book_Price;
      }
     
     void Display(){
         System.out.println("Book Name : "+Book_name);
         System.out.println("Book ID No : "+Book_ID);
         System.out.println("Book Author: "+Book_Author);
         System.out.println("Book Price : LKR "+Book_Price);
           
     }

}
