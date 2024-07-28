public class Coffee {

    private static Coffee coffeeBean;

    private Coffee(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void coffeeMessage(){
        System.out.println("Coffee class is working");
    }

    public static Coffee getCoffeeBean(){
        if (coffeeBean==null){
            synchronized (Coffee.class) {
                if (coffeeBean == null) {
                    coffeeBean = new Coffee();
                }
            }
        }
        return coffeeBean;
    }
}
