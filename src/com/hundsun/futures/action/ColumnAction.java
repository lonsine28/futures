/**
 * 
 */
package com.hundsun.futures.action;

import java.util.List;

import com.hundsun.futures.entity.Column;
import com.hundsun.futures.service.ColumnService;

/**
 * @author jinyb09017
 *
 */
public class ColumnAction extends BaseAction{
	private Column myCol;
	private ColumnService columnService;
	private Integer id;//������Ҫһ��setid���������url��������id�����������޷���ð���
	private String column;
	public void setId(Integer id)
	{
		this.id=id;
	}
	public void setColumn(String column)
	{
		this.column=column;
	}
	
	/**
	 * @return the column
	 */
	public Column getMycol() {
		return myCol;
	}
	/**
	 * @param column the column to set
	 */
	public void setMyCol(Column myCol) {
		this.myCol = myCol;
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
	
	public String list()
	{
		List<Column> columnList=columnService.ListColumn();
		httpRequest.setAttribute("columnList", columnList);
		return "list";
	}
	public String upd()
	{
		Column col=new Column();
		col.setColumn(this.column);
		col.setId(this.id);
		columnService.updateColumn(col);
		return "upd";
	}
	public String del()
	{
		//���Ҳ���Դ�ע���user�Ƕ���getId������ô�������idֵ��
		columnService.deleteColumn(this.id);
		return "del";
	}
	public String search()
	{
		Column col=columnService.queryById(id);
		httpRequest.setAttribute("col", col);
		return "edit";
	}
	public String add()
	{
		Column col=new Column();
		col.setColumn(this.column);
		columnService.addColumn(col);
		return "add";
	}
	

}
