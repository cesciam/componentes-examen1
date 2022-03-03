package encrypter;

public class EncryptCesar implements IEncripta {
    @Override
    public String encripta(String texto) {
        return rotar(texto, 3);
    }
    @Override
    public String desencripta(String texto) {
        return rotar(texto, -3);
    }

    public static String rotar(String palabraOriginal, int rotaciones) {
        final int LONG_ALF = 26, INI_MINUSC = 97, INI_MAYUS = 65;
        String palabraCifrada = "";
        for (int x = 0; x < palabraOriginal.length(); x++) {
            char caracterActual = palabraOriginal.charAt(x);
            if (!Character.isLetter(caracterActual)) {
                palabraCifrada += caracterActual;
                continue;
            }
            int codigoAsciiDeCaracterActual = (int) caracterActual;
            boolean esMayuscula = Character.isUpperCase(caracterActual);
            int nuevaPosicionEnAlfabeto = ((codigoAsciiDeCaracterActual - (esMayuscula ? INI_MAYUS : INI_MINUSC)) + rotaciones) % LONG_ALF;
            if (nuevaPosicionEnAlfabeto < 0)
                nuevaPosicionEnAlfabeto += LONG_ALF;
            int nuevaPosicionAscii = (esMayuscula ? INI_MAYUS : INI_MINUSC) + nuevaPosicionEnAlfabeto;
            palabraCifrada += Character.toString((char) nuevaPosicionAscii);
        }
        return palabraCifrada;
    }
}
