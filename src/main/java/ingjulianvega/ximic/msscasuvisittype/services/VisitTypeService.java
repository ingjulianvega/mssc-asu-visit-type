package ingjulianvega.ximic.msscasuvisittype.services;


import ingjulianvega.ximic.msscasuvisittype.web.model.VisitType;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitTypeDto;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitTypeList;

import java.util.UUID;

public interface VisitTypeService {
    VisitTypeList get();

    VisitTypeDto getById(UUID id);

    void create(VisitType visitType);

    void updateById(UUID id, VisitType visitType);

    void deleteById(UUID id);

}
