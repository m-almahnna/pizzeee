


public class SaudiPizza implements OriginalPizza {
    public String prepare;
    public int box;
    public int delivery;

    String beefPizza;
    String shrimpPizza;

    public String getBeefPizza() {
        return beefPizza;
    }

    public void setBeefPizza(String beefPizza) {
        this.beefPizza = beefPizza;
    }

    public String getShrimpPizza() {
        return shrimpPizza;
    }

    public void setShrimpPizza(String shrimpPizza) {
        this.shrimpPizza = shrimpPizza;
    }


    public String prepare() {
        return prepare;
    }

    @Override
    public int box() {
        return box;
    }

    @Override
    public int delivery() {
        return delivery;
    }

    public void setPrepare(String prepare) {
        this.prepare = prepare;
    }

    public int getBox() {
        return box;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setBox(int box) {
        this.box = box;
    }




    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "SaudiPizza{" +
                "prepare='" + prepare + '\'' +
                ", box='" + box + '\'' +
                ", delivery='" + delivery + '\'' +
                ", beefPizza='" + beefPizza + '\'' +
                ", shrimpPizza='" + shrimpPizza + '\'' +
                '}';
    }
}
