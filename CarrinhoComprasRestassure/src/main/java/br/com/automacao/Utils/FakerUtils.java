package br.com.automacao.Utils;

import java.util.Random;


import br.com.automacao.entity.User;


public class FakerUtils {
	public static String generateRandomFullName()  {
		Random r = new Random();
        String gerada = Integer.toString(Math.abs(r.nextInt()), 34).substring(0, 6);
        return "Name"+ gerada;
    }
    
	
}