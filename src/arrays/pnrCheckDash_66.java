package arrays;

public class pnrCheckDash_66 {

    public static void main(String[] args) {

        //66.I en array finns ett personnummer. Skapa ett program som kontrollerar att födelsedatum och
        //de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett felmeddelande om så ej är fallet.


        String[] personalNumbers = {"850324-5033", "830613-5033", "6805244032", "920101-5033" };

        for (int i = 0; i < personalNumbers.length; i++) {

            if (personalNumbers[i].charAt(6) != '-') {
                System.out.printf("%n%s%s%s", "Field ", i, " is incorrectly formatted");
            }
        }
    }
}
