package com.RestService.dto;

import com.RestService.model.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class UserDTO implements Serializable {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	@JsonIgnore
	private String password;
	private String PhoneNumber;
	private boolean isLocked;
	private boolean enabled;
	private boolean firstLogin;
	private boolean expired;
	private Date registeredDate;
	private Set<Role> roles = new HashSet<>();;
	private String stamp;
	private String signature;
}
