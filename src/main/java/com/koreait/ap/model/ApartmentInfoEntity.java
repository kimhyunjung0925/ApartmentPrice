package com.koreait.ap.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ApartmentInfoEntity {
    private int ipart;
    @JsonProperty("거래금액") private String dealamout;
    @JsonProperty("건축년도") private String buildyear;
    @JsonProperty("년") private String dealyear;
    @JsonProperty("월") private String dealmonth;
    @JsonProperty("일") private String dealday;
    @JsonProperty("법정동") private String dong;
    @JsonProperty("아파트") private String apartmentname;
    @JsonProperty("전용면적") private float areaforexclusiveuse;
    @JsonProperty("지번") private String jibun;
    @JsonProperty("층") private int floor;
    private int locationcode;
    @JsonProperty("도로명구군시코드") private String excd;
    private String localnm;

    public void setDealamount(String dealamount){
        this.dealamout = dealamount.replaceAll(",","").trim(); //trim은 양쪽 빈칸 없앰
    }


}
