package com.example.DataBaseManager.users;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    List<DataModel> allUsers() {
        return userRepository.findAll();
    }

    Optional<DataModel> getUserById(Long id) {
        return userRepository.findById(id).or(() -> Optional.of(new DataModel( "not found", "not found", "not found")));
    }

    void insertUser(DataModel dataModel){
        List<DataModel> all = userRepository.findAll();
        DataModel dataModel1 = all.get(all.size() - 1);
        dataModel.setId(dataModel1.getId()+1);
        userRepository.save(dataModel);
    }

    void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

}
