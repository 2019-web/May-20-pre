package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.bean.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

//    public City findCityByName(String cityName) {
//        return cityDao.findByName(cityName);
//    }

//    public List<City> findAllCities() {
//        return cityDao.findAll();
//    }
public List<City> findAllCity(){
    return cityDao.findAllCity();
}

    public City findCityById(Long id) {
    return cityDao.findById(id);
}

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }

}
