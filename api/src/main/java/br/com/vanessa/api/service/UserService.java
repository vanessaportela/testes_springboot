package br.com.vanessa.api.service;

import br.com.vanessa.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
