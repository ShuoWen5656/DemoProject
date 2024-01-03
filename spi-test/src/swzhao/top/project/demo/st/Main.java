package swzhao.top.project.demo.st;

import swzhao.top.project.demo.spi.LoggerService;

/**
 * @author swzhao
 * @date 2024/1/2 10:39 下午
 * @Discreption <>
 */
public class Main {

    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getLoggerService();
        loggerService.info("swzhaonb");
        loggerService.info("swzhaonb");

    }
}
