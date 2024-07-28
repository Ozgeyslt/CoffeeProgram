public class CoffeeMaker extends  TypesOfCoffee{

    private static Coffee getCoffeeBean;

    public CoffeeMaker(Coffee getCoffeeBean) {
        super(getCoffeeBean);
    }

    @Override
    void latte() {
        IngredientOfCoffee coffeelatte= BuildCoffee.startCoffee("Checked", "Checked")
                .setCream("Checked")
                .setFoam("Checked").build();
        System.out.println("Latte is ready" + coffeelatte.toString());
    }

    @Override
    void mocha() {
        IngredientOfCoffee mocha= BuildCoffee.startCoffee("Checked", "Checked")
                .setMilk("Checked")
                .setFoam("Checked")
                .setSugar("Checked").build();
        System.out.println("Mocha is ready" + mocha.toString());
    }

    @Override
    void cappuccino() {
        IngredientOfCoffee cappuccino=BuildCoffee.startCoffee("Checked", "Checked")
                .setMilk("Checked")
                .setFoam("Checked").build();
        System.out.println("Capppuccino is ready" + cappuccino.toString());
    }

    @Override
    void americano() {
        IngredientOfCoffee americano=BuildCoffee.startCoffee("Checked", "Checked").build();
        System.out.println("Americano is ready" + americano.toString());
    }
}
