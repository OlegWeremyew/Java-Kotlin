package syntax.lesson21

fun main() {
    println("winner - ${getWinner(5, 3, 2, 3)}")
}

fun getWinner(
    griffindorPoints: Int,
    slytherinPoints: Int,
    raverclawPoints: Int,
    hufflepuffPoints: Int
): String {
    if (
        griffindorPoints > slytherinPoints
        && griffindorPoints > raverclawPoints
        && griffindorPoints > hufflepuffPoints
    ) {
        return "griffindor"
    } else if (
        slytherinPoints > griffindorPoints
        && slytherinPoints > raverclawPoints
        && slytherinPoints > hufflepuffPoints
    ) {
        return "slytherin"
    } else if (
        raverclawPoints > griffindorPoints
        && raverclawPoints > slytherinPoints
        && raverclawPoints > hufflepuffPoints
    ) {
        return "raverclaw"
    }

    return "hufflepuff"
}
