![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Formativa 3: Construyendo una lista de objetos desde archivo – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Constanza Alejandra Tamayo Pozo
- **Sección:** 002A
- **Carrera:** Analista programador computacional
- **Sede:** Sede Online

---

## 📘 Descripción general del sistema
LlanquihueTourApp es una aplicación desarrollada en Java que permite leer información de tours turísticos desde un archivo de texto.

Los datos leídos son transformados en objetos de la clase `Tour` y almacenados en una colección `ArrayList`. 
Luego, el sistema muestra todos los tours disponibles y filtra aquellos cuyo precio es mayor a $30.000.


## Conceptos Aplicados
- Programación Orientada a Objetos.
- Encapsulamiento mediante atributos privados.
- Uso de constructores, getters y setters.
- Sobrescritura del método `toString()`.
- Lectura de archivos `.txt`.
- Separación de datos con `split(";")`.
- Uso de colección `ArrayList`.
- Recorrido de colecciones con bucle `for-each`.
- Filtrado de objetos según una condición.
- Organización del proyecto en paquetes.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 llanquihuetourapp/
├── 📁 src/
│   └── 📁 main/
│       ├── 📁 java/
│       │   └── 📁 cl/
│       │       └── 📁 llanquihuetour/
│       │           ├── 📁 data/
│       │           │   └── GestorDatos.java
│       │           ├── 📁 model/
│       │           │   └── Tour.java
│       │           └── 📁 ui/
│       │               └── Main.java
│       └── 📁 resources/
│           └── tours.txt
├── pom.xml
└── README.md

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/ctamayop/llanquihue-tour.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main` desde el paquete `ui`.

4. Observar la salida generada en la consola.


---

**Repositorio GitHub:** \ https://github.com/ctamayop/llanquihue-tour.git
**Fecha de entrega:** \ 15/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa 1






