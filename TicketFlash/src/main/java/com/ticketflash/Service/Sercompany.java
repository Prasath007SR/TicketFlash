package com.ticketflash.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketflash.Model.ModelCompany;
import com.ticketflash.Repository.RepoCompany;

@Service
public class Sercompany {
@Autowired
RepoCompany userRepo;
	public String validateUser(String email, String password) {
		String result="";
		ModelCompany u=userRepo.findByEmail(email);
		if(u==null)
		{
			result="Invalid username/password";
		}
			else
			{
				if(u.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Incorrect password";
				}
			}
		

		return result;
		}
	}