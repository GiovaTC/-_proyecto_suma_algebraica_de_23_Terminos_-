# -_proyecto_suma_algebraica_de_23_Terminos_- :.
# ➕ Proyecto Java 21 + IntelliJ IDEA + Consola + MySQL 8 + JDBC:

<img width="1254" height="1254" alt="image" src="https://github.com/user-attachments/assets/510a5a50-ba4e-46c2-82ca-15a5d4269fc5" />  

```

# Suma Algebraica de 23 Términos

Aplicación desarrollada en **Java 21** que permite ingresar **23 términos algebraicos (positivos y negativos)**, calcular la **suma algebraica**, almacenar la operación en **MySQL 8** mediante **JDBC** y consultar el historial de operaciones.

---

# Objetivo

Desarrollar una aplicación de consola que permita:

- Solicitar **23 términos algebraicos**.
- Calcular la **suma algebraica**.
- Mostrar el resultado en pantalla.
- Guardar la operación en **MySQL**.
- Consultar el historial de operaciones almacenadas.

---

# Tecnologías utilizadas

- Java 21
- IntelliJ IDEA
- MySQL 8
- JDBC
- Programación Orientada a Objetos (POO)

---

# Estructura del proyecto

```text
SumaAlgebraica23Terminos/
│
├── src/
│
├── config/
│   └── ConexionBD.java
│
├── modelo/
│   └── Termino.java
│
├── dao/
│   └── SumaDAO.java
│
├── servicio/
│   └── CalculadoraAlgebraica.java
│
├── vista/
│   └── EntradaDatos.java
│
└── Main.java
```

---

# Base de Datos

## Crear la Base de Datos

```sql
CREATE DATABASE suma_algebraica_db;
USE suma_algebraica_db;
```

---

## Crear la Tabla

```sql
CREATE TABLE operaciones (

    id INT AUTO_INCREMENT PRIMARY KEY,

    termino1 DOUBLE,
    termino2 DOUBLE,
    termino3 DOUBLE,
    termino4 DOUBLE,
    termino5 DOUBLE,
    termino6 DOUBLE,
    termino7 DOUBLE,
    termino8 DOUBLE,
    termino9 DOUBLE,
    termino10 DOUBLE,
    termino11 DOUBLE,
    termino12 DOUBLE,
    termino13 DOUBLE,
    termino14 DOUBLE,
    termino15 DOUBLE,
    termino16 DOUBLE,
    termino17 DOUBLE,
    termino18 DOUBLE,
    termino19 DOUBLE,
    termino20 DOUBLE,
    termino21 DOUBLE,
    termino22 DOUBLE,
    termino23 DOUBLE,

    resultado DOUBLE,

    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);
```

---

# Funcionamiento del Programa

```text
==============================
 SUMA ALGEBRAICA DE 23 TÉRMINOS
==============================

Ingrese término 1:
15

Ingrese término 2:
-6

Ingrese término 3:
8

...

Ingrese término 23:
-2

Resultado = 47

Información almacenada correctamente.
```

---

# Fórmula Matemática

```text
Resultado =
T1 + T2 + T3 + ... + T23
```

Los términos pueden ser:

- Positivos (+)
- Negativos (-)

---

# Ejemplo

## Entrada

```text
12
-5
10
-7
8
-3
6
-2
9
1
4
-8
11
-1
5
7
-4
3
2
-6
10
-9
4
```

## Salida

```text
Resultado = 42
```

---

# Clases del Proyecto

## ConexionBD.java

### Responsabilidades

- Abrir conexión con MySQL.
- Cerrar conexión.
- Ejecutar instrucciones **INSERT**.
- Ejecutar consultas **SELECT**.

---

## Termino.java

### Modelo de Datos

Contiene:

- 23 atributos `double`.
- Resultado de la operación.
- Fecha del registro.

---

## CalculadoraAlgebraica.java

### Responsabilidades

- Recibir los 23 términos.
- Calcular la suma algebraica.

### Método principal

```java
double calcular(double[] numeros)
```

---

## EntradaDatos.java

### Responsabilidades

- Leer datos desde consola.
- Validar números ingresados.
- Mostrar el resultado.

---

## SumaDAO.java

### Responsabilidades

- Guardar la operación en MySQL.
- Consultar el historial.

---

## Main.java

### Flujo Principal

```text
Conectar a la Base de Datos
           │
           ▼
