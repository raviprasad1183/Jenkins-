<fieldset>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="/register" modelAttribute="user" >
Name:<form:input path="name"/><p></p>
Password:<form:password path="password"/><p></p>
<input type="submit" value="Login" >
</form:form>
</fieldset>