package cn.gaoyuexiang.reader;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class PreMessagerReader extends FileReader {

    public static final String DEF_FILE = "goodsMsg/perGoods.json";

    public PreMessagerReader(String fileName) {
        super(fileName, DEF_FILE);
    }

    public PreMessagerReader() {
        super(DEF_FILE, DEF_FILE);
    }
}
