package ImprimindoMedia;

public class ImpressaoDasMedias {
	public static void main(String[] args) {
		
		/* Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7.
		 *  A m�dia dos n�meros 4, 5 e 6.
		 *   A soma das duas m�dias. 
		 *   A m�dia das m�dias*/
		
		Calculando calculando = new Calculando();
		calculando.setSequencia1(7+8+9);
		calculando.setSequencia2(4+5+6);
		calculando.setSomaDasMedias(calculando.getMediaSequencia1() + calculando.getMediaSequencia2());
		calculando.setMedia(2);		
		calculando.setMediaDasMedias(calculando.getSomaDasMedias());
		
		
		
		System.out.println("  ");
		System.out.println("A soma da sequ�ncia 1 (8+9+7) � igual a :  " + calculando.getSequencia1());
		System.out.println("A m�dia da sequ�ncia 1 � : " +calculando.getMediaSequencia1());
		System.out.println(" ");
		System.out.println("A soma da sequ�ncia 2 ( 4+5+6) � igual a :  " + calculando.getSequencia2());
		System.out.println("A m�dia da sequ�ncia 2 � : " +calculando.getMediaSequencia2());
		System.out.println("  ");
		System.out.println("A soma das duas m�dias � igual a :" + calculando.getSomaDasMedias());
		System.out.println("  ");
		System.out.println("A m�dia das m�dias � igual a :" + calculando.getMediaDasMedias());
		
		
	}
}
