Resume Pengenalan RESTful API

- API singkatan dari Application Programming Interface. API menungkinkan kounikasi dan pertukaran data antara 2 atau lebih software/ sistem yang terpisah. Client -> API -> System/server. 
- REST singkatan Representational State Transfer. HTTP method : 4 method ; Resource --> URL, GET --> membaca data, PUT --> membuat/mengganti data, POST --> membuat data baru, DELETE --> menghapus data. 
- Rest API component : Method, URL, HEADER, Body. 
- HTTP response code : 200 ok, 201 created, 400 bad request, 404 not found, 401 unaurhorized, 405 method not allowed, 500 internal server error. 
- Rest API inputs : GET --> method-GET, URL, costum-header. POST --> method-POST, URL, costum-header, input JSON. PUT--> method-PUT, URL, costum-header, input JSON. DELETE --> method-DELETE, URL, costum-header. 
- API Testing berbeda dengan GUI, mengirim request dan mendapatkan responsenya, memverifikasi response yang benar dan erro handling. Kind of API test : functionality, load test, security. 
- API test proses : specification review, specification development, framework development, test case development, execute & report. 
- Type of output API : bisa berbentuk apa saja (JSON atau XML), response apakah passed atau fail, memangil fungsi API lain. 
- Type bug : gagal melakukan erro handling pada keadaan tertentu, kesulitan u/ tersambung dan mendapat respon API, isu keamanan, performance issues, error atau warning yang tidak tepat, struktur dari data respon tidak benar (JSON & XML). 