
import java.io.*;
import java.util.Scanner;

public class Main {
    static String path;
    public static void main(String[] args) throws IOException {
        Operation operation = new Operation();
        Scanner sc = new Scanner(System.in);
        File file = new File("Demo\\abc.txt");
        path = file.getAbsolutePath();

        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File not created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            System.out.println("Crud operations:");
            System.out.println("1.Create");
            System.out.println("2.Retrieve");
            System.out.println("3.Update");
            System.out.println("4.Delete");


            int n = sc.nextInt();

                if(n==1) {
                    System.out.println("Create");
                    operation.Create();

                }
                else if(n==2) {
                    System.out.println("Retrieve");
                    Scanner scanner = new Scanner(new File(path));
                    String content = "";
                    while (scanner.hasNext()) {
                        content += scanner.nextLine();
                        content += "\n";
                    }
                    System.out.print(content);
                }
                else if(n==3) {
                    System.out.println("Update");
                    operation.Update();

                }
                else if (n==4) {
                    System.out.println("Delete");
                    operation.Delete();
                }
                else{

                    break;
                }
                    //System.exit(0);
            }


        }
    }

