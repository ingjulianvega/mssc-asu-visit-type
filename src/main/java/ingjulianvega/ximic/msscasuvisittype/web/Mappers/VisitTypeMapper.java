package ingjulianvega.ximic.msscasuvisittype.web.Mappers;


import ingjulianvega.ximic.msscasuvisittype.domain.VisitTypeEntity;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitTypeDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface VisitTypeMapper {
    VisitTypeDto visitTypeEntityToVisitTypeDto(VisitTypeEntity visitTypeEntity);

    VisitTypeEntity visitTypeDtoToVisitTypeEntity(VisitTypeDto visitTypeDto);

    ArrayList<VisitTypeDto> visitTypeEntityListToVisitTypeDtoList(List<VisitTypeEntity> visitTypeEntityList);
}