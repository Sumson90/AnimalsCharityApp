package pl.animalscharityapp.reop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.animalscharityapp.model.Advert;

import java.util.List;
@Repository
public interface AdvertRepository extends JpaRepository <Advert, Long>{

    @Query(nativeQuery = true, value = "select * from advert where title = :advertTitle")
    List<Advert> dupa123(@Param(value = "advertTitle")String title);
    @Query(nativeQuery = true, value = "select * from advert where id = :advertId")
   Advert findAdvertClassById(@Param(value = "advertId")Long id);
}
