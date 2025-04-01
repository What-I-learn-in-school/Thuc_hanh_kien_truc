from flask import Flask, render_template, request
import redis

app = Flask(__name__)
redis_client = redis.StrictRedis(host='redis', port=6379, decode_responses=True)

@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == 'POST':
        vote = request.form['vote']
        redis_client.rpush('votes', vote)
    return '''
        <form method="POST">
            <button name="vote" value="Option A">Vote for Option A</button>
            <button name="vote" value="Option B">Vote for Option B</button>
        </form>
    '''

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)