  import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;



public class Main {
  public static void main(String[] args) {

    int iniciarQuiz = 0;
    int pontuacao = 0;
    int questionario = 0;
    int resposta;
  
    System.out.println("Welcome! Would you like to start the quiz?");
    System.out.println("1. Yes || 2. No");
    iniciarQuiz = new Scanner(System.in).nextInt();

    //Criando um objeto do tipo Scanner para ler a entrada do usuário
    
    if (iniciarQuiz == 1){
      System.out.println("Let's begin!\n");
      questionario = 1;
    } else {
      System.out.println("No problem! Se ya!");
    };

    //Criando diversos cases para cada pergunta do quiz

    //A resposta correta é de acordo com o número definido na pergunta
    
    switch (questionario) {
      case 1:{
      
        System.out.println("(1) What is the capital of Brazil?\n");
        System.out.println("1. São Paulo || 2. Rio de Janeiro\n");
        System.out.println("3. Brasília  || 4. Salvador\n");
        System.out.println("R: ");
        resposta = new Scanner(System.in).nextInt();

        if (resposta == 3){
          System.out.println("\nCorrect! You've got 10 points\n");
          pontuacao = pontuacao + 10;
        } else {
          System.out.println("\nWrong! You've got 0 points");
        }

        System.out.println("Would you like to continue?");
        System.out.println("1. Yes || 2. No");
        if (new Scanner(System.in).nextInt() == 1){
          questionario = 2;
        } else {
          break;
        };
      }; 

      case 2:{
        System.out.println("(2) What is the biggest state of Brazil?\n");
        System.out.println("1. Amazonas      || 2. Rio de Janeiro \n");
        System.out.println("3. Minas Gerais  || 4. Mato Grosso do Sul \n");
        System.out.println("R: ");
        resposta = new Scanner(System.in).nextInt();

        if (resposta == 1){
          System.out.println("\nCorrect! You've got 10 points\n");
          pontuacao += 10;
        } else {
          System.out.println("\nWrong! You've got 0 points");
        }

        System.out.println("Next question?");
        System.out.println("1. Yes || 2. No");
        if (new Scanner(System.in).nextInt() == 1){
          questionario = 3;
        } else {
          break;
        };
      };

      case 3:{
        System.out.println("(3) What year does Brazil became a Republic?\n");
        System.out.println("1. 1822      || 2. 1889 \n");
        System.out.println("3. 1992      || 4. 1960 \n");
        System.out.println("R: ");
        resposta = new Scanner(System.in).nextInt();

        if (resposta == 2){
          System.out.println("\nCorrect! You've got 10 points\n");
          pontuacao += 10;
        } else {
          System.out.println("\nWrong! You've got 0 points");
        }

        System.out.println("Next question?");
        System.out.println("1. Yes || 2. No");
        if (new Scanner(System.in).nextInt() == 1){
          questionario = 4;
        } else {
          break;
        };
      };

      case 4:{
        System.out.println("(4) What is the name of the president of Brazil?\n");
        System.out.println("1. João Amoedo      || 2. Lula \n");
        System.out.println("3. Jair Bolsonaro   || 4. Dilma Roussef \n");
        System.out.println("R: ");
        resposta = new Scanner(System.in).nextInt();

        if (resposta == 2){
          System.out.println("\nCorrect! You've got 10 points\n");
          pontuacao += 10;
        } else {
          System.out.println("\nWrong! You've got 0 points");
        }

        System.out.println("Next question?");
        System.out.println("1. Yes || 2. No");
        if (new Scanner(System.in).nextInt() == 1){
          questionario = 5;
        } else {
          break;
        };
      };

      case 5:{
        System.out.println("(5) How many World Cup's Brazil have?\n");
        System.out.println("1. 3   || 2. 6 \n");
        System.out.println("3. 5   || 4. 2 \n");
        System.out.println("R: ");
        resposta = new Scanner(System.in).nextInt();

        if (resposta == 2){
          System.out.println("\nCorrect! You've got 10 points\n");
          pontuacao += 10;
        } else {
          System.out.println("\nWrong! You've got 0 points");
        }

        System.out.println("Next question?");
        System.out.println("1. Yes || 2. No");
        if (new Scanner(System.in).nextInt() == 1){
          questionario = 6;
        } else {
          break;
        };
      };

      case 6:{
        
      }
    };

    System.out.println("Your final score is: " + pontuacao);
  };  
}
