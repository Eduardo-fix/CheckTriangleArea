// 2010552 - Eduardo Max dos Reis Silva

package aplicacao; 

import java.util.Locale; 
import java.util.Scanner;

import programa.triangulo;

public class programaPrincipal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//instanciação de variáveis
        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

		//input usuário
        System.out.println("Entre com os Lados do Triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os Lados do Triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		//checando área dos triângulos
		double p = (x.a + x.b + x.c)/2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		//lógica de retorno para usuário
		if (areaX > areaY) {
			System.out.println("O triângulo X tem a maior área!");
			}
			else if (areaY > areaX) {
			System.out.println("O triângulo Y tem a maior área!");
			}
			else {
				System.out.println("Os dois triângulos são iguais!");
			}
		
	
		sc.close();
    }
}






