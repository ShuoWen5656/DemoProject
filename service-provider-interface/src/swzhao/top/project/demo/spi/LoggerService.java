package swzhao.top.project.demo.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author swzhao
 * @date 2024/1/2 9:15 下午
 * @Discreption <> 接口使用方，门面
 */
public class LoggerService {

    private static final LoggerService LOGGER_SERVICE = new LoggerService();

    /**
     * 日志实例
     */
    private final Logger logger;

    private final List<Logger> loggerList;

    public LoggerService() {
        ServiceLoader<Logger> load = ServiceLoader.load(Logger.class);

        loggerList = new ArrayList<>();

        for (Logger logger : load) {
            loggerList.add(logger);
        }

        if (loggerList.isEmpty()) {
            logger = null;
        }else {
            logger = loggerList.get(0);
        }
    }

    public static LoggerService getLoggerService() {
        return LOGGER_SERVICE;
    }


    public void info(String msg) {
        logger.info(msg);
    }


    public void debug(String msg) {
        logger.debug(msg);
    }


}
