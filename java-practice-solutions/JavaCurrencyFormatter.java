import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
// Java 8

// Solution 1
    Scanner in = new Scanner(System.in);
    double payment = in.nextDouble();

    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

// Solution 2
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        Map<String, Locale> localeMap = new LinkedHashMap<>();

        localeMap.put("US",Locale.US);
        localeMap.put("India",Locale.US);
        localeMap.put("China",Locale.CHINA);
        localeMap.put("France",Locale.FRANCE);

        for (Map.Entry<String, Locale> entry : localeMap.entrySet()) {
            String country = entry.getKey();
            Locale locale = entry.getValue();
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
            String formattedPayment = currencyFormat.format(payment);
            if (country.equals("India"))
                System.out.println(country + ": " + formattedPayment.replace("$","RS."));
            else
                System.out.println(country + ": " + formattedPayment);