public class App {

    public String getGreeting() {
        return "Gradle Build Successful";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

    }
}
