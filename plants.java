// # first roll is d20 for number of plants gathered
// # 20 = 1d4 + 4

// # ON PAGE 5
// #example: if 
// # enter biome type, spit out list of plants received from rolls

import java.util.*;

public class PlantFinder {

    private Random die = new Random();

    private int d20() {
        return die.nextInt(20) + 1;
    }

    private int d4() {
        return die.nextInt(4) + 1;
    }

    private int plantsToGather() {
        int roll = d20();
        if(roll <= 10) {
            return 1;
        }
        else if (roll >= 11 && roll <= 15) {
            return d4();
        }
        else if (roll >= 16 && roll <= 18) {
            return d4();
        }
        else if (roll == 19) {
            return d4() + 2;
        }
        else {
            return d4() + 4;
        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your current biome:");

        String biome = scanner.nextLine();
        System.out.println(biome);

    }
}