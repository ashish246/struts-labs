<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home Page</title>
</head>
<body>
	<sx:head />

	<s:form action="Welcome" namespace="/">
		<s:textfield name="name" label="User Name"></s:textfield>
		<s:password name="password" label="Password"></s:password>

		<sx:datetimepicker name="dob" label="Format (dd-MMM-yyyy)"
			displayFormat="dd-MMM-yyyy" value="%{'2010-01-01'}" />

		<sx:autocompleter label="What's your lucky number?"
			name="yourLuckyNumber" autoComplete="false"
			list="{'1','12','13','14'}" />

		<s:textarea name="bio" label="About You" cols="20" rows="3"
			wrap="true"></s:textarea>

		<s:checkbox name="receiveUpdates" fieldValue="true"
			label="Check to receive updates."></s:checkbox>

		<s:select list="{'Developer','Manager','Customer'}" name="rolesSelect"
			multiple="true" value="{'Manager'}"></s:select>

		<s:checkboxlist list="{'Developer','Manager','Customer'}"
			name="roleCheckbox" value="{'Customer'}"></s:checkboxlist>

		<s:radio list="{'Developer','Manager','Customer'}" name="rolesRadio"
			multiple="true" value="{'Customer'}"></s:radio>

		<s:doubleselect list="{'Developer','Manager','Tester'}"
			name="doubleSelectRole" label="Role"
			doubleList="top == 'Developer' ? {'Java','PHP'} : (top == 'Manager' ? {'HR Manager', 'Finance Manager'} : {'UI Testing', 'Functional Testing'})"
			doubleName="doubleSelectExpertise"></s:doubleselect>

		<s:combobox label="What's your favor fruit" headerKey="-1"
			headerValue="--- Select ---" list="{'Developer','Manager','Tester'}"
			name="yourFruits" />

		<s:combobox label="Select a month" headerKey="-1"
			headerValue="--- Select ---"
			list="#{'1':'Jan', '2':'Feb', '3':'Mar', '4':'Apr'}" name="yourMonth" />

		<s:updownselect label="Select a food"
			list="#{'KFC':'KFC', 'McDonald':'McDonald', 'Burger King':'Burger King',
'Pizza Hut':'Pizza Hut', 'Fat Boy King':'Fat Boy King'}"
			name="favFastFood" headerKey="-1" headerValue="--- Please Order ---"
			size="7" />

		<s:optiontransferselect label="Lucky Numbers" name="leftNumber"
			list="{'1 - One ', '2 - Two', '3 - Three', '4 - Four', '5 - Five'}"
			doubleName="rightNumber"
			doubleList="{'10 - Ten','20 - Twenty','30 - Thirty','40 - Forty','50 - Fifty'}" />

		<!-- A bit tricky here, use a "s:url" tag point to a "databaseJSON" action, which will return a 
		list of the option in JSON format. And link it to the autocompleter component via href="%{databaseList}". -->
		
		<s:url id="databaseList" action="databaseJSON" />

		<sx:autocompleter label="What's your favorite Database Server?"
			href="%{databaseList}" name="yourFavDatabase" />

		<s:submit value="Submit"></s:submit>
	</s:form>

</body>
</html>