$(function () {
	$(".sidebar li").click(function () {
		let menu_text = $(this).text();
        let menu_id = $(this).attr("id");
        if (menu_text === "DEPT") {
            document.location.href = `${rootPath}/comsc/`;
        } else if (menu_id === "hot_board") {
            document.location.href = `${rootPath}/comsc/hot`;
        } else if (menu_id === "free_board") {
            document.location.href = `${rootPath}/comsc/free`;
        } else if (menu_id === "info_board") {
            document.location.href = `${rootPath}/comsc/info`;
        } else if (menu_id === "book_board") {
            document.location.href = `${rootPath}/`;
        } else if (menu_id === "notice") {
            document.location.href = `${rootPath}/comsc/notice`;
        } else if (menu_id === "menu-mypage") {
            document.location.href = `${rootPath}/`;
        }
    })
})