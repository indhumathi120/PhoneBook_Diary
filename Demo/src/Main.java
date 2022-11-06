import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Operation operation=new Operation();
        Scanner sc=new Scanner(System.in);
       File file =new File("abc.txt");
       try{
           if(file.createNewFile()){
               System.out.println("File created");
           }
           else {
               System.out.println("File not created");
           }
       }
       catch (IOException e){
           e.printStackTrace();
       }
        System.out.println("1.Create");
        System.out.println("2.Retrieve");
        System.out.println("2.Update");
        System.out.println("3.Delete");

        int n=sc.nextInt();
       switch(n){


           case 1:
               System.out.println("Create");
               operation.Create();
               break;
           case 2:
               System.out.println("Update");
               operation.Update();
               break;
           case 3:
               System.out.println("Delete");
               operation.Delete();
               break;
       }


    }
}
