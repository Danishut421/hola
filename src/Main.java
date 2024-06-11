
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nombre;

        String respuesta = JOptionPane.showInputDialog(null, "Desea ingresar un nombre\n" + "1.- Si\n" + "2.-No");

        if (respuesta.equalsIgnoreCase("Si")) {
            nombre = JOptionPane.showInputDialog(null, "Favor de ingresar nombre");
            JOptionPane.showMessageDialog(null, "El nombre ingresado es: " + nombre);
            JOptionPane.showMessageDialog(null, "Muy bien " + nombre + " que le vaya bien!");

        } else {
            if (respuesta.equalsIgnoreCase("No")) {
                JOptionPane.showMessageDialog(null, "muy bien, que le vaya bien!");
            }

        }

    }

}
