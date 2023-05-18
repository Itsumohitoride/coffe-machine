Universidad ICESI
Departamento de Computación y Sistemas Inteligentes
Arquitectura de Software G3

Tarea 01 – Introducción Middleware ICE

G3 Arquitectura de Software - Tarea de Despliegue
Objetivo
Mediante el trabajo en equipo, comprender y aplicar el proceso de despliegue de un sistema de un sistema de software distribuido, bajo un conjunto de restricciones específicas.

Actividad por desarrollar
El sistema de máquinas de café con administración remota cuenta con una implementación parcial que se usará como línea base. Esta implementación tiene los siguientes componentes (el código fuente lo pueden descargar del repositorio que se indicará en clase – Ver carpeta de recursos):
1. Coffeemach: componente que representa una instancia de una máquina de café, el punto de interacción con el cliente del negocio de este sistema.
2. Cm_logistics: componente que se encarga de las responsabilidades de la logística de abastecimiento y reparación para resolver alarmas de las máquinas de café.
3. Bodega: componente que representa la bodega o sitio donde se maneja el inventario físico de suministros e ingredientes, así como del manejo de las herramientas de reparación de las máquinas de café.
4. ServidorCentral: componente encargado de la administración central de todos los flujos del negocio del sistema de la máquina de café, es decir, de la administración de todo el negocio.
5. Base de datos: subsistema con la definición del modelo de datos en el cual se persiste y mantiene de manera íntegra la información relativa a la administración centralizada de todo el sistema. Esto excluye los datos locales y propios de cada máquina de café, los cuales son manejados por cada una.
En grupos de entre 3 hasta 5 personas, se realizará el despliegue bajo las siguientes restricciones:
• ServidorCentral y Base de datos, se desplegarán en un computador externo a la red del laboratorio de LIASON.
• Se desplegarán, mínimo 2 dos instancias de Coffeemach, dentro de la red de LIASON.
• Cm_logistics y Bodega se desplegarán dentro de la red de LIASON.
• La base de datos sugerida es PostgreSQL. Sin embargo, el grupo puede decidir emplear una diferente (apoyándose en scripts disponibles).
Despliegue y documentación del proceso
Se debe realizar y documentar el proceso de despliegue (incluyendo los posibles ajustes que se requieran a nivel de código para satisfacer las restricciones planteadas). La estrategia por seguir para lograr el despliegue será acordada y documentada por el grupo. Se espera que todos y cada uno de los estudiantes estén en la capacidad de entender, explicar y realizar todo el proceso de despliegue, con base en lo realizado por el grupo. Resaltar en el informe la manera de ejecutar cada uno de los componentes, en los computadores respectivos, en el orden adecuado, asegurándose de que los servicios provistos por cada componente queden correctamente expuestos para ser consumidos por los otros componentes.
Entregables en un archivo .zip y sustentación (a ser evaluados en equivalencia de 100% a 5.0)
Reporte indicando y conteniendo:
• PDF con documentación del proceso
• (5%) Repositorio del código (Github)
• (50%) La documentación incluye: breve explicación de la interfaz empleada, diagrama UML de deployment, descripción de la configuración del despliegue, paso a paso de alto nivel para el proceso de ajustes y despliegue, descripción del trabajo asignado y realizado por cada uno de los integrantes del equipo.
• (20%) Adicional a la línea base de despliegue cumpliendo las restricciones, explorar y documentar dos alternativas de despliegue. Las alternativas de despliegue pueden relajar – si así lo decide el equipo – las restricciones de distribución entre computadores externos e internos a la red de LIASON.
Universidad ICESI
Departamento de Computación y Sistemas Inteligentes
Arquitectura de Software G3
Tarea 01 – Introducción Middleware ICE
• (25%) Desenvolvimiento del equipo y de sus miembros durante la sustentación.
Puntos opcionales y bonificables
• (10%) Emplear un contenedor Docker para el despliegue de la base de datos, y agregar los pasos y modificaciones respectivas al reporte.
• (10%) Emplear un motor de base de datos diferente a PostgreSQL, y agregar los pasos y modificaciones respectivas al reporte.
• (10%) Preparar y realizar el informe y la sustentación en su totalidad en Inglés.
