public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < count; i++) {
        list.add(in.nextInt());
    }

    int q = in.nextInt();
    for (int i = 0; i < q; i++) {
        String qTypes = in.next().trim().toLowerCase();

        switch (qTypes) {
            case "insert":
                int insIndex = in.nextInt();
                int value = in.nextInt();
                list.add(insIndex,value);
                break;
            case "delete":
                int delIndex = in.nextInt();
                list.remove(delIndex);
                break;
        }
    }
    for (int val : list) {
        System.out.print(val + " ");
    }
}