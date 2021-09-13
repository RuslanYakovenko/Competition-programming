import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int ans = 0;
        do{
            ans++;
            n /= 10;
        }
        while(n!=0);
        System.out.println(ans);
    }
}
