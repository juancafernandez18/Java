import javax.swing.*;

public class UsoAuto {
    public static void main(String[] args) {

        Auto renault = new Auto();
        renault.setColor(JOptionPane.showInputDialog("Ingrese el color del auto"));

        System.out.println("El color del auto es:" +renault.getColor());

        renault.setRuedas(4);
        System.out.println("El nuemro de ruedas del auto es: "+ renault.getRuedas());

        Furgoneta furgo = new Furgoneta(7,500);
        furgo.setColor("verde");
        System.out.println("La capacidad de la furgoneta es :" +furgo.getCapacidadCarga());
        System.out.println("El color de la furgo es :" +furgo.getColor());
        System.out.println("La cantidad de ruedas de la furgo es :" +furgo.getRuedas());


    }
}
