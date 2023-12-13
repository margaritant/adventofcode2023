import java.io.*;
import java.util.Scanner;

public class AdventDay1Part2
{
    public static void main (String[] args){
        int sum = 0;
        try {         
               
                BufferedReader bf = new BufferedReader(new FileReader("aoc_day1.txt"));
                String line;
                int i;
                int no1 = 0, no2 = 0;
                int number = 0;
                while((line = bf.readLine()) != null){
                   char[] ch = new char[line.length()];
                   
                   for (i=0;i<line.length();i++){
                       ch[i] = line.charAt(i);
                   }
                   for (i=line.length()-1;i>=0;i--){
                       if (ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='e'||ch[i]=='o'||ch[i]=='r'||ch[i]=='x'||ch[i]=='t'||ch[i]=='n') {
                            if (ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9') {
                            no2 = Character.getNumericValue(ch[i]);
                            break;
                       }else{
                           if (ch[i]=='e'&&ch[i-1]=='n' && ch[i-2]=='o'){
                             no2 = 1; 
                             break;
                           }
                           if (ch[i]=='o'&&ch[i-1]=='w' && ch[i-2]=='t'){
                             no2 = 2;  
                             break;
                           }
                           if (ch[i]=='e'&&ch[i-1]=='e' && ch[i-2]=='r'&& ch[i-3]=='h'&& ch[i-4]=='t'){
                             no2 = 3; 
                             break;
                           }
                           if (ch[i]=='r'&&ch[i-1]=='u' && ch[i-2]=='o'&& ch[i-3]=='f'){
                             no2 = 4; 
                             break;
                           }
                           if (ch[i]=='e'&&ch[i-1]=='v' && ch[i-2]=='i'&& ch[i-3]=='f'){
                             no2 = 5;  
                             break;
                           }
                           if (ch[i]=='x'&&ch[i-1]=='i' && ch[i-2]=='s'){
                             no2 = 6;   
                             break;
                           }
                           if (ch[i]=='n'&&ch[i-1]=='e' && ch[i-2]=='v'&& ch[i-3]=='e'&& ch[i-4]=='s'){
                             no2 = 7;  
                             break;
                           }
                           if (ch[i]=='t'&&ch[i-1]=='h' && ch[i-2]=='g'&& ch[i-3]=='i'&& ch[i-4]=='e'){
                             no2 = 8;
                             break;
                           }
                           if (ch[i]=='e'&&ch[i-1]=='n' && ch[i-2]=='i'&& ch[i-3]=='n'){
                             no2 = 9; 
                             break;
                           }
                        }
                       }    
                   }
                   for (i=0;i<line.length();i++){
                       if (ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='o'||ch[i]=='t'||ch[i]=='f'||ch[i]=='s'||ch[i]=='e'||ch[i]=='n') {
                            if (ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9') {
                            no1 = Character.getNumericValue(ch[i]); 
                            break;
                       }else{
                           if (ch[i]=='o'&&ch[i+1]=='n' && ch[i+2]=='e'){
                             no1 = 1;
                             break;
                           }
                           if (ch[i]=='t'&&ch[i+1]=='w' && ch[i+2]=='o'){
                             no1 = 2;  
                             break;
                           }
                           if (ch[i]=='t'&&ch[i+1]=='h' && ch[i+2]=='r'&& ch[i+3]=='e'&& ch[i+4]=='e'){
                             no1 = 3; 
                             break;
                           }
                           if (ch[i]=='f'&&ch[i+1]=='o' && ch[i+2]=='u'&& ch[i+3]=='r'){
                             no1 = 4;   
                             break;
                           }
                           if (ch[i]=='f'&&ch[i+1]=='i' && ch[i+2]=='v'&& ch[i+3]=='e'){
                             no1 = 5;  
                             break;
                           }
                           if (ch[i]=='s'&&ch[i+1]=='i' && ch[i+2]=='x'){
                             no1 = 6;
                             break;
                           }
                           if (ch[i]=='s'&&ch[i+1]=='e' && ch[i+2]=='v'&& ch[i+3]=='e'&& ch[i+4]=='n'){
                             no1 = 7;
                             break;
                           }
                           if (ch[i]=='e'&&ch[i+1]=='i' && ch[i+2]=='g'&& ch[i+3]=='h'&& ch[i+4]=='t'){
                             no1 = 8; 
                             break;
                           }
                           if (ch[i]=='n'&&ch[i+1]=='i' && ch[i+2]=='n'&& ch[i+3]=='e'){
                             no1 = 9;  
                             break;
                           }
                        }
                       }    
                   }
                   
                   sum = sum + (no1*10) + no2;
                   System.out.println(line + " number1: " + no1 + " number2: " + no2 + " sum is: " + sum);
                  
                   
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

