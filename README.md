# 🧩 Aprendizaje de Programación Orientada a Objetos (POO) - [ADJGC](https://www.linkedin.com/in/adjgc/)

Este repositorio está dedicado a documentar mi aprendizaje y evolución en el paradigma de **Programación Orientada a Objetos**. Aquí centralizo los conceptos teóricos, ejemplos prácticos y ejercicios desarrollados para dominar la estructura de software basada en objetos.

El objetivo es construir una base sólida para el desarrollo de aplicaciones escalables y mantenibles, utilizando lenguajes como **Java**.

---

## 🛠️ Tecnologías y Conceptos
* **Lenguaje Principal:** Java 21
* **Metodología:** Pilares de la POO
* **Herramientas de Diseño:** Diagramas de Clase (PlantUML)
* **Entorno:** Intellij IDEA (JetBrains)

---

## 📖 Contenido

* **Clases:** Modelado de clases en POO.
* **Herencia:** Modelado de relaciones jerarquicas entre clases.
* **Polimorfismo:** Modelado y relación de clases jerarquicas con diferentes comportamientos.
* **Encapsulamiento:** Nivel de acceso a una clase, propiedad o método.
* **Abstracción:** Modelado y relación de métodos que implementan diferentes comportamientos.
* **Excepciones:** Manejo adecuado de excepciones para no interrumpir la apropiada ejecución del programa.
* **Colecciones:** Estrucutras de datos dinámicas. 
* **Threads:** Integración de flujos concurrentes en programación.
* **Siguientes pasos:** 

---

## 🏛️ Los 4 Pilares de la POO
En este repositorio encontrarás implementaciones detalladas de:

1. **Abstracción:** Representación de las características esenciales de un objeto sin incluir detalles de fondo.
2. **Encapsulamiento:** Protección del estado interno de un objeto mediante el uso de modificadores de acceso (`private`, `public`, `protected`).
3. **Herencia:** Creación de nuevas clases basadas en clases existentes para reutilizar código y jerarquizar.
4. **Polimorfismo:** Capacidad de un objeto para tomar múltiples formas, principalmente a través de la sobreescritura de métodos.

---

## ⚒️ Ejercicios y Prácticas

### 1. Modelado y diseño de clases en POO (`📂 src/clases/conceptosbasicos`)
Explicación de los componentes mínimos necesarios para la creación de una clase.

#### ✅ Actividades
- [x] Definir los atributos de una clase.
- [ ] Implementar los `constructores` básicos de una clase.
- [ ] Implementar los métodos `Getters` y `Setters`.

---

### 2. Herencia entre clases (`📂 src/clases/herencia`)
Explicación de herencia, relaciones jerarquicas y palabras reservadas `extends` y `super`.

#### ✅ Actividades
- [x] Deinifir los atributos de una Persona, Trabajador, Academico, Administrativo, en el entorno de la UAM.
- [ ] Crear las relaciones jerarquicas: Persona -> Trabajador -> Academico/Administrativo.
- [ ] Jugar con las nuevas relaciones creadas y observar el comportamiento de las clases.

---

### 3. Polimorfismo (`📂 src/clases/polimorfismo`)
Ejemplificación del polimorfismo.

#### ✅ Actividades
- [x] Deinifir los atributos de una Persona, Trabajador, Academico, Administrativo, en el entorno de la UAM.
- [x] Crear las relaciones jerarquicas: Persona -> Trabajador -> Academico/Administrativo.
- [ ] Crear un vector de personas (longitud 5).
- [ ] Instanciar diferentes tipos de personas sobre el vector.
- [ ] Instanciar una cadena en el ultimo espacio del vector.

---

### 4. Clases abstractas (`📂 src/clases/clasesabstractas`)

#### ✅ Actividades
- [x] Definir una clase abstracta Figura con un método abstracto para calcular el área de la figura.
- [ ] Crear 2 figuras geométricas distintas que hereden e implementen los métodos abstractos de Figura.
- [ ] Instanciar y observar el comportamiento de la implementación del método abstracto.

---

### 5. Sobre-escritura de métodos (`📂 src/clases/sobreescritura`)
Uso de palabra reservada `@override` para la sobre-escritura de métodos.

#### ✅ Actividades
- [x] Definir una clase abstracta de Animal, con al menos un método abstracto.
- [x] Crear una clase Gato y una clase Perro que hereden de Animal e implementen sus métodos abstractos.
- [ ] Instanciar y observar el compartamiento de estas nuevas clases.

---

### 6. Sobrecarga de métodos (`📂 src/clases/sobrecarga`)
Implementación de múltiples métodos con el mismo nombre, pero variando la cantidad y/o tipo de dato de los parámetros que recibe.

#### ✅ Actividades
- [x] Definir una clase Animal, con al menos 3 métodos sobrecargados.
- [x] Realizar diferentes implementaciones del mismo método.
- [ ] Instanciar y observar el compartamiento de la sobrecarga.

---

### 7. Encapsulamiento (`📂 src/clases/encapsulamiento`)
Definir diferentes niveles de acceso para atributos y métodos de una clase.

#### ✅ Actividades
- [x] Definir una clase Alumno con todos sus atributos privados.
- [ ] Jugar con los modificadores de acceso de los metodos de Alumno.

---

### 8. Interfaces (`📂 src/clases/interfaces`)
Modelar el comportamiento de diferentes formas geométricas.

#### ✅ Actividades
- [x] Modelar comportamientos independientes de figuras geométricas.
- [ ] Implementar los comportamientos particulas de un Círculo y un Cuadrado.
- [ ] Observar el comportamiento y comprar con el uso de clases abstractas.

---

### 9. Ejercicio integrador: Pókemon ⚪⚡🔴 (`📂 src/ejercicios/pokemon`)
Modelar el comportamiento de diferentes formas geométricas.

