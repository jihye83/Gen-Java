package Lista4_ArrayVetorMatriz;

import java.util.Scanner;

public class Extra {
	/*
	 *5. Crie programas em Java que crie e exiba as seguintes figuras abaixo utilizando matrizes:
	 * 1)* * * *   2)* * * *   3)*
	 *   * * * *     *     *     * *
	 *   * * * *     *     *     * * *
	 *   * * * *     * * * *     * * * *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		char [][] matriz = {{'*','*','*','*'},{'*','*','*','*'},{'*','*','*','*'},{'*','*','*','*'}};
		int i, j;
		
		/*
	 	char [][] matriz = new char[4][4];
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("\nDigite o * : ");
				String c = sc.next();
				matriz[i][j] = c.charAt(0);
			}
		}
		 */
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");		
			}
			System.out.println();
		}
		
		System.out.println();
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (i == 0 || i == 3 || j == 0 || j == 3) {
					System.out.print(matriz[i][j] + " ");
				} else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		
		System.out.println();
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (i > j || i == j) {
					System.out.print(matriz[i][j] + " ");
				}else {
					System.out.print("  ");
				} 		
			}
			System.out.println();
		}
	}
/*
 * [0][0] [0][1] [0][2] [0][3]
 * [1][0] [1][1] [1][2] [1][3]
 * [2][0] [2][1] [2][2] [2][3]
 * [3][0] [3][1] [3][2] [3][3]
 */
}
