<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="w-25">
    <h3>Sinh vien khai bao</h3>

    <form:form method="post" modelAttribute="sinhVienAndTotNghiep" action="/sinhvienkhaibao" class=" d-flex flex-column gap-3">
        <h5>Thong tin Sinh Vien</h5>
        <div>
            <label for="soCMND">So CMND</label>
            <form:input path="sinhVienDTO.soCMND" class="form-control" placeholder="Enter a valid So CMND" required="true"
                        id="soCMND"/>
        </div>
        <div>
            <label for="hoTen">Ho Ten</label>
            <form:input path="sinhVienDTO.hoTen" class="form-control" placeholder="Enter Ho Ten"
                        required="true" id="hoTen"/>
        </div>
        <div>
            <label for="email">Email</label>
            <form:input path="sinhVienDTO.email" class="form-control" placeholder="Enter Email"
                        type="email" required="true" id="email"/>
        </div>
        <div>
            <label for="soDT">So DT</label>
            <form:input path="sinhVienDTO.soDT" class="form-control" placeholder="Enter So DT"
                        required="true" id="soDT"/>
        </div>
        <div>
            <label for="diaChi">Dia Chi</label>
            <form:input path="sinhVienDTO.diaChi" class="form-control" placeholder="Enter Dia Chi"
                        required="true" id="diaChi"/>
        </div>

        <h5>Thong tin TotNghiep</h5>
        <div>
            <label>Ma Truong</label>
            <form:select path="totNghiepDTO.maTruong" class="form-select" aria-label="Default select example">
                <c:forEach items="${truongList}" var="truong">
                    <form:option value="${truong.maTruong}" selected="true">${truong.tenTruong}</form:option>
                </c:forEach>
            </form:select>
        </div>
        <div>
            <label>Ma Nganh</label>
            <form:select path="totNghiepDTO.maNganh" class="form-select" aria-label="Default select example">
                <c:forEach items="${nganhList}" var="nganh">
                    <form:option value="${nganh.maNganh}" selected="true">${nganh.tenNganh}</form:option>
                </c:forEach>
            </form:select>
        </div>
        <div>
            <label for="heTN">He TN</label>
            <form:input path="totNghiepDTO.heTN" class="form-control" placeholder="Enter He TN"
                        required="true" id="heTN"/>
        </div>
        <div>
            <label for="ngayTN">Ngay TN</label>
            <form:input path="totNghiepDTO.ngayTN" class="form-control" placeholder="Enter Ngay TN"
                        type="date" required="true" id="ngayTN"/>
        </div>
        <div>
            <label for="loaiTN">Loai TN</label>
            <form:input path="totNghiepDTO.loaiTN" class="form-control" placeholder="Enter Loai TN"
                        required="true" id="loaiTN"/>
        </div>

        <button type="submit" class="btn btn-success">Khai Bao</button>
    </form:form>
</div>