## 任务一

### `plantuml`图

`example`的类图如下：

![](https://www.png8.com/imgs/2021/09/8643273b83ff3675.png)

时序图如下：

![](https://www.png8.com/imgs/2021/09/8d9ef31c798620e2.png)

### 设计理念理解

程序要设计的目的（程序要做的工作）是：

1. 建立并管理葫芦娃对象的集合
2. 装葫芦娃对象进行排序
3. 输出排序日志到文件

这三个工作分别对应三个顶层的类：

1. `Lineable`和其接口实现`Gourd`类，作为葫芦娃的抽象；`Line`类，作为排成“一排”的葫芦娃对象的集合
2. `Sorter`和其接口实现`BubbleSorter`类，作为排序算法和日志生成的实现；`Geezer`类，作为唯一管理实例，调用排序并处理日志
3. `BufferedWriter`将`Sorter`类生成的和`Geezer`类处理传递的日志输出到文件

类和类之间的大致通信关系在`plantuml`图中已经有相关叙述，这里详细展开一些细节之处：

- `Gourd`类和`Solution`类需要相互通信，因此就两者都有着彼此的引用
- `Geezer`类建立唯一实例的方法：
    - 唯一的构造函数声明为`private`，即禁止了外部创建实例
    - 使用静态成员方法构造新的对象，保证总数只能由一个

一些可以改进之处：

- `Lineable`类应该**都**会有一个指向上层`Position`的引用，因此用`class`实现加上`Position position`属性的基**类**，而不是使用无法添加非静态属性的**接口**，似乎更加符合设计直觉
- `Geezer`类作为一个调用的中间层似乎并不是很有必要，将其中处理日志的功能直接放到`Sorter`类中，似乎也是一种设计选择
- `Sorter`类对于日志的处理和`swap`的实现应该都是一样的，因此使用**一般基类**而不是**接口**应该更为合适
- `Geezer`里面出现了`Lineable`的具体实现类`Gourd`，按说应该只是`Lineable`

## 任务二

根据题目要求，对类设计做出以下变化：

- `Gourd`类的改变——`Youkai`类
    - 依旧使用枚举（`c256.png`的rgb值并没有明显规律）
    - 相应的改变一些`Geezer`类中的接口调用（如`get_xxx_ByRank()`函数）
- `Sort`接口的不同实现
    - 即修改`sort`函数，以及配套的`private`函数用于辅助排序算法
    - 冒泡排序等时间复杂度为O(n^2)的算法速度太慢，故这里使用快速排序`QuickSorter`和堆排序`HeapSorter`

类图如下：

![](https://www.png8.com/imgs/2021/09/344ceb4eabc611a6.png)

## 任务三

256的一行和16*16的一个矩阵的不同，仅仅体现在最后`log`字符串的打印上，内部的存储和排序算法是一样的。因此这里选择继承最终生成`result.txt`的`Line`类，子类`Matrix`修改了`toString()`，也就是将内部的数据的字符串型，从**一行**变为了**矩阵**。

类图如下：

![](https://www.png8.com/imgs/2021/09/6ca3877e0a4b2a9f.png)

## 可视化录屏

[bilibili](https://www.bilibili.com/video/BV1sf4y1E7pN/)