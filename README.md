# MANUAL DE USUARIO FERNANPAAQ
Practica Obligatoria Tema 3. Programa de una compañia de transportes realizado por Manuel José Liébana

## Índice
1. [Comenzando](#comenzando)
2. [Requisitos Mínimos](#requisitos)
3. [Instalación](#Instalación)
4. [Ejecucion](#ejecucion)
5. [Colaboradores](#colaboradores)


## 🔰​ Comenzando 🔰​

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

## ✔ Requisitos Mínimos ✔

_Debes tener instalado Windows 10 o Windows 11 (x64) y la siguiente versión de java
**Java SE Development Kit 19.0.2**, para descargarla acceda al siguiente enlace_

```
https://download.oracle.com/java/19/archive/jdk-19.0.2_windows-x64_bin.exe
```

Para comprobar la version de java que tenemos instalada en nuestro equipo, escribimos "cmd" en el buscador de Windows. Después de ejecutarlo, escribimos "java-version" en la terminal.

_A continuación, debes tener el siguiente path en tus variables de entorno del sistema, si no sabes mirarlo en el buscador de Windows "Editar las variables del entorno" y por último añadir la siguiente línea al path si no la tienes:_

```
C:\Program Files\Java\jdk-19.0.2\bin
```

## 🔧 Instalación 🔧

_Una vez cumplas los requisitos, debes descargarte nuestro repositorio, pulsando en el siguiente botón:_

![image](https://github.com/ManuelJose05/FERNANPAAQ-TEMA3/assets/150932456/22e5bcb4-96f0-4117-a4cd-fd84532fa13c)

_Ahora con el proyecto en tu equipo situandolo en el disco C: solo tendrás que descomprimirlo con permisos de administrador para pasar al siguiente apartado_

## ⚙️ Ejecución ⚙️
_Con el programa descomprimido, se va a encontrar una carpeta **PracticaT5** y un ejecutable llamado **FERNANPAAQ**. Para acceder al programa primero debe cumplir los requisitos y después puede abrir la aplicación._
_Al abrir la aplicación se encontrará con la siguiente pantalla:_

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/3543e4e1-d027-48ad-8cf9-231deecc082a)

Encontrarás un menú con las siguientes opciones:
1. Login
2. Registrarse
3. Seguir un envío con el número de seguimiento
4. Log out

## 1. Iniciar sesión
Debemos introducir un usuario y contraseña de una cuenta registrada para acceder al programa.

  ### Inicio de sesión como usuario

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/28216291-30a3-444b-bb76-ccc709515749)

Una vez iniciada la sesión, nos aparecerá una pequeña frase de bienvenida con el nombre de usuario y el número de paquetes que tiene pendiente de entrega, además de otro menú.
El menú contendrá las siguientes opciones:
1. Realizar un envío
2. Muestra información
3. Modificar mis datos de entrega para un envío
4. Muestra información de los envíos que yo he realizado
5. Ver mi perfil
6. Modificar mis datos
7. Cerrar sesión

  #### 1.- Realizar un envío
El programá nos pedirá el correo electrónico de un usuario, si este no encuentra ningún usuario con ese usuario, nos pedirá su número de teléfono. En caso de no encontrar ninguna de las 2 variantes, comenzaremos a introducir los datos del envío y se añaderá a "Envíos de usuarios no registrados", de caso contrario, usará la información del usuario registrado para el envío.

    Envío a usuario no registrado
    
  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/c879a56f-b137-465e-87a0-d92bd0014858)
 
    Envío a  usuario registrado
    
  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/ad51845c-cfad-45ba-9c0b-ee5be64be51d)


  Si al crear un envío indicamos que queremos recibir información, cada vez que se asigne un conductor o se modifique el estado de un envío se enviará un mensaje al correo del usuario que recibirá el paquete indicando dicha operación.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/59bb734d-2c37-4114-bc14-89bdc6757d1f)


  #### 2.- Muestra información
  Muestra al usuario la información de los envíos que son dirigidos a él.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/bccd0811-b0d4-44bc-8e91-dc4d09c4b4cc)


  #### 3.- Modificar mis datos de entrega para un envío
  El usuario puede modificar la dirección de entrega de un envío introduciendo el id del envío

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/bfa43299-3e52-4934-b702-9f17e5f550e4)


  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/12bb400f-0670-49cf-8cbd-27d5f38c5088)
  

  #### 4.- Muestra información de los envíos que yo he realizado
  Muestra al usuario la información de los envíos que él ha enviado a otros usuarios

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/fa956dcb-bc3d-484e-8373-77d870218b48)

  #### 5.- Ver mi perfil
  Muestra al usuario la información de su cuenta de usuario en el programa

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/1308397a-1883-4290-8f1f-d0ec533b5018)

  #### 6.- Modificar mis datos
  El programa nos pregunta que deseamos modificar de la cuenta, introducimos la opción y rellenamos las preguntas con la nueva información

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/187d68b3-aac5-474d-a9fc-3a9230b29205)


  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/28e27c4b-4d08-4863-8e1e-dc6d8bf3707f)

  #### 7.- Cerrar sesión
  El programa cierra la sesión del usuario y volvemos al menú de inicio

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/a68626ac-c846-4863-95a7-5c6af5dcb72e)


  ### Inicio de sesión como conductor
  Nos aparecerá el siguiente menú

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/bee46b07-d1e7-4d20-881d-f2fc799ac3d3)

