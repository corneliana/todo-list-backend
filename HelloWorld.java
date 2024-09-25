public class HelloWorld {
    static int x = 100;

    StringBuilder stringBuilder = new StringBuilder();
    var sb = new StringBuilder();
    public static void main(String[] args) {
        System.out.printf("Welcome to the Todo List Application! The value of x is: %d\n", x);
    }
}

class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }
}