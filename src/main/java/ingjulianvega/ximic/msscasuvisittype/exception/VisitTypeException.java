package ingjulianvega.ximic.msscasuvisittype.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitTypeException extends RuntimeException {

    private HttpStatus httpStatus;
    private String apiCode;
    private String error;
    private String message;
    private String solution;
}

