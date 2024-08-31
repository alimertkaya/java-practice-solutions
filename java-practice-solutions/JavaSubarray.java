public static void main(String[] args) {
    int sum, count = 0;

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            sum = 0;

            for (int k = i; k <= j; k++) {
                sum += arr[k];
            }

            if (sum < 0)
                count++;
        }
    }
    System.out.println(count);
}