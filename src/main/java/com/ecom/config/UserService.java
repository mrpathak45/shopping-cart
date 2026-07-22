package com.ecom.config;

import com.ecom.model.UserDtls;
import com.ecom.repository.UserRepository;
import com.ecom.util.AppConstant;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Increase failed login attempts
    public void increaseFailedAttempt(UserDtls userDtls) {
        userDtls.setFailedAttempt(userDtls.getFailedAttempt() + 1);
        userRepository.save(userDtls);
    }

    // Lock user account
    public void userAccountLock(UserDtls userDtls) {
        userDtls.setAccountNonLocked(false);
        userDtls.setLockTime(new Date()); // ✔ java.util.Date
        userRepository.save(userDtls);
    }

    // Unlock account if time expired
    public boolean unlockAccountTimeExpired(UserDtls userDtls) {

        Date lockTime = userDtls.getLockTime();

        if (lockTime == null) {
            return false;
        }

        long lockTimeMillis = lockTime.getTime();
        long currentTimeMillis = System.currentTimeMillis();

        long unlockTimeMillis =
                lockTimeMillis + (AppConstant.UNLOCK_DURATION_TIME * 60 * 1000);

        if (currentTimeMillis > unlockTimeMillis) {
            userDtls.setAccountNonLocked(true);
            userDtls.setFailedAttempt(0);
            userDtls.setLockTime(null);
            userRepository.save(userDtls);
            return true;
        }

        return false;
    }
}
