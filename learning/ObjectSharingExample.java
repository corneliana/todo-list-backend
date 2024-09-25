package learning;

public class ObjectSharingExample {
    private static class Greeter {
        private String name;

        // create an object that contains a mutable state: name
        public Greeter(String name) {
            this.name = name;
        }
        
        public String greet(String message) {
            return name + " says: " + message;
        }
    }
    
    public static void main(String[] args) {
        // greeter and greeter2 point to and share the same object
        Greeter greeter = new Greeter("John");
        Greeter greeter2 = greeter;
        greeter2.name = "Alice";

        System.out.println(greeter.greet("Hello World!"));
        System.out.println(greeter2.greet("Nice to see you!"));
    }
}
