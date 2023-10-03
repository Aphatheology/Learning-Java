package Week2;

import java.util.Arrays;
import java.util.List;

public class ChildClass extends AbstractParent {
    public ChildClass(String name, String lineage, int yob) {
        super(name, lineage, yob);
    }

    @Override
    public void saveDescendants(List<String> descendants) {
        System.out.println(descendants);
    }

    @Override
    public void saveExternalMembers(List<String> members) {
        System.out.println(members);
    }

    public static void main(String[] args) {
        ChildClass mustapha = new ChildClass("Mustapha", "Akanmu", 2005);
        ChildClass adekola = new ChildClass("Adekola", "Opeyemi", 2000);
        ChildClass abdulkareem = new ChildClass("Abdulkareem", "Abefe", 2010);

        int mustaphaGeneration = mustapha.calculateGeneration();
        System.out.println(mustaphaGeneration);

        adekola.saveDescendants(Arrays.asList("Haneefah", "Bushroh", "Sobiyyah"));

        abdulkareem.saveExternalMembers(Arrays.asList("Aliyah", "Bayo"));

        adekola.displayInfo();

    }
}
