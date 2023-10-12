package logica;




import igu.Pantallaa;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Practica2 {
    public static ArrayList<venta> listaVentas;

    public static void main(String[] args) {
        // Cargar los datos guardados previamente
        listaVentas = cargarDatos();

        Pantallaa panta = new Pantallaa();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);

        // Resto del código

        // Guardar los datos al cerrar la aplicación
        panta.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                guardarDatos(listaVentas);
            }
        });
    }

    public static void guardarDatos(ArrayList<venta> lista) {
        try {
            FileOutputStream fileOut = new FileOutputStream("datos_ventas.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(lista);
            out.close();
            fileOut.close();
            System.out.println("Datos de ventas guardados.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<venta> cargarDatos() {
        ArrayList<venta> lista = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("datos_ventas.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            lista = (ArrayList<venta>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Datos de ventas cargados.");
        } catch (IOException | ClassNotFoundException e) {
            // En caso de no poder cargar los datos, se crea una lista vacía
            lista = new ArrayList<>();
        }
        return lista;
    }
    
}