package com.taotao.common.pojo;

import java.util.List;

/**
 * 分页查询的bean
 * @author 胡园
 *
 */
public class EUDataGridResult {
	private long total;//查到的总记录数
	private List<?> rows;//查到的一页中的数据
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
}
