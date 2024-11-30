<%@ page import="duc.assi1.modelDTO.TotNghiepDTO" %>
<%@ page import="java.util.List" %>
<%@ page import="duc.assi1.modelDTO.CongViecDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div>
    <h3>Tim Kiem Sinh Vien</h3>

    <form:form method="post" modelAttribute="sinhVien" action="/thongtinvieclam" class=" d-flex gap-3">
        <div>
            <label for="soCMND">So CMND</label>
            <form:input path="soCMND" class="form-control" placeholder="Enter a valid So CMND"
                        required="true" id="soCMND"/>
        </div>

        <button type="submit" class="btn btn-success">Tim Kiem</button>
    </form:form>

    <c:choose>
        <c:when test="${sinhVienInfo!=null}">
            <h3>Thong tin sinh vien</h3>
            <table class="table table-hover">
                <thead>
                <tr>
                    <th scope="col">SoCMND</th>
                    <th scope="col">Ho Ten</th>
                    <th scope="col">Ma Nganh</th>
                    <th scope="col">Ma Truong</th>
                    <th scope="col">Ten CongTy</th>
                    <th scope="col">Thoi Gian Lam Viec</th>
                </tr>
                </thead>
                <tbody>
                    <%
                        List<TotNghiepDTO> totNghiepDTOList = (List<TotNghiepDTO>) request.getAttribute("totNghieps");
                        List<CongViecDTO> congViecDTOList = (List<CongViecDTO>) request.getAttribute("congViecs");
                        for (int i = 0; i < totNghiepDTOList.size(); i++) {
                            TotNghiepDTO totNghiepDTO = totNghiepDTOList.get(i);
                            CongViecDTO congViecDTO = new CongViecDTO();
                            if(i<congViecDTOList.size()){
                                congViecDTO = congViecDTOList.get(i);
                            }
                    %>
                    <tr>
                        <td>${sinhVienInfo.soCMND}</td>
                        <td>${sinhVienInfo.hoTen}</td>
                        <td><%= totNghiepDTO.getMaNganh() %></td>
                        <td><%= totNghiepDTO.getMaTruong() %></td>
                        <td><%= congViecDTO.getTenCongTy() %></td>
                        <td><%= congViecDTO.getThoiGianLamViec() %></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </c:when>
        <c:otherwise>
            <h3>Sinh vien khong ton tai</h3>
        </c:otherwise>
    </c:choose>

</div>