package controlselection.greetings;

public class Greetings {
    public String greeting(int hour, int minute) {
        String greetingText = "";

        int minutes = hour * 60 + minute;

        if (minutes >= 300 && minutes < 540) {
            greetingText = "Jó reggelt!";
        } else {
            if (minutes >= 540 && minutes <= 1110) {
                greetingText = "Jó napot!";
            } else {
                if (minutes >= 1110 && minutes <= 1200) {
                    greetingText = "Jó estét!";
                } else {
                    if (minutes > 1200 || minutes < 300) {
                        greetingText = "Jó éjt!";
                    }
                }
            }
        }
        return greetingText;
    }
}
