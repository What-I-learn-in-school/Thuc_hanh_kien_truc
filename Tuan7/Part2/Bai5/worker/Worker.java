import redis.clients.jedis.Jedis;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Worker {
    public static void main(String[] args) throws Exception {
        Jedis redis = new Jedis("redis", 6379);
        Connection db = DriverManager.getConnection("jdbc:postgresql://postgres:5432/votes", "postgres", "postgrespassword");

        while (true) {
            String vote = redis.lpop("votes");
            if (vote != null) {
                PreparedStatement stmt = db.prepareStatement("INSERT INTO votes (option) VALUES (?)");
                stmt.setString(1, vote);
                stmt.executeUpdate();
            }
            Thread.sleep(100);
        }
    }
}