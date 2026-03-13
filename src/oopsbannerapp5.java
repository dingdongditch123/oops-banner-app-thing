/**
 * OOPS Banner App
 * UC5: Array Initialization with String.join()
 *
 * @author Satwik
 * @version 1.4
 */

public class oopsbannerapp5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*   *"),
            String.join(" ", "*   *", "*   *", "*   *", "*   *"),
            String.join(" ", "*   *", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*", "*", "*"),
            String.join(" ", "*   *", "*", "*", "*"),
            String.join(" ", "*****", "*", "*", "*****")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}