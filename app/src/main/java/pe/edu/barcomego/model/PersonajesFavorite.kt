package pe.edu.barcomego.model

data class PersonajesFavorite(
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Origin,
    val location: Location,
    val image: String,
)

data class Origin(
    val name: String
)

data class Location(
    val name: String
)

fun getDataFavorite(): List<PersonajesFavorite> = listOf(
    PersonajesFavorite(
        name = "Abradolf Lincler",
        status = "unknown",
        species = "Human",
        type = "Genetic experiment",
        gender = "Male",
        origin = Origin("Earth (Replacement Dimension)"),
        location = Location("Testicle Monster Dimension"),
        image = "https://rickandmortyapi.com/api/character/avatar/7.jpeg",
    )
)
