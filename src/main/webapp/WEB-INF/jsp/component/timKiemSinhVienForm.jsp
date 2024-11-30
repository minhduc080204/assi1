<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div>
    <h3>Tim Kiem Sinh Vien</h3>

    <form:form method="post" modelAttribute="sinhVien" action="/timkiemsinhvien" class=" d-flex gap-3">
        <div>
            <label for="soCMND">So CMND</label>
            <form:input path="soCMND" class="form-control" placeholder="Enter a valid So CMND"
                        id="soCMND"/>
        </div>
        <div>
            <label for="hoTen">Ho Ten</label>
            <form:input path="hoTen" class="form-control" placeholder="Enter Ho Ten"
                        id="hoTen"/>
        </div>
        <div>
            <label for="email">Email</label>
            <form:input path="email" class="form-control" placeholder="Enter Email"
                        type="email" id="email"/>
        </div>
        <div>
            <label for="soDT">So DT</label>
            <form:input path="soDT" class="form-control" placeholder="Enter So DT"
                        id="soDT"/>
        </div>
        <div>
            <label for="diaChi">Dia Chi</label>
            <form:input path="diaChi" class="form-control" placeholder="Enter Dia Chi"
                        id="diaChi"/>
        </div>

        <button type="submit" class="btn btn-success">Tim Kiem</button>
    </form:form>

    <c:choose>
        <c:when test="${ketQuaSinhViens!=null}">
            <h3>Kết quả</h3>
            <table class="table table-hover">
                <thead>
                <tr>
                    <th scope="col">SoCMND</th>
                    <th scope="col">Ho Ten</th>
                    <th scope="col">Email</th>
                    <th scope="col">So DT</th>
                    <th scope="col">Dia Chi</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${ketQuaSinhViens}" var="ketQuaSinhVien">
                    <tr>
                        <td>${ketQuaSinhVien.soCMND}</td>
                        <td>${ketQuaSinhVien.hoTen}</td>
                        <td>${ketQuaSinhVien.email}</td>
                        <td>${ketQuaSinhVien.soDT}</td>
                        <td>${ketQuaSinhVien.diaChi}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:when>


    </c:choose>

</div>