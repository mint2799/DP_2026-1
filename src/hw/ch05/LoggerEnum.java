package hw.ch05;

public enum LoggerEnum {
    INSTANCE;

    private StringBuilder logBuffer = new StringBuilder();

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
            .append(message).append("\n");
        System.out.println("[LoggerEnum] " + message);
    }

    public String getLog(){
        return logBuffer.toString();
    }
}
