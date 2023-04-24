import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n==1) System.out.println(1);
        else{
            int s = 2;
            int e = 1;
            int r = 6;
            int ans = 2;
            e += r;

            while(true){
                if(s<=n && n<=e){
                    System.out.println(ans);
                    break;
                }
                s += r;
                r += 6;
                e += r;
                ans += 1;
            }
        }
    }
}