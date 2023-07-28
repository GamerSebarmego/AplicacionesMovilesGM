package pe.edu.barcomego.model

data class Personajes (
    val name: String,
    val status: String,
    val species: String,
    val image: String,
)

fun getData(): List<Personajes> = listOf(
    Personajes("Rick Sanchez", "Vivo", "Humano", "https://rickandmortyapi.com/api/character/avatar/1.jpeg"),
    Personajes("Morty Smith", "Vivo", "Humano", "https://rickandmortyapi.com/api/character/avatar/2.jpeg"),
    Personajes("Summer Smith", "Vivo", "Humano", "https://rickandmortyapi.com/api/character/avatar/3.jpeg"),
    Personajes("Beth Smith", "Vivo", "Humano", "https://rickandmortyapi.com/api/character/avatar/4.jpeg"),
    Personajes("Jerry Smith", "Vivo", "Humano", "https://rickandmortyapi.com/api/character/avatar/5.jpeg"),
    Personajes("Mr. Poopybutthole", "Vivo", "Otro", "https://rickandmortyapi.com/api/character/avatar/6.jpeg"),
    Personajes("Birdperson", "Desconocido", "Otro", "https://rickandmortyapi.com/api/character/avatar/7.jpeg"),
    Personajes("Squanchy", "Desconocido", "Otro", "https://rickandmortyapi.com/api/character/avatar/8.jpeg"),
    Personajes("Unity", "Desconocido", "Otro", "https://rickandmortyapi.com/api/character/avatar/9.jpeg"),
    Personajes("Evil Morty", "Desconocido", "Humano", "https://rickandmortyapi.com/api/character/avatar/10.jpeg"),
    Personajes("Noob-Noob", "Vivo", "Otro", "https://rickandmortyapi.com/api/character/avatar/11.jpeg"),
    Personajes("Scary Terry", "Desconocido", "Otro", "https://rickandmortyapi.com/api/character/avatar/12.jpeg"),
    Personajes("Snowball", "Fallecido", "Otro", "https://rickandmortyapi.com/api/character/avatar/13.jpeg")
)