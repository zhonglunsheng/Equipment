<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="list-group">
  <a href="#" class="list-group-item active">
    系统菜单
  </a>
  <a href="${pageContext.request.contextPath}/department/list.do" class="list-group-item">部门管理</a>
  <a href="${pageContext.request.contextPath}/user/list.do" class="list-group-item">用户管理</a>
  <a href="${pageContext.request.contextPath}/equipmentType/list.do" class="list-group-item">设备类型管理</a>
  <a href="${pageContext.request.contextPath}/equipment/list.do" class="list-group-item">采购管理</a>
  <a href="javascript:logout()" class="list-group-item">安全退出</a>
</div>