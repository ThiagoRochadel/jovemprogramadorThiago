import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> tarefas = new ArrayList<>();
        int opcao=0;

        do{
            System.out.print("""

                    ===MENU===
                    1. Adicionar  Tarefa
                    2. Remover Tarefa
                    3. Listar Tarefas
                    4. Sair

                    Digite sua opção: """);



            if(!sc.hasNextInt()){
                System.out.println("Digite um número e não escreva !");
                sc.nextLine();
                continue;
            }
            opcao = sc.nextInt();

            sc.nextLine();


            switch (opcao){
                case 1:
                    System.out.println("Adicionar Tarefa ");
                    System.out.print("Digite uma tarefa: ");
                    tarefas.add(sc.nextLine());
                    System.out.println("\nTarefa Adicionada!\n");
                    break;
                case 2:
                    System.out.println("Remover Tarefa");
                    if(tarefas.size()  == 0){
                        System.out.println("Lista Vazia");
                        continue;
                    }
                    for(String item:tarefas){
                        System.out.println(tarefas.indexOf(item) +" - " + item);

                    }
                    System.out.println("Qual tarefa deseja remover: ");
                    tarefas.remove(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Lista de Tarefas");
                    tarefas.forEach((tarefa) -> System.out.println(tarefa));
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }


        }while(opcao != 4);

        System.out.println("Sistema Finalizado");

        sc.close();
    }
}
