import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        TaskContainer<SimpleTask> simpleTaskContainer = new TaskContainer<>();
        SimpleTask simpleTask = new SimpleTask("New task");
        simpleTaskContainer.add(simpleTask);

        TaskContainer<ComplexTask> complexTaskContainer = new TaskContainer<>();
        ComplexTask complexTask = new ComplexTask("New complex task", "A task much more complex than the simple task", true);
        complexTaskContainer.add(complexTask);

        Consumer<SimpleTask> simpleTaskPrinter = new Consumer<SimpleTask>() {
            @Override
            public void accept(SimpleTask task) {
                System.out.println(task.getContent());
            }
        };
        simpleTaskPrinter.accept(simpleTaskContainer.get());

        Consumer<ComplexTask> complexTaskPrinter = new Consumer<ComplexTask>() {
            @Override
            public void accept(ComplexTask task) {
                System.out.println(task.getTitle() + ": " + task.getDescription() + "(" + task.getDone() + ")");
            }
        };
        complexTaskPrinter.accept(complexTaskContainer.get());

        //Classes anonymes en lambda
        Consumer<SimpleTask> lambdaSimpleTask = task -> {System.out.println(task.getContent());};
        lambdaSimpleTask.accept(simpleTask);

        Consumer<ComplexTask> lambdaComplexTask = task -> {System.out.println(task.getTitle() + ": " + task.getDescription() + "(" + task.getDone() + ")");};
        lambdaComplexTask.accept(complexTask);
    }


}
