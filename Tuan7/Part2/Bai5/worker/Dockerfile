FROM openjdk:11

WORKDIR /app

# Tải thư viện Jedis, Gson và PostgreSQL JDBC driver
ADD https://repo1.maven.org/maven2/redis/clients/jedis/4.3.1/jedis-4.3.1.jar jedis.jar
ADD https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar gson.jar
ADD https://jdbc.postgresql.org/download/postgresql-42.6.0.jar postgresql.jar

# Copy mã nguồn
COPY . .

# Biên dịch Worker.java với classpath chứa Jedis, Gson và PostgreSQL JDBC driver
RUN javac -cp ".:jedis.jar:gson.jar:postgresql.jar" Worker.java

# Chạy Worker với classpath chứa Jedis, Gson và PostgreSQL JDBC driver
CMD ["java", "-cp", ".:jedis.jar:gson.jar:postgresql.jar", "Worker"]