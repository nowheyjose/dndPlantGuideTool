
//made by nowheyjose 

import java.util.*;

public class PlantFinder {

    private static Random di = new Random();

    private static int d20() {
        return di.nextInt(20) + 1;
    }

    private static int d4() {
        return di.nextInt(4) + 1;
    }

    private static int plantsToGather() {
        int roll = d20();
        if (roll <= 10) {
            return 1;
        } else if (roll >= 11 && roll <= 15) {
            return d4();
        } else if (roll >= 16 && roll <= 18) {
            return d4();
        } else if (roll == 19) {
            return d4() + 2;
        } else {
            // original guide says to roll twice. Modified this for a friend
            return d4() + 4;
        }
    }

    private static void countPlants(String[] plantArray, HashMap<String, Integer> counter) {
        for (String plant : plantArray) {
            counter.put(plant, counter.getOrDefault(plant, 0) + 1);
        }
    }

    private static void print(String[] plantArray) {
        HashMap<String, Integer> freqCounter = new HashMap<String, Integer>();
        countPlants(plantArray, freqCounter);
        for (String plant : freqCounter.keySet()) {
            System.out.println(freqCounter.get(plant) + " " + plant);
        }
        // for (String plant : plantArray) {
        // System.out.println(plant);
        // }
    }

    private static void plantList(String biome) {
        int quantity = plantsToGather();
        String[] plants = new String[quantity];
        Biome bio = new Biome(biome);
        for (int i = 0; i < plants.length; i++) {
            int type = d20();
            plants[i] = bio.getPlant(type);
        }

        print(plants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        Set<String> options = new HashSet<String>() {
            private static final long serialVersionUID = 1L;
            {
                add("arctic");
                add("cave");
                add("desert");
                add("forest");
                add("lake");
                add("river");
                add("ocean");
                add("mountain");
                add("plain");
                add("swamp");
                add("q");
            }
        };
        System.out.println(
                "Enter your current biome\n('arctic', 'cave', 'desert', 'forest', 'lake', 'river', 'ocean', 'mountain', 'plain', 'swamp') \nYou can quit by entering 'q':");
        while (!done) {

            String biome = scanner.nextLine();
            if (!options.contains(biome)) {
                System.out.println("That wasn't an option!");
                continue;
            }
            if (biome.equals("q"))
                break;
            plantList(biome.toLowerCase());
        }
        scanner.close();

    }
}