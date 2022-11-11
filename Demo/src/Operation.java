import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operation {
    static List<String> list = new ArrayList<>();

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
    Scanner sc = new Scanner(System.in);

    public void Create() throws IOException {

        System.out.println("Enter the Name");
        name = sc.nextLine();
        System.out.println("Enter the number");
        number = sc.nextLine();
        //list.add(name);
        FileWriter fileWriter = new FileWriter(Main.path, true);
        fileWriter.append(name + "-" + number + "\n");
        fileWriter.close();
    }

    public String Retrieve() throws Exception {
 //       System.out.println("Enter the Name");
        Scanner scanner = new Scanner(new File(Main.path));
        String content = "";
        while (scanner.hasNext()) {
            content += scanner.nextLine();
            content+=",";
           list.add(content);
 //          System.out.print(",");
            content += "\n";

        }
        System.out.print(content);
//        System.out.print(list);
        return "true";
    }
    public String Update(){
       ////add
        return "true";

    }
    public boolean Delete() throws Exception{
//        File index=new File("");
        System.out.println("Enter the name to delete:");
        String del=sc.next();


        //System.out.print(del);
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(del)){
                System.out.println("yes");
                System.exit(0);
            }
            else{
                System.out.println("no");
                System.exit(0);
            }
        }
//        String[] entries = index.list();
//        for (String s : entries) {
//            File currentFile = new File(index.getPath(), s);
//            currentFile.delete();
//        }
//        list.add=>for=>del=>equal=>check
        return true;
    }
}
