/**
 * 在char，byte和
 * short中，我们可看到算术运算符的“转型”效果。对这些类型的任何一个进行算术运算，都会获
 * 得一个int结果。必须将其明确“造型”回原来的类型（缩小转换会造成信息的丢失），以便将值
 * 赋回那个类型。但对于int值，却不必进行造型处理，因为所有数据都已经属于int类型。然
 * 而，不要放松警惕，认为一切事情都是安全的。如果对两个足够大的int值执行乘法运算，结
 * 果值就会溢出。下面这个例子向大家展示了这一点：
 * <p>
 * 而且不会从编译器那里收到出错提示，运行时也不会出现异常反应。爪哇咖啡（Java）确实
 * 是很好的东西，但却没有“那么”好！ 对于char，byte或者short，混合赋值并不需要造型。即
 * 使它们执行转型操作，也会获得与直接算术运算相同的结果。而在另一方面，将造型略去可
 * 使代码显得更加简练。
 */
public class Overflow {
    public static void main(String[] args) {
        int big = 0x7fffffff; // max int value
        prt("big = " + big);
        int bigger = big * 4;
        prt("bigger = " + bigger);
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
