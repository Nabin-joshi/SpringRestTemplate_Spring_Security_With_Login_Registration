package com.RestService.controller.auth;

import com.RestService.dto.AuthenticationRequestDTO;
import com.RestService.dto.AuthenticationResponseDTO;
import com.RestService.dto.RegisterRequestDTO;
import com.RestService.dto.ResponseDTO;
import com.RestService.exception.EntityNotFoundException;
import com.RestService.service.auth.AuthenticationService;
import com.RestService.service.auth.LogoutService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthenticationController {

  private final AuthenticationService service;
  private final LogoutService logoutService;

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponseDTO> register(
      @RequestBody RegisterRequestDTO request
  ) {
    return ResponseEntity.ok(service.register(request));
  }
  @PostMapping("/authenticate")
  public ResponseDTO<?> authenticate(
      @RequestBody AuthenticationRequestDTO request
  ) {
    try{
      return new ResponseDTO<>(service.authenticate(request));
    } catch(Exception ex){
      log.info(ex.getMessage());
        throw new EntityNotFoundException("invalid login credential");
    }

  }

}