package concurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

//        não podemos prever a ordem em que as tarefas
//começarão a ser executadas, mesmo se conhecermos a ordem em que elas foram criadas e iniciadas.

        // cria e nomeia cada executável
        PrintTask task1 = new PrintTask("task1");
        PrintTask task2 = new PrintTask("task2");
        PrintTask task3 = new PrintTask("task3");
        System.out.println("Starting Executor");

        // cria ExecutorService para gerenciar threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // inicia as três PrintTasks
        executorService.execute(task3); // inicia task3 depois de um tempo passado o parametro
        executorService.execute(task1); // inicia task1, ela foi iniciada depois da thread pricipal
        executorService.execute(task2); // inicia task2

        // fecha ExecutorService -- ele decide quando fechar threads
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n"); //A Thread Main termina antes da task pois ainda há tarefas a serem finalizada
    }
}
