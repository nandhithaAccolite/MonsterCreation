public class Parent {
    private String eyescolor,fethercolor,ability,weakness;
    private int size,strength,durability,aggression;

    public Parent(String eyescolor, String fethercolor, String ability, String weakness, int size, int strength, int durability, int aggression) {
        this.eyescolor = eyescolor;
        this.fethercolor=fethercolor;
        this.ability=ability;
        this.weakness=weakness;
        this.size=size;
        this.strength=strength;
        this.durability=durability;
        this.aggression=aggression;

    }

    public String getEyescolor() {
        return eyescolor;
    }

    public void setEyescolor(String eyescolor) {
        this.eyescolor = eyescolor;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getFethercolor() {
        return fethercolor;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFethercolor(String fethercolor) {
        this.fethercolor = fethercolor;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }


}
