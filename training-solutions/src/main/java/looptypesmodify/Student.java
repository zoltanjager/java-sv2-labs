package looptypesmodify;

import java.util.List;

public class Student {
    private String name;
    private boolean active;

    public Student(String name){
        active = true;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
