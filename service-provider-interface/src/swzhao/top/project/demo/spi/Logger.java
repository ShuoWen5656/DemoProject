package swzhao.top.project.demo.spi;

/**
 * @author swzhao
 * @date 2024/1/2 9:15 下午
 * @Discreption <> 定义通用接口
 */
public interface Logger {

    /**
     * info级别日志
     * @param msg
     */
    void info(String msg);

    /**
     * debug级别日志
     * @param msg
     */
    void debug(String msg);


}
