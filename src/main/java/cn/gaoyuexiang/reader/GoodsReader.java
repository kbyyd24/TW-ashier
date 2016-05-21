package cn.gaoyuexiang.reader;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class GoodsReader extends FileReader {

    public static final String DEF_FILE = "goodsMsg/goodsInfo.json";

    public GoodsReader(String fileName) {
        super(fileName, DEF_FILE);
    }

    public GoodsReader() {
        super(DEF_FILE, DEF_FILE);
    }
}
