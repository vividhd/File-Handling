package Json;

import org.json.JSONObject;

import java.io.File;
import java.util.Scanner;

public class FileHandle {
    public static void main(String[] args) {
        try{
            File file =new File("C:/Users/Vividh/IdeaProjects/Json/file.json");
            Scanner sc=new Scanner(file);
            StringBuilder jsondata=new StringBuilder();
            while(sc.hasNextLine()){
                jsondata.append(sc.nextLine());
            }
            sc.close();
            JSONObject jsonObject=new JSONObject(jsondata.toString());

            String name=jsonObject.getString("name");
            int age=jsonObject.getInt("age");
            String city= jsonObject.getString("city");

            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("City: "+city);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
