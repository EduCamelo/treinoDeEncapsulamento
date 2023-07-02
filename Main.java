import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        personagem x = new personagem();
        Scanner input = new Scanner(System.in);
        int y =0, z;
        do{
            System.out.println();
            System.out.println("=== Menu ===");
            System.out.println("1 - Andar pela Caos city");
            System.out.println("2 - Pular para o outro lado da cidade");
            System.out.println("3 - Descansar na rua");
            System.out.println("4 - Utilizar mágia");
            System.out.println("5 - Abrir janela de Status");
            System.out.println("0 - Encerrar programa");
            System.out.println();
            System.out.print("Escolha uma ação: ");
            z = input.nextInt(); input.nextLine();
            System.out.println();
            switch(z){
                case 1:
                x.andar();
                break;

                case 2:
                x.pular();
                break;
                
                case 3:
                x.descansar();
                System.out.println("Você dormiu no chão");
                break;

                case 4:
                x.magia();
                System.out.println("Você usou magia para cantar.");
                break;

                case 5:
                x.abrirStatus();
                x.fecharStatus();
                break;

                case 0:
                y++;
                break;
            }
        }while(y == 0);
        input.close();
        System.out.println("Programa encerrado com sucesso.");
    }
}
