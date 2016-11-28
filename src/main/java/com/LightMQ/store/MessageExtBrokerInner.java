package com.LightMQ.store;

import com.LightMS.common.TopicFilterType;
import com.LightMS.common.message.MessageExt;

/**
 * 存储内部使用的Message对象
 * 
 * @author LuoJin
 * @since 2016年11月24日
 */

public class MessageExtBrokerInner extends MessageExt{
	 private static final long serialVersionUID = 7256001576878700634L;
	    private String propertiesString;
	    private long tagsCode;


	    /**
	     * 目前只支持单个标签的过滤
	     */
	    public static long tagsString2tagsCode(final TopicFilterType filter, final String tags) {
	        if (null == tags || tags.length() == 0)
	            return 0;

	        return tags.hashCode();
	    }


	    public String getPropertiesString() {
	        return propertiesString;
	    }


	    public void setPropertiesString(String propertiesString) {
	        this.propertiesString = propertiesString;
	    }


	    public long getTagsCode() {
	        return tagsCode;
	    }


	    public void setTagsCode(long tagsCode) {
	        this.tagsCode = tagsCode;
	    }
}
