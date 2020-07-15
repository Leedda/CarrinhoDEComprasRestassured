package br.com.automacao.Utils;

import java.util.Random;

public class FakerUtils {
	public static String generateRandomFullNome() {
        Random r = new Random();
        String gerada = Integer.toString(Math.abs(r.nextInt()), 25).substring(0, 6);
        return "Nome"+ gerada;
    }
	
//	public static String generateRandomFullEmail() {
//        Random r = new Random();
//        String gerada = Integer.toString(Math.abs(r.nextInt()), 25).substring(0, 12);
//        return "Email"+ gerada;
//    }
}
