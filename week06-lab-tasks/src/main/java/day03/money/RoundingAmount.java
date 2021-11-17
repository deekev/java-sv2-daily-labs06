package day03.money;

public class RoundingAmount {

 /* Írj egy metódust, mely paraméterként egy összeget (egész számot) kap,
 és a magyar fizetési kerekítések szerint visszaadja a fizetendő összeget!
 (Tehát: Ha a kapott összeg 1-re vagy 2-re végződik, akkor 0-ra kerekít,
 ha 3-ra, 4-re, 6-ra vagy 7-re, akkor 5-re kerekít, ha pedig 8-ra vagy 9-re,
 akkor 10-re kerekít. Ha 5-re vagy 0-ra végződik az összeg, akkor nincs kerekítés.
  */

    public int getRoundedAmount(int amount) {

        String amountString = String.valueOf(amount);
        int lastIndex = amountString.length() - 1;
        int rounded;
        switch (amountString.substring(lastIndex)) {
            case "1":
            case "6":
                rounded = amount - 1;
                break;
            case "2":
            case "7":
                rounded = amount - 2;
                break;
            case "4":
            case "9":
                rounded = amount + 1;
                break;
            case "3":
            case "8":
                rounded = amount + 2;
                break;
            default:
                rounded = amount;
        }
        return rounded;
    }


    public static void main(String[] args) {

        RoundingAmount roundingAmount = new RoundingAmount();
        System.out.println(roundingAmount.getRoundedAmount(150));
        System.out.println(roundingAmount.getRoundedAmount(151));
        System.out.println(roundingAmount.getRoundedAmount(152));
        System.out.println(roundingAmount.getRoundedAmount(153));
        System.out.println(roundingAmount.getRoundedAmount(154));
        System.out.println(roundingAmount.getRoundedAmount(155));
        System.out.println(roundingAmount.getRoundedAmount(156));
        System.out.println(roundingAmount.getRoundedAmount(157));
        System.out.println(roundingAmount.getRoundedAmount(158));
        System.out.println(roundingAmount.getRoundedAmount(159));
    }
}