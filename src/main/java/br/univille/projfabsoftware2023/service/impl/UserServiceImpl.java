package br.univille.projfabsoftware2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.projfabsoftware2023.entity.User;
import br.univille.projfabsoftware2023.repository.UserRepository;
import br.univille.projfabsoftware2023.service.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

}
