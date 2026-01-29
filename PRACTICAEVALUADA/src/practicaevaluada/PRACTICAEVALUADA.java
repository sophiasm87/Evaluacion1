/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada;

import javax.swing.JOptionPane;

/**
 *
 * @author sophi
 */
public class PRACTICAEVALUADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArticulo;
        String categoria;
        double valorCIF;
        double iva;
        double arancel;
        double almacen;
        double total;
        double variableMuestra;

        nombreArticulo = JOptionPane.showInputDialog("Ingrese el nombre del artículo");
        categoria = JOptionPane.showInputDialog("Ingrese el código de categoría");
        valorCIF = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor CIF del paquete"));

        iva = valorCIF * 0.13;
        arancel = 0;
        almacen = 0;

        if (categoria.compareTo("TEC") == 0) {
            arancel = valorCIF * 0.05;
        } else {
            if (categoria.compareTo("tec") == 0) {
                arancel = valorCIF * 0.05;
            } else {
                if (categoria.compareTo("ROP") == 0) {
                    arancel = valorCIF * 0.15;
                } else {
                    if (categoria.compareTo("rop") == 0) {
                        arancel = valorCIF * 0.15;
                    } else {
                        if (categoria.compareTo("HOG") == 0) {
                            arancel = valorCIF * 0.10;
                        } else {
                            if (categoria.compareTo("hog") == 0) {

                            }
                            arancel = valorCIF * 0.10;
                            if (valorCIF >= 500) {
                                almacen = 20;
                            } else {
                                almacen = 0;
                            }
                            JOptionPane.showInputDialog("ingrese la categoria");
                            JOptionPane.showMessageDialog(null, "EL NOMBRE DEL ARTUCILO ES:  " + nombreArticulo
                                    + "El vaor cif es:" + valorCIF + "La categoria es: " + categoria);

                        }

                    }
                }
            }
        }
    }
}
