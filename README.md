# Punto 4.

**¿Por qué ocurre la excepción UnsatisfiedDependencyException?** 

La excepción UnsatisfiedDependencyException ocurre porque en InventoryService y OrderService se usa una inyección por constructor, lo que implica que ambos beans deben existir completamente construidos antes de ser inyectados, pero InventoryService no puede construirse sin OrderService y viceversa, lo que resulta en una dependencia circular.

**Romper el ciclo con inyección de una de las dependencias con @Lazy e identificar el orden de inicialización de los beans**

Se usará la anotanción @Lazy en el constructor de InventoryService (@Lazy OrderService orderService).

El bean 'inventoryService' se crea primero porque depende de un bean @Lazy, el bean 'orderService' se crea cuando InventoryService lo necesite.

**Solución de diseño a la dependencia circular sin ocultarla con setter o @Lazy**

Se propone crear un tercer servicio: SalesValidationService, que gestiona las interacciones entre InventoryService y OrderService.
