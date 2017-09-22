package com.impl;

public class Pageuser {
	private int sumpage;
	private int pagebersize=6;
	private int currentpage;
	private int pagebersum;
	private String handle;
	private int starlocal;
	public int getSumpage() {
		return sumpage;
	}
	public void setSumpage(int sumpage) {
		sumpage=(int)Math.ceil((float)pagebersum/(float)pagebersize);
		this.sumpage = sumpage;
	}
	public int getPagebersize() {
		return pagebersize;
	}
	public void setPagebersize(int pagebersize) {
		this.pagebersize = pagebersize;
	}
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public int getPagebersum() {
		return pagebersum;
	}
	public void setPagebersum(int pagebersum) {
		this.pagebersum = pagebersum;
	}
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		if(handle.equals("firstpage")){
			currentpage=1;
		}else if(handle.equals("uppage")){
			if(currentpage>1){
				currentpage--;
			}else{
				currentpage=1;
			}
		}else if(handle.equals("downpage")){
			if(currentpage<sumpage){
				currentpage++;
			}else{
				currentpage=sumpage;
			}
		}else if(handle.equals("lastpage")){
			currentpage=sumpage;
		}else{
			currentpage=1;
		}
		this.handle = handle;
	}
	public int getStarlocal() {
		starlocal=(currentpage-1)*pagebersize;
		return starlocal;
	}
	public void setStarlocal(int starlocal) {
		this.starlocal = starlocal;
	}
}
