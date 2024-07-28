public class BuildCoffee {

    private String hotWater;
    private String espresso;
    private String milk;
    private String cream;
    private String foam;
    private String sugar;
    private static Coffee getCoffeeBean;
    public BuildCoffee(Coffee getCoffeeBean){
        this.getCoffeeBean=getCoffeeBean;
    }

    public BuildCoffee(String hotWater, String espresso, String milk, String cream, String foam, String sugar) {
        this.hotWater = hotWater;
        this.espresso = espresso;
        this.milk = milk;
        this.cream = cream;
        this.foam = foam;
        this.sugar = sugar;
    }

    public static BuildCoffee startCoffee(String hotWater, String espresso){
        BuildCoffee buildCoffee=new BuildCoffee(getCoffeeBean);
        buildCoffee.hotWater=hotWater;
        buildCoffee.espresso=espresso;
        return buildCoffee;
    }

    public IngredientOfCoffee build(){
        IngredientOfCoffee types=new IngredientOfCoffee(getCoffeeBean);
        types.setEspresso(espresso);
        types.setMilk(milk);
        types.setHotWater(hotWater);
        types.setCream(cream);
        types.setFoam(foam);
        types.setSugar(sugar);
        return types;
    }

    public BuildCoffee setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public BuildCoffee setCream(String cream) {
        this.cream = cream;
        return this;
    }

    public BuildCoffee setFoam(String foam) {
        this.foam = foam;
        return this;
    }

    public BuildCoffee setSugar(String sugar) {
        this.sugar = sugar;
        return this;
    }
}
