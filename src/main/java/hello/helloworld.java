package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("the current time: "+currentTime);
        Greeter greeter = new Greeter(1,"hello");
        System.out.println(greeter.sayHello());
    }
}