FROM python:3.9

# Đặt thư mục làm việc
WORKDIR /app

# Sao chép file yêu cầu vào container
COPY requirements.txt ./

# Cài đặt dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Sao chép mã nguồn vào container
COPY . .

# Mở cổng 5000
EXPOSE 5000

# Chạy ứng dụng
CMD ["python", "index.py"]
