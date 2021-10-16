package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("John Doe");
        note.setTopic("Intro");
        note.setText("This is an intro.");

        System.out.println(note.getNoteText());

    }
}
