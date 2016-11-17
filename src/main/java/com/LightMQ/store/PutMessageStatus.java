package com.LightMQ.store;

/**
 * 写入消息后返回结果
 * 
 * @author LuoJin
 * @since 2016年11月17日
 */

public enum PutMessageStatus {
	PUT_OK,
    FLUSH_DISK_TIMEOUT,
    FLUSH_SLAVE_TIMEOUT,
    SLAVE_NOT_AVAILABLE,
    SERVICE_NOT_AVAILABLE,
    CREATE_MAPEDFILE_FAILED,
    MESSAGE_ILLEGAL,
    UNKNOWN_ERROR,
}
