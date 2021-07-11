package ingjulianvega.ximic.msscasuvisittype.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "visit-type")
public class VisitTypeParameters {

    private String api;
}
