public class Excepciones {

    public static void verificarRangoDelIndice(int i, int size) throws IndiceFueraDeRangoException {
        if (i < 0 || i >= size) {
            throw new IndiceFueraDeRangoException("Índice fuera de rango");
        }
    }

}
