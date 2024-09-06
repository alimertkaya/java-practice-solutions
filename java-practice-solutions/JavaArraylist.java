public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    List<List<Integer>> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        List<Integer> row = new ArrayList<>();
        int m = in.nextInt();
        for (int j = 0; j < m; j++) {
            row.add(in.nextInt());
        }
        arr.add(row);
    }

    int q = in.nextInt();
    for (int i = 0; i < q; i++) {
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;

        try {
            System.out.println(arr.get(x).get(y));
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }
    in.close();
}