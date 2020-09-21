

public class ItalianPizza implements OriginalPizza {
    public String prepare;
    public int box;
    public int delivery;

    String margareta;
    String mazerla;

    public String getMargareta() {
        return margareta;
    }

    public void setMargareta(String margareta) {
        this.margareta = margareta;
    }

    public String getMazerla() {
        return mazerla;
    }

    public void setMazerla(String mazerla) {
        this.mazerla = mazerla;
    }


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
}
