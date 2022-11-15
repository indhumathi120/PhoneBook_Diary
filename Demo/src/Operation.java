import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operation {
    static List<String> list = new ArrayList<>();
    static List<Integer> deletedItemList=new ArrayList<>();

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
    public void initiate() throws Exception{
        Scanner scanner = new Scanner(new File(Main.path));
        while(scanner.hasNext()){
            list.add(scanner.nextLine());
        }

    }
    public void create() throws IOException {

        System.out.println("Enter the Name");
        name = sc.nextLine();
        System.out.println("Enter the number");
        number = sc.nextLine();
        list.add(name);
        FileWriter fileWriter = new FileWriter(Main.path,true);
        fileWriter.append(name + "-" + number + "\n"); // changed
        list.add(name+"-"+number);
        fileWriter.close();
    }

    //todo: Step 1: Load all data to a list, Step 2: Separate the name and number, Step 3: Validate the user input with the name
    //todo: Step 4: Add the matching users in another list, Step 5: Display the list for deletion.
    public String retrieve() throws Exception {
        Scanner scanner = new Scanner(new File(Main.path));
        String content = "";
        while (scanner.hasNext()) {
            content += scanner.nextLine();
            content += "\n";
        }
        System.out.print(content);
        return "true";
    }
    public String update(){
        return "true";

    }
    public boolean delete() throws Exception{
//        File index=new File("");

        System.out.println("Enter the name to delete:");
        String del=sc.next();
        
        //System.out.print(del);
        for(int i=0;i<list.size();i++){

            if(list.get(i).contains(del)){
             deletedItemList.add(i);
            }
            else{
                System.out.println("no");

            }
        }
        for(int j=0;j<deletedItemList.size();j++){
            System.out.println(j+1+"."+list.get(deletedItemList.get(j)));
        }
        System.out.println("Enter number to get delete from phone book");
        int n=sc.nextInt();
        sc.nextLine();
        int index = deletedItemList.get(n-1);
        list.remove(index);
        deletedItemList.clear();
        System.out.print(list);
        FileWriter fileWriter = new FileWriter(Main.path,false);
        for(int i=0;i<list.size();i++){
            fileWriter.write(list.get(i));
            fileWriter.write("\n");
        }
        fileWriter.close();
        return true;
    }
}
