package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {
    private List<Hardware> hardwares = new ArrayList<>();
    private List<Software> softwares = new ArrayList<>();
    private Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public void setHardwares(List<Hardware> hardwares) {
        this.hardwares = hardwares;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(List<Software> softwares) {
        this.softwares = softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "hardwares=" + hardwares +
                ", softwares=" + softwares +
                ", cpu=" + cpu +
                '}';
    }

    public void addHardware(Hardware hardware) {
        hardwares.add(hardware);
    }

    public void addSoftware(Software software) {
        softwares.add(software);
    }

}
