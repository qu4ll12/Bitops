package core.TestGeneration.result;

import lombok.Getter;

@Getter
public class ExceptionOutput {
    private final String exceptionClass;
    private final String message;

    public ExceptionOutput(Throwable throwable) {
        this.exceptionClass = throwable.getClass().getSimpleName();
        this.message = throwable.getMessage();
    }

    @Override
    public String toString() {
        if (message == null || message.isEmpty()) {
            return exceptionClass;
        }
        return exceptionClass + ": " + message;
    }
}
