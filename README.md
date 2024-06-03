# Tarea 3 Desarrollo Orientado a Objetos
### Integrantes: 
 - Gabriel Sebastián Castillo Castillo
 - Marcos Emiliano Martínez Rojas

### Diagrama UML:
Tanto las clases JButton[Producto] como las clases Image[Producto] y las clases Boton[numero], solo se especifica una sola clase, ya que el resto de su familia de clases las replica.
Lo único que las diferencia es la imagen que cada clase carga. 
![UML](src/main/resources/ExpendedorUML.png)

### Cambios realizados:
 - Se agregó un producto extra (Alfajor), únicamente con el propósito de que fuera una grilla de productos de 2x3.
 - Se agregó un método en Expendedor para que pueda rellenar sus depósitos.
 - Se creó un enum más sofisticado, él cual además, pueda crear productos. 
 - Se cambió Moneda1500 por Moneda2000, únicamente con el motivo de la imagen de un billete de $2000.
