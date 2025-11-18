package simulator;

public class AClass {
    static {
        ClassLogger.log("AClass: static blok çalıştı");
    }
    {
        ClassLogger.log("AClass: instance blok çalıştı");
    }
    public AClass() {
        ClassLogger.log("AClass: constructor çalıştı");
    }
    public String getTypeName() {
        return "AClass";
    }
}
