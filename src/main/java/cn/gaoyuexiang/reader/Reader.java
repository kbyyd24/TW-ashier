package cn.gaoyuexiang.reader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public interface Reader {
    <T>ArrayList<T> read(T t) throws IOException;
}
