package com.fdmgroup.icode.physical.therapist;

import org.springframework.stereotype.Service;

@Service
public class TherapistService {

    private TherapistLoginService loginService;

    public TherapistService(TherapistLoginService loginService) {
        this.loginService = loginService;
    }

    public boolean loginUser(String username, String password) {
       return loginService.loginUser(username, password);
    }
	

}
