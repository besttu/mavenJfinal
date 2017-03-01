<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<style type="text/css">
#aadd {
	position: absolute;
	left: 0;
}
</style>
</head>
</head>
<body>
<body>
	<h3>#(tes)</h3>
	<div class="container">
		<div>
			<a class="btn btn-primary" href="/mavenJfinal/frontTest/add">add</a>
		</div>
		<div class="row">

			<div class="col-md-8">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>id</th>
							<th>title</th>
							<th>content</th>
							<th>operator</th>
						</tr>
					</thead>
					<tbody>
						#for(x : bg.getList())
						<tr>
							<td>#(x.id)</td>
							<td>#(x.title)</td>
							<td>#(x.content)</td>

							<td><a href="/mavenJfinal/frontTest/delete?did=#(x.id)">删除</a><a
								href="/mavenJfinal/frontTest/add1?bid=#(x.id)">修改</a></td>
						</tr>
						#end
						<a id="pre" href="#" onclick="preNumber()">上一页</a>#(bg.pageNumber)
						/#(bg.totalPage)
						<a id="nex" onclick="nextNumber()" href="#">下一页</a>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div>
		<a href="/Jfinal/front/delete?id=1">delete</a>
	</div>
	<script type="application/javascript">
		
		var pre = document.getElementById("pre");
		var nex = document.getElementById("nex")
		var pm = #(bg.pageNumber)
		function preNumber() {
			pm < 2 ? 1 : --pm;
			pre.href = "/mavenJfinal/frontTest?pageNumber=" + pm;
		}
		function nextNumber() {
			//pm>#(bg.pageNumber)?#(bg.pageNumber):++pm;
			if(pm>#(bg.pageNumber)){
				pm=#(bg.pageNumber)
			}else{
				++pm
				if(pm>#(bg.pageNumber)){
					pm=#(bg.pageNumber)
				}
			}
			nex.href = "/mavenJfinal/frontTest?pageNumber=" + pm;
		}
	
	
	
	
	
	
	</script>
</html>