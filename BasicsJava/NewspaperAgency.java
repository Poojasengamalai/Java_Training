
import java.util.Scanner;
public class NewspaperAgency {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Profit = (a*b)-(a*c)-100;
        System.out.println(Profit);
        sc.close();
    }
}
/*1. The Newspaper Agency;
	Each Saturday, the Herald sells a copies of special edition newspaper for Rs. b per copy. The cost to the Herald of each newspaper is Rs. c. The Herald pays a fixed cost for storage, delivery and so on of Rs. 100 per Saturday. The Herald wants to calculate the profit which it obtains only on Saturdays. Can you please help them out by writing a Java program to compute the profit if a, b, and c are given?


Input format 
input consist of 3 integer 
a is the no. of copies sold 
b is cost per copy 
c is the cost the Herald spends per copy 

Output format
the output consist of single integer which correspond to the profit obtained by the Herald 

Sample input 
1000
2
1
Sample output 
900 */