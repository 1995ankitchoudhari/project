<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>JavaByKiran | Registration Page</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href='<spring:url value="/resources/css/bootstrap.min.css"/>'>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link href='<spring:url value="/resources/dist/css/AdminLTE.min.css"/>' rel="stylesheet" />
 
    <!-- iCheck -->
    <link rel="stylesheet" href='<spring:url value="/resources/plugins/iCheck/square/blue.css"/>'>
    
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="hold-transition register-page">
  <%
String msg=(String)request.getAttribute("msg");

if(msg!=null)
{
	%>
	<script type="text/javascript">
	alert("${msg}");
	</script>
	<%
	
}
%>
    <div class="register-box">
      <div class="register-logo">
        <a href="../../index2.html"><b>Java By Kiran</b></a>
      </div>

      <div class="register-box-body">
      
          
          
        <p class="login-box-msg">Register a new membership</p>
        <form action="/registration" id="form" method="post">
          <div class="form-group has-feedback">
            <input type="text" name="name" id="name" value="" class="form-control" placeholder="Name">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
            <div id="name_error" style="color:red;"></div>
          </div>
          <div class="form-group has-feedback">
            <input type="text" name="mobile" id="mobile" class="form-control" placeholder="Mobile">
            <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
            <div id="mobile_error" style="color:red;"></div>
          </div>
          <div class="form-group has-feedback">
            <input type="text" name="email" id="email" class="form-control" placeholder="Email">
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            <div id="email_error" style="color:red;"></div>
          </div>
          
          <div class="form-group has-feedback">
            <input type="password" name="password" id="password" class="form-control" placeholder="Password">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            <div id="password_error" style="color:red;"></div>
          </div>
          
          <div class="row">
            
            <div class="col-xs-12">
              <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
            </div><!-- /.col -->
          </div>
        </form>

        <br>

        <a href="/loginpage" class="text-center">I already have a membership</a>
      </div><!-- /.form-box -->
    </div><!-- /.register-box -->

    <!-- jQuery 2.1.4 -->
    <script src="<spring:url value="/resources/plugins/jQuery/jQuery-2.1.4.min.js"/>"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="<spring:url value="/resources/js/bootstrap.min.js"/>"></script>
    <!-- iCheck -->
    <script src="<spring:url value="/resources/plugins/iCheck/icheck.min.js"/>"></script>
    <script>
      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });
    </script>
    <script>
      $("#form").submit(function(){
        var name = $("#name").val();
        var email = $("#email").val();
        var password = $("#password").val();
        var mobile = $("#mobile").val();

        if(name=='' || email=='' || password=='' || mobile==''){
          if(name==''){
            $("#name_error").text("Please enter Name.");
          }else{
            $("#name_error").text("");
          }

          if(email==''){
            $("#email_error").text("Please enter Email.");
          }else{
            if(!validateEmail(email)){
              $("#email_error").text("Please enter valid email.");
            }else{
              $("#email_error").text("");  
            }    
            
          }

          if(password==''){
            $("#password_error").text("Please enter Password.");
          }else{
            $("#password_error").text("");
          }

          if(mobile==''){
            $("#mobile_error").text("Please enter Mobile.");
          }else{            
            $("#mobile_error").text("");
          }
          
          return false;
        }

        if(!validateEmail(email)){
              $("#email_error").text("Please enter valid email.");
            }else{
              $("#email_error").text("");  
            }    
      });

      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });

      function validateEmail($email) {
        var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
        return emailReg.test( $email );
      }
    </script>
  </body>
</html>
