function sendAjaxGet(url, func) {
	var xhr = new XMLHttpRequest()
			|| new ActiveXObject("Microsoft.HTTPRequest");
	xhr.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			func(this);
		}
	};
	xhr.open("GET", url, true);
	xhr.send();
};

function sendAjaxPost(url, func) {
	var xhr = new XMLHttpRequest()
			|| new ActiveXObject("Microsoft.HTTPRequest");
	xhr.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			func(this);
		}
	};
	xhr.open("POST", url, true);
	xhr.send();
};

function viewEmp(xhr) {
	var eachEmp = xhr.responseText.split("Employee");
	for (x = 1; x < eachEmp.length ; x++){
		var eachVal = eachEmp[x].split(":");
		var newrow = document.createElement("tr");
		newrow.setAttribute("id", "Employee " + x);
		document.getElementById("empList").appendChild(newrow);
		var col1 = document.createElement("td");
		var col2 = document.createElement("td");
		var col3 = document.createElement("td");
		var col4 = document.createElement("td");
		var col5 = document.createElement("td");
		var col6 = document.createElement("td");
		col1.textContent = eachVal[0];
		col2.textContent = eachVal[1];
		col3.textContent = eachVal[2];
		col4.textContent = eachVal[3];
		col5.textContent = eachVal[4];
		col6.textContent = eachVal[5];
		document.getElementById("Employee " + x).appendChild(col1);
		document.getElementById("Employee " + x).appendChild(col2);
		document.getElementById("Employee " + x).appendChild(col3);
		document.getElementById("Employee " + x).appendChild(col4);
		document.getElementById("Employee " + x).appendChild(col5);
		document.getElementById("Employee " + x).appendChild(col6);
	}
	
}

function pendingReq(xhr){
	var eachReq = xhr.responseText.split("Reimbursement");
	for (x = 1; x < eachReq.length ; x++){
		var eachVal = eachReq[x].split("/");
		var newrow = document.createElement("tr");
		newrow.setAttribute("id", "Pending " + x);
		document.getElementById("PendingList").appendChild(newrow);
		var col1 = document.createElement("td");
		var col2 = document.createElement("td");
		var col3 = document.createElement("td");
		var col4 = document.createElement("td");
		var col5 = document.createElement("td");
		var col6 = document.createElement("td");
		var col7 = document.createElement("td");
		var col8 = document.createElement("td");
		var col9 = document.createElement("td");
		var col10 = document.createElement("td");
		var col11 = document.createElement("td");
		var col12 = document.createElement("td");
		col1.textContent = eachVal[0];
		col2.textContent = eachVal[1];
		col3.textContent = eachVal[2];
		col4.textContent = eachVal[3];
		col5.textContent = eachVal[4];
		col6.textContent = eachVal[5];
		col7.textContent = eachVal[6];
		col8.textContent = eachVal[7];
		col9.textContent = eachVal[8];
		col10.textContent = eachVal[9];
		col11.textContent = eachVal[10];
		col12.textContent = eachVal[11];
		document.getElementById("Pending " + x).appendChild(col1);
		document.getElementById("Pending " + x).appendChild(col2);
		document.getElementById("Pending " + x).appendChild(col3);
		document.getElementById("Pending " + x).appendChild(col4);
		document.getElementById("Pending " + x).appendChild(col5);
		document.getElementById("Pending " + x).appendChild(col6);
		document.getElementById("Pending " + x).appendChild(col7);
		document.getElementById("Pending " + x).appendChild(col8);
		document.getElementById("Pending " + x).appendChild(col9);
		document.getElementById("Pending " + x).appendChild(col10);
		document.getElementById("Pending " + x).appendChild(col11);
		document.getElementById("Pending " + x).appendChild(col12);
	}
}

function resolvedReq(xhr){
	var eachReq = xhr.responseText.split("Reimbursement");
	for (x = 1; x < eachReq.length ; x++){
		var eachVal = eachReq[x].split("/");
		var newrow = document.createElement("tr");
		newrow.setAttribute("id", "Resolved " + x);
		document.getElementById("ResolvedList").appendChild(newrow);
		var col1 = document.createElement("td");
		var col2 = document.createElement("td");
		var col3 = document.createElement("td");
		var col4 = document.createElement("td");
		var col5 = document.createElement("td");
		var col6 = document.createElement("td");
		var col7 = document.createElement("td");
		var col8 = document.createElement("td");
		var col9 = document.createElement("td");
		var col10 = document.createElement("td");
		var col11 = document.createElement("td");
		var col12 = document.createElement("td");
		col1.textContent = eachVal[0];
		col2.textContent = eachVal[1];
		col3.textContent = eachVal[2];
		col4.textContent = eachVal[3];
		col5.textContent = eachVal[4];
		col6.textContent = eachVal[5];
		col7.textContent = eachVal[6];
		col8.textContent = eachVal[7];
		col9.textContent = eachVal[8];
		col10.textContent = eachVal[9];
		col11.textContent = eachVal[10];
		col12.textContent = eachVal[11];
		document.getElementById("Resolved " + x).appendChild(col1);
		document.getElementById("Resolved " + x).appendChild(col2);
		document.getElementById("Resolved " + x).appendChild(col3);
		document.getElementById("Resolved " + x).appendChild(col4);
		document.getElementById("Resolved " + x).appendChild(col5);
		document.getElementById("Resolved " + x).appendChild(col6);
		document.getElementById("Resolved " + x).appendChild(col7);
		document.getElementById("Resolved " + x).appendChild(col8);
		document.getElementById("Resolved " + x).appendChild(col9);
		document.getElementById("Resolved " + x).appendChild(col10);
		document.getElementById("Resolved " + x).appendChild(col11);
		document.getElementById("Resolved " + x).appendChild(col12);
	}
}

