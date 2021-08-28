package core;

import entities.User;
import mernis.mernisService;

public class mernisServiceAdapter implements UserIdentityValidatorService {

	@Override
	public boolean isValid(User user) {
		mernisService mernisService = new mernisService();

		return mernisService.tcKimlikDogrula(Long.parseLong(user.getIdentityNumber()), user.getFirstName(),
				user.getLastName(), user.getYearOfBirth());
	}

}
