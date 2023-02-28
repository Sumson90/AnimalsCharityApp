package pl.animalscharityapp.service;

import org.springframework.stereotype.Service;
import pl.animalscharityapp.Dto.AdvertDto;
import pl.animalscharityapp.model.Advert;
import pl.animalscharityapp.model.User;
import pl.animalscharityapp.reop.AdvertRepository;
import pl.animalscharityapp.reop.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdvertService {
    private final AdvertRepository advertRepository;
    private final UserRepository userRepository;


    public AdvertService(AdvertRepository advertRepository, UserRepository userRepository) {
        this.advertRepository = advertRepository;
        this.userRepository = userRepository;
    }

   public void addAdvert(Advert advert){
        advertRepository.save(advert);
    }


    public List<Advert> findByTitle(String title) {
        return advertRepository.dupa123(title);
    }
    public AdvertDto getAdvertDto(Long id){
        Optional<Advert> advert = advertRepository.findById(id);
        AdvertDto advertDto =new AdvertDto();
        advertDto.setCity(advert.get().getCity());
        advertDto.setTitle(advert.get().getTitle());
        return advertDto;
    }

    public void saveAdvert(AdvertDto advertDto){
        Optional<User> byId = userRepository.findById(advertDto.getUserId());
        Advert advert = new Advert();
        advert.setAdvertUser(byId.get());
        advert.setTitle(advertDto.getTitle());
        advert.setCity(advertDto.getCity());
        advert.setDate(advertDto.getDate());
        advert.setDescription(advertDto.getDescription());
        advertRepository.save(advert);

    }
    public void update(Long id){
        Advert toUpdate = advertRepository.findAdvertClassById(id);
        toUpdate.setDescription("dupa");
        advertRepository.save(toUpdate);

    }
}
