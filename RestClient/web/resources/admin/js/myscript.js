// Hàm hiện thông báo confirm xóa user
function confirmDelete(message, url) {
    var alert = confirm(message);
    if (alert) {
        window.location = url;
    }
}