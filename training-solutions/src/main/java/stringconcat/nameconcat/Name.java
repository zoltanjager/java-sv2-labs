package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        String fullName;
        if (title != null) {
            fullName = title.getTitle();
            fullName += " " + givenName;
        } else {
            fullName = givenName;
        }

        if (middleName != null) {
            fullName += " " + middleName;
        }
        fullName += " " + familyName;
        return fullName;
    }

    public String concatNameHungarianStyle() {
        String fullName;

        if(title != null) {
            fullName = title.getTitle();
            fullName = fullName.concat(" ");
            fullName = fullName.concat(familyName);
        } else {
            fullName = familyName;
        }

        if (middleName != null) {
            fullName = fullName.concat(" ");
            fullName = fullName.concat(middleName);
        }
        fullName = fullName.concat(" ");
        fullName = fullName.concat(givenName);

        return fullName;

    }


}
