public static void main(String[] args) {
    int i = 0;

    try (Scanner scan = new Scanner(System.in)) {
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            i++;
            System.out.printf("%d %s\n",i,line);
        }
    }
}