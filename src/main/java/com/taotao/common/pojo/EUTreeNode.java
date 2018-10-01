package com.taotao.common.pojo;
/**
 * easyUI树形控件节点格式
 * <p>Title: EUTreeNode</p>
 * <p>Description: </p>
 */
public class EUTreeNode {

	private long id;//就是当前节点的id,用当前节点的id来查询parentId是当前节点的字节点
	private String text;//当前节点的文本信息
	private String state;//当前节点的关闭，打开状态
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
