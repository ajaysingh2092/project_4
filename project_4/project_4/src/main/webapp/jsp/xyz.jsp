<%@page import="in.co.rays.project_4.ctl.CollegeCtl"%>
<%@page import="in.co.rays.project_4.util.DataUtility"%>
<%@page import="in.co.rays.project_4.util.ServletUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College View</title>
<link href="<%=ORSView.APP_CONTEXT%>/css/main.css" rel="stylesheet"
	id="bootstrap-css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.1/js/mdb.min.js"></script>
<style type="text/css">
.log1 {
	padding-top: 5%;
	/* padding-left: 30%; */
}

.hm-gradient {
	background-image: url('<%=ORSView.APP_CONTEXT%>/img/bg1.png');
}



i.css {
	border: 2px solid #8080803b;
	padding-left: 10px;
	padding-bottom: 11px;
	background-color: #ebebe0;
}
</style>
</head>
<body class="hm-gradient">
	<div class="header">
		<%@include file="Header.jsp"%>
	</div>
	<div>

		<main>
		<form action="<%=ORSView.COLLEGE_CTL%>" method="post">

			<div class="row log1">
				<!-- Grid column -->
				<jsp:useBean id="bean" class="in.co.rays.project_4.bean.CollegeBean"
					scope="request"></jsp:useBean>
				<div class="col-md-4 mb-4"></div>
				<div class="col-md-4 mb-4">
					<div class="card">
						<div class="card-body">
							<%
								long id = DataUtility.getLong(request.getParameter("id"));

								if (id > 0) {
							%>
							<h3 class="text-center default-text py-3">Update College</h3>
							<%
								} else {
							%>
							<h3 class="text-center default-text py-3">Add College</h3>
							<%
								}
							%>
							<!--Body-->
							<div>

								<H4 align="center">
									<%
										if (!ServletUtility.getSuccessMessage(request).equals("")) {
									%>
									<div class="alert alert-success alert-dismissible">
										<button type="button" class="close" data-dismiss="alert">&times;</button>
										<%=ServletUtility.getSuccessMessage(request)%>
									</div>
									<%
										}
									%>
								</H4>

								<H4 align="center">
									<%
										if (!ServletUtility.getErrorMessage(request).equals("")) {
									%>
									<div class="alert alert-danger alert-dismissible">
										<button type="button" class="close" data-dismiss="alert">&times;</button>
										<%=ServletUtility.getErrorMessage(request)%>
									</div>
									<%
										}
									%>

								</H4>

								<input type="hidden" name="id" value="<%=bean.getId()%>">
								<input type="hidden" name="createdBy"
									value="<%=bean.getCreatedBy()%>"> <input type="hidden"
									name="modifiedBy" value="<%=bean.getModifiedBy()%>"> <input
									type="hidden" name="createdDatetime"
									value="<%=DataUtility.getTimestamp(bean.getCreatedDateTime())%>">
								<input type="hidden" name="modifiedDatetime"
									value="<%=DataUtility.getTimestamp(bean.getModifiedDateTime())%>">
							</div>
							<div class="md-form">
								<span class="pl-sm-5"><b>Name</b><span
									style="color: red;">*</span></span> </br> <i
									class="fas fa-university prefix grey-text css"
									style="font-size: 1rem;"></i> <input type="text" name="name"
									id="defaultForm-email" style="border: 2px solid #8080803b;"
									placeholder="Enter Name"
									value="<%=DataUtility.getStringData(bean.getName())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("name", request)%></font></br>

								<span class="pl-sm-5"><b>Address</b><span
									style="color: red;">*</span></span> </br> <i
									class="fas fa-address-book prefix grey-text css"
									style="font-size: 1rem;"></i> <input type="text" name="address"
									id="defaultForm-email" style="border: 2px solid #8080803b;"
									placeholder="Enter Address"
									value="<%=DataUtility.getStringData(bean.getAddress())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("address", request)%></font></br>

								<span class="pl-sm-5"><b>State</b><span
									style="color: red;">*</span></span> </br> <i
									class="fas fa-address-card prefix grey-text"></i> <input
									type="text" name="state" id="defaultForm-email"
									style="border: 2px solid #8080803b;" placeholder="Enter State"
									value="<%=DataUtility.getStringData(bean.getState())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("state", request)%></font></br>

								<span class="pl-sm-5"><b>City</b><span
									style="color: red;">*</span></span> </br> <i
									class="far fa-address-card prefix grey-text css"
									style="font-size: 1rem;"></i> <input type="text" name="city"
									id="defaultForm-email" style="border: 2px solid #8080803b;"
									placeholder="Enter City"
									value="<%=DataUtility.getStringData(bean.getCity())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("city", request)%></font></br>

								<span class="pl-sm-5"><b>Mobile No</b><span
									style="color: red;">*</span></span> </br> <i
									class="fa fa-phone prefix grey-text css"
									style="font-size: 1rem;"></i> <input type="text"
									name="mobileNo" placeholder="Enter MobileNo" maxlength="10"
									style="border: 2px solid #8080803b;" id="defaultForm-pass"
									value="<%=DataUtility.getStringData(bean.getPhoneNo())%>">
								<font color="red" class="pl-sm-5"> <%=ServletUtility.getErrorMessage("mobileNo", request)%></font></br>
							</div>
							</br>
							<%
								if (id > 0) {
							%>
							<div class="text-center">

								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=CollegeCtl.OP_UPDATE%>"> <input type="submit"
									name="operation" class="btn btn-success btn-md"
									style="font-size: 17px" value="<%=CollegeCtl.OP_CANCEL%>">
							</div>
							<%
								} else {
							%>
							<div class="text-center">

								<input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="<%=CollegeCtl.OP_SAVE%>"> <input type="submit"
									name="operation" class="btn btn-warning btn-md"
									style="font-size: 17px" value="<%=CollegeCtl.OP_RESET%>">
							</div>
							<%
								}
							%>
						</div>
					</div>
				</div>
				<div class="col-md-4 mb-4"></div>
			</div>

		</form>
		</main>


	</div>

</body>


</body>
</html>