package hello;

public class Greeter {

    private long id;
    private String content;

    public String sayHello() {
        return "Hello world!";
    }

    public Greeter(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}