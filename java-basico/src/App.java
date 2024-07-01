import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int x = 0;
        int op;

         do{
            System.out.println(" 1 - Calcular area de um circulo: ");
            System.out.println(" 2 - Calcular area de um triangulo: ");
            System.out.println(" 3 - Calcular area de um triangulo Isosceles: ");
            System.out.println(" 4 - Calcular area de um triangulo equilatero: ");
            System.out.println(" 5 - Calcular perimetro de um retangulo: ");
            System.out.println(" 6 - Calcular perimetro de um quadrado: ");
            System.out.println(" 7 - Calcular volume de uma esfera: ");
            System.out.println(" 0 - Sair ");

            System.out.println(" Digite a operação trigonometrica desejada: ");

            op = sca.nextInt();
            AreaTrigonometrica area = new AreaTrigonometrica();

            switch (op) {
                case 1:
                    area.areaFoCircle();
                    break;
                case 2:
                    area.areaOfTriangle();
                    break;
                case 3:
                    area.areaOfisocelesTriangle();
                    break;
                case 4:
                    area.areaofEquilateralTriangle();
                    break;
                case 5:
                    area.perimeterOfRectangle();
                    break;
                case 6:
                    area.perimeterOfSquare();
                    break;
                case 7:
                    area.volumeOfSphere();
                default:
                System.out.println("O número escolhido é inválido! Digite um número entre 1 a 7.");

            }
            
        }while (x != 0);

    }
}
