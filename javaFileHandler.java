import java.io.File;
import java.io.IOException;

public class javaFileHandler {
    public static void main(String [] args){
        File file = new File(
            "C:\\Users\\burak\\OneDrive\\Desktop\\javaProjects\\java files\\example.txt");
        try{
            if(file.createNewFile()){
                System.out.println("new file added");
            }
            else{
                System.out.println("file already generated");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
