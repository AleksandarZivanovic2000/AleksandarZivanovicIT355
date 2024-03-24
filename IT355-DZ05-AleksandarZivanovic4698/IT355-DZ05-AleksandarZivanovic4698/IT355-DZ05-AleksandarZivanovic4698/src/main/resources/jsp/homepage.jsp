<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>

<head> <title>Automobili</title> </head>

<body>
<div align="center">
    <p>Unesite ime korisnika za listu vozila:</p>
    <form method="get" action="filter">
        Ime: <input type="text" name="ime" value="${ime}"/>
        <input type="submit" value="Filter"/>
    </form>

    <table border="1" cellpadding="5">

        <caption><h2> Lista Automobila </h2><caption>

            <tr>
                <th> Model </th>
                <th> Marka </th>
                <th> Cena </th>
                <th> Korisnik </th>
            </tr>

            <c:forEach var="automobil" items="${automobili}">
            <tr>
                <td>${automobil.getModel()}</td>
                <td>${automobil.getMarka()}</td>
                <td>${automobil.getCena()}</td>
                <td>${automobil.getKorisnik().getIme()}</td>

            </tr>
            </c:forEach>
    </table>
</div>

</body>

</html>