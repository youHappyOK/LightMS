package com.LightMQ.store;

import java.nio.ByteBuffer;
/**
 * 写消息回调接口
 * 
 * @author LuoJin
 * @since 2016年11月16日
 */

public interface AppendMessageCallback {
	public AppendMessageResult doAppend(final long fileFromOffset, final ByteBuffer byteBuffer,
            final int maxBlank, final Object msg);
}
