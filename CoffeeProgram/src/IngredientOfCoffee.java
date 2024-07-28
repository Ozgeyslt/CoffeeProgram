public class IngredientOfCoffee {

    private String hotWater;
    private String espresso;
    private String milk;
    private String cream;
    private String foam;
    private String sugar;
    private static Coffee getCoffeeBean;
    public IngredientOfCoffee(Coffee getCoffeeBean){
        this.getCoffeeBean=getCoffeeBean;
    }

    public IngredientOfCoffee(String hotWater, String espresso, String milk, String cream, String foam, String sugar) {
        this.hotWater = hotWater;
        this.espresso = espresso;
        this.milk = milk;
        this.cream = cream;
        this.foam = foam;
        this.sugar=sugar;
    }

    @Override
    public String toString() {
        return  '\n' +
                "Hot Water=" + hotWater + '\n' +
                "Espresso=" + espresso + '\n' +
                "Milk=" + milk + '\n' +
                "Cream=" + cream + '\n' +
                "Foam=" + foam + '\n' +
                "Sugar=" + sugar + '\n';
    }

    public String getHotWater() {
        return hotWater;
    }

    public void setHotWater(String hotWater) {
        this.hotWater = hotWater;
    }

    public String getEspresso() {
        return espresso;
    }

    public void setEspresso(String espresso) {
        this.espresso = espresso;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getCream() {
        return cream;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

    public String getFoam() {
        return foam;
    }

    public void setFoam(String foam) {
        this.foam = foam;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }
}
