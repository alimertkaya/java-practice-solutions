public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(in.hasNext()) {
        String ip = in.nextLine();

        if (ip.matches(MyRegex.pattern))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

static class MyRegex {
    static String pattern = "(((25[0-5])|(2[0-4]\\d)|([0-1]?\\d{1,2}))(\\.|$)){4}";
}