// Hàm hiện thông báo confirm xóa user
function confirmDelete(message, url) {
    var alert = confirm(message + "--" + url);
    if (alert) {
        window.location = url;
    }
}