package lesson_12;

public class Task_2 {
    public static void main(String[] args) {
        String myString = "storchka";
        int firstIndex =1;
        int lastIndex =3;
        String result = substring(myString,firstIndex);
        System.out.println(result);
            result = substring(myString,firstIndex, lastIndex);
        System.out.println(result);
    }
        public static String substring (String string, int indexFirst){
        if (string == null) return "Null String";
        return substring(string,indexFirst,string.length());
        }
        public static String substring (String string, int indexFirst, int indexLast){
            if (string == null) return "Null String";
            if (indexFirst < 0 || indexLast > string.length() || indexFirst > indexLast) {
                System.out.println("Некорректные индексы.");
                return "";
            }
            StringBuilder result = new StringBuilder();
            for (int i= indexFirst; i< indexLast;i++){
                 result.append(string.charAt(i));
            }
        return result.toString();
    }
        
    }

