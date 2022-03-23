public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finalNotu = 'A';

        String result = "";
        result = (finalNotu == 'A') ? "Gayet Basarılı" : (finalNotu == 'B') ? "Başarılı" : (finalNotu == 'C') ? "Ha gayret" : "Diğerleri...";
        System.out.println("result:\n" + result);
    }
}