Las opciones serán las siguientes:
1. Información de los envíos pendientes de entrega
2. Cambiar el estado de un envío
3. Ver el histórico de paquetes entregados
4. Añadir una zona de entrega a mi perfil
5. Ver mi perfil
6. Modificar mis datos
7. Salir

  #### 1.- Información de los envíos pendientes de entrega
  Esta opción muestra al conductor la información de envíos que tenga sin entregar

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/b4c2ce51-1f95-49bc-9460-dfc13c6e798d)

  #### 2.- Cambiar el estado de un envío
  Esta opción muestra al conductor los envíos que no estan entregados para poder modificar su estado, puede seleccionar 3 estados (En oficina de origen | En reparto | Entregado).
  Si el envío tiene activadas las notificaciones, cada vez que el conductor modifique el envío se enviará un mensaje al correo del destinatario explicando el cambio de estado.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/4e2b248b-1957-4443-9ce9-43f42d147dd6)
  

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/0644571c-05dd-4846-bd11-a50bf79c93fe)


  #### 3.- Ver el histórico de paquetes entregados
  Se muestra por pantalla todos los paquetes que el conductor tiene entregados

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/b7aa23e0-c4be-45a1-ba85-27dae9cb79da)

  #### 4.- Añadir una zona de entrega a mi perfil
  El conductor puede añadir más zonas de entregas para recibir más envíos (Se introduce el código postal de la zona de entrega)

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/ae88bb68-1710-4c16-82ee-fec545bbf9a7)

  #### 5.- Ver mi perfil
  Se muestra en pantalla la información del conductor

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/59935f54-c824-4208-9466-49aa0ff67807)

  #### 6.- Modificar mis datos
  El conductor puede cambiar su email y contraseña cuando él desee.

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/9edc113b-48ae-4a25-8a07-fdf307c01820)

  #### 7.- Salir
  El programa cierra la sesión del conductor y vuelve a mostrar el menú de inicio

  ![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/8d0df4ba-d53d-40a7-ab21-2fe8ac498a3c)



### 2. Registrarse
El programa nos pedirá que introduzcamos nombre de usuario, apellidos, email, contraseña, dirección de entrega (código postal, provincia, ciudad, calle, número domicilio) y por último este enviará un mensaje al correo introducido con un número de confirmación para asegurar que el correo es válido. En caso de no introducir correctamente ese código, no se registrará al usuario.

![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/852698bf-26b7-48a1-aff3-fe7f1642587b)


![image](https://github.com/ManuelJose05/Practica-Obligatoria-Tema5/assets/150932456/e6f51e79-205c-42db-b20a-4abe3d8ad7cf)




  

