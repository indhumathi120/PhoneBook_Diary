import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    static String path;
    public static void main(String[] args) throws Exception {
        Operation operation = new Operation();
        Scanner sc = new Scanner(System.in);
        File file = new File("xyz.txt");
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
       //System.out.print(path);

            int n = sc.nextInt();

                if(n==1) {
                    System.out.println("Create");
                    operation.create();

                }
                else if(n==2) {
                    System.out.println("Retrieve");
                    operation.retrieve();
                }
                else if(n==3) {
                    System.out.println("Update");
                    operation.update();

                }
                else if (n==4) {
                    System.out.println("Delete");
                    operation.delete();
                }
                else{

                    break;
                }
                    //System.exit(0);
            }


        }


}

