<%@ page import="com.company.dao.inter.UserDaoInter" %>
<%@ page import="com.company.main.Context" %>
<%@ page import="com.company.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 4/7/2023
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  <script src="assets/js/users.js"></script>
  <link rel="stylesheet" href="assets/css/users.css">
  <title>JSP Page</title>


</head>
<body>


<%--<jsp:include page="header.jsp" />--%>
<%
  User user =(User) session.getAttribute("loggedInUser");
%>
<%="welcome, "+user.getName()%>
<%
  UserDaoInter userDao = Context.instanceUserDao();
  String name = request.getParameter("name");
  String surname = request.getParameter("surname");
  String nationalityIdStr = request.getParameter("nid");
  Integer nationalityId=null;
  if(nationalityIdStr!=null && !nationalityIdStr.trim().isEmpty()) {
    nationalityId = Integer.parseInt(nationalityIdStr);
  }
  List<User> list = userDao.getAll(name, surname, nationalityId);
%>
<div class="container">
  <%--<div class="row">--%>
  <%--<div class="col-sm-8">col-sm-8</div>--%>
  <%--<div class="col-sm-4">col-sm-4</div>--%>
  <%--</div>--%>
  <%--<div class="row">--%>
  <%--<div class="col-sm">col-sm</div>--%>
  <%--<div class="col-sm">col-sm</div>--%>
  <%--<div class="col-sm">col-sm</div>--%>
  <%--</div>--%>
  <div class="row">
    <div class="col-4">
      <form action="users.jsp" method="GET">
        <div class="form-group">
          <label for="name">name:</label>
          <input onkeyup="writeWhatIamTyping()"
                 placeholder="Enter name" class="form-control" type="text" name="name" value=""/>
        </div>
        <div class="form-group">
          <label for="surname">surname:</label>
          <input placeholder="Enter surname" class="form-control" type="text" name="surname" value=""/>
        </div>

        <input class="btn btn-primary" type="submit" name="search" value="Search" id="btnsearch"/>
      </form>
    </div>
  </div>
  <div>
    <table class="table">
      <thead>
      <tr>
        <th>name</th>
        <th>surname</th>
        <th>nationality</th>
        <th></th>
        <th></th>
      </tr>
      </thead>
      <tbody>
      <%
        for(User u: list){
      %>
      <tr>
        <td><%=u.getName()%></td>
        <td><%=u.getSurname()%></td>
        <td><%=u.getNationality().getName()==null?"N/A":u.getNationality().getName()%></td>
        <td style="width:5px">

          <input type="hidden" name="id" value="<%=u.getId()%>"/>
          <input type="hidden" name="action" value="delete"/>
          <button class="btn btn-danger" type="submit" value="delete"
                  data-toggle="modal" data-target="#exampleModal"
                  onclick="setIdForDelete(<%=u.getId()%>)">
            <i class="fas fa-trash-alt"></i>
          </button>
        </td>
        <td style="width:5px">
          <form action="userdetail" method="GET">
            <input type="hidden" name="id" value="<%=u.getId()%>"/>
            <input type="hidden" name="action" value="update"/>
            <button class="btn btn-secondary" type="submit" value="update">
              <i class="fas fa-pen-square"></i>
            </button>
          </form>
        </td>
      </tr>
      <%}%>
      </tbody>
    </table>

  </div>
</div>


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        Are you sure?
      </div>
      <div class="modal-footer">
        <form action="userdetail" method="POST">
          <input type="hidden" name="id" value="" id="idForDelete"/>
          <input type="hidden" name="action" value="delete"/>
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
          <input type="submit" class="btn btn-danger" value="Delete"/>
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
