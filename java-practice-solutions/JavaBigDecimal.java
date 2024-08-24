Arrays.sort(s, 0, n, (a,b) -> {
    BigDecimal numA = new BigDecimal(a);
    BigDecimal numB = new BigDecimal(b);
    return numB.compareTo(numA);
});