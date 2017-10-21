<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="row search" >
  <div class="col-md-6">
	<form action="${pageContext.request.contextPath}/department/list.do" method="post">
	    <div class="input-group" style="width: 300px">
		      <input type="text" class="form-control" name="deptName"  value="${s_department.deptName }" placeholder="请输入要查询的部门...">
		      <span class="input-group-btn">
		        <button class="btn btn-default" type="submit"><span class="glyphicon glyphicon-search"></span>&nbsp;查询</button>
		      </span>
	    </div>
    </form>
  </div>
  <div class="col-md-6 text-right" >
  	<button class="btn btn-primary" onclick="javascript:window.location.href='${pageContext.request.contextPath}/department/preSave.do'">添加</button>
  </div>
</div>
<table class="table table-striped table-bordered">
  <tr>
     	<th>编号</th>
     	<th>部门名称</th>
     	<th>备注</th>
  </tr>
  <c:forEach varStatus="status" var="department" items="${departmentList }">
  		<tr>
  			<td>${status.index+1 }</td>
  			<td>${department.deptName }</td>
  			<td>${department.remark }</td>
  		</tr>
  </c:forEach>
</table>
<ul class="pagination">
	${pageCode }
</ul>