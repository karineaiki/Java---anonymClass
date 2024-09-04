public class ComplexTask {
    private String title;
    private String description;
    private boolean done;

    public ComplexTask(String title, String description, boolean done) {
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean getDone() {
        return done;
    }
}
