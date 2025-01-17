import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        //Scanner to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Tittle Of the Book ");
        // taking input Book tittle from user
        String tittle= input.nextLine();
        System.out.println("Enter the Book  Author Name");
        // taking input Book's Author Name
        String author = input.next();
        System.out.println(" Enter the Book Price");
        // taking input Book's Price From user
        int price = input.nextInt();
        // creating a object book1 and calling the Constrcutor
        Books book1= new Books(tittle , author, price);
        // calling the DisplayOutput function
        book1.DisplayOutput();
    }
}
// creating the class book
 class Books {

    //Declareing the Variable  tittle name price
    String tittle;
    String author;
    int price;

     // creating the   constructor Book
     public Books(String tittle, String author, int price) {
        // assinging the value to the local pariable using this keyword
         this.tittle=tittle;
         this.author=author;
         this.price=price;
     }
     // displaying the output
     public void DisplayOutput()
     {
         System.out.println( "The tittle of the Book is : " + tittle);
         System.out.println("The Author of the Book is : " + author );
         System.out.println("The Price of the Book is :" + price);
     }
 }