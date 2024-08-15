import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "techmaster";
        String correctPassword = "hoclacoviec";
        int balance = 1000000;
        String choice;
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Nhập username: ");
            String username = scanner.nextLine();
            System.out.print("Nhập password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                loggedIn = true;
                System.out.println("Đăng nhập thành công!");
            } else {
                System.out.println("Sai username hoặc password. Vui lòng thử lại.");
            }
        }
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Xem thông tin tài khoản");
            System.out.println("2. Rút tiền");
            System.out.print("Mời bạn chọn chức năng (1 hoặc 2): ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    // Xem thông tin tài khoản
                    System.out.println("Thông tin tài khoản:");
                    System.out.println("Username: " + correctUsername);
                    System.out.println("Password: " + correctPassword);
                    System.out.println("Balance: " + balance + " VND");
                    break;

                case 2:
                    System.out.print("Nhập số tiền muốn rút: ");
                    int amount = Integer.parseInt(scanner.nextLine());
                    if (amount > balance) {
                        System.out.println("Số dư không đủ để thực hiện giao dịch này.");
                    } else {
                        balance -= amount;
                        LocalDateTime now = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
                        String formattedDateTime = now.format(formatter);
                        System.out.println("Bạn đã rút " + amount + " VND vào lúc " + formattedDateTime);
                        System.out.println("Số dư hiện tại: " + balance + " VND");
                    }
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.print("\nDo you want to continue? (Y/N): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("Chương trình kết thúc.");
        System.exit(0);
    }
}
