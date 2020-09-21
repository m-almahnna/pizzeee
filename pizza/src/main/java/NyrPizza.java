


public class NyrPizza implements OriginalPizza {
     String prepare;
     int box;
     int delivery;


    String cheese;
    String chicken;


    public String prepare() {
        return prepare;
    }

    public void setPrepare(String prepare) {
        this.prepare = prepare;
    }

    public int box() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public int delivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }
}
