package controlselection.week;

public class DayOfWeeks {
    public String dayOfWeek(String day) {
        String dayOfWeek = day.toLowerCase();

        switch(dayOfWeek) {
            case "hétfő":
                dayOfWeek = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                dayOfWeek = "hét közepe";
                break;
            case "péntek":
                dayOfWeek = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                dayOfWeek = "hétvége";
                break;
            default:
                dayOfWeek = "ismeretlen nap";
        }
        return dayOfWeek;
    }
}
