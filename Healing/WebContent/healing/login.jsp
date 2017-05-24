<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="row"
	style="background-color: #fff; margin-bottom: 10px; padding-top: 100px; padding-bottom: 100px">
	<div class="col-xs-12 col-lg-10 col-lg-offset-1"
		data-form-type="formoid">

		<form action="#" method="post" data-form-title="CONTACT FORM">


			<div class="row row-sm-offset" style="padding: 10px" align="center">
				<label class="form-control-label" for="form1-2-email">Email:</label>
				<div class="col-xs-12 col-md-4" style="float: inherit;">
					<input type="email" class="form-control" name="email"
						data-form-field="Name" id="form1-2-email">
				</div>
			</div>
			<div class="row row-sm-offset" style="padding: 10px" align="center">
				<div class="col-xs-12 col-md-4" style="float: none;">
					<label class="form-control-label" for="form1-2-pass">Pass:</label>
				</div>
				<div class="col-xs-12 col-md-4" style="float: none;">
					<input type="pass" class="form-control" name="pass"
						data-form-field="Email" id="form1-2-pass">
				</div>
			</div>

			<div align="center" style="margin: 10px">
				<button type="submit" class="btn btn-primary">Login</button>
				<a class="btn btn-primary" href="/Healing/index?path=join">Join</a>
				<!-- <button type="submit" class="btn btn-primary">Login</button>
							<button type="submit" class="btn btn-primary">Join</button> -->
			</div>
			<div align="center" style="margin: 10px">
				<a class="nav-link link" href="/Healing/index?path=joincheck">비밀번호
					찾기</a>
			</div>

		</form>
	</div>
</div>

