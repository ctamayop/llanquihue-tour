package cl.llanquihuetour.data;

import cl.llanquihuetour.model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

    /**
     * Gestiona la lectura de datos desde el archivo tours.txt.
     */
    public class GestorDatos {

        private ArrayList<Tour> listaTours;

        /**
         * Constructor de la clase.
         */
        public GestorDatos() {
            listaTours = new ArrayList<Tour>();
        }

        /**
         * Lee el archivo y carga los tours en el ArrayList.
         *
         * @param ruta Ruta del archivo de texto.
         */
        public void cargarDatos(String ruta) {

            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

                String linea;

                while ((linea = br.readLine()) != null) {

                    // Separa la línea usando ;
                    String[] datos = linea.split(";");

                    // Obtiene cada dato
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    // Crea el objeto Tour
                    Tour tour = new Tour(nombre, tipo, precio);

                    // Agrega el objeto al ArrayList
                    listaTours.add(tour);
                }

            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }

            public ArrayList<Tour> getListaTours() {
                return listaTours;
            }
        }