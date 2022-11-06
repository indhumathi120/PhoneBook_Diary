
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Operation operation = new Operation();
        Scanner sc = new Scanner(System.in);
        File file = new File("abc.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File not created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Crud operations:");
        System.out.println("1.Create");
        System.out.println("2.Retrieve");
        System.out.println("2.Update");
        System.out.println("3.Delete");



            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Create");
                    operation.Create();
                    System.exit(0);
                case 2:
                    System.out.println("Retrieve");
                    Scanner scanner = new Scanner(new File("E:\\Java Programming\\PhoneBook_Diary\\Demo\\abc.txt"));
                    String content = "";
                    while (scanner.hasNext()) {
                        scanner.nextLine();
                        content = content + scanner.nextLine();
                        content += "/n";
                    }
                    System.out.print(content);
                case 3:
                    System.out.println("Update");
                    operation.Update();
                    //System.exit(0);
                case 4:
                    System.out.println("Delete");
                    operation.Delete();

                    //System.exit(0);
            }


        }
    }
