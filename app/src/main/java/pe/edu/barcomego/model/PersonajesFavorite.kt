package pe.edu.barcomego.model

data class PersonajesFavorite(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Origin,
    val location: Location,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)

data class Origin(
    val name: String,
    val url: String
)

data class Location(
    val name: String,
    val url: String
)

fun getDataFavorite(): List<PersonajesFavorite> = listOf(
    PersonajesFavorite(
        id = 7,
        name = "Abradolf Lincler",
        status = "unknown",
        species = "Human",
        type = "Genetic experiment",
        gender = "Male",
        origin = Origin("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
        location = Location("Testicle Monster Dimension", "https://rickandmortyapi.com/api/location/21"),
        image = "https://rickandmortyapi.com/api/character/avatar/7.jpeg",
        episode = listOf(
            "https://rickandmortyapi.com/api/episode/10",
            "https://rickandmortyapi.com/api/episode/11"
        ),
        url = "https://rickandmortyapi.com/api/character/7",
        created = "2017-11-04T19:59:20.523Z"
    )
)
