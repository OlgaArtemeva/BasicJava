public class Environment {
    private Long lastDeployTime;
    private Long upDuration;
    private String currentUri; // местонахождение обновления
    private final String type;
    private String version;
    public static final String QA = "QA";
    public static final String PROD = "PROD";
    public static final String DEV = "DEV";



    boolean isRunning;


    private Environment(String type) {
        this.type = type;
    }


    private Environment(Long lastDeployTime, Long upDuration, String currentUri, String type, String version) {
        this.lastDeployTime = lastDeployTime;
        this.upDuration = upDuration;
        this.currentUri = currentUri;
        this.type = type;
        this.version = version;
        this.isRunning = false;
    }

    public void deploy(String version) throws NotOwnerException, IllegalStateException{
        if (version.compareTo(this.version)<0){  //0 1 -1
            throw new IllegalArgumentException();
        }
        if (isRunning) {
            throw new IllegalStateException();
        }

        if (type.equals("Prod")) {
            throw new NotOwnerException(); // запускается исключение?
        }
        this.version = version;
        lastDeployTime = System.currentTimeMillis();
        upDuration = 0l;   // почему требует значение 0l, а 0 не устраивает
        System.out.println("новая версия успешно задеплоена");
    }

    // почему класс исключений прописываем в классе Environment?
    public class NotOwnerException extends Exception {
    }

    public static String[] listEnvs() {
        return new String[]{QA, PROD, DEV};

    }

    public Long getLastDeployTime() {
        return lastDeployTime;
    }

    public Long getUpDuration() {
        return upDuration;
    }

    public String getCurrentUri() {
        return currentUri;
    }

    public String getType() {
        return type;
    }

    public static Environment createEnvironment(String type){
        return new Environment(type);
    }

    public void deployNow(String version){
        this.isRunning = false;
        this.version = version;
        lastDeployTime = System.currentTimeMillis();
        upDuration = 0l;   // почему требует значение 0l, а 0 не устраивает
        this.isRunning = true;
        System.out.println("новая версия успешно задеплоена");
    }
}
