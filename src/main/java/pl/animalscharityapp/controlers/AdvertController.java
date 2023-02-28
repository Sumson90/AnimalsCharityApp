package pl.animalscharityapp.controlers;

import org.springframework.web.bind.annotation.*;
import pl.animalscharityapp.Dto.AdvertDto;
import pl.animalscharityapp.model.Advert;
import pl.animalscharityapp.service.AdvertService;

import java.util.List;

@RequestMapping("/advert")
@RestController
public class AdvertController {

    public final AdvertService advertService;


    public AdvertController(AdvertService advertService) {
        this.advertService = advertService;

    }

    @GetMapping(value = "/{advertTitle}")
    @ResponseBody
    public List<Advert> getAllOffers(@PathVariable(value = "advertTitle") String title) {
        return advertService.findByTitle(title);
    }

    @GetMapping(value = "/dto/{advertId}")
    @ResponseBody
    public AdvertDto getAdvert(@PathVariable(value = "advertId") Long id) {
        return advertService.getAdvertDto(id);
    }

    @PostMapping(value = "/save")
    public String addAdvert (@RequestBody AdvertDto advertDto){
         advertService.saveAdvert(advertDto);
         String result = "Advert added :" + advertDto;
         return result;

    }

    @PutMapping(value = "/update")
    public void updateAdvert(Long id){
        advertService.update(id);
    }

}