function viewInfo (xhr){
		var Emp = xhr.responseText.split("Employee");
		var eachVal = Emp[1].split(":");
//		var newrow = document.createElement("tr");
//		newrow.setAttribute("id", "Me " + x);
//		document.getElementById("myList").appendChild(newrow);

		document.getElementById("Me1").textContent = eachVal[0];
		document.getElementById("Me2").textContent = eachVal[1];
		document.getElementById("Me3").textContent = eachVal[2];
		document.getElementById("Me4").textContent = eachVal[3];
		document.getElementById("Me5").textContent = eachVal[4];
		document.getElementById("Me6").textContent = eachVal[5];
		document.getElementById("usr").textContent = eachVal[1];
		document.getElementById("psw").textContent = eachVal[2];
		document.getElementById("fnm").textContent = eachVal[3];
		document.getElementById("lnm").textContent = eachVal[4];
		document.getElementById("eml").textContent = eachVal[5];
}	
	

window.onload = function() {
	sendAjaxGet("http://localhost:8080/Project1/ViewEmp", viewEmp);
	sendAjaxGet("http://localhost:8080/Project1/Pending", pendingReq);
	sendAjaxGet("http://localhost:8080/Project1/Resolved", resolvedReq);
	sendAjaxGet("http://localhost:8080/Project1/ViewInfo", viewInfo);
	// sendAjaxGet("http://localhost:8080/Project1/NewEmpServlet", empReq);
}

function allEmpReq(){
	sendAjaxGet("http://localhost:8080/Project1/NewEmpServlet?filter=", empReq);
}

function empReq(xhr){
	var eachReq = xhr.responseText.split("Reimbursement");
	var user = document.getElementById("workId").value;
	var myNode = document.getElementById("EmpReqList");
	while (myNode.firstChild) {
	    myNode.removeChild(myNode.firstChild);
	}
	// <tr>
    //                         <th>ID</th>
    //                         <th>Amount</th>
    //                         <th>Description</th>
    //                         <th>Receipt</th>
    //                         <th>Submitted Date</th>
    //                         <th>Submitted Time</th>
    //                         <th>Resolved Date</th>
    //                         <th>Resolved Time</th>
    //                         <th>Author</th>
    //                         <th>Resolver</th>
    //                         <th>Type</th>
    //                         <th>Status</th>
    //                     </tr>
	for (x = 1; x < eachReq.length ; x++){
		var eachVal = eachReq[x].split("/");
		if (eachVal[8] == user){
		var newrow = document.createElement("tr");
		newrow.setAttribute("id", "Req " + x);
		document.getElementById("EmpReqList").appendChild(newrow);
		var col1 = document.createElement("td");
		var col2 = document.createElement("td");
		var col3 = document.createElement("td");
		var col4 = document.createElement("td");
		var col5 = document.createElement("td");
		var col6 = document.createElement("td");
		var col7 = document.createElement("td");
		var col8 = document.createElement("td");
		var col9 = document.createElement("td");
		var col10 = document.createElement("td");
		var col11 = document.createElement("td");
		var col12 = document.createElement("td");
		col1.textContent = eachVal[0];
		col2.textContent = eachVal[1];
		col3.textContent = eachVal[2];
		col4.textContent = eachVal[3];
		col5.textContent = eachVal[4];
		col6.textContent = eachVal[5];
		col7.textContent = eachVal[6];
		col8.textContent = eachVal[7];
		col9.textContent = eachVal[8];
		col10.textContent = eachVal[9];
		col11.textContent = eachVal[10];
		col12.textContent = eachVal[11];
		document.getElementById("Req " + x).appendChild(col1);
		document.getElementById("Req " + x).appendChild(col2);
		document.getElementById("Req " + x).appendChild(col3);
		document.getElementById("Req " + x).appendChild(col4);
		document.getElementById("Req " + x).appendChild(col5);
		document.getElementById("Req " + x).appendChild(col6);
		document.getElementById("Req " + x).appendChild(col7);
		document.getElementById("Req " + x).appendChild(col8);
		document.getElementById("Req " + x).appendChild(col9);
		document.getElementById("Req " + x).appendChild(col10);
		document.getElementById("Req " + x).appendChild(col11);
		document.getElementById("Req " + x).appendChild(col12);
		}
	}
}