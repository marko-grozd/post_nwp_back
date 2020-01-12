package semc.nwp.Post.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import semc.nwp.Post.demo.model.User;

public interface UserSecRepo extends JpaRepository<Integer, User> {


    User findByusernameAndpassword(String username, String password);
}
