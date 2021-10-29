package enumtype.university;

public enum University {
    BME("Budapesti Műszaki Egyetem"), JATE("József Attila Tudományegyetem"), DOTE("Debreceni Orvostudományi Egyetem");

    private final String fullName;

    University(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
