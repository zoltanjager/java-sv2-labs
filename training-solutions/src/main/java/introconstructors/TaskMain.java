package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("English lesson", "English verbs");

        task.start();
        task.setDuration(45);
        System.out.println(task.getTitle() + "- " + task.getDescription() +
                            " - " + task.getStartDateTime() + " " + task.getDuration());

    }
}
