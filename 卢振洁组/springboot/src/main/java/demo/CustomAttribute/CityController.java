package demo.CustomAttribute;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class CityController {
        @Autowired
        City city;

        @RequestMapping("/city")
        public String sayCity(){
            return " 城市："+city.getName()+","+city.getLatitude();
        }
    }
