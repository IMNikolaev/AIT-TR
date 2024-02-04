package lesson_12;

public class Task_3 {
    public static void main(String[] args) {
        String []strings = {null,"qw","qwe",null,"qwert","qwertz","qwerty"};
        String word = "qw";
        System.out.println(searchInArray(strings,word));
    }
    public static int searchInArray (String [] stArray, String word)
    {
        if (stArray == null) return -1;
        for (int i = 0; i<stArray.length; i++){
            if (stArray[i]!= null && stArray[i].equals(word)){
                return i;
            }
        }
        return -1;
    }
}
