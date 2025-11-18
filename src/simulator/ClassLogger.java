package simulator;

public class ClassLogger {
    private static StringBuilder logs = new StringBuilder();

    public static void log(String message){
    logs.append(message).append("\n");
    }
    public static String getlogs(){
        return logs.toString();

    }
    public static void clear(){
        logs.setLength(0);
    }
}
