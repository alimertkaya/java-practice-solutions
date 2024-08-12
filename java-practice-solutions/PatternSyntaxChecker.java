public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.nextLine();

    for (int i = 0; i < n; i++) {
        String pattern = in.nextLine();
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}