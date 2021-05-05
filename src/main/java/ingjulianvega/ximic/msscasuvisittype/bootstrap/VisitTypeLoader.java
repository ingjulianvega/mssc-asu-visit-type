package ingjulianvega.ximic.msscasuvisittype.bootstrap;

import ingjulianvega.ximic.msscasuvisittype.domain.VisitTypeEntity;
import ingjulianvega.ximic.msscasuvisittype.domain.repositories.VisitTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class VisitTypeLoader implements CommandLineRunner {

    private final VisitTypeRepository visitTypeRepository;

    @Override
    public void run(String... args) throws Exception {
        if (visitTypeRepository.count() == 0) {
            loadVisitTypeObjects();
        }
    }

    private void loadVisitTypeObjects() {
        visitTypeRepository.saveAll(Arrays.asList(
                VisitTypeEntity.builder()
                        .name("Consulta")
                        .build(),
                VisitTypeEntity.builder()
                        .name("Lectura de exámenes")
                        .build(),
                VisitTypeEntity.builder()
                        .name("Otra")
                        .build()
        ));
    }
}