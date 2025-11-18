package simulator;

public class CClass extends BClass {

    static {
        ClassLogger.log("CClass: static blok çalıştı");
    }

    {
        ClassLogger.log("CClass: instance blok çalıştı");
    }

    public CClass() {
        ClassLogger.log("CClass: constructor çalıştı");
    }
    @Override
    public String getTypeName() {
        return "CClass";
    }
}
