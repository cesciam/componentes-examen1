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
        char option = scanner.nextLine().charAt(0);
        if (option != "{1"  || option != "2" || option != "3"){
            System.out.println("Ingrese una opción válida.");
            start();
        }
    }
}
