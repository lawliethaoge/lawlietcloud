package com.lawliet.cloud.dao;

import com.lawliet.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author KongHao  lawliet.haoge@gmail.com
 * 2019/4/21 16:18
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
