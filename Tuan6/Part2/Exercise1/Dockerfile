FROM node:18

# Đặt thư mục làm việc
WORKDIR /app

# Sao chép package.json và package-lock.json vào container
COPY package*.json ./

# Cài đặt dependencies
RUN npm install

# Sao chép mã nguồn vào container
COPY . .

# Mở cổng 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["node", "app.js"]