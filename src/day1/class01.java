package day1;

/**
 * 打印int的32位字节
 */

public class class01 {

    public static void main(String[] args) {
        int num = 1024;
        print(num >>> 1);

        int a = 7182312;
        int b = 8128312;

        print(a);
        print(b);
        System.out.println("==========");
        print(a | b);
        print(a & b);
        print(a ^ b);
    }

    // 将1向左移动n位后，与num进行与运算，
    // 当该位置是1时，则代表该位置在二进制中为1，则num在i位上的数字则为1
    // 负数的二进制表现形式，符号位为1，后面的数字取反后再加1则得到负数值
    public static void print(int num){
        for (int i = 31; i >= 0 ; i--) {
            System.out.print((num&(1<< i))==0 ? 0:1);
        }
        System.out.println();
    }
}
