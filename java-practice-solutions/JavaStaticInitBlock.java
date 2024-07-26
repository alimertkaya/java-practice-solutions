import java.util.Scanner;

private static double breath;
private static double height;
private static boolean flag = true;

static {
    Scanner in = new Scanner(System.in);
    breath = in.nextDouble();
    height = in.nextDouble();
    if (breath <= 0 || height <= 0) {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    in.close();
}

public static void main(String[] args) {
    if (flag) {
        System.out.println((int)(breath * height));
    }
}