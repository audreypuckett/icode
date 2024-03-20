package com.fdmgroup.icode.physical.therapist;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.physical.model.Therapist;

@Service
public class TherapistLoginService {
	 
	private TherapistRepository repo;

    public TherapistLoginService(TherapistRepository repo) {
		this.repo = repo;
	}

	/*
	 * Both username and password need to match
	 */
	public boolean loginUser(String username, String password) {
       boolean isSuccessful = false;
		List<Therapist> therapists = repo.getAllTherapists(); 
	   for(Therapist currentTherapist : therapists){
			if(currentTherapist.getUsername().equals(username) && currentTherapist.getPassword().equals(password)){
				isSuccessful = true;
				break;
			}
	   }
	   return isSuccessful;
    }
}
