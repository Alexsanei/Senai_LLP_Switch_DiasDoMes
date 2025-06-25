import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome ou número do mês: ");
        String entrada = scanner.nextLine().trim().toLowerCase();

        int dias = 0;
        boolean mesValido = true;

        switch (entrada) {
            case "1":
            case "janeiro":
            case "3":
            case "março":
            case "marco":
            case "5":
            case "maio":
            case "7":
            case "julho":
            case "8":
            case "agosto":
            case "10":
            case "outubro":
            case "12":
            case "dezembro":
                dias = 31;
                break;

            case "4":
            case "abril":
            case "6":
            case "junho":
            case "9":
            case "setembro":
            case "11":
            case "novembro":
                dias = 30;
                break;

            case "2":
            case "fevereiro":
                System.out.print("Digite o ano: ");
                int ano = scanner.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;

            default:
                mesValido = false;
                System.out.println("Mês inválido.");
        }

        if (mesValido) {
            System.out.println("Esse mês tem " + dias + " dias.");
        }

        scanner.close();
    }
}
