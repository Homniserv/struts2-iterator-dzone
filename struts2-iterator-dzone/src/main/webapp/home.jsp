<%@taglib uri="/struts-tags" prefix="s" %>

<html>
    <body>
        Enter a user name to get the documents uploaded by that user.
        <s:form name="fetch" theme="simple" action="fetch">
                Username <s:textfield name="username" />
                <s:submit value="Fetch Records" />
        </s:form>

        </body>
</html>>