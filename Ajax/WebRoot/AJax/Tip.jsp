<%@ page contentType="text/xml; charset=gb18030"%><%@ page import="java.util.*"  %><%
	Map map = new HashMap();
	String p1 = "<member><price>10.5</price><num>50</num><chandi>����</chandi></member>";
	String p2 = "<member><price>30</price><num>20</num><chandi>�Ϻ�</chandi></member>";
	String p3 = "<member><price>50</price><num>10</num><chandi>�人</chandi></member>";
	map.put("p1",p1);
	map.put("p2",p2);
	map.put("p3",p3);


	String pid= request.getParameter("pid");
	System.out.println(pid);
	StringBuffer sb = new StringBuffer();
	sb.append("<members>");	
	sb.append(map.get(pid).toString());
	sb.append("</members>");
	out.write("<?xml version='1.0' encoding='gb2312' ?>");
	out.write(sb.toString());
%>


