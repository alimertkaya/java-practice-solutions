public static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();

    if (a.length() != b.length())
        return false;
    else {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        return Arrays.equals(A,B);
    }
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    String b = in.nextLine();
    in.close();

    boolean result = isAnagram(a,b);

    System.out.println(result ? "Anagrams" : "Not Anagrams");

}