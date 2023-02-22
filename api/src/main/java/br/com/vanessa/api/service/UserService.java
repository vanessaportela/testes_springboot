package br.com.vanessa.api.service;

import br.com.vanessa.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
