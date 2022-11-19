package ImprimindoMedia;

public class ImpressaoDasMedias {
	public static void main(String[] args) {
		
		/* Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
		 *  A média dos números 4, 5 e 6.
		 *   A soma das duas médias. 
		 *   A média das médias*/
		
		Calculando calculando = new Calculando();
		calculando.setSequencia1(7+8+9);
		calculando.setSequencia2(4+5+6);
		calculando.setSomaDasMedias(calculando.getMediaSequencia1() + calculando.getMediaSequencia2());
		calculando.setMedia(2);		
		calculando.setMediaDasMedias(calculando.getSomaDasMedias());
		
		
		
		System.out.println("  ");
		System.out.println("A soma da sequência 1 (8+9+7) é igual a :  " + calculando.getSequencia1());
		System.out.println("A média da sequência 1 é : " +calculando.getMediaSequencia1());
		System.out.println(" ");
		System.out.println("A soma da sequência 2 ( 4+5+6) é igual a :  " + calculando.getSequencia2());
		System.out.println("A média da sequência 2 é : " +calculando.getMediaSequencia2());
		System.out.println("  ");
		System.out.println("A soma das duas médias é igual a :" + calculando.getSomaDasMedias());
		System.out.println("  ");
		System.out.println("A média das médias é igual a :" + calculando.getMediaDasMedias());
		
		
	}
}
