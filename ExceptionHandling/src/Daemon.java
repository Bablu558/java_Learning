public class Daemon {

    public static void main(String[] args) throws Exception {

        // Daemon thread: Auto-save
        Thread autoSave = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    System.out.println("Auto-saving document...");
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        autoSave.setDaemon(true); // VERY IMPORTANT
        autoSave.start();

        // User thread: Typing simulation
        for (int i = 1; i <= 10; i++) {
            System.out.println("User typing line " + i);
            Thread.sleep(2000);
        }

        System.out.println("User closed the document");
    }
}
