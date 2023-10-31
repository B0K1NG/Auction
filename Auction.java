import java.util.Arrays;
import java.util.Scanner;

public class Auction {
    String name;
    double value;
    int quantity;

    public Auction(String name, double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    String Topic[] = { "Luxury Manxion", "Automobile", "Electronics", "Art" };
    String betterPrintout = Arrays.toString(Topic);
    
    public String User(){
        Scanner User = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userName = User.next();
        System.out.printf("\nWelcome to the auction %s!", userName);
        System.out.print("\nThere are: ");
        System.out.print(Topic.length);
        System.out.println(" auctions in total.");
        System.out.println(betterPrintout);
   
        System.out.println("\nPlease place your bid for: " + Topic[0]);
        return userName;

    }    public void Bid() {
        Scanner Bid = new Scanner(System.in);
        System.out.print("Enter your bid amount: ");
        double amount = Bid.nextDouble();
        System.out.printf("Bidded %s Euros!", amount);
        if (amount >= value){
            System.out.println("\nCongratulations you have won!\n");
        }
        else{
            System.out.println("\nSorry, you have lost this auction!\n");
        }
    }

    public static void main(String[] args) {
        Auction houseAuction = new Auction("British Royale", 1000000, 1);
        houseAuction.User();
        houseAuction.Bid();
       
        Auction carAuction = new Auction("Audi A5 2022", 60000, 1);
        System.out.print("Please place your bid for: " + carAuction.name);
        carAuction.Bid();
        
        Auction computerAuction = new Auction("Lenovo IDEA Laptop", 1500, 5);
        System.out.print("Please place your bid for: " + computerAuction.name);
        computerAuction.Bid();
        
        Auction paintingAuction = new Auction("Da Vinci Painting", 5000000, 1);
        System.out.print("Please place your bid for: " + paintingAuction.name);
        paintingAuction.Bid();

        System.out.println("Thank you for coming to the auction, those who won come to see me in 1 hour to take back your winnings and pay for them");
    }
}