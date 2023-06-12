package com.loeaf.mybatishelper.model;

import java.util.Date;
import lombok.Data;

@Data
public class M_Restaurant {
    private String id;

    private String dataType;

    private String englishAddress;

    private String holiday;

    private String jibunAddress;

    private Double latitude;

    private Double longitude;

    private String miniAddress;

    private String name;

    private String phoneNumber;

    private String referenceUrl;

    private Integer refinedGeoLocation;

    private Date regDate;

    private String representativeMenu;

    private Integer restaurantNumber;

    private String roadAddress;

    private Date updateDate;

    private String cityTypeId;

    private String countryTypeId;

    private String foodTypeId;

    private String instaInfoId;

    private String geoInfo;

    private String googleCallApiUrl;

    private String googleCallDataUuid;

    private Date registDatetime;

    private Date modifiedDatetime;
}