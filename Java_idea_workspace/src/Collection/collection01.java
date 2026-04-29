/**集合分为单列集合、双列集合
 * Collection 接口中有两个重要的子类接口 List Set 单列集合
 * I.1.查找多个元素是否存在 containsAll
 * II.Iterable<>
 *     1.collection遍历元素使用Iterator（必须实现）
 *          a.Iterator iterator = collection.iterator();
 *          b.hasNext();
 *          c.next();作用1）下移2）返回下移以后集合位置上的元素返回
 *              e.g.while(iterator.hasNext()){
 *                  iterator.next();
 *              }
 * Map 接口的实现子类是双列集合 ，存放K-V 键字对
 */
package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class collection01 {

    static void main(String[] args) {
       Collection collection = new ArrayList();
        Iterator iterator = collection.iterator();
        //itit
        while (iterator.hasNext()) {
            Object next =  iterator.next();

        }

        for (Object object : collection){
            System.out.println();
        }
        //显示所有快捷建 CTRL + J

    }
}
