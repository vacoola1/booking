(function() {
    var ajaxUrl = "/ajax" + window.location.pathname;
    var datatableApi;
    var filter;

    $(function () {
        filter = $('#filter');
        filter.submit(function () {
            updateTable();
            return false;
        });

        datatableApi = $('#datatable').DataTable({
            "ajax": {
                "url": ajaxUrl + "/propperties",
                "dataSrc": function (json) {
                    return json;
                }
            },
            "paging": true,
            "info": false,
            "searching": false,
            "columns": [
                {
                    "data": "id"
                },
                {
                    "data": "location"
                },
                {
                    "data": "address"
                },
                {
                    "data": "owner"
                }
            ],
            "order": [
                [
                    0,
                    "asc"
                ]
            ]
        });

    });

    function updateTable() {
        $.get(app.ajaxUrl + "/properties?"+filter.serialize(), function (data) {
            datatableApi.clear().rows.add(data).draw();
        });
    }

}());