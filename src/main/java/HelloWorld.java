/**
 * 一个简单的Java测试类
 * 用于验证Java环境是否正常工作
 */
public class HelloWorld {
    
    /**
     * 主方法，程序的入口点
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        System.out.println("Hello, World! 这是一个Java测试程序。");
        
        // 测试一些基本的Java功能
        testBasicFunctions();
    }
    
    /**
     * 测试一些基本的Java功能
     */
    private static void testBasicFunctions() {
        // 测试字符串操作
        String message = "Java测试";
        System.out.println("字符串长度: " + message.length());
        System.out.println("字符串大写: " + message.toUpperCase());
        
        // 测试数学运算
        int a = 10;
        int b = 5;
        System.out.println("加法: " + (a + b));
        System.out.println("减法: " + (a - b));
        System.out.println("乘法: " + (a * b));
        System.out.println("除法: " + (a / b));
        
        // 测试数组
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("数组内容: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}