# 🛒 [ElectroNova]

> Proyecto final — Java POO · [Curso 1603] · [2026]

## 👥 Integrantes

| Nombre | GitHub |
|--------|--------|
| [Nombre 1] | [@juanka007copy-spec](https://github.com/usuario) |
| [Nombre 2] | [@LuisGJ2007](https://github.com/usuario) |
| [Nombre 3] | [@EmanuelCG123](https://github.com/usuario) |
  [Nombre 4] | [@usuario](https://github.com/usuario) |
---

## 📋 Descripción
ElectroNova es un sistema de tienda virtual desarrollado en Java orientado a la venta de productos electrónicos. El sistema permite la gestión de usuarios, productos, carrito de compras y pedidos, diferenciando roles entre clientes y administradores. Además, implementa control de stock y simulación de procesos reales 
<!-- ¿Qué vende tu ecommerce? ¿Qué lo hace diferente? -->

---

## 🚀 Cómo ejecutar

### Requisitos
- Java JDK 17+
- <!-- IDE, BD, etc. -->

### Pasos
```bash


# 1. Clonar
git clone (https://github.com/Antomaker/competencia.git)

# 2. <!-- instrucciones específicas de su proyecto -->
```
Al iniciar
El programa podemos ver un Menú Principal el cual es parecido a el siguiente
=== BIENVENIDO A ELECTRONOVA ===

=== MENÚ PRINCIPAL ===
1. Iniciar Sesión
2. Registrarse como Cliente
3. Ver Productos
0. Salir

al escoger la opcion 1 o ingresar uno de los dos usuarios de prueba
admin@electronova.com admin123
Clientecliente@electronova.com cliente123

lurgo de hacer lo anterior veremos en pantalla lo siguiente
=== MENÚ ADMINISTRADOR ===
1. Agregar Producto
2. Ver Productos
3. Gestionar Stock
4. Cerrar Sesión

sim embargo este solo aplica si eres admin para cliente sale lo siguiente
=== MENÚ CLIENTE ===
1. Ver Productos
2. Agregar al Carrito
3. Ver Carrito
4. Realizar Pedido
5. Mi Perfil
6. Cerrar Sesión

y para finalizar podemos cerrar secion desde siendo admin o cliente ya dependiendo cual sea la opcion
---

## 🏗️ Tecnologías usadas

| Categoría | Tecnología elegida |
|-----------|-------------------|
| Lenguaje | Java |
| UI / Framework | Swing / javaFX<!-- Swing / JavaFX / Spring Boot / otro --> |
| Persistencia | Archivos <!-- Archivos / SQLite / MySQL / H2 / otro --> |
| IDE | netbeans<!-- NetBeans / IntelliJ / Eclipse --> |

---

## 🧩 Diagrama de clases UML

![Diagrama de clases](docs/uml/diagrama-clases.png)
<img width="1331" height="1314" alt="Diagrama de clase" src="https://github.com/user-attachments/assets/224b81e3-ad9b-41e5-925c-51bc673279a6" />


---

## 📐 Diagrama de casos de uso

![Casos de uso](docs/uml/casos-de-uso.png)
<img width="937" height="1137" alt="Diagrama de uso" src="https://github.com/user-attachments/assets/e5a83ca4-530c-4dae-a775-9a389c884a82" />

---

## 🎯 Funcionalidades implementadas

- [ SI] Gestión de productos
- [ SI ] Gestión de usuarios / clientes
- [ SI] Carrito de compras
- [ SI] Flujo de pedido y pago
- [ SI] Historial de pedidos
- [ SI] Interfaz gráfica o web funcional
- [ SI] Persistencia de datos
- [ ] <!-- opcional: búsqueda, reportes, descuentos... -->

---

## 📐 Conceptos POO aplicados

| Concepto | Clase / método donde se aplica |
|----------|-------------------------------|
| Herencia |Administrador y Cliente heredan de Usuario |Permite reutilizar atributos y métodos de una clase base.
| Encapsulación |Uso de atributos privados y métodos getStock(), getId() getCantidad() en clases como Producto e ItemCarrito|Protege los datos usando atributos privados y acceso mediante getters/setters 
| Polimorfismo |Uso de Usuario usuarioActual permitiendo almacenar objetos Administrador o Cliente |Una variable puede comportarse como distintos tipos de objetos.
| Abstracción |Clase Usuario representando características generales de cualquier usuario |Se representan solo las características importantes del sistema.
| Colecciones |Uso de List<Producto> y List<ItemCarrito> |Se usan listas dinámicas para almacenar objetos.
| Excepciones |Manejo implícito con validaciones como if (p != null) y control de stock; se puede mejorar usando try-catch para Scanner |Aunque no tienes try-catch, ya haces validaciones preventivas

---

## 🖼️ Capturas
<img width="1911" height="1077" alt="image" src="https://github.com/user-attachments/assets/2d71c540-9e40-40b4-8de7-5d2774305098" />
<img width="1913" height="1073" alt="image" src="https://github.com/user-attachments/assets/4d27373b-1bbe-432f-a322-2660b2a271ae" />

<!-- Agrega screenshots en la carpeta assets/ -->
