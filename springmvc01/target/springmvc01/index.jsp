<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<form action="num1.do">
    <input type="text" name="num1">
    <select name="flog">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
    </select>
    <input type="text" name="num2">
    =
    <input type="submit" value="do">
</form>
</body>
</html>