#### ✅ Actividades
- [x] Definir los atributos y ataques generales de un Pókemon.
- [x] Definir al menos 3 ataques de pokemones tipo: Agua, Electrico, Fuego, Planta.
- [ ] Implementar los atauqes particulares y especiales (de acuerdo al tipo) para un pokemon de cada tipo definido en el punto anterior.
- [ ] Implementar una clase principal donde se observen los comportamientos de cada pokemon creado.
- [ ] Se sugieren los pokemons Squirtle, Pikachu, Charmander, Bulbasaur y descripciones de ataques como `Pikachu ha usado: Placaje`
- [ ] **Plus: Definir una organización de directorios para mayor entendimiento de la solución.**

---

### 10. Colecciones (`📂 src/clases/colecciones`)
Mostrar los tipos de colecciones más empleados en POO, sus diferencias y casos de uso.

#### ✅ Actividades
- [x] Definir una clase Persona.
- [ ] Declarar un ArrayList de personas y jugar con sus métodos (agregar, modificar, obtener, borrar).
- [ ] Declarar un LinkedList de personas y jugar con sus métodos (agregar, modificar, obtener, borrar, obtener primero, obtener último).
- [ ] Declarar un Stack de personas y jugar con sus métodos (agregar, modificar, obtener, borrar).
- [ ] Declarar un HashMap de personas y jugar con sus métodos (agregar, modificar, obtener).

---

### 11. Relaciones entre clases (`📂 src/clases/relaciones`)
Demuestra los tipos de relaciones (1 a 1, 1 a N, N a N) entre clases como se haría en bases de datos.

#### ✅ Actividades
- [x] Definir clase Propietario y clase Auto con una relación 1 a N, **un Auto puede tener mucho propietarios**.
- [ ] Instanciar un objeto de la clase Auto y agregar todos sus atributos, incluir al menos 2 propietarios.
- [ ] Jugar con el objeto creado, modificar, borrar, recorrer, etc.

---

### 12. Manejo de excepciones (`📂 src/clases/excepciones`)
Ejemplifica el manejo de excepciones en Java, bloques `try, catch, finally`.

#### ✅ Actividades
- [ ] Provocar diferentes excepciones en Java e implementar su correcto manejo.

---

### 13. Ejercicio integrador: Videojuegos 🎮🌟🕹️ (`📂 src/ejercicios/videojuegos`)
Desarrollar un ejercicio para repasar de manera conjunta lo visto en este curso hasta este momento.

#### ✅ Actividades
- [x] Crear una lista de al menos 5 videojuegos de diferentes consolas.
- [ ] Para cada videojuego, mostrar en pantalla el nombre y la cantidad de jugadores que soporta.
- [ ] Cambiar los datos de 2 videojuegos y mostrar los datos de toda la coleccion.
- [ ] Agregar nuevos juegos a la coleccion.
- [ ] De los videojuegos en la lista, mostrar solamente los que sean para Nintendo 64.

---

### 14. Conversiones o Cast (`📂 src/clases/conversiones`)
Demostrar las formas posibles de convertir entre tipos de datos.

#### ✅ Actividades
- [x] Declarar variables de tipo de dato primitivo (int, double, long, etc).
- [ ] Convertir de double a int y mostrar el resultado.
- [ ] Convertir de double a long y mostrar el resultado.
- [ ] Declarar vairbales de tipo de dato compuesto/objeto (String, Integer, Double).
- [ ] Realizar conversiones entre estos tipos de datos bajo sus métodos de clase.

---

### 15. Enums (`📂 src/clases/enums`)
Uso de enum como clase de contenido **constantes**.

#### ✅ Actividades
- [x] Crear un enum de algunos colores constantes.
- [ ] Revisar las diferentes funciones que posee enum.

---

### 16. Generic (`📂 src/clases/generics`)
Creación de clases con tipos de datos genéricos.

#### ✅ Actividades
- [x] Modelar una clase que pueda recibir en sus atributos un elemento de cualquier tipo de dato.
- [ ] Instanciar al menos 2 objetos de la clase genérica creada.
- [ ] Asignar y recuperar diferentes tipos de datos sobre el atributo de la clase genérica.

---

### 17. Ejercicio integrador: Flora 🌻🌲☘️ (`📂 src/ejercicios/flora`)
Desarrollo de ejercicio integrando temas vistos en este curso.

#### ✅ Actividades
- [x] Modelar una clase Planta con sus atributos, constructores y métodos básicos.
- [ ] Crear las siguientes clases hijas de Planta: Árbol, Flor, Arbusto.
- [ ] Definir un método para cada clase hija del mismo nombre con implementación diferente.
- [ ] Dentro de la clase principal, jugar con los modificadores de acceso.

---

### 18. Threads (`📂 src/clases/threads`)
Explicación de programación concurrente con hilos.

#### ✅ Actividades
- [x] Crear un objeto de hijo de thread.
- [x] Crear un objeto que implemente la interface runnable.
- [ ] Entender las diferentes entre un hilo y un runnable.

---

## 🚀 Próximamente...

> [!NOTE]
> A medida que avance en el curso, estaré integrando temas avanzados como:

* **Clases Abstractas vs Interfaces:** Cuándo y por qué usar cada una.
* **Relaciones entre Clases:** Asociación, Agregación y Composición.
* **Manejo de Excepciones:** Manejo de errores en un flujo de trabajo.
* **Coleciones:** Estructuras de datos especiales como listas y conjuntos.
* **HashMap:** Mapeo de objetos con HashMap (JSON).
* **Enum:** Definición de colecciones de constantes.
* **Threads:** Programación concurrente.

---

**Desarrollado con 🤍 por:** [ADJGC](https://www.linkedin.com/in/adjgc/)