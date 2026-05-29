import java.util.Scanner;
public class TreasureHunter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int Ben = sc.nextInt();
        int BB = sc.nextInt();
        int Benamt = (Ben*T)/100;
        System.out.println(Benamt);
        T = T - Benamt;
        int BBamt = (BB*T)/100;
        System.out.println(BBamt);
        T = T - BBamt;
        System.out.println(T/3);
        sc.close();
    }
}
