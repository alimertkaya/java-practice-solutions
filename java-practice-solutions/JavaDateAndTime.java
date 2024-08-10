public static String findDay(int month, int day, int year) {

    Calendar calender = Calendar.getInstance();
    calender.set(year, month - 1, day);

    String[] days = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);

    return days[dayOfWeek - 1];
}