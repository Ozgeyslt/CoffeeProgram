abstract class TypesOfCoffee {

    private static Coffee getCoffeeBean;

    public TypesOfCoffee (Coffee getCoffeeBean){
        this.getCoffeeBean=getCoffeeBean;
    }

    abstract void latte();
    abstract void mocha();
    abstract void cappuccino();
    abstract void americano();
}
