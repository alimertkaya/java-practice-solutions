// Solution 1
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    in.close();

    String reversedS = new StringBuilder(s).reverse().toString();
    if (s.equals(reversedS))
        System.out.println("Yes");
    else
        System.out.println("No");
}

// *******************************************************************************************

// Solution 2
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    in.close();

    char[] chars = s.toCharArray();
    int len = chars.length;

    for (int i = 0; i < (len / 2); i++) {
        char temp = chars[i];
        chars[i] = chars[len - 1 - i];
        chars[len - 1 - i] = temp;
    }

    String reversedS = new String(chars);
    if (s.equals(reversedS))
        System.out.println("Yes");
    else
        System.out.println("No");
}