package com.jobportal.jobportal.service;

import com.jobportal.jobportal.entity.User;
import com.jobportal.jobportal.repository.UserRepository;
import com.jobportal.jobportal.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepo;
    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;

    public String register(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);
        return "User Registered";
    }
    public String login(String email,String password){
        User user=userRepo.findByEmail(email).orElseThrow(()-> new RuntimeException("User not found"));
        if (!encoder.matches(password,user.getPassword())){
            throw new RuntimeException("Invalid password");
        }
        return jwtUtil.generateToken(email);
    }
}
