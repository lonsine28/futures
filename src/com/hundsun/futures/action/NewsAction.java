/**
 * 
 */
package com.hundsun.futures.action;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hundsun.futures.entity.Column;
import com.hundsun.futures.entity.News;
import com.hundsun.futures.service.ColumnService;
import com.hundsun.futures.service.NewsService;

/**
 * @author jinyb09017
 *
 */
public class NewsAction extends BaseAction {
	private NewsService newsService;
	private ColumnService columnService;
	private String column;//接收传递的column栏目信息
	private Map<String,Integer> columnMap;
	private News news;
	public void setNews(News news)
	{
		this.news = news;
	}
	public News getNews()
	{
		return news;
	}
	/**
	 * @return the newsService
	 */
	public void setColumn(String column)
	{
		this.column=column;
	}
	public NewsService getNewsService() {
		return newsService;
	}
	/**
	 * @param newsService the newsService to set
	 */
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	/**
	 * @return the columnService
	 */
	public ColumnService getColumnService() {
		return columnService;
	}
	/**
	 * @param columnService the columnService to set
	 */
	public void setColumnService(ColumnService columnService) {
		this.columnService = columnService;
	}
	public void init()
	{
		columnMap=new HashMap<String , Integer>();
		List<Column>	columnList = columnService.ListColumn();
		for(Column col:columnList)
		{
			columnMap.put(col.getColumn(), col.getId());
		}
	}
	public String list()
	{
		init();
		List<News> newsList=null;
		if(column!=null)
		{
			newsList = newsService.ListNewsByColumnId(columnMap.get(column));
		}
		else
		{
            newsList = newsService.ListNews();
		}
		httpRequest.setAttribute("newsList", newsList);
		httpRequest.setAttribute("columnMap", columnMap);
		return "list";
		
		
			
		
	}
	public String edit()
	{
		System.out.println("edit输出"+news);
		httpRequest.setAttribute("news", news);
		return	"edit";
	}
	public String del()
	{
		System.out.println("是否已经得到newsid"+news.getId());
		newsService.deleteNews(news.getId());
		return	"edit";
	}

}
