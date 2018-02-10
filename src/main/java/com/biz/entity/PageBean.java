package com.biz.entity;

import java.util.List;

public class PageBean<T> {
	//pageCode，当前页码
	private int pc;
	//totalRecord, 总记录数
	private int tr;
	//pagesize, 每页记录数
	private int ps;
	//当前页记录
	private List<T> datas;

	public PageBean(int pc, int tr, int ps, List<T> datas) {
		this.pc = pc;
		this.tr = tr;
		this.ps = ps;
		this.datas = datas;
	}

	public PageBean() {
	}

	/**
	 * 返回总页数
	 */
	public int getTp() {
		int tp = tr / ps;
		return tr % ps == 0 ? tp : tp + 1;
	}
	
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getTr() {
		return tr;
	}
	public void setTr(int tr) {
		this.tr = tr;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}

	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
}
