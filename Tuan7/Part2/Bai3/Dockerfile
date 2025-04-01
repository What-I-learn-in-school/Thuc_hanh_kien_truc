FROM python:3.9-slim

# Set the working directory
WORKDIR /app

# Copy requirements.txt và cài đặt dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy mã nguồn ứng dụng
COPY . .

# Expose cổng ứng dụng
EXPOSE 5000

# Chạy ứng dụng
CMD ["python", "app.py"]