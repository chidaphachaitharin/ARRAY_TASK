public class Main {
    public static void main(String[] args) {
        int[] tab1 = {3, 2, -2, 5, -3};
        int[] tab2 = {1, 1, 2, -1, 2, -1};
        int[] tab3 = {1, 2, 3, -4};
        int[] tab4 = {1, 1};

        alltab(tab1);
        alltab(tab2);
        alltab(tab3);
        alltab(tab4);
    }

    public static void alltab(int[] tab) {
        int maxOppositeSum = Integer.MIN_VALUE;
        int max = 0;

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == -tab[j]) { // Check if the current pair is opposite
                    int oppositeSum = Math.abs(tab[i]) + Math.abs(tab[j]);
                    if (oppositeSum > maxOppositeSum) {
                        maxOppositeSum = oppositeSum; // Update if a higher opposite pair is found
                        max = tab[i];
                    }
                }
            }
        }

        if (maxOppositeSum == Integer.MIN_VALUE) {
            System.out.println("For the array: " + java.util.Arrays.toString(tab));
            System.out.println("Information: Cannot find a pair of opposite values.");
        }
        else {
            System.out.println("For the array: " + java.util.Arrays.toString(tab));
            System.out.println("The highest opposite pair is: " + max + " and |" + -max + "|");
        }
    }
}





