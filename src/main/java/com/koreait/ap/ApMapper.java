package com.koreait.ap;

import com.koreait.ap.model.ApartmentInfoEntity;
import com.koreait.ap.model.LocationCodeEntity;
import com.koreait.ap.model.SearchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApMapper {
    List<LocationCodeEntity> selLocationList();
    LocationCodeEntity selLocation(String excd);
    List<ApartmentInfoEntity> selApartmentInfoList(SearchDto dto);
    int insApartmentInfo(ApartmentInfoEntity entity);
}
