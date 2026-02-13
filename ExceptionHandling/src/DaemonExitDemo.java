import java.util.Scanner;

public class DaemonExitDemo {

    static volatile boolean running = true;

    public static void main(String[] args) throws Exception {

        // Daemon thread
        Thread autoSave = new Thread(() -> {
            while (running) {
                try {
                    Thread.sleep(3000);
                    System.out.println("Auto-saving...");
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("Daemon stopped");
        });

        autoSave.setDaemon(true);
        autoSave.start();

        // User input listener
        Scanner sc = new Scanner(System.in);
        System.out.println("Type E and press Enter to exit");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("E")) {
                running = false;
                System.out.println("Exiting application...");
                break;
            }
        }
    }
}
