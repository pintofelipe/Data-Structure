
package com.coco77.hospital;

import java.io.*;
import java.util.*;

public class Hospital {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

    public static void main(String[] args) {
        // Ajusta la ruta según tu sistema
        String rutaArchivo = "C:\\Users\\57312\\Downloads\\Data-Structure\\ExamenFinal\\Hospital\\target\\classes\\com\\coco77\\hospital\\usuarios.txt"; 
        cargarDatosDesdeArchivo(rutaArchivo);
        mostrarUsuarios();
        imprimirArbol();
    }

    private static void cargarDatosDesdeArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            System.out.println("El archivo " + nombreArchivo + " no existe.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Usuario usuario = new Usuario(
                        datos[0], // Documento
                        datos[1], // Tipo de Cliente
                        datos[2], // Nombre
                        datos[3], // Correo
                        datos[4], // Teléfono
                        Integer.parseInt(datos[5]), // Edad
                        Integer.parseInt(datos[6]) // Estrato
                );
                usuarios.add(usuario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error al parsear un número: " + e.getMessage());
        }
    }

    private static void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Documento: " + usuario.documento);
            System.out.println("Tipo Cliente: " + usuario.tipoCliente);
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Correo: " + usuario.correo);
            System.out.println("Teléfono: " + usuario.telefono);
            System.out.println("Edad: " + usuario.edad);
            System.out.println("Estrato: " + usuario.estrato);
            System.out.println("-----------------------");
        }
    }
    
    
     private static void imprimirArbol() {
        System.out.println("Árbol binario ordenado por edad (de mayor a menor):");
        abb.imprimirArbolDescendente();
    }
}
