public class Pet {
    String species = "";
    String name = "";
    int age;
    public Pet(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }
    public String[] getDescription() {
        String[] descriptionLines = new String[3];
        descriptionLines[0] = "Pet Species: " + this.species;
        descriptionLines[1] = "Pet Name: " + this.name;
        descriptionLines[2] = "Pet Age: " + this.age;
        return descriptionLines;
    }
}
