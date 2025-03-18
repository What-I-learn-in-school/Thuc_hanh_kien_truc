FROM nginx

# Sao chép tệp HTML vào thư mục phục vụ web của Nginx
COPY index.html /usr/share/nginx/html/index.html

# Mở cổng 80
EXPOSE 80

# Chạy Nginx
CMD ["nginx", "-g", "daemon off;"]
