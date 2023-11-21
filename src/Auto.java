public class Auto {
    private int ruedas;
    private String color;
    private int motor;
    private int peso;
    public Auto(){
        ruedas = 4;
        color= "blanco";
        motor=1600;
        peso=2000;

    }

    public int getPeso() {
        return peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public String  getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
