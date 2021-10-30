package stringbasic;

public class Student {
    private Person person;
    private String idNeptun;
    private String idStudent;
    private String badgeId;

    public Student(Person person, String idNeptun, String idStudent) {
        this.person = person;
        this.idNeptun = idNeptun;
        this.idStudent = idStudent;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getIdNeptun() {
        return idNeptun;
    }

    public void setIdNeptun(String idNeptun) {
        this.idNeptun = idNeptun;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", idNeptun='" + idNeptun + '\'' +
                ", idStudent='" + idStudent + '\'' +
                ", badgeId='" + badgeId + '\'' +
                '}';
    }
}
