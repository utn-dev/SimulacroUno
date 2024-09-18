# SimulacroUno

Desarrolle un sistema para una empresa automovilística en donde se puedan crear nuevos Vehículos.
Para la empresa los vehículos tiene un nombre de modelo, un precio de mercado y tienen un tipo de vehículo.
Por un lado están los vehículos utilitarios donde se especifica la cantidad de kilogramos máximo que
soporta, como también es un dato importante saber la altura de estos vehículos.
La empresa también diseña automóviles como un grupo de vehículos. Y cuenta con dos grandes
grupos de automóviles: Los autos urbanos y los de carrera.
Si bien todos los automóviles cuentan con un número máximo de airbags. Es importante diferenciar
que los autos urbanos saben la cantidad máxima de ocupantes y los autos de carrera la velocidad máxima
que alcanzan (este dato no es necesario en los automóviles urbanos).
En el último tiempo la empresa decidió crear vehículos de tipo motocicleta. El dato más importante
es la cilindrada que poseen.
Esta empresa nos dijo que tanto los vehículos de carreras como sus motocicletas entran la categoría
de “deportivos” para la industria. Ya que pueden tener un comportamiento que denominan “competir en
pista”.
1) Cree las clases enunciadas en el texto junto con los atributos.
2) Muestre el comportamiento de “competir en pista” para las clases que puedan aplicarlo.
3) Generar un método para mostrar por pantalla la siguiente información:
“ Tipo de Vehículo: modelo + precio + Datos específicos de la clase”
Ej: “Utilitario: NombreModelo + año + KG_MAX + Altura “
4) Crear un ArrayList con cada tipo de vehículo. Recorrerlo e imprimir por pantalla la información de cada
vehículo.
5) Se solicita actualizar el valor de los precios del array del ejercicio 4. Esto se debe realizar a través de un
método de la clase. Cree un bucle en donde se actualizan con los siguientes valores e imprima ambos
valores(sin aumento y con aumento):
● Motos = 5%
● Utilitarios = 10%
● Automóvil = 15%
● De carrera = 20%
