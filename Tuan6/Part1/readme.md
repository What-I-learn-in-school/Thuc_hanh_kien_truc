# 21046541 - Phùng Anh Minh 

## 1.Kiểm tra phiên bản Docker
`docker --version`  
Hiển thị phiên bản Docker đang cài đặt trên hệ thống.
![img.png](1.png)

## 2. Chạy container thử nghiệm
`docker run hello-world`  
Chạy một container kiểm tra, hiển thị thông báo xác nhận Docker hoạt động đúng.
![img.png](2.png)

## 3. Tải image nginx từ Docker Hub
`docker pull nginx`  
Tải image `nginx` về máy cục bộ.
![img.png](3.png)

## 4. Liệt kê các images đã tải
`docker images`  
Hiển thị danh sách các images trên máy.
![img.png](4.png)

## 5. Chạy container nginx dưới nền
`docker run -d nginx`  
Chạy `nginx` trong chế độ nền (detached mode).
![img.png](5.png)

## 6. Xem danh sách container đang chạy
`docker ps`  
Hiển thị danh sách các container đang hoạt động.
![img.png](6.png)

## 7. Xem danh sách tất cả container (kể cả đã dừng)
`docker ps -a`  
Hiển thị toàn bộ container, bao gồm cả những container đã dừng.
![img.png](7.png)

## 8. Xem logs của container
`docker logs <container_id>`  
Xem nhật ký (logs) của một container cụ thể.
![img.png](8.png)

## 9. Truy cập vào bên trong container
`docker exec -it <container_id> /bin/sh`  
Mở terminal bên trong container để thực hiện các lệnh.
![img.png](9.png)

## 10. Dừng container
`docker stop <container_id>`  
Dừng một container đang chạy.
![img.png](10.png)

## 11. Khởi động lại container
`docker restart <container_id>`  
Khởi động lại container.
![img.png](11.png)

## 12. Xóa container
`docker rm <container_id>`  
Xóa một container đã dừng.
![img.png](12.png)

## 13. Xóa tất cả container đã dừng
`docker container prune`  
Xóa toàn bộ container không hoạt động.
![img.png](13.png)

## 14. Xóa image
`docker rmi <image_id>`  
Xóa một image khỏi hệ thống.
![img.png](14.png)

## 15. Xóa tất cả images không sử dụng
`docker image prune -a`  
Dọn dẹp toàn bộ images không sử dụng để tiết kiệm dung lượng.
![img.png](15.png)

## 16. Chạy container và ánh xạ cổng
`docker run -d -p 8080:80 nginx`  
Chạy container nginx và ánh xạ cổng 8080 trên máy host với cổng 80 của container.
![img.png](16.png)

## 17. Xem thông tin chi tiết của container
`docker inspect <container_id>`  
Hiển thị thông tin chi tiết về container dưới dạng JSON.
![img.png](17.png)

## 18. Tạo volume và gắn vào container
`docker run -d -v mydata:/data nginx`  
Tạo một volume tên `mydata` và gắn vào `/data` trong container.
![img.png](18.png)

## 19. Liệt kê danh sách volumes
`docker volume ls`  
Hiển thị danh sách các volumes trên hệ thống.
![img.png](19.png)

## 20. Xóa tất cả volumes không sử dụng
`docker volume prune`  
Dọn dẹp toàn bộ volumes không sử dụng.
![img.png](20.png)

## 21. Chạy container với tên cụ thể
`docker run -d --name my_nginx nginx`  
Chạy container nginx và đặt tên là `my_nginx`.
![img.png](21.png)

## 22. Giám sát tài nguyên container
`docker stats`  
Hiển thị thông tin về tài nguyên CPU, RAM mà container đang sử dụng.
![img.png](22.png)

## 23. Liệt kê mạng Docker
`docker network ls`  
Hiển thị danh sách các mạng Docker.