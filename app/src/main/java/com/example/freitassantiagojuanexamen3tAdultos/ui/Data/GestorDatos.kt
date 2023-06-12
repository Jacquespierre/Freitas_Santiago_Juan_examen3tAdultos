package com.example.freitassantiagojuanexamen3tAdultos.ui.Data

import com.example.freitassantiagojuanexamen3tAdultos.R

object GestorDatos {
    val cachorro = Cachorro(
        id = 1.toString(),
        title = "Monty",
        sexo = "Masculino",
        edad = 14,
        descripcion = "Monty juega con los amigos",
        cachorroImageId = R.drawable.p1
    )
    val listaCachorros = listOf(
        cachorro,
        Cachorro(
            id = 2.toString(),
            title = "Lubilee",
            sexo = "Femenino",
            edad = 6,
            descripcion = "Lubilee disfruta en el campamento",
            cachorroImageId = R.drawable.p2
        ),
        Cachorro(
            id = 3.toString(),
            title = "Bezzy",
            sexo = "Masculino",
            edad = 8,
            descripcion = "Bezzy te ayuda a escoger un color",
            cachorroImageId = R.drawable.p3
        ),
        Cachorro(
            id = 4.toString(),
            title = "Mochi",
            sexo = "Masculino",
            edad = 10,
            descripcion = "Mochi es un perfecto perseguidor de patos",
            cachorroImageId = R.drawable.p4
        ),
        Cachorro(
            id = 5.toString(),
            title = "Fresa",
            sexo = "Femenino",
            edad = 12,
            descripcion = "Fresa ama tus gustos",
            cachorroImageId = R.drawable.p5
        ),
        Cachorro(
            id = 6.toString(),
            title = "Lucy",
            sexo = "Femenino",
            edad = 6,
            descripcion = "Lubilee disfruta en el campamento",
            cachorroImageId = R.drawable.p6
        ),
        Cachorro(
            id = 7.toString(),
            title = "Lubilee",
            sexo = "Femenino",
            edad = 6,
            descripcion = "Lucy te ve desde cualquier parte",
            cachorroImageId = R.drawable.p7
        ),
        Cachorro(
            id = 8.toString(),
            title = "Astro",
            sexo = "Masculino",
            edad = 10,
            descripcion = "Astro te lleva la comida",
            cachorroImageId = R.drawable.p8
        ),
        Cachorro(
            id = 9.toString(),
            title = "Boo",
            sexo = "Femenino",
            edad = 8,
            descripcion = "Boo es un osito de peluche",
            cachorroImageId = R.drawable.p9
        ),
        Cachorro(
            id = 10.toString(),
            title = "Pippa",
            sexo = "Masculino",
            edad = 7,
            descripcion = "Pippa le encanta ver por la ventana",
            cachorroImageId = R.drawable.p10
        ),
        Cachorro(
            id = 11.toString(),
            title = "Coco",
            sexo = "Femenino",
            edad = 10,
            descripcion = "Coco le chifla estar en el Spa",
            cachorroImageId = R.drawable.p11
        ),
        Cachorro(
            id = 12.toString(),
            title = "Brody",
            sexo = "Masculino",
            edad = 13,
            descripcion = "Brody espera que le ordenes",
            cachorroImageId = R.drawable.p2
        ),
    )
}