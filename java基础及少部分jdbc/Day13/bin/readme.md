###1.集合
Collection
List (可重复， 输入顺序与输出顺序一致）
   ArrayList（查询快，增删慢） LinkedList（查询慢 增删快）
   
Set  (不可重复，输入输出顺序不一致)
 HashSet LinkedHashSet TreeSet（排序了的）
 Map  
  HashMap  输入输出不一致
  TreeMap   可排序
  
###2.Collection Collections
Collections 工具类 服务 于collection框架
sort() shuffle()  reverse() StringBuffer
###3.常用方法
list ： add remove get set size isEmpty 遍历：3种方法  普通for循环  
                                                                                                                增强型for 循环    迭代器
LinkList ： 首位操作的方法 
Set ：  遍历       ：     增强型for 循环    迭代器
Map:key value 结构
            put remove clear containsKey  get  isEmpty clear 
           遍历：把map转换成set 集合进行遍历
           1. map.keySet() 获取所有的key值   遍历该key值 （是一个set）
           map.values();
           2.map.entrySet()   获取到  set 集合   里面存放的是 entry 类型的 key，value 的数据 
          1). Map<String,String  >  map = new HashMap   <String,String  >();
           Set<Entry<String,String  >>   entrys = map.entrySet();
           for(Entry<String,String> entry:entrys){
           entry.getKey(); entry.getValue();}
           2）.迭代器
###4.比较器
Comparable (内部比较器）       Comparator  (外部比较器             （匿名内部类）)
           
           
           
              
  
  
 