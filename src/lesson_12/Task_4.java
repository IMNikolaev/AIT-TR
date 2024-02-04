package lesson_12;

public class Task_4 {
    public static void main(String[] args) {
        String myString = "null" ;
        System.out.println(string23Index(myString));
    }
    public static String string23Index (String str){
        if (str == null) return "Null String";
        if (str.length()>=3){
            char char2= Character.toUpperCase(str.charAt(1));
            char char3= Character.toUpperCase(str.charAt(2));
            return String.valueOf(char2) + char3;
        } else if (str.length()== 2){
            char char2= Character.toUpperCase(str.charAt(1));
            return String.valueOf(char2) + "?";
        } else {
            return "???";
        }
    }
}
