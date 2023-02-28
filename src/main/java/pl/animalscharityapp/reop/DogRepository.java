package pl.animalscharityapp.reop;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.animalscharityapp.model.Dog;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
