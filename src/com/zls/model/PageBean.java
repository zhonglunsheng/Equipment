package com.zls.model;
/**
 * ��ҳ
 * @author zhonglunsheng
 *
 */
public class PageBean {

	/**�ڼ�ҳ*/
	private int page; 
	/**ÿҳ��¼��*/
	private int pageSize;
	@SuppressWarnings("unused")
	/**��ʼҳ*/
	private int start;  
	
	
	public PageBean(int page, int pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStart() {
		return (page-1)*pageSize;
	}
	
	
}
