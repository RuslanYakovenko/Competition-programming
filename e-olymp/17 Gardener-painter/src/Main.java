import java.util.Scanner;
public class Main {

    static long solve(int N){
        return 3L * (long) Math.pow(2, N-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long ans =  solve(scanner.nextInt());
        System.out.println(ans);
    }
}
