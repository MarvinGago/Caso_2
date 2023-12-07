/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_2;

import javax.swing.JOptionPane;

public class Caso_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Definir el grupo de amigos
        String[] amigos = {"Guillermo", "Tavo", "David", "Greivin", "Joshua", "Andres"};

        // Inicializar el grupo de amigos
        GrupoAmigos grupo = new GrupoAmigos(amigos);

        // Definir los movimientos
        Movimiento[] movimientos = {
            new Movimiento("Tavo", "Guillermo", 5,"Cuenta 1","Cafe","Joshua","David",150,"Dolar"),
            new Movimiento("David", "Guillermo", 20,"Cuenta 1","Cafe","Joshua","David",150,"Dolar"),
            new Movimiento("Greivin", "Guillermo", -115,"Cuenta 1","Cafe","Joshua","David",150,"Dolar"),
            new Movimiento("Joshua", "Guillermo", 60,"Cuenta 1","Cafe","Joshua","David",150,"Dolar"),
            new Movimiento("Andres", "Guillermo", 60,"Cuenta 1","Cafe","Joshua","David",150,"Dolar")
        };

        // Menú principal
        int opcion;
        do {
            String[] opciones = {"Agregar Nuevo Movimiento", "Ver Saldo por Persona", "Salir"};
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Gastos de Amigos App",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 0:
                    // Agregar Movimiento
                    String deudor = JOptionPane.showInputDialog("Ingrese el nombre del deudor:");
                    String acreedor = JOptionPane.showInputDialog("Ingrese el nombre del acreedor:");
                    double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto gastado:"));
                    String cuenta = JOptionPane.showInputDialog("Cuenta #:");
                    String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion de la compra:");
                    String participantes = JOptionPane.showInputDialog("Ingrese el nombre del participante:");
                    String quienpago = JOptionPane.showInputDialog("Ingrese el nombre de quien pago:");
                    double montoTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto Total:"));
                    String tipoMoneda = JOptionPane.showInputDialog("Ingrese el tipo de moneda:");
                    

                    Movimiento nuevoMovimiento = new Movimiento(deudor, acreedor, monto,cuenta,descripcion,participantes,quienpago,montoTotal,tipoMoneda);
                    grupo.agregarMovimiento(nuevoMovimiento);
                    JOptionPane.showMessageDialog(null, "Movimiento agregado correctamente.");
                    break;

                case 1:
                    // Ver Saldo de Amigo
                    String amigoConsulta = JOptionPane.showInputDialog("Ingrese el nombre del amigo para consultar el saldo:");
                    double saldo = grupo.obtenerSaldoAmigo(amigoConsulta);
                    JOptionPane.showMessageDialog(null, "El saldo total que le deben a " + amigoConsulta + " es: " + saldo + " dólares.");
                    break;

                case 2:
                    // Salir
                    JOptionPane.showMessageDialog(null, "Saliendo de la aplicación.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (opcion != 2); // 2 es la opción para salir
    
    }
    }
    

