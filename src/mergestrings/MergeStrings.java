/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergestrings;

/**
 *
 * @author teena
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teena
 */
public class MergeStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This Code calls the mergeString function, passing two string parameters. It will concat \nthe"
                + " two strings into one, alternating between each character.\nFor Example: String a = 'ABC' and "
                + " String b = 'DEF' will concat into String c = 'ADBECF'."); 
        String a = "abcdefghi";
        String b = "jklmnopqrstuvwxyz"; 
        System.out.println("\n\nThe String a = " + a + ". \nThe String b = " + b + " \nThe merge string is " + mergeString(a, b));
    }
    
    static String mergeString(String a, String b){
        String mergeString = ""; 
                for(int x = 0; x<((a.length())+b.length()); x++){
            if(x <  a.length()){ 
                mergeString = mergeString.concat(Character.toString(a.charAt(x))); 
            }
            if(x < b.length()){
                mergeString = mergeString.concat(Character.toString(b.charAt(x))); 
            }
        }
     return mergeString; 
    }  
}

