
public class Biome {
    String environment;
    String[] plantsInBiome;

    public Biome(String currBiome) {
        environment = currBiome;
        this.setBiome();
    }

    public void setBiome() {
        if (environment.equals("arctic")) {
            plantsInBiome = new String[] { "Blue herb", "Drojos Ivy", "Ucre bramble", "White poppy", "Kreet paste",
                    "Angel flower" };
        } else if (environment.equals("cave")) {
            plantsInBiome = new String[] { "Twilight wormwood", "Blue herb", "Mandrake root", "Abyss flower",
                    "Kasuni juice", "Blackleaf Rose" };
        } else if (environment.equals("desert")) {
            plantsInBiome = new String[] { "Drojos ivy", "Ellond scrub", "Ucre bramble", "Dried Ephedra",
                    "Olina petals", "Ebrium fungus" };
        } else if (environment.equals("forest")) {
            plantsInBiome = new String[] { "Twilight wormwood", "Drojos Ivy", "Ellond scrub", "Blood herb",
                    "Thunderleaf", "Wisp stems" };
        } else if (environment.equals("lake") || environment.equals("river") || environment.equals("ocean")) {
            plantsInBiome = new String[] { "Twilight wormwood", "Blue herb", "Mandrake root", "Aniseed sap",
                    "Kreet paste", "Chromatic mud" };
        } else if (environment.equals("mountain")) {
            plantsInBiome = new String[] { "Drojos Ivy", "Ellond scrub", "Mandrake root", "Ash chives", "Kasuni juice",
                    "Dragontongue petals" };
        } else if (environment.equals("plain")) {
            plantsInBiome = new String[] { "Ellond scrub", "Mandrake root", "Ucre bramble", "Aniseed sap",
                    "Lunar nectar", "Dragontongue petals" };
        } else if (environment.equals("swamp")) {
            plantsInBiome = new String[] { "Twilight wormwood", "Blue herb", "Ucre bramble", "Frenn moss",
                    "Ecire laurel", "Spineflower berries" };
        }
    }

    public String getPlant(int plantType) {
        if (plantType <= 5) {
            return plantsInBiome[0];
        } else if (plantType >= 6 && plantType <= 10) {
            return plantsInBiome[1];
        } else if (plantType >= 11 && plantType <= 15) {
            return plantsInBiome[2];
        } else if (plantType >= 16 && plantType <= 18) {
            return plantsInBiome[3];
        } else if (plantType == 19) {
            return plantsInBiome[4];
        } else {
            return plantsInBiome[5];
        }
    }
}