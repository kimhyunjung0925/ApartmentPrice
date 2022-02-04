<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인</title>
</head>
<body>

    <form action="/result" method="POST">
        <div>
            <label>연도 :
                <select name="year">
                    <c:forEach var="year" begin="2000" end="2020">
                        <option value="${year}"> ${year}년 </option>
                    </c:forEach>
                </select>
            </label>

            <label> 월 :
                <select name="month">
                    <c:forEach var="month" begin="1" end="12">
                        <option value="${month}"> ${month}월 </option>
                    </c:forEach>
                </select>
            </label>

            <label> 지역 :
                <select name="excd">
                    <c:forEach var="item" items="${requestScope.locationList}">
                        <option value="${item.excd}"> ${item.localnm} </option>
                    </c:forEach>
                </select>
            </label>
            <input type="submit" value="검색">
        </div>
    </form>

    <table>
        <tr>
            <th>지역명</th>
            <th>법정동</th>
            <th>지번</th>
            <th>아파트명</th>
            <th>거래금액</th>
            <th>건축년도</th>
            <th>계약년도</th>
            <th>계약월</th>
            <th>계약일</th>
            <th>전용면적</th>
            <th>층</th>
        </tr>


        <c:forEach items="${requestScope.result}" var="item">
            <tr>
                <td>${item.localnm}</td>
                <td>${item.dong}</td>
                <td>${item.jibun}</td>
                <td>${item.apartmentname}</td>
                <td>${item.dealamout}</td>
                <td>${item.buildyear}</td>
                <td>${item.dealyear}</td>
                <td>${item.dealmonth}</td>
                <td>${item.dealday}</td>
                <td>${item.areaforexclusiveuse}</td>
                <td>${item.floor}</td>
            </tr>
        </c:forEach>
    </table>



</body>
</html>