Ingresar 23 términos
           │
           ▼
Calcular la suma
           │
           ▼
Mostrar resultado
           │
           ▼
Guardar en MySQL
           │
           ▼
Consultar historial
           │
           ▼
Fin
```

---

# Ejemplo Completo

## Entrada

```text
10
-5
3
8
-2
6
7
-1
4
5
-3
9
2
-8
11
-4
13
-6
1
12
-7
14
-10
```

## Salida

```text
La suma algebraica es:

59
```

---

# Conceptos de Java que se practican

- Variables
- Tipos de datos
- Arreglos (`double[]`)
- Ciclos `for`
- Métodos
- Clases
- Objetos
- Encapsulamiento
- Programación Orientada a Objetos (POO)
- JDBC
- MySQL
- Manejo de excepciones (`try-catch`)
- Entrada por teclado (`Scanner`)
- DAO (Data Access Object)

---

# Ventajas del Proyecto

- Fácil de comprender.
- Excelente práctica de JDBC.
- Introduce el patrón DAO.
- Refuerza el uso de arreglos.
- Practica el manejo de datos positivos y negativos.
- Almacena información en una base de datos relacional.
- Escalable para operaciones matemáticas más complejas.

---

# Archivos del Proyecto

```text
📁 SumaAlgebraica23Terminos

├── 📁 config
│   └── ConexionBD.java
│
├── 📁 modelo
│   └── Termino.java
│
├── 📁 dao
│   └── SumaDAO.java
│
├── 📁 servicio
│   └── CalculadoraAlgebraica.java
│
├── 📁 vista
│   └── EntradaDatos.java
│
├── Main.java
│
├── README.md
│
└── ScriptSQL.sql
```

---

# Script SQL incluido

El proyecto puede incluir un archivo:

```text
ScriptSQL.sql
```

con:

- Creación de la base de datos.
- Creación de la tabla.
- Inserciones de prueba.
- Consultas de ejemplo.

---

# Datos de Prueba (INSERT)

Se pueden generar sentencias `INSERT` para probar rápidamente el funcionamiento del proyecto.

Ejemplo:

```sql
INSERT INTO operaciones (
    termino1, termino2, termino3, termino4, termino5,
    termino6, termino7, termino8, termino9, termino10,
    termino11, termino12, termino13, termino14, termino15,
    termino16, termino17, termino18, termino19, termino20,
    termino21, termino22, termino23, resultado
)
VALUES (
    10, -5, 3, 8, -2,
    6, 7, -1, 4, 5,
    -3, 9, 2, -8, 11,
    -4, 13, -6, 1, 12,
    -7, 14, -10, 59
);
```

---

# Consulta del Historial

```sql
SELECT *
FROM operaciones
ORDER BY fecha DESC;
```

---

# Resultado Esperado

El usuario podrá:

- Ingresar 23 términos algebraicos.
- Obtener automáticamente la suma algebraica.
- Guardar la operación en MySQL.
- Consultar el historial de operaciones.
- Practicar Java 21, JDBC y Programación Orientada a Objetos.

---

# Recursos que puedo generar

Este proyecto puede complementarse con:

- ✅ `ConexionBD.java`
- ✅ `Termino.java`
- ✅ `SumaDAO.java`
- ✅ `CalculadoraAlgebraica.java`
- ✅ `EntradaDatos.java`
- ✅ `Main.java`
- ✅ Script SQL completo.
- ✅ Datos de prueba (`INSERT`).
- ✅ `README.md` completamente documentado.
- ✅ Logo minimalista para el proyecto **Suma Algebraica de 23 Términos**.

---

# Autor

**Proyecto académico para practicar:**

- Java 21
- IntelliJ IDEA
- Consola
- MySQL 8
- JDBC
- Programación Orientada a Objetos (POO)
- Patrón DAO
- Persistencia de datos
:. . / .  
