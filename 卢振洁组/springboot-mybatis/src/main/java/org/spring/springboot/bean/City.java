package org.spring.springboot.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * 城市实体类
 */
public class City {

    /**
     * 城市编号
     */
    @Value("${city.id}")
    private Long id;

    /**
     * 省份编号
     */
    @Value("${city.provinceId}")
    private Long provinceId;

    /**
     * 城市名称
     */
    @Value("${city.cityName}")
    private String cityName;

    /**
     * 描述
     */
    @Value("${city.description}")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
