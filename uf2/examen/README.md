Examen UF2
==

**1. (1 Punto) Implementa la clase Atleta, debe contener los siguientes atributos:**
* Distancia recorrida actual
* Velocidad actual (horizontal y vertical)
* Elevación actual
* Número de carril por el que corre

Define un método constructor que permita establecer el carril.

`En el main:` Utiliza la clase Atleta para crear ocho atletas en los carriles 0,1,2,3, ... 7

**2. (1 Punto) Añade dos métodos a la clase Atleta.**

* Añade un método `correr()` a la clase `Atleta` que reciba un número decimal por parámetro y establezca la velocidad horizontal de dicho valor.

* Añade otro método `saltar()` que reciba un número decimal por parámetro y establezca la velocidad vertical a dicho valor, siempre y cuando la elevación actual del atleta sea igual a 0.

`En el main:` Utiliza ambos métodos con diferentes atletas.

**3. (2 Puntos) Crea las clases Valla, Carril y Pista.**

* La clase `Valla` debe contener campos de posición y altura (todas las vallas de una pista tendrán la misma altura), y otro campo para indicar si la valla está en pie o no.

Añade un constructor para definir la posición de la valla. El constructor debe establecer también una altura predeterminada y poner la valla "en pie".

* La clase `Carril` debe contener 10 objetos de la clase Valla. Crea un constructor que inicialice las vallas en posiciones sucesivas de 10 en 10. (0, 10, 20, ... 90).

* La clase `Pista` debe contener 8 carriles. Crea un constructor que inicialice los 8 carriles.

`En el main:` Crea un objeto de la clase `Pista` que contenga los ocho carriles con las diez vallas por carril.

**4. (2 Puntos) Añade más métodos:**

* Crea un método `choca()` en la clase `Atleta` que reciba un objeto de la clase `Valla` y retorne si el atleta ha chocado con dicha valla (hay que comprobar si el taleta está en la misma posición que la valla y si la elevación del atleta es mayor que la altura de la valla).

* Crea un método `tirar()` en la clase `Valla` que establezca que la valla no está en pie.

* Crea un método `frenar()` en la clase `Atleta` número decimal como parámetro y reste dicho valor a la velocidad horizontal del atleta.reste

`En el main:` Utiliza estos tres métodos para comprobar si alguno de los ocho atletas choca con alguna de las vayas qye hay en su carril. En caso de que choque, tira la valla y frena al atleta.
