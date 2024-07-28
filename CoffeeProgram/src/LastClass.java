public class LastClass {

    public static void main(String[] args) {
        Coffee coffee=Coffee.getCoffeeBean();
        coffee.coffeeMessage();
        System.out.println("*******************************");

        Coffee coffeeLast=Coffee.getCoffeeBean();
        System.out.println(coffee.equals(coffeeLast));
        System.out.println("*******************************");
        IngredientOfCoffee latte=BuildCoffee.startCoffee("Checked", "Checked")
                .setCream("Checked").build();
        System.out.println(latte);
        System.out.println("*******************************");

        CoffeeMaker coffeeMaker=new CoffeeMaker(Coffee.getCoffeeBean());
        coffeeMaker.latte();
        coffeeMaker.mocha();
        coffeeMaker.cappuccino();
        coffeeMaker.americano();
    }
}
