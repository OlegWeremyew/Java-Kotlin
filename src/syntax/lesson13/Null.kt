package syntax.lesson13

fun main() {
    var nullableString: String = "";
    var nullableString2: String? = null; // "?" special type operator
    println("value " + nullableString.length);
    println("value - ${nullableString2?.length ?: "no value here"}"); // it will be invoke only if not null

    var nullableString3: String? = "Oleg";
    println(nullableString3?.uppercase() ?: "no value here");

    val PI:Double = 3.1415;
    println(PI.toString());

    val PInull:Double? = null;
    println("The PI value is ${PInull ?: "3.14"}");
}
