package pers.xzj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.xzj.pojo.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
