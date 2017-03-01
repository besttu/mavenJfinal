<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>添加数据</h3>

	<form action="/mavenJfinal/frontTest/updata" method="post">
		id:
		<p>
			<input type="text"  name="b.id" value="#(bl.id)" />
		</p>
		name:
		<p>
			<input type="text" name="b.title" value="#(bl.title)" />
		</p>
		pwd:
		<p>
			<textarea rows=" 10 " name="b.content" cols="100 ">#(bl.content)</textarea>
		</p>
		<p>
			<input type="submit" value="submit" />
		</p>
	</form>
</body>
</html>