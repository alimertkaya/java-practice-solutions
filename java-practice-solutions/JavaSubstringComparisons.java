public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int k = in.nextInt();
    in.close();

    List<String> words = new ArrayList<>();

    for (int i = 0; i < s.length() - (k - 1); i++) {
        words.add(s.substring(i, k + i));
    }
    Collections.sort(words);
    System.out.println(words.get(0));
    System.out.println(words.get(words.size() - 1));
}