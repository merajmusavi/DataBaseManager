package com.example.DataBaseManager.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<DataModel,Long> {
}
