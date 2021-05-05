package ingjulianvega.ximic.msscasuvisittype.exception;

import lombok.Getter;

@Getter
public class VisitTypeException extends RuntimeException {

    private final String code;

    public VisitTypeException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

