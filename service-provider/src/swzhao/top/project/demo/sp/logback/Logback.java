package swzhao.top.project.demo.sp.logback;

import swzhao.top.project.demo.spi.Logger;

/**
 * @author swzhao
 * @date 2024/1/2 10:38 下午
 * @Discreption <>
 */
public class Logback implements Logger {
    @Override
    public void info(String s) {
        System.out.printf("[INFO]您想输出的log是：%s \n", s);
    }

    @Override
    public void debug(String s) {
        System.out.printf("[DEBUG]您想输出的log是：%s \n", s);
    }
}
