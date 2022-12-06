import java.io.File;
import java.io.IOException;

public class FunFiles {
    // Attributes


    // Constructors
    public FunFiles(){
        //findFiles();
        createFiles();
    }


    // Methods
    public void findFiles(){
        File myFile = new File("C:\\Users\\garratt.karl\\Desktop\\Prog 2 Projects\\Java\\FileTest");
        String[] allFiles = myFile.list();
        for (String name:allFiles){
            System.out.println(name);
        }
    }

    public void createFiles(){
        File myFile = new File("test.txt");
        try{
            if(myFile.createNewFile()){
                System.out.println("File created.");
            }
        }
        catch(IOException e){
            System.out.println("Princess is in another castle!");
            e.printStackTrace();
        }
    }


}
