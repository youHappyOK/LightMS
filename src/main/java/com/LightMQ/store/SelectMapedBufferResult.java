package com.LightMQ.store;

import java.nio.ByteBuffer;

/**
 * 查询Pagecache返回结果
 * @author LuoJin
 * @since 2016年11月28日
 */
public class SelectMapedBufferResult {
    // 从队列中哪个绝对Offset开始
    private final long startOffset;
    // position从0开始
    private final ByteBuffer byteBuffer;
    // 有效数据大小
    private int size;
    // 用来释放内存
    private MapedFile mapedFile;


    public SelectMapedBufferResult(long startOffset, ByteBuffer byteBuffer, int size, MapedFile mapedFile) {
        this.startOffset = startOffset;
        this.byteBuffer = byteBuffer;
        this.size = size;
        this.mapedFile = mapedFile;
    }


    public ByteBuffer getByteBuffer() {
        return byteBuffer;
    }


    public int getSize() {
        return size;
    }


    public void setSize(final int s) {
        this.size = s;
        this.byteBuffer.limit(this.size);
    }


    public MapedFile getMapedFile() {
        return mapedFile;
    }


    @Override
    protected void finalize() {
        if (this.mapedFile != null) {
            this.release();
        }
    }


    /**
     * 此方法只能被调用一次，重复调用无效
     */
    public synchronized void release() {
        if (this.mapedFile != null) {
            this.mapedFile.release();
            this.mapedFile = null;
        }
    }


    public long getStartOffset() {
        return startOffset;
    }
}
