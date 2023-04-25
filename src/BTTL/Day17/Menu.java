package BTTL.Day17;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> arrAccount = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("1 . Log in");
            System.out.println("2 . Register");
            System.out.println("Enter your selection");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        logIn();
                        break;
                    case 2:
                        register();
                        break;
                    case 0:
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void register() {
        System.out.println("Username");
        String user = scanner.nextLine();
        System.out.println("Password");
        String pass = scanner.nextLine();
        System.out.println("FullName");
        String fullName = scanner.nextLine();
        System.out.println("Phone Number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Address");
        String address = scanner.nextLine();
        Account account = new Account(user, pass, fullName, phoneNumber, address);
        arrAccount.add(account);
        writeFile();
    }

    public static void logIn() throws IOException {
        String username;
        String password;
        while (true) {
            try {
                System.out.println("Username");
                username = scanner.nextLine();
                if (username.equals("")) {
                    throw new FileNotFoundException("Please re-enter");
                }
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Error :" + e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Password");
                password = scanner.nextLine();
                if (password.equals("")) {
                    throw new FileNotFoundException("Please re-enter");
                }
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Error :" + e.getMessage());
            }
        }
        readFile();
        if (arrAccount.size() != 0) {
            for (Account e : arrAccount) {
                if (e.getUsername().equals(username) && e.getPass().equals(password)) {
                    System.out.println("Logged in successfully");
                } else {
                    System.out.println("Account or password error");
                }
            }
        } else {
            System.out.println("Account or password error");
        }

    }

    public static void writeFile() {
        File file = new File("C:\\C0223i1\\Module2\\src\\BTTL\\Day17\\Register");
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("Can't find directory");
            }

            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Account account : arrAccount) {
                bufferedWriter.write(account.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        File file = new File("C:\\C0223i1\\Module2\\src\\BTTL\\Day17\\Login");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String account;
        String[] str;
        while ((account = bufferedReader.readLine()) != null) {
            str = account.split(", ");
            arrAccount.add(new Account(str[1], str[2], str[3], str[4], str[5]));
        }
        bufferedReader.close();
        fileReader.close();
    }
}
