# Microservicios ACME
Este practica es separar en microservicios y la comunnicación sea por peticiones rest. 

### Pre-requisitos 📋
Tener java jdk 8
tener instalado maven y git
Clonar de la rama jahernandez el proyecto MicroserviciosACME

Importarse los siguientes modulos y ejecutarlos en el siguiente orden

## ACME-EMPLOYEEV1 : 
Levantar este microservicio que es el se va encargar de hacer la alta.
Ejecutar los siguientes comandos :
  ```
  mvn clean package
  mvn spring-boot:run
  ``` 
  
  El puerto que levantará sera por el siguiente:
  
   ```
   path /acme-hr-employee
   puerto 9093
   
   ```
  
## Acme-HR_SysWorkStation : 
Levantar este microservicio donde se va encargar de guardar la estacion de trabajo
Ejecutar los siguientes comandos : 
  ```
  mvn clean package
  mvn spring-boot:run
  ``` 

  El puerto que levantará sera por el siguiente:
  
   ```
   context-path = /acme-hr-workstation
   puerto 9091
   ```
## Acme-HR-System : 
Ejecuta las demas tarea

Ejecutar los siguientes comandos :
  ```
  mvn clean package
  mvn spring-boot:run
  ``` 

  El puerto que levantará sera por el siguiente:
  
   ```
   /acme-hr-system
   puerto /acme-hr-system
   ```


   
  ## Proceso de Ejecucion 
  
  Para ejecutar los microservicios   
  * ACME-EMPLOYEEV1
  * Acme-HR_SysWorkStation
  * Acme-HR-System
  
