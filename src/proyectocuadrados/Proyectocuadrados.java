package proyectocuadrados;
 
import javax.swing.JOptionPane;
 
public class Proyectocuadrados {
 
    public static void main(String[] args) {
        int n, cont, impar, sumaimpares, cuadrado;
        String resultado = "Número Suma Cuadrado\n";
        resultado = resultado ;
 
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N"));
 
        for (cont = 1; cont <= n; cont++) {
            sumaimpares = 0;
            String suma_str = "";
 
            for (int i = 1; i <= cont; i++) {
                impar = (2 * i) - 1;
                sumaimpares = sumaimpares + impar;
 
                if (i == cont) {
                    suma_str = suma_str + impar;
                } else {
                    suma_str = suma_str + impar + "+";
                }
            }
 
            cuadrado = sumaimpares;
            resultado = resultado  + cont + ".   " + suma_str + "  = " + cuadrado + "\n";
        }
 
        JOptionPane.showMessageDialog(null, resultado);
    }
}
