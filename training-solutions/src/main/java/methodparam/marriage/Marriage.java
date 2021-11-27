package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        setNameAfterMarriage(woman, man);
        addRegisterDate(woman, man);
    }

    private void addRegisterDate(Woman woman, Man man) {
        woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
    }

    private void setNameAfterMarriage(Woman woman, Man man) {
        woman.setName(man.getName().split(" ")[0] + "né" + " " + woman.getName());
    }

}
