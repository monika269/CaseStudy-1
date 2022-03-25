package com.example.demo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.UserEntity;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Integer> {


	//void signOut(int id);
	

}
