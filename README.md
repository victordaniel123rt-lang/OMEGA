# OMEGA 🎯

Repositorio de ejercicios educativos en Java desarrollados como parte de cursos de programación en la DGTIC y la UAM.

## 📋 Descripción

Este proyecto contiene una colección de ejercicios prácticos de Java que abarcan diferentes conceptos de programación como estructuras de datos, algoritmos y simulaciones de situaciones del mundo real.

## 📁 Estructura del Proyecto

```
OMEGA/
├── EJERCICIOS/
│   └── src/
│       └── main/
│           └── java/
│               └── dgtic/
│                   ├── core/
│                   │   ├── congaDeBingo/
│                   │   │   └── LaCongaDeBingo.java
│                   │   └── UAM/
│                   │       └── FormadosCafeteria.java
│                   └── ...
└── README.md
```

## 🎮 Ejercicios Incluidos

### 1. La Conga de Bingo (`LaCongaDeBingo.java`)

**Ubicación:** `EJERCICIOS/src/main/java/dgtic/core/congaDeBingo/`

**Descripción:**
Programa que implementa una lógica de comparación de secuencias numéricas. Dado un conjunto de arrays con tres elementos cada uno, el programa encuentra secuencias donde cada elemento es mayor al anterior (secuencias estrictamente crecientes).

**Conceptos Utilizados:**
- `Set` y `HashSet` para evitar duplicados
- `List` y `ArrayList` para almacenar datos
- Iteración anidada
- Comparación condicional

**Entrada:**
- Un número `n` indicando cantidad de filas
- `n` líneas con 3 números enteros cada una (a, e, c)

**Salida:**
- Número de secuencias encontradas donde cada triple está estrictamente en orden creciente

---

### 2. Formados Cafetería (`FormadosCafeteria.java`)

**Ubicación:** `EJERCICIOS/src/main/java/dgtic/core/UAM/`

**Descripción:**
Simulador de una cafetería con dos colas de espera: una para alumnos y otra para trabajadores. El programa procesa eventos de llegada y atención, atendiendo primero a trabajadores y luego a alumnos si no hay trabajadores.

**Conceptos Utilizados:**
- `Queue` y `LinkedList` (estructura FIFO)
- Procesamiento de eventos
- Manipulación de strings
- Entrada/salida con `BufferedReader`

**Comandos Soportados:**
- `LLEGA ALUMNO <nombre>` - Agrega un alumno a la cola
- `LLEGA TRABAJADOR <nombre>` - Agrega un trabajador a la cola
- `ATIENDE` - Atiende a la siguiente persona (trabajador o alumno)

**Lógica de Atención:**
1. Si hay trabajadores en cola → atiende trabajador
2. Si no hay trabajadores → atiende alumno
3. Imprime el nombre de la persona atendida

---

## 🛠️ Requisitos

- **Java 8 o superior**
- IDE Java (IntelliJ IDEA, Eclipse, VS Code con extensiones Java, etc.)
- o compilador de línea de comandos `javac`

## 🚀 Cómo Compilar y Ejecutar

### Opción 1: Línea de Comandos

```bash
# Navegar al directorio del proyecto
cd EJERCICIOS

# Compilar
javac src/main/java/dgtic/core/congaDeBingo/LaCongaDeBingo.java
javac src/main/java/dgtic/core/UAM/FormadosCafeteria.java

# Ejecutar
java -cp src/main/java dgtic.core.congaDeBingo.LaCongaDeBingo
java -cp src/main/java dgtic.core.UAM.FormadosCafeteria
```

### Opción 2: IDE Java

1. Abre el proyecto en tu IDE favorito
2. Haz clic derecho en el archivo `.java` deseado
3. Selecciona "Run" o "Ejecutar"

## 📝 Ejemplos de Uso

### LaCongaDeBingo.java

```
Entrada:
4
1 2 3
2 3 4
1 1 1
3 4 5

Salida:
2
```

### FormadosCafeteria.java

```
Entrada:
8
LLEGA ALUMNO Juan
LLEGA TRABAJADOR Maria
LLEGA ALUMNO Pedro
ATIENDE
ATIENDE
ATIENDE
LLEGA TRABAJADOR Luis
ATIENDE

Salida:
Maria
Juan
Pedro
Luis
```

## 📚 Conceptos de Java Cubiertos

- ✅ Estructuras de datos: `List`, `Set`, `Queue`
- ✅ Colecciones: `ArrayList`, `HashSet`, `LinkedList`
- ✅ Entrada/Salida: `Scanner`, `BufferedReader`
- ✅ Algoritmos: iteración, comparación, procesamiento de eventos
- ✅ Manejo de strings: extracción y procesamiento
- ✅ Lógica condicional

## 🎓 Institución

- **DGTIC** - Dirección General de Tecnologías de la Información y Comunicaciones
- **UAM** - Universidad Autónoma Metropolitana

## 📄 Licencia

Este proyecto contiene ejercicios educativos. Úsalos libremente para aprender y enseñar.

## 🤝 Contribuciones

Si encuentras mejoras o tienes sugerencias, siéntete libre de hacer un fork y enviar pull requests.

---

**Última actualización:** 2026-06-22
