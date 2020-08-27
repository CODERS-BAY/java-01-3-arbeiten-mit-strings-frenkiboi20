public class WorkingStrings {

    public static void main(String[] args) {

        String s = "Hello World!";

        System.out.println("Länge: " + s.length());
        System.out.println("In Gross: " + s.toUpperCase());
        System.out.println("In klein: " + s.toLowerCase());
        String newWord = "Coders Bay";
        s = s.substring(0, 5);
        for (int i=0; i<15; i++) {
            System.out.println(newWord + " " + s);
        }
    }


}
