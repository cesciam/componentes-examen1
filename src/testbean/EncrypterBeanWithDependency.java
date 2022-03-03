package testbean;
import encrypter.IEncripta;
import java.util.Scanner;

public class EncrypterBeanWithDependency {
    private IEncripta encrypter;
    private Scanner scanner = new Scanner(System.in);

    public void setEncrypter(IEncripta encrypter) {
        this.encrypter = encrypter;
    }

    public void start() {
        System.out.println("1. Encriptar texto.");
        System.out.println("2. Desencriptar texto.");
        System.out.println("3. Salir.");
        System.out.print("Ingrese una opción: ");
        String option = scanner.nextLine();
        if (!option.equals("1") && !option.equals("2") &&!option.equals("3")){
            System.out.println("Ingrese una opción válida.");
            start();
        }
        switch (option) {
            case "1":
                System.out.println(encrypter.encripta(solicitaTexto("Ingrese el texto que desea encriptar: ")));
                start();
                break;
            case "2":
                System.out.println(encrypter.desencripta(solicitaTexto("Ingrese el texto que desea desencriptar: ")));
                start();
                break;
        }
    }

    private String solicitaTexto(String texto){
        System.out.println(texto);
        return scanner.nextLine();
    }
}
