package br.com.automacao.factory;
import br.com.automacao.Utils.FakerUtils;
import br.com.automacao.entity.User;

public class UserFactory {
	public static User obterUsuarioValido() {
		User usuario = new User();
		usuario.setName(FakerUtils.generateRandomFullNome());
		usuario.setEmail("10minutemail.com");
		usuario.setCity("Round Rock");
		usuario.setState("TX");
		return usuario;
		
	}

}
//City State Expected Behavior

//Round Rock TX 200

//Tampa TX 404

//-- -- 400