public class TaskContainer<T> {
    private T task;

    public TaskContainer() {}

    public void add(T task) {
        this.task = task;
    }

    public T get() {
        return task;
    }
}
