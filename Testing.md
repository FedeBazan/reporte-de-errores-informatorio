# Testing

### Elementos utilizados:

Sistema:

Windows 10 pro versión: 19045.2965

Navegadores:

Edge: versión 113.0.1774.57 (Compilación oficial) (64 bits)

Chrome: versión 116.0.5803.2 (Build oficial) dev (64 bits)

Brave:  [Versión 1.52.117 Chromium: 114.0.5735.90 (Build oficial) (64 bits)](https://brave.com/latest/)

---

# Casos de testing

---

| ID | 1 |
| --- | --- |
| Titulo | Crasheo de la página |
| Descripción | Al ingresar a la página en la sección de productos en venta, al momento de dar click a cualquiera de los dos botones de la parte superior del grid de productos para poder cambiar la cantidad de elementos mostrados, la página intenta cargar por aproximadamente 5 segundos y luego queda congelada. |
| Precondiciones | Un navegador web |
| Criticidad | Alta |
| Tipo de defecto | Funcional |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Intentar cambiar la cantidad de elementos con los botones superiores |
| Resultado obtenido | La página queda congelada de manera indefinida |
| Resultado esperado | Que los botones cambien la cantidad de productos mostrados en el grid de la página |

Capturas:

![https://academybugs.com/wp-content/uploads/2020/10/22.gif](https://academybugs.com/wp-content/uploads/2020/10/22.gif)

![https://academybugs.com/wp-content/uploads/2020/10/21.png](https://academybugs.com/wp-content/uploads/2020/10/21.png)

---

| ID | 2 |
| --- | --- |
| Titulo | Vinculo de twitter roto |
| Descripción | Al ingresar a la página, ingresar a un producto en particular e intentar ingresar al twitter de la página, se abre otra pestaña con un vinculo roto ya que no carga nada |
| Precondiciones | Un navegador web |
| Criticidad | Media |
| Tipo de defecto | Componente |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Ingresar a un producto de la lista
3_Hacer click en el icono de twitter que se ubica debajo del precio y descripción del producto |
| Resultado obtenido | Se abre otra pestaña con un link roto sin poder visualizar el twitter de la página |
| Resultado esperado | Ver en otra pestaña el twitter de la página de forma normal |

Capturas:

![https://academybugs.com/wp-content/uploads/2020/10/5.gif](https://academybugs.com/wp-content/uploads/2020/10/5.gif)

![https://academybugs.com/wp-content/uploads/2020/10/5.png](https://academybugs.com/wp-content/uploads/2020/10/5.png)

---

| ID | 3 |
| --- | --- |
| Titulo | Crasheo de la página |
| Descripción | Al ingresar a la página, ingresar a un producto en particular e intentar cambiar el tipo de moneda a pagar, la página queda congelada de manera indefinida |
| Precondiciones | Un navegador web |
| Criticidad | Alta |
| Tipo de defecto | Funcional |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Ingresar a un producto de la lista
3_Ir al panel derecho de la página
4_Intentar cambiar el tipo de moneda utilizando la pestaña |
| Resultado obtenido | La página queda congelada |
| Resultado esperado | Poder cambiar el tipo de moneda a confeccionar el valor del producto |

Capturas:

![https://academybugs.com/wp-content/uploads/2020/10/21.gif](https://academybugs.com/wp-content/uploads/2020/10/21.gif)

![https://academybugs.com/wp-content/uploads/2020/10/22.png](https://academybugs.com/wp-content/uploads/2020/10/22.png)

---

| ID | 4 |
| --- | --- |
| Titulo | Cantidad de productos |
| Descripción | Al ingresar a la página, ingresar a un producto en particular, agregarlo al carro, luego ingresar al carro, al intentar cambiar la cantidad de productos del mismo tipo a llevar, si se supera la cantidad mayor a 2 y se da click al boton de “update” o “incrementar”, la página queda colgada |
| Precondiciones | Un navegador web |
| Criticidad | Alta |
| Tipo de defecto | Funcional |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Ingresar a un producto de la lista
3_Agregar el producto al carro
4_Ir al carro
5_Sumar una cantidad mayor de 2 del mismo tipo de producto
6_Dar click al boton “update” |
| Resultado obtenido | La página queda colgada |
| Resultado esperado | Al dar click al boton “update” que el valor del producto se multiplique por la cantidad de unidades indicada por el usuario |

![https://academybugs.com/wp-content/uploads/2020/10/1.gif](https://academybugs.com/wp-content/uploads/2020/10/1.gif)

![https://academybugs.com/wp-content/uploads/2020/10/1.png](https://academybugs.com/wp-content/uploads/2020/10/1.png)

---

| ID | 5 |
| --- | --- |
| Titulo | Filtro de precios no funciona |
| Descripción | Al ingresar a la página, ir al panel derecho e intentar hacer click en cualquiera de los valores del filtro por precio, la página no hace nada |
| Precondiciones | Un navegador web |
| Criticidad | Media |
| Tipo de defecto | Funcional |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Ir al panel derecho de la página
3_Hacer click a cualquier valor del filtro de precios |
| Resultado obtenido | La página no hace nada |
| Resultado esperado | Se espera que la lista de productos se filtre según el rango de precio seleccionado por el usuario |

![https://academybugs.com/wp-content/uploads/2020/10/4.gif](https://academybugs.com/wp-content/uploads/2020/10/4.gif)

![https://academybugs.com/wp-content/uploads/2020/10/F4.png](https://academybugs.com/wp-content/uploads/2020/10/F4.png)

---

| ID | 6 |
| --- | --- |
| Titulo | El formulario para ingresar con una cuenta de usuario no funciona |
| Descripción | Al ingresar a la página, ir al panel derecho, deslizarse hasta el panel de ingreso de usuario, al hacer click al boton para validar los datos sea con datos o no, la página se vuelve a cargar |
| Precondiciones | Un navegador web |
| Criticidad | Baja |
| Tipo de defecto | Visual |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Ir al panel derecho de la página
3_Hacer click al botón para validar los datos e ingresar con una cuenta |
| Resultado obtenido | La página se recarga |
| Resultado esperado | Que se validen los datos y se ingrese con el usuario si este esta registrado |

Capturas:

![https://academybugs.com/wp-content/uploads/2020/10/F9.gif](https://academybugs.com/wp-content/uploads/2020/10/F9.gif)

![https://academybugs.com/wp-content/uploads/2020/10/F9.png](https://academybugs.com/wp-content/uploads/2020/10/F9.png)

---

| ID | 7 |
| --- | --- |
| Titulo | El formulario para ingresar con una cuenta de usuario no funciona |
| Descripción | Las imágenes de algunos elementos tienen espacio innecesario debajo |
| Precondiciones | Un navegador web |
| Criticidad | Baja |
| Tipo de defecto | Visual |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Visualizar algunos elementos en particular de la lista |
| Resultado obtenido | La imagenes de los productos en el grid de productos tienen un espacio en blanco innecesario |
| Resultado esperado | Que las imagenes se visualicen de forma normal y orgánica  |

![https://academybugs.com/wp-content/uploads/2020/10/F8.gif](https://academybugs.com/wp-content/uploads/2020/10/F8.gif)

![https://academybugs.com/wp-content/uploads/2020/10/8.png](https://academybugs.com/wp-content/uploads/2020/10/8.png)

---

| ID | 8 |
| --- | --- |
| Titulo | Botón para retornar a la tienda  |
| Descripción | Al hacer click en el botón para retornar a la tienda luego de eliminar items del carrito, la página deja de funcionar |
| Precondiciones | Un navegador web |
| Criticidad | Baja |
| Tipo de defecto | Contenido |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Agregar cualquier producto al carro
3_Ingresar al carro
4_Eliminar el item
5_Hacer click el botón para retornar a la tienda |
| Resultado obtenido | La página queda colgada |
| Resultado esperado | El botón debe enviar al usuario de nuevo a la tienda para que siga comprando |

![https://academybugs.com/wp-content/uploads/2020/10/F15.gif](https://academybugs.com/wp-content/uploads/2020/10/F15.gif)

![https://academybugs.com/wp-content/uploads/2020/10/15.png](https://academybugs.com/wp-content/uploads/2020/10/15.png)

---

| ID | 9 |
| --- | --- |
| Titulo | El título del botón Iniciar sesión está desalineado verticalmente |
| Descripción | En la sección de registro, se ve que el texto del botón del formulario para ingresar con una cuenta esta visualmente más abajo de lo necesario |
| Precondiciones | Un navegador web |
| Criticidad | Baja |
| Tipo de defecto | Funcional |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Haga clic en el vínculo Buscar errores en la barra de navegación
3_Abrir un producto
4_Desplazarce hasta la parte inferior y buscar el formulario de inicio de sesión en el menú del lado derecho
5_Ingresar cualquier nombre de usuario y contraseña que no esté registrado y haga clic en "Iniciar sesión” |
| Resultado obtenido | El botón esta visualmente desalineado |
| Resultado esperado | Que el visualmente el botón este bien alineado |

![https://academybugs.com/wp-content/uploads/2020/10/F7.gif](https://academybugs.com/wp-content/uploads/2020/10/F7.gif)

![https://academybugs.com/wp-content/uploads/2020/10/7.png](https://academybugs.com/wp-content/uploads/2020/10/7.png)

---

| ID | 10 |
| --- | --- |
| Titulo | La breve descripción y la descripción del producto no están en inglés. |
| Descripción | En la descripción del producto se ve que el idioma no es el correcto, no esta en inglés |
| Precondiciones | Un navegador web |
| Criticidad | Medio |
| Tipo de defecto | UX/UI |
| Pasos | 1_Ingresar a https://academybugs.com/find-bugs/#
2_Hacer click a un producto
3_Ver la descripción |
| Resultado obtenido | La descripción esta en un idioma que no es el inglés |
| Resultado esperado | Se espera que la descripción del producto este en inglés |

![https://academybugs.com/wp-content/uploads/2020/10/Find-13.gif](https://academybugs.com/wp-content/uploads/2020/10/Find-13.gif)

![https://academybugs.com/wp-content/uploads/2020/10/Find-13.png](https://academybugs.com/wp-content/uploads/2020/10/Find-13.png)