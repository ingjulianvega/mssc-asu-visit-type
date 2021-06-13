package ingjulianvega.ximic.msscasuvisittype.web.controller;


import ingjulianvega.ximic.msscasuvisittype.services.VisitTypeService;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitType;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitTypeDto;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitTypeList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class VisitTypeController implements VisitTypeI {

    private final VisitTypeService visitTypeService;

    @Override
    public ResponseEntity<VisitTypeList> get(Boolean usingCache) {
        return new ResponseEntity<>(visitTypeService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<VisitTypeDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(visitTypeService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid VisitType visitType) {
        visitTypeService.create(visitType);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid VisitType visitType) {
        visitTypeService.updateById(id, visitType);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        visitTypeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
