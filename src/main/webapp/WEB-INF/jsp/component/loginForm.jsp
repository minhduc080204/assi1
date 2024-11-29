<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="w-25">
    <h3>Login</h3>
    <form:form method="POST" modelAttribute="user" action="/login" class=" d-flex flex-column gap-3">
        <div>
            <label for="userName">Username</label>
            <form:input path="userName" class="form-control" placeholder="Enter a valid email address" required="true" id="userName"/>
        </div>
        <div>
            <label for="password">Password</label>
            <form:input path="password" type="password" class="form-control" placeholder="Enter password" required="true" id="password"/>
        </div>

        <div class="form-check mb-0">
            <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3"/>
            <label class="form-check-label" for="form2Example3">
                Remember me
            </label>
        </div>
        <button type="submit" class="btn btn-success">Login</button>
    </form:form>
</div>