/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacotgenerator;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Bacotgenerator {

    public static void bacotgenerator(String s){
        int i;
        for (i = 0; i < s.length(); i++) {
            char c=s.charAt(i);//diubah ke char
            if(c=='a'||c=='u'||c=='e'||c=='o'){
                c='i';
            }
              String S=String.valueOf(c);
              System.out.print(S);
        } 
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("=====Selamat Datang di Aplikasi Bacot Generator +62==== ");
        System.out.println();
        System.out.println("Aplikasi Ini berungsi Mengubah Vokal A U E O menjadi I semua ");
        System.out.println();
        System.out.print("Masukan Bacotan Netizen : ");
        s=keyboard.nextLine();
        System.out.println("Generate....");
        System.out.println();
        bacotgenerator(s);
        System.out.println();
        System.out.println("=============by owob===============");
    }
    
}
