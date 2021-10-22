fetch("http://ec2-3-37-62-104.ap-northeast-2.compute.amazonaws.com/api/schema/swagger-ui/api/add-product")
.then(response => response.json())
.then(t => console.log(t))