public class PartyAffiliation {
    public static void main(String[] args) {
        String userPartyAffiliation = "D";
        System.out.println("Enter your PartyAffiliation [D/R/I] ");
        String Democrat = "D";
        String Republican = "R";
        String Independent = "I";

        if (userPartyAffiliation == "D") {
            System.out.println("You are a Democrat Donkey");
        } else if (userPartyAffiliation == "R") {
            System.out.println("You are a Republican Elephant");
        } else if (userPartyAffiliation == "I") {
            System.out.println("You are a Independent Man");
        } else {
            System.out.println("Party Affiliation enter is unvalid");
        }
    }
}