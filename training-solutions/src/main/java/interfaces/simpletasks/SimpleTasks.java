package interfaces.simpletasks;

import java.util.List;

public class SimpleTasks implements Runnable{

    private List<String> tasks;

    public List<String> getTasks() {
        return tasks;
    }

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (nextStep());
    }

    private boolean nextStep() {
        if (!tasks.isEmpty() && tasks != null ) {
            tasks.remove(tasks.size()-1);
        }
        return !tasks.isEmpty();
    }

}
