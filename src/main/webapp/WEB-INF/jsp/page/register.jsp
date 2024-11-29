<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%
    request.setAttribute("title", "Register");
%>

<%@ include file="../component/header.jsp" %>
<div class="d-flex justify-content-center align-items-center" style="height: 90vh">
    <div class="bg-body-tertiary p-3" style="width: 30%">
        <h3>Register</h3>
        <hr>
        <div>
            <form:form method="POST" modelAttribute="member" action="/register" name="member"
                       class=" d-flex flex-column gap-3" id="registerForm"
            >
                <form:hidden path="id"/>
                <form:input path="user_name" class="form-control"
                            placeholder="Enter a valid email address" required="true"
                />
                <form:input path="email" type="email" class="form-control"
                            placeholder="Enter a valid email address" required="true"
                />
                <form:input path="password" type="password" class="form-control"
                            placeholder="Enter password" required="true" id="password"
                />
                <input type="password" class="form-control" placeholder="Enter password" required id="repassword">
                <button type="submit" class="btn btn-success">Register</button>
            </form:form>
        </div>
        <p class="small fw-bold mt-2 pt-1 mb-0">Have an account?
            <a href="/login" class="link-danger">Register</a>
        </p>
    </div>
</div>

<script>
    document.getElementById('registerForm').addEventListener('submit', function (event) {
        // Lấy giá trị của các ô input
        const password = document.getElementById('password').value;
        const repassword = document.getElementById('repassword').value;

        // Kiểm tra điều kiện
        if (password !== repassword) {
            // Ngăn không cho form gửi đi
            event.preventDefault();

            // Hiển thị lỗi
            showAlert('danger', 'Repass is wrong. Try again !');
        }
    });
</script>
<%@ include file="../component/footer.jsp" %>
