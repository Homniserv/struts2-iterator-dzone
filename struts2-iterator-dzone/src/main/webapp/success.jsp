<%@taglib uri="/struts-tags" prefix="s" %>

<html>

    <body>
        Documents uploaded by the user are:</br>
        <s:iterator value="documents"><s:property value="name" /></br></s:iterator>
    </body>
</html>