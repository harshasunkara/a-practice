import java.io.*;  
public class FileExample {  
public static void main(String[] args) {  
    File f=new File("/Users/sonoojaiswal/Documents");  
    String filenames[]=f.list();  
    for(String filename:filenames){  
        System.out.println(filename);  
    }  
}  
} 
