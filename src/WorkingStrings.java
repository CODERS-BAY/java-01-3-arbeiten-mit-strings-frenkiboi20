public class WorkingStrings {

    public static void main(String[] args) {

        String s = " Hello World!    ";

        System.out.println(s);
        System.out.println("Länge: " + s.length());
        System.out.println("In gross: " + s.toUpperCase());
        System.out.println("In klein: " + s.toLowerCase());

        String newWord = s.substring(1, 7) + "Coders Bay";
        System.out.println(newWord);

        System.out.println(s.replaceFirst(" ", ""));
        System.out.println(s.repeat(15));

    }


}
