<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	function checkForm(){
		var deptName = $("#deptName").val();
		if (deptName==null || deptName=="") {
			$("#errorMsg").html("部门名称不能为空");
			return false;
		}
		return true;
	}
	
	function resetValue(){
		$("#deptName").val("");
		$("#remark").val("");
	}
</script>
<div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title">${actionName }</h3>
  </div>
  <div class="panel-body">
	<form class="form-horizontal" action="${pageContext.request.contextPath }/department/save.do" method="post" onsubmit="return checkForm()">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">部门名称：</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="deptName" name="deptName" style="width:300px;">
		    </div>
		  </div>
		  <div class="form-group">
		    <label  class="col-sm-2 control-label">部门备注：</label>
		    <div class="col-sm-10">
		      <textarea rows="4" class="form-control" id="remark" name="remark" style="width:400px;"></textarea>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button class="btn btn-primary" type="submit">保存</button>&nbsp;&nbsp;
		      <button class="btn btn-primary" type="button" onclick="resetValue()">重置</button>&nbsp;&nbsp;
		      <font id="errorMsg" color="red">${errorMsg }</font>
		  </div>
		</div>
	</form>
	</div>
</div>