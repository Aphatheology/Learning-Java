package Week2;

import java.util.List;

public abstract class AbstractParent {
    private final String name;
    private final String lineage;
    private final int yob;
    private final int FAMILY_START_YEAR = 1950;
    private final int GENERATION_DIVIDER = 25;

    public AbstractParent(String name, String lineage, int yob) {
        this.name = name;
        this.lineage = lineage;
        this.yob = yob;
    }

    public abstract void saveDescendants(List<String> descendants);
    public abstract void saveExternalMembers(List<String> members);

    public int calculateGeneration() {
        return (this.yob - FAMILY_START_YEAR) / GENERATION_DIVIDER;
    };

    public void displayInfo() {
        System.out.println("I am " + this.name + ", my lineage is " + this.lineage);
    }
}
