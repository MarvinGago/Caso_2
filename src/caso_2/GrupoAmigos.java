/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_2;

/**
 *
 * @author CPUw1010
 */
public class GrupoAmigos {
    String[] amigos;
        double[] saldos;

        GrupoAmigos(String[] amigos) {
            this.amigos = amigos;
            this.saldos = new double[amigos.length];
        }

        void agregarMovimiento(Movimiento movimiento) {
            int indiceDeudor = buscarIndice(movimiento.deudor);
            int indiceAcreedor = buscarIndice(movimiento.acreedor);

            if (indiceDeudor != -1 && indiceAcreedor != -1) {
                saldos[indiceDeudor] -= movimiento.monto;
                saldos[indiceAcreedor] += movimiento.monto;
            }
        }

        double obtenerSaldoAmigo(String amigo) {
            int indiceAmigo = buscarIndice(amigo);
            return (indiceAmigo != -1) ? saldos[indiceAmigo] : 0;
        }

        int buscarIndice(String amigo) {
            for (int i = 0; i < amigos.length; i++) {
                if (amigos[i].equals(amigo)) {
                    return i;
                }
            }
            return -1; // Amigo no encontrado
        }
}
