package encrypter;

public class EncryptVignere implements IEncripta {
    private String llave = "ESTAESLALLAVE";
    @Override
    public String encripta(String texto) {
        String res = "";
        //texto = texto.toUpperCase();
        for (int i = 0, j = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c + llave.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % llave.length();
        }
        return res;
    }

    @Override
    public String desencripta(String texto) {
        String res = "";
        //texto = texto.toUpperCase();
        for (int i = 0, j = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c - llave.charAt(j) + 26) % 26 + 'A');
            j = ++j % llave.length();
        }
        return res;
    }
}
