package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.entities.PassBasedEnc;
import com.example.demo.entities.SaltValue;
import com.example.demo.services.LoginService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LoginController {
	
@Autowired
 LoginService lservice;
@Autowired
SaltValue saltValue;

@PostMapping("/chkLogin")
public Login chkLogin(@RequestBody LoginCheck lchk)
{
	System.out.println(saltValue.getSalt());
	String encrypted=PassBasedEnc.generateSecurePassword(lchk.getPassword(),saltValue.getSalt());
	return lservice.getLogin(lchk.getEmail_id(),encrypted);
}
	
}
