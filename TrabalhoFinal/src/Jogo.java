import java.util.Random;

public class Jogo {

	private char[][] tabuleiro;
	
	public void iniciar(){
        int numLinhas = 8;
        int numColunas = 8;
        int[][] tabuleiro = new int[numLinhas][numColunas];

        Random rand = new Random();

        // Preencher o vetor com números aleatórios entre 0 e 100
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                tabuleiro[i][j] = rand.nextInt(8);

                
            }
            
        }
        

		//Continuar o código....
		numeroAleatorio();
	}
	
	
	private void numeroAleatorio() {
		int linha = (int) (Math.random() * 8);
		int coluna = (int) (Math.random() * 8);
		System.out.println(linha + " " + coluna);
	}
	
	//Demais métodos:
	//private .....
}