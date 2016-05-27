package cn.gaoyuexiang.reader;

import cn.gaoyuexiang.json.JsonMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class FileReader implements Reader {

    private String fileName;
    private String defFile;

    public FileReader(String fileName, String defFile) {
        this.fileName = fileName;
        this.defFile = defFile;
    }

    public <T> ArrayList<T> read(T t) throws IOException {
        File file = new File(fileName);
        if (!file.exists())
            file = new File(defFile);
        return JsonMapper.resolveJSON(new FileInputStream(file), t);
    }
}
