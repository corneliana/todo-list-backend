package learning;

import java.util.function.Function;

public class ClosureExample {
    // 'name' 是 createGreeter 的局部变量
    public static Function<String, String> createGreeter(String name) {
        return message -> name + " says: " + message;
    }

    public static void main(String[] args) {
        // greeter and greeter2 会创建两个不同的闭包，每个都绑定了自己的 name 值 => 变量 name 被闭包捕获
        // 外部代码不能直接访问或修改 name, name 的值只能通过调用返回的函数来间接修改和访问
        Function<String, String> greeter = createGreeter("John");
        Function<String, String> greeter2 = createGreeter("Alice");
        // 此时 createGreeter 已经执行完毕，但 'name' 的值仍然被保留

        System.out.println(greeter.apply("Hello World!"));
        System.out.println(greeter2.apply("Nice to see you!"));
        // 即使 createGreeter 已经结束，仍然可以访问 "Alice" 这个值

        // 闭包延长了变量生命周期，使其在创建函数结束后仍然可用。
        // 特定环境指的是闭包捕获的变量状态，每个闭包实例可能绑定不同的环境。
        // 数据隐藏通过将变量封装在闭包内部实现，外部无法直接访问这些变量。
    }
}

