package cn.gaoyuexiang.exception;

import java.io.IOException;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class JsonFormatException extends IOException {

    public JsonFormatException() {}

    public JsonFormatException(String message) {
        super(message);
    }
}
