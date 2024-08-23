public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String n = bufferedReader.readLine();

    bufferedReader.close();
    BigInteger a = new BigInteger(n);

    System.out.println(a.isProbablePrime(1) ? "prime" : "not prime" );
}