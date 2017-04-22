<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Booking</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="webjars/datatables/1.10.11/css/jquery.dataTables.min.css">
    <link rel="stylesheet" href="webjars/datetimepicker/2.4.7/jquery.datetimepicker.css">
</head>
<body>
<div class="jumbotron">
    <div class="container">
        <div class="shadow">
            <h3>Booking</h3>

            <div class="view-box">
                <form method="post" class="form-horizontal" role="form" id="filter">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="dateFtom">From Date:</label>
                        <div class="col-sm-2">
                            <input class="form-control" name="dateFtom" id="dateFtom">
                        </div>

                        <label class="control-label col-sm-2" for="dateTo">To Date:</label>
                        <div class="col-sm-2">
                            <input class="form-control" name="dateTo" id="dateTo">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="location">Location:</label>

                        <div class="col-sm-2">
                            <input class="form-control" name="location" id="location">
                        </div>

                        <label class="control-label col-sm-2" for="address">Address:</label>

                        <div class="col-sm-2">
                            <input class="form-control" name="address" id="address">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-8">
                            <button type="submit" class="btn btn-primary pull-right">Filter</button>
                        </div>
                    </div>
                </form>
                <table class="table table-striped display" id="datatable">
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Location</th>
                        <th>Address</th>
                        <th>Owner</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</div>

</body>
<script type="text/javascript" src="webjars/jquery/2.2.3/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/datetimepicker/2.4.7/build/jquery.datetimepicker.full.min.js"></script>
<script type="text/javascript" src="webjars/datatables/1.10.11/js/jquery.dataTables.min.js"></script>
</html>
