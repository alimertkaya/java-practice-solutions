/*
* When a double or int input value is read, a newline (\n) character remains in the input buffer.
* If a string input is then immediately read after this, the desired input value may not be correctly obtained.
* To resolve this issue, we use the nextLine() method after reading an int or double input to clear the newline (\n) character.
*/

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    scan.nextLine();
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
}