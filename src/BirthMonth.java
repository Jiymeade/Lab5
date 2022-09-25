public class BirthMonth {
    public static void main(String[] args) {
        int monthinterger = 0;

        System.out.println("What is your birthday month interger?");
        monthinterger = 0;


        if (monthinterger == 1) {
            System.out.println("Your birth month is January ");
        } else if (monthinterger == 2) {
            System.out.println("Your birth month is Feburary");
        } else if (monthinterger == 3) {
            System.out.println("Your birth month is March");
        } else if (monthinterger == 4) {
            System.out.println("Your birth month is April");
        } else if (monthinterger == 5) {
            System.out.println(" Your birth month is May");
        } else if (monthinterger == 6) {
            System.out.println(" Your birth month is June");
        } else if (monthinterger == 7) {
            System.out.println(" Your birth month is July");
        } else if (monthinterger == 8) {
            System.out.println(" Your birth month is August");
        } else if (monthinterger == 9) {
            System.out.println(" Your birth month is September");
        } else if (monthinterger == 10) {
            System.out.println(" Your birth month is October");
        } else if (monthinterger == 11) {
            System.out.println(" Your birth month is November");
        } else if (monthinterger == 12) {
            System.out.println(" Your birth month is December");
        } else if (monthinterger >=0 && monthinterger <= 13) {
            System.out.println("You entered an incorrect month value");
        }
    }
}

