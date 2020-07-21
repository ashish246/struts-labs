<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<style type="text/css">
.errorsBg {
	background-color: #fdd;
	color: red;
	border: 1px solid;
}

.errorMessage {
	padding: 0px 8px;
}

table {
	border-spacing: 4px;
}

td {
	padding: 4px;
}
</style>

</head>

<body>
	<h1>Struts 2 - Working with Theme</h1>

	<s:form action="validateUser" namespace="/user">

		<s:textfield key="global.username" name="username" />
		<s:password key="global.password" name="password" />
		<s:submit key="global.submit" name="submit" />

	</s:form>

	<s:url id="localeEN" namespace="/" action="locale">
		<s:param name="request_locale">en</s:param>
	</s:url>
	<s:url id="localezhCN" namespace="/" action="locale">
		<s:param name="request_locale">zh_CN</s:param>
	</s:url>
	<s:url id="localeDE" namespace="/" action="locale">
		<s:param name="request_locale">de</s:param>
	</s:url>
	<s:url id="localeFR" namespace="/" action="locale">
		<s:param name="request_locale">fr</s:param>
	</s:url>

	<s:a href="%{localeEN}">English</s:a>
	<s:a href="%{localezhCN}">Chinese</s:a>
	<s:a href="%{localeDE}">German</s:a>
	<s:a href="%{localeFR}">France</s:a>

</body>
</html>