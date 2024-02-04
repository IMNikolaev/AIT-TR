package lesson_12;

public class Task_0 {

        public static void main(String[] args) {
            String input = "asdadsa12цку";
            String result =  toUpperCase(input);
            System.out.println(result);
        }

       public static String toUpperCase(String input) {
            char[] charArray = input.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char currentChar = charArray[i];
                if (isLatin(currentChar)) {
                    charArray[i] = (char)(currentChar - 'a' + 'A');
                }
            }

            return new String(charArray);
        }
        public static boolean isLatin (char a){
            return (a>= 'a' && a<='z');
        }
}
