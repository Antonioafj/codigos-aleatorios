package tech.buildrun.service;


import jakarta.enterprise.context.ApplicationScoped;
import tech.buildrun.entity.UserEntity;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity){
        userEntity.persist(userEntity);
        return  userEntity;
    }
}
