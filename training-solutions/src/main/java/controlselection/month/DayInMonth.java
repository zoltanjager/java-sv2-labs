package controlselection.month;

public class DayInMonth {
    public int DaysInMonth(int year, String month) {
        String NameOfMonth = month.toLowerCase();
        int daysInMonth;

        switch(NameOfMonth) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                daysInMonth = 31;
                break;
            case "február":
                if ( year % 4 == 0  && !(year % 100 == 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 0;
        }
        return daysInMonth;
    }
}
