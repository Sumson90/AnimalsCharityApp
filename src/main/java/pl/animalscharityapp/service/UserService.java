package pl.animalscharityapp.service;

import org.springframework.stereotype.Service;
import pl.animalscharityapp.model.User;
import pl.animalscharityapp.reop.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findByUserId(Long Id) {
        return
        userRepository.findAllById(Id);


    }
}
