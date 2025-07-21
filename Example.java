import java.util.*;
class Example{
      public static void main(String args[]){
      Scanner input = new Scanner(System.in);
     
      System.out.println("===========================================================================================");
      System.out.println("__          __  __                              __            _  __  ___            __    ");
      System.out.println("\\ \\        / / |  |                            |  |          (_)   \\/   |          |  |   "); 
      System.out.println(" \\ \\  /\\  / /__|  |  ___  ___  _ __ ___   ___  |  |_  ___     _|  \\  /  | __ _ _ __|  |_  ");
      System.out.println("  \\ \\/  \\/ / _ \\  |/   __/ _ \\| '_ ` _ \\ / - \\ |  ___/ _ \\   | |  |\\/|  |/ _` | '__|  __| ");
      System.out.println("   \\  /\\  /  __/  |   (_| (_) | | | | | |  __/ |   || (_) |  | |  |  |  | (_| | |  |  |_  ");
      System.out.println("    \\/  \\/ \\___|__|\\____\\___ /|_| |_| |_|\\___|  \\__  \\___/   |_|__|  |__|\\__,_|_|   \\___| ");
      System.out.println();
      System.out.println("===========================================================================================");
      System.out.print("Enter Customer Phone Number - ");
      String number = input.nextLine();
      System.out.println();
      System.out.print("Enter Customer Name         - ");
      String name = input.nextLine();
      System.out.println("===========================================================================================");
      System.out.println();
      
      //Unit prices
      double ub = 250; //basmathi
      double ud =180; //dhal
      double us = 150; //sugar
      double uh = 1200; //highland
      double uy = 50; //yogurt
      double uf = 120; //flour
      double usa = 160; //saop
      
     
      System.out.print("Basmathi Qty(Kg)  - ");
      double basmathi = input.nextDouble();
      System.out.println();
      
      System.out.print("Dhal Qty(Kg)      - ");
      double dhal = input.nextDouble();
      System.out.println();
      
      System.out.print("Sugar Qty(Kg)     - ");
      double sugar = input.nextDouble();
      System.out.println();

      System.out.print("Highland Qty      - ");
      double highland = input.nextDouble(); 
      System.out.println();
      
      System.out.print("Yogurt Qty        - ");
      double yogurt = input.nextDouble(); 
      System.out.println();
      

      System.out.print("Flour Qty(Kg)     - ");
      double flour = input.nextDouble(); 
      System.out.println();
      
     
      System.out.print("Soap Qty          - ");
      double soap = input.nextDouble(); 
      System.out.println();
      
      //prices
      double pb = us*basmathi;
      double pd = ud*dhal;
      double ps = us*sugar;
      double ph = uh*highland;
      double py = uy*yogurt;
      double pf = uf*flour;
      double psa = usa*soap;
      
      double total = pb+pd+ps+ph+py+pf+psa;
      double discount = total/100*10;
      double price = total-discount;
      
System.out.println("+---------------------------------------------------------------+");
System.out.println("|               _   __  __          _____ _______               |");
System.out.println("|              ( ) |  \\/  |   /\\   |  __ \\__   __|              |");
System.out.println("|               _  | \\  / |  /  \\  | |__) | | |                 |");
System.out.println("|              | | | |\\/| | / /\\ \\ |  _  /  | |                 |");
System.out.println("|              | | | |  | |/ ____ \\| |\\ \\   | |                 |");
System.out.println("|              |_| |_|  |_/_/    \\_\\_| \\_\\  |_|                 |");
System.out.println("|                   225,Galle Road, Panadura.                   |");
System.out.println("|                                                               |");
System.out.println("+---------------------------------------------------------------+");
System.out.printf ("|                      # Tel   : %-31s|%n", number);
System.out.printf ("|                      # Name  : %-31s|%n", name);
System.out.println("+----------------+-------------+--------------+-----------------+");
System.out.println("|     Item       |    Qty      | Unit Price   |     Price       |");
System.out.println("+----------------+-------------+--------------+-----------------+");

System.out.printf("| %-14s | %-11s | %12.2f | %15.2f |%n", "# Basmathi", basmathi, ub, pb);
System.out.printf("| %-14s | %-11s | %12.2f | %15.2f |%n", "# Dhal", dhal, ud, pd);
System.out.printf("| %-14s | %-11s | %12.2f | %15.2f |%n", "# Sugar", sugar, us, ps);
System.out.printf("| %-14s | %-11s | %12.2f | %15.2f |%n", "# Highland", highland, uh, ph);
System.out.printf("| %-14s | %-11s | %12.2f | %15.2f |%n", "# Yogurt", yogurt, uy, py);
System.out.printf("| %-14s | %-11s | %12.2f | %15.2f |%n", "# Flour", flour, uf, pf);
System.out.printf("| %-14s | %-11s | %12.2f | %15.2f |%n", "# Soap", soap, usa, psa);

System.out.println("+----------------+-------------+--------------+-----------------+");
System.out.printf("| %-28s | %-12s | %15.2f |%n", "","Total", total);
System.out.println("|                              +--------------+-----------------+");
System.out.printf("| %-28s | %-12s| %15.2f |%n", "","Discount(10%)", discount);
System.out.println("|                              +--------------+-----------------+");
System.out.printf("| %-28s | %-12s | %15.2f |%n", "","Price", price);
System.out.println("+------------------------------+--------------+-----------------+");
System.out.println();
System.out.print("Enter Amount -");
double cash = input.nextDouble();

double price2 = cash-price;
int change =(int)price2;

System.out.println();

System.out.println("+-------------------------------------+");
System.out.printf("|     %-19s | %-9s |%n","Net Amount",price);
System.out.println("+-------------------------------------+");
System.out.printf("|     %-19s | %-9s |%n","Cash",cash);
System.out.println("+-------------------------------------+");
System.out.printf("|     %-19s | %-9s |%n","Change",change);
System.out.println("+-------------------------------------+");
System.out.println();
String rs = "Rs.";
int note1,note2,note3,note4,note5,note6,note7,coin1,coin2,coin3,coin4;
note1 = 5000;
note2 = 2000;
note3 = 1000;
note4 = 500;
note5 = 100;
note6 = 50;
note7 = 20;
coin1 = 10;
coin2 = 5;
coin3 = 2;
coin4 = 1;

int no = 0;

int i = change/note1;
int change2 = change%note1;

int i2 = change2/note2;
int change3 = change2%note2;

int i3 = change3/note3;
int change4 = change3%note3;

int i4 = change4/note4;
int change5 = change4%note4;

int i5 = change5/note5;
int change6 = change5%note5;

int i6 = change6/note6;
int change7 = change6%note6;

int i7 = change7/note7;
int change8 = change7%note7;

int i8 = change8/coin1;
int change9 = change8%coin1;

int i9 = change9/coin2;
int change10 = change9%coin2;

int i10 = change10/coin3;
int change11 = change10%coin3;

int i11 = change11/coin4;
int change12 = change11%coin4;

int totalNotes = i+i2+i3+i4+i5+i6+i7;
int totalCoins = i8+i9+i10+i11;

System.out.println("+-------------------------------------+");
System.out.printf("|     %-19s | %-9s |%n","Value","no");
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,note1,i);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,note2,i2);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,note3,i3);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,note4,i4);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,note5,i5);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,note6,i6);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,note7,i7);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,coin1,i8);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,coin2,i9);
System.out.println("+-------------------------------------+");
System.out.printf("|   %s%-18d | %-9d |%n",rs,coin3,i10);
System.out.println("+-------------------------------------+");
System.out.printf("|   %-19s   | %-9d |%n","No of Notes",totalNotes);
System.out.println("+-------------------------------------+");
System.out.printf("|   %-19s   | %-9d |%n","No of Coins",totalCoins);
System.out.println("+-------------------------------------+");
System.out.println();
System.out.println();
System.out.println("----------------------------------------");
System.out.println("      THANK YOU FOR SHOPPING WITH US         ");
System.out.println("----------------------------------------");

  }
}
