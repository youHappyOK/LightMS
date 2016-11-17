package com.LightMQ.store;
/**
 * result的Status
 * 
 * @author LuoJin
 * @since 2016年11月16日
 */
public enum AppendMessageStatus {
	PUT_OK,
    END_OF_FILE,
    MESSAGE_SIZE_EXCEEDED,
    UNKNOWN_ERROR,
}
