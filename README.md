#ThoughtWorks 2016比赛
code:[https://github.com/kbyyd24/TW-ashier](https://github.com/kbyyd24/TW-ashier)

##第二个半价收银台

* 商品信息、促销信息对象保存在`json`文件中
  * 默认商品信息保存在文件`goodsMsg/goodsInfo.json`文件中
  * 默认优惠信息保存在文件`goodsMsg/onSaleGoods.json`文件中

* 购物车保存条形码的字符串数组，调用`cn.gaoyuexiang.ashier.Ashier.checkout`方法获得打印的小票

使用示例 :
```java
import cn.gaoyuexiang.ashier.*;

public class Test() {

  /**
   * demo
   * @param args 条形码字符串数组
   */
  public static void main(String[] args) {
    Ashier ashier = SecondHalfAshier();
    ashier.loadLists();
    String ticket = ashier.checkout(args);
    System.out.println(ticket);
  }
}
```