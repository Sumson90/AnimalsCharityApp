package pl.animalscharityapp.reop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.animalscharityapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
