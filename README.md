# ChallengeConversorMoneda
```markdown
# 🌍 Conversor de Monedas

Este proyecto es una aplicación interactiva desarrollada en Java para realizar conversiones de monedas en tiempo real, utilizando la API de ExchangeRate-API.

![Conversor de Monedas](https://github.com/Codi3go/ChallengeConversorMoneda/assets/Bienvenida.png)

## 🚀 Características
- Conversión entre las siguientes monedas:
  - **Dólar (USD)** y **Peso Argentino (ARS)**.
  - **Dólar (USD)** y **Real Brasileño (BRL)**.
  - **Dólar (USD)** y **Peso Colombiano (COP)**.
- Obtención de tasas de cambio en tiempo real desde [ExchangeRate-API](https://www.exchangerate-api.com).
- Interfaz interactiva por consola para una experiencia sencilla y clara.

## 📋 Requisitos
- **Java 17** o superior.
- Conexión a Internet para acceder a la API.
- Dependencia de la biblioteca **Gson** para procesar JSON.

## ⚙️ Instalación
1. **Clona o descarga este repositorio:**
   ```bash
   git clone https://github.com/usuario/ConversorDeMonedas.git
   ```
2. **Importa el proyecto** en tu IDE preferido (IntelliJ IDEA, Eclipse, etc.).
3. **Configura las dependencias:**
   - Si usas Maven, asegúrate de incluir la biblioteca `Gson` en el archivo `pom.xml`:
     ```xml
     <dependency>
         <groupId>com.google.code.gson</groupId>
         <artifactId>gson</artifactId>
         <version>2.8.9</version>
     </dependency>
     ```
   - Si no usas Maven, descarga `Gson` desde [Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson) e inclúyelo manualmente en tu proyecto.
4. Ejecuta la clase `AplicacionConversorMoneda` para iniciar la aplicación.

## 🛠️ Estructura del Proyecto
- **`AplicacionConversorMoneda`** 🏦  
  Esta clase maneja la interacción con el usuario. Presenta el menú principal, recibe las opciones ingresadas por el usuario y coordina las conversiones de moneda.  

- **`ConsultaMoneda`** 💰  
  Se encarga de realizar las solicitudes a la API de ExchangeRate-API, obteniendo las tasas de cambio actuales. Los datos se devuelven en un formato que la clase principal puede procesar fácilmente.  

- **`Moneda`** 💸  
  Una clase que modela la respuesta de la API, estructurando los datos con las variables `codigoBase` (moneda base) y `tasasDeConversion` (tasa de cambio para cada moneda).

## 📈 Funcionamiento
1. El usuario selecciona una opción del menú interactivo para elegir las monedas de origen y destino.
2. Introduce la cantidad a convertir.
3. La aplicación consulta las tasas de cambio en tiempo real y realiza el cálculo.
4. Se muestra el resultado en pantalla.

## 🤝 Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar el proyecto o reportar algún problema, crea un `pull request` o abre un `issue` en este repositorio.

## 📜 Licencia
Este proyecto está bajo la licencia MIT. Puedes usarlo y modificarlo libremente.
```  
