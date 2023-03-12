public class Main {
    public static void main(String[] args) {
//        String str = "";
//        for (int i = 0; i < 1000000; i++) {
//            str += "+";
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1000000; i++) {
//            sb.append("+");
//        }
        String[] name = {"М", "а", "к", "с", "и", "м"};
        String ms1 = "МАКСИМ СО";
        String ms2 = "максим со";
        System.out.println(ms1.toLowerCase());                                                    // максим со
        System.out.println(ms2.toUpperCase());                                                    // МАКСИМ СО
        System.out.println(String.join("", name));                                       // Максим
        System.out.println(String.join("", "М", "а", "к", "с", "и", "м"));      // Максим
        System.out.println(String.join(",", "М", "а", "к", "с", "и", "м"));     // М,а,к,с,и,м

    }
}
