package me.daydayup.beesite.modules.blog.exception;

/**
 * @author mooejun
 * @since 2019/4/28
 */
public class TipException extends RuntimeException {

    public TipException() {
    }

    public TipException(String message) {
        super(message);
    }

    public TipException(String message, Throwable cause) {
        super(message, cause);
    }

    public TipException(Throwable cause) {
        super(cause);
    }

}
