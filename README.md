## Android Data Binding

Ha pasado algun tiempo desde la última vez que escribí algo para Android, recientemente con la liberación Android 10 tras revisar uno de sus tantos ejemplos encontré una implementación en una aplicación con el uso de data binding.
En pocas palabras el data binding nos ayuda a vincular nuestras fuentes de datos con los elementos de la interfaz de usuario declarados en los ficheros XML, el principal beneficio al utilizar esta técnica es que eliminaremos mucho código innecesario y nos permitirá enfocarnos en lo que realmente importa además de utilizar una forma declarativa.

Data binding soluciona los problemas de código repetitivo que tenemos que declarar al desarrollar nuestra aplicación.
Lo primero que tenemos que hacer es habilitar data binding, este lo haremos en nuestro archivo gradle:

```xml
dataBinding {
  enable = true
}
```


Data binding necesita variables para poder funcionar, por ello es necesario agregar la sección de data

```xml
<data>
<variable name=”clase” type =”package”/>
</data>

```

Dentro de esta etiqueta definimos la variable en la cual asignaremos el nombre y el paquete al que pertenece nuestra fuente de datos.
<br/>
Una vez definidas las variables podremos construir expresiones en nuestro layout
Ejemplos:

```xml
android:text="@{String.valueOf(index + 1)}"
android:visibility="@{age < 13 ? View.GONE : View.VISIBLE}"
android:transitionName='@{"image_" + id}'
```

```xml
// Bind the name property of the viewmodel to the text attribute
android:text="@{viewmodel.name}"
// Bind the nameVisible property of the viewmodel to the visibility attribute
android:visibility="@{viewmodel.nameVisible}"
// Call the onLike() method on the viewmodel when the View is clicked.
android:onClick="@{() -> viewmodel.onLike()}"

```

<br/>
En el ejemplo construiremos un Login sencillo con el uso de ```Data Binding```.
<br/>

![Login]()


