package br.com.vanessa.api.service.impl;

import br.com.vanessa.api.domain.User;
import br.com.vanessa.api.repositories.UserRepository;
import br.com.vanessa.api.service.UserService;
import br.com.vanessa.api.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
