package StreamsAPI.ExampleWithNoStreams.BE.Entity;

public class StudentNoteBackend {
    private String name;
    private int note;

    public StudentNoteBackend(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentNoteBackend{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
