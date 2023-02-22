package br.com.vanessa.api.service;

import br.com.vanessa.api.domain.User;
import br.com.vanessa.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}
