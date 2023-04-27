package builder;

public class Main {
    public static void main(String[] args) {
        LunchOrder order = LunchOrder.Builder
                .get().withMeat("Chicken")
                .withDrink("Water")
                .withBread("Protein").build();

    }
}
