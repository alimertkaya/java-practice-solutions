public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    in.close();
    String[] s2 = s1.trim().split("[ !,?._'@]+");

    if (s1.trim().length() == 0 ) {
        System.out.println(0);
    }
    else {
        System.out.println(s2.length);
        for (String s : s2) {
            System.out.println(s);
        }
    }
}