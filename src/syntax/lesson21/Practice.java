package syntax.lesson21;

public class Practice {
    public static void main(String[] args) {
        System.out.println("The winner - " + PractiseKt.getWinner(10, 8, 8, 3));
        System.out.println("The winner - " + getWinner(3, 18, 8, 3));
    }

    public static String getWinner(int griffindorPoints, int slytherinPoints, int raverclawPoints, int hufflepuffPoints) {
        if (
                griffindorPoints > slytherinPoints
                        && griffindorPoints > raverclawPoints
                        && griffindorPoints > hufflepuffPoints
        ) {
            return "griffindor";
        } else if (
                slytherinPoints > griffindorPoints
                        && slytherinPoints > raverclawPoints
                        && slytherinPoints > hufflepuffPoints
        ) {
            return "slytherin";
        } else if (
                raverclawPoints > griffindorPoints
                        && raverclawPoints > slytherinPoints
                        && raverclawPoints > hufflepuffPoints
        ) {
            return "raverclaw";
        }

        return "hufflepuff";
    }
}
