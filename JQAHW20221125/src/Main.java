public class Main {
    public static void main(String[] args) {
//        Environment qa = new Environment("qa");
//        Environment prod = new Environment("prod");
//        Environment dev = new Environment("dev");

        Environment qa = Environment.createEnvironment("qa");
        Environment prod = Environment.createEnvironment("prod");
        Environment dev = Environment.createEnvironment("dev");

        try {
            qa.deploy("1.1"); // почему требуется обернуть в try/catch обьект qa и dev?
        } catch (Environment.NotOwnerException e) {
            throw new RuntimeException(e);
        } catch (IllegalStateException e) {
            System.out.println("Can't deploy on running env");
        } catch (IllegalArgumentException e) {
            System.out.println("Can't deploy older version");
        }

        try {
            prod.deploy("1.2");
        } catch (Environment.NotOwnerException e) {   // можно прописать класс исключения NotOwnerException как Environment.NotOwnerException?
            System.out.println("Domeone tried to deploy Prod");
        } catch (IllegalStateException e) {
            System.out.println("Can't deploy on running env");
        }catch (IllegalArgumentException e) {
            System.out.println("Can't deploy older version");
        }

        try {
            qa.deploy("1.2");
        } catch (Environment.NotOwnerException e) {
            throw new RuntimeException(e);
        } catch (IllegalStateException e) {
            System.out.println("Can't deploy on running env");
        }catch (IllegalArgumentException e) {
            System.out.println("Can't deploy older version");
        }

        try {
            dev.deploy("2.2");
        } catch (Environment.NotOwnerException e) {
            throw new RuntimeException(e);
        } catch (IllegalStateException e) {
            System.out.println("Can't deploy on running env");
        }catch (IllegalArgumentException e) {
            System.out.println("Can't deploy older version");
        }

        System.out.println("---------------------------------");
    }
}