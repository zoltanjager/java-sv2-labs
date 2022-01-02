package schoolrecords;

public enum MarkType {

    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");
    private final int mark;
    private final String description;

    MarkType(int mark, String description) {
    this.mark = mark;
    this.description = description;
    }



    public String getDescription() {
        return description;
    }

    public int getMark() {
        return mark;
    }
}
