package com.RestService.converter.impl;

import com.RestService.model.User;
import com.RestService.converter.BaseConverter;
import com.RestService.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends BaseConverter<User, UserDTO> {

	@Override
	public User fromDto(UserDTO dto) {
		User user = new User();
		user.setFirstname(dto.getFirstname());
		user.setLastname(dto.getLastname());
		user.setRoles(dto.getRoles());
		user.setEmail(dto.getEmail());
		user.setPassword(dto.getPassword());
		return user;
	}


	@Override
	public UserDTO fromEntity(User entity) {
//		RestBaseProperty rb = new RestBaseProperty();
//		rb.setDomain("localhost");
//		rb.setPort("8888");
//		rb.setProtocol("http");
//		rb.setResourceLocation("resource");
		UserDTO userDTO = new UserDTO();
//		userDTO.setUserId(entity.getId());
//		userDTO.setUsername(entity.getUsername());
//		userDTO.setEmail(entity.getEmail());
//		userDTO.setFullName(entity.getFullName());
//		userDTO.setMobileNumber(entity.getMobileNumber());
//		userDTO.setLocked(entity.isLocked());
//		userDTO.setEnabled(entity.isEnabled());
//		userDTO.setExpired(entity.isExpired());
//		userDTO.setFirstLogin(entity.isFirstLogin());
//		userDTO.setWardNo(entity.getWardNo());
//		userDTO.setRoles(entity.getRole().stream().map(role -> role.getRole()).collect(Collectors.toList()));
//		userDTO.setRegisteredDate(entity.getRegisteredDate());
//		userDTO.setStamp(ImageUtilService.makeFullImageurl(rb, entity.getStamp()));
//		userDTO.setSignature(ImageUtilService.makeFullImageurl(rb, entity.getSignature()));
		return userDTO;
	}

	//Splits first name, middle name and last name from full name string 
	//and puts it into the string array
	private String[] splitFirstMiddleAndLastName(String fullName) {
		return fullName.split(" ");
	}
}
