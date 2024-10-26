package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {
        // This is explaining the spaces
        System.out.println("A Sentence");       // no space
        System.out.println(" A Sentence");      // 1 space
        System.out.println("  A Sentence");     // 2 spaces
        System.out.println("   A Sentence");    // 3 spaces
        System.out.println("    A Sentence");   // 4 spaces

        // Now, I will use tab to do 4 spaces at once --- \t equals to 4 spaces

        System.out.println("\tA Sentence");

        // Lets put 2 tabs
        System.out.println("        A Sentence");
        System.out.println("\t\tA Sentence");

        System.out.println();

        // This is explaining New Line
        System.out.println("1) Unlock the car door");
        System.out.println("2) Get into the car");
        System.out.println("3) Start the car");

        System.out.println();

        System.out.println("1) Unlock the car door\n2) Get into the car\n3) Start the car");

        System.out.println();

        System.out.println("Week Days: \n\tMonday \n\tTuesday \n\tWednesday \n\tThursday \n\tFriday \n\tSaturday \n\tSunday");

    }
}
