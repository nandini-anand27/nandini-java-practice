public class InheritClass extends ParentParent implements InterfaceDemo1, InterfaceDemo2 {
    @Override
    public void printsomething() {
        System.out.println("print something");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        InheritClass obj = new InheritClass();
        obj.printsomething();
    }
}

interface InterfaceDemo1 {
    void printsomething();
}

interface InterfaceDemo2 {
    void printsomething();
}

class ParentParent {
}
