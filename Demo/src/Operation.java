import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Operation {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String number;
    Scanner sc=new Scanner(System.in);
    public String Create() throws IOException {

        System.out.println("Enter the Name");
        name=sc.nextLine();
        System.out.println("Enter the number");
        number=sc.nextLine();
        FileWriter fileWriter=new FileWriter("abc.txt");
        fileWriter.write(name);
        fileWriter.write("-");
        fileWriter.write(number);
        fileWriter.close();
        return "true";
    }
    public String Retrieve(){
        System.out.println("Enter the Name");
        name=sc.nextLine();
        System.out.println("Enter the number");
        number=sc.nextLine();
        return "true";
    }
    public String Update(){

        return "true";

    }
    public String Delete(){
        File file=new File("abc.txt");
        file.delete();
        return "true";
    }
}
