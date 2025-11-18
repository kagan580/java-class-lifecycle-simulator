package simulator;

public class BClass extends AClass{
    static {
        ClassLogger.log("BClass: static blok çalıştı");
    }

    {
        ClassLogger.log("BClass: instance blok çalıştı");
    }
    public BClass() {
        ClassLogger.log("BClass: constructor çalıştı");
    }
    @Override
    public String getTypeName() {
        return "BClass";
    }
}
