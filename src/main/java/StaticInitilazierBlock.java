import java.util.Scanner;

public class StaticInitilazierBlock {

    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth an height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }


    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.println(area);
        }

    }
}
