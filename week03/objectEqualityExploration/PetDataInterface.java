import java.util.Scanner;

public class PetDataInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your pet:");
        String name = sc.nextLine();
        System.out.println("Enter your pet's species:");
        String species = sc.nextLine();
        System.out.println("How old is " + name + ", the " + species + "?");
        int age = sc.nextInt();
        Pet userPet = new Pet(species, name, age);
        String[] description = userPet.getDescription();
        System.out.println(description[0]);
        System.out.println(description[1]);
        System.out.println(description[2]);
        sc.close();
    }
}
