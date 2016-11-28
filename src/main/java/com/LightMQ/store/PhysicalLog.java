package com.LightMQ.store;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 消息存储物理文件
 * 
 * @author LuoJin
 * @since 2016年11月15日
 */
public class PhysicalLog {
	private static final Logger log = LoggerFactory.getLogger(LoggerName.StoreLoggerName);
    // Message's MAGIC CODE daa320a7
    public final static int MessageMagicCode = 0xAABBCCDD ^ 1880681586 + 8;
    // End of file empty MAGIC CODE cbd43194
    private final static int BlankMagicCode = 0xBBCCDDEE ^ 1880681586 + 8;
    private final MapedFileQueue mapedFileQueue;
    private final DefaultMessageStore defaultMessageStore;
    private final FlushCommitLogService flushCommitLogService;
    private final AppendMessageCallback appendMessageCallback;
    private HashMap<String/* topic-queueid */, Long/* offset */> topicQueueTable = new HashMap<String, Long>(
        1024);

}
