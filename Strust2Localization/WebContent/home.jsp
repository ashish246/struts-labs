<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Localization Example</title>
</head>
<body>
	<s:form action="welcome">
		<s:textfield key="global.username" name="username"></s:textfield>
		<s:textfield key="global.address" name="address"></s:textfield>
		<s:select list="{'en_US','fr_FR','de_DE', 'zh_CN'}" name="appLocale"
			key="global.selectlocale"></s:select>
		<s:submit key="global.submit" name="submit"></s:submit>
	</s:form>

	<s:url id="localezhCN" namespace="/" action="welcome">
		<s:param name="appLocale">zh_CN</s:param>
	</s:url>
	<s:url id="localeDE" namespace="/" action="welcome">
		<s:param name="appLocale">de_DE</s:param>
	</s:url>
	<s:url id="localeFR" namespace="/" action="welcome">
		<s:param name="appLocale">fr_FR</s:param>
	</s:url>

	<s:a href="%{localezhCN}">Chinese</s:a>
	<s:a href="%{localeDE}">German</s:a>
	<s:a href="%{localeFR}">France</s:a>
	
</body>
</html>