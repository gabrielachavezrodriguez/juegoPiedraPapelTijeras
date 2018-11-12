/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijeras;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class PiedraPapelTijeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        String opcion;
        while (!(opcion = JOptionPane.showInputDialog(
                "Seleccione una opcion\n"
                + "1)Piedra\n"
                + "2)Papel\n"
                + "3)Tijeras\n"
                + "0)Salir")).equals("0")) {
            int usuario = Integer.valueOf(opcion);
            int sistema = r.nextInt(3) + 1;
            String mensaje;
            if (usuario == sistema) {
                mensaje = "empate";
            } else if ((usuario == 1 && sistema == 3)
                    || (usuario == 2 && sistema == 1)
                    || (usuario == 3 && sistema == 2)) {
                mensaje = "gana usuario";
            } else {
                mensaje = "gana sistema";
            }
            JOptionPane.showMessageDialog(null,
                    "usuario tira " + convertirTiro(usuario)
                    + "\nsistema tira " + convertirTiro(sistema) + "\n"
                    + mensaje
            );
        }
    }

    public static String convertirTiro(int seleccion) {
        switch (seleccion) {
            case 1:
                return "piedra";
            case 2:
                return "papel";
            case 3:
                return "tijeras";
        }
        return "";
    }
}
