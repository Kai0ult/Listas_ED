package ifma.lista02;

public class ListaMatrizes {
    public static void main(String[] args) {
        //q01();
        //q02();
        //q03();
        //q04();
        //q05();
        //q06();
        //q07();
        //q08();
        //q09();
        //q10();
        //q11();
        //q12();
        //q13();
        //q14();
        //q15();
        //q16();
        //q17();
        //q18();
    }


    public static void q01(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void q02(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                if(i + j == matriz.length - 1){
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void q03(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                if(i + j == matriz.length - 1){
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
    }

    public static void q04(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int soma = 0;
        for (int i=0; i < matriz.length; i++){
            soma += matriz[i][matriz.length - 1 - i];
        }
        System.out.println(soma);
    }

    public static void q05(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1) {
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
    }

    public static void q06(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int soma = 0, contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1) {
                    soma += matriz[i][j];
                    contador++;
                }
            }
        }
        double media = (double) soma / contador;
        System.out.println(media);
    }

    public static void q07(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j > matriz.length - 1) {
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
    }

    public static void q08(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j > matriz.length - 1) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                }
            }
        }
        System.out.println(maior);
    }

    public static void q09(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= matriz.length - 1) {
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }

    }

    public static void q10(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= matriz.length - 1) {
                    if (matriz[i][j] < menor){
                        menor = matriz[i][j];
                    }
                }
            }
        }
        System.out.println(menor);
    }

    public static void q11(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j < matriz.length - 1) {
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
    }

    public static void q12(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int multi = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j < matriz.length - 1) {
                    multi *= matriz[i][j];
                }
            }
        }
        System.out.println(multi);
    }

    public static void q13(){
        int[][] matrizA = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrizB = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                if (matrizA[i][j] % 2 == 0) {
                    matrizB[i][j] = matrizA[i][j] * matrizA[i][j];
                } else {
                    matrizB[i][j] = matrizA[i][j] * matrizA[i][j] * matrizA[i][j];
                }
                System.out.print(matrizB[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void q14(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrizRotacionada = new int[3][3];

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matrizRotacionada[j][matriz.length - 1 - i] = matriz[i][j];
            }
        }

        for (int i = 0; i < matrizRotacionada.length; i++) {
            for (int j = 0; j < matrizRotacionada[i].length; j++) {
                System.out.print(matrizRotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q15(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrizRotacionada = new int[3][3];

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matrizRotacionada[matriz.length - 1 - i][matriz.length - 1 - j] = matriz[i][j];
            }
        }

        for (int i = 0; i < matrizRotacionada.length; i++) {
            for (int j = 0; j < matrizRotacionada[i].length; j++) {
                System.out.print(matrizRotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q16(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrizRotacionada = new int[3][3];

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matrizRotacionada[matriz.length - 1 - j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < matrizRotacionada.length; i++) {
            for (int j = 0; j < matrizRotacionada[i].length; j++) {
                System.out.print(matrizRotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q17(){
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                if(j != 1){
                    System.out.print(matriz[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }

    public static void q18(){
        int[][] matriz = {{1,2}, {3,4}, {5,6}};
        int[][] matrizC = new int[2][3];
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                    matrizC[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                System.out.print(matrizC[i][j]+ " ");
            }
            System.out.println();
        }

    }


}
