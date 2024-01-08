package Oops;
public class StringBufferMethods {
     public static void main(String [] args){
         StringBuffer sb = new StringBuffer("Dhanush");
         System.out.println(sb);
         sb.append("partha");// to add any number or string
         System.out.println(sb);
         sb.delete(7,13);// to delete a string with starting and ending range
         System.out.println(sb);
         sb.deleteCharAt(6);// to delete specific index
         System.out.println(sb);
         sb.setCharAt(5,'h');// to set a character at specific index, works like replacing
         System.out.println(sb);
     }
}
