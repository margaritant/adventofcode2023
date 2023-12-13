import java.io.*;
import java.util.Scanner;

public class AdventDay1
{
    public static void main (String[] args){
        int sum = 0;
        try {         
               
                BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
                String line;
                int i;
                int no1 = 0, no2 = 0;

                while((line = bf.readLine()) != null){

                   char[] ch = new char[line.length()];
                   
                   for (i=0;i<line.length();i++){
                       ch[i] = line.charAt(i);
                   }
                   for (i=line.length()-1;i>=0;i--){
                       if (ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9') {
                            no1 = Character.getNumericValue(ch[i]); 
                       }    
                   }
                   for (i=0;i<line.length();i++){
                       if (ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9') {
                            no2 = Character.getNumericValue(ch[i]);  
                       }    
                   }
                   
                   sum = sum + (no1*10) + no2;
                
                }
                bf.close();
            } 
        catch (IOException ex) { 
                System.out.println (ex.toString());
                System.out.println("Could not find the file ");
            } 
        System.out.print("\n" + sum);
        
    }
}

