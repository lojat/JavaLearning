package functional.interfaces;

@FunctionalInterface
interface Say {
    void say(String msg);
}

class Call implements Say {
    public void say(String msg) {
        System.out.println(msg);
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Call call = new Call();
        call.say("Hello java!");
    }
}
