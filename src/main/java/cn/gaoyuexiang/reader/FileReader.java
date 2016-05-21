package cn.gaoyuexiang.reader;

import cn.gaoyuexiang.entry.Goods;
import cn.gaoyuexiang.entry.PreMessager;
import cn.gaoyuexiang.json.JsonMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by melo on 2016/05/21.
 * Project : TW-ashier
 */
public class FileReader implements Reader {
//    /**
//     * 默认商品信息读取文件
//     * 当使用无参的 Ashier.beginWork() 方法或传入的文件名不存在时使用该值
//     */
//    public static final String DEF_GOODS_INFO = "goodsMsg/goodsInfo.json";
//    /**
//     * 默认优惠商品信息读取文件
//     */
//    public static final String DEF_PERFERENTIAL_GOODS = "goodsMsg/perGoods.json";
//
//    private String goodsInfo;
//    private String perGoods;
//
//    public FileReader(String goodsInfo, String perGoods) {
//        this.goodsInfo = goodsInfo;
//        this.perGoods = perGoods;
//    }
//
//    public ArrayList<Goods> readGoods() throws IOException {
//        File goodsInfoFile = new File(this.goodsInfo);
//        if (!goodsInfoFile.exists())
//            goodsInfoFile = new File(DEF_GOODS_INFO);
//        return JsonMapper.resolveJSON(
//                new FileInputStream(goodsInfoFile)
//                , new Goods()
//        );
//    }
//
//    public ArrayList<PreMessager> readPreMessager() throws IOException {
//        File perGoodsFile = new File(this.perGoods);
//        if (!perGoodsFile.exists())
//            perGoodsFile = new File(DEF_PERFERENTIAL_GOODS);
//        return JsonMapper.resolveJSON(
//                new FileInputStream(perGoodsFile)
//                , new PreMessager()
//        );
//    }

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
