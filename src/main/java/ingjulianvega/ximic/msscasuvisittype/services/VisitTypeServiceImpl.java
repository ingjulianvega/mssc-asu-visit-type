package ingjulianvega.ximic.msscasuvisittype.services;

import ingjulianvega.ximic.msscasuvisittype.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasuvisittype.domain.VisitTypeEntity;
import ingjulianvega.ximic.msscasuvisittype.domain.repositories.VisitTypeRepository;
import ingjulianvega.ximic.msscasuvisittype.exception.VisitTypeException;
import ingjulianvega.ximic.msscasuvisittype.web.Mappers.VisitTypeMapper;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitType;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitTypeDto;
import ingjulianvega.ximic.msscasuvisittype.web.model.VisitTypeList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class VisitTypeServiceImpl implements VisitTypeService {

    private final VisitTypeRepository visitTypeRepository;
    private final VisitTypeMapper visitTypeMapper;


    @Cacheable(cacheNames = "visitTypeListCache", condition = "#usingCache == false")
    @Override
    public VisitTypeList get(Boolean usingCache) {
        log.debug("get()...");
        return VisitTypeList
                .builder()
                .visitTypeDtoList(visitTypeMapper.visitTypeEntityListToVisitTypeDtoList(visitTypeRepository.findAll()))
                .build();
    }

    @Cacheable(cacheNames = "visitTypeCache")
    @Override
    public VisitTypeDto getById(UUID id) {
        log.debug("getById()...");
        return visitTypeMapper.visitTypeEntityToVisitTypeDto(
                visitTypeRepository.findById(id)
                        .orElseThrow(() -> new VisitTypeException(ErrorCodeMessages.VISIT_TYPE_NOT_FOUND, "")));
    }

    @Override
    public void create(VisitType visitType) {
        log.debug("create()...");
        visitTypeMapper.visitTypeEntityToVisitTypeDto(
                visitTypeRepository.save(
                        visitTypeMapper.visitTypeDtoToVisitTypeEntity(
                                VisitTypeDto
                                        .builder()
                                        .name(visitType.getName())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, VisitType visitType) {
        log.debug("updateById...");
        VisitTypeEntity visitEntity = visitTypeRepository.findById(id)
                .orElseThrow(() -> new VisitTypeException(ErrorCodeMessages.VISIT_TYPE_NOT_FOUND, ""));

        visitEntity.setName(visitType.getName());
        visitTypeRepository.save(visitEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        visitTypeRepository.deleteById(id);
    }
}
