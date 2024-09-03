package labTest;

/*
* Implement the missing Lotus class so that when we run the code above it will print:

Vine is a plant
Lotus:Vanity has 1024 leaves  and it is not spreading smell
Lotus:Pride has 2048 leaves  and it is spreading smell
There are 3 plants.
Lotus:Loathing has 1024 leaves
There are 3 Lotus plants.

  Note: Lotus must implement Smell interface
* */
public class Main {
    public static void main(String[] args) {
        Plant[] garden = new Plant[3];
        garden[0] = new Plant("Vine");
        garden[1] = new Lotus("Vanity");
        Lotus l = new Lotus("Pride", 2048);
        l.smellOn(); // will change a instantiate bool value
        garden[2] = l;

        for (Plant p : garden) {
            System.out.println(p);
        }

        System.out.println(STR."There are \{Plant.getNumPlants()} plants."); // There are 3 plants.

        Lotus r = new Lotus("Loathing"); //
        System.out.println(r.getName()); // Lotus:Loathing has 1024 leaves
        System.out.println(STR."There are \{Lotus.getNumLotuses()} Lotus plants."); // There are 3 Lotus plants.
        // static LOTUS e
    }
}


