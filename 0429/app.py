from datetime import datetime

from flask import Flask, render_template, jsonify, request
from pymongo import MongoClient

app = Flask(__name__)

client = MongoClient("mongodb://localhost:27017/")
db = client.test


@app.route('/')
def index():
    return render_template('index.html')

@app.route('/detail/<idx>')
def detail(idx):
    return jsonify({"result": "success"})

@app.route('/post', methods=['POST'])
def save_post():
    title_receive = request.form['title_give']
    password_receive = request.form['password_give']
    content_receive = request.form['content_give']
    time = datetime.now()
    now = time.strftime('%Y-%m-%d-%H-%M-%S')

    doc = {
        'title':title_receive,
        'pw':password_receive,
        'content':content_receive,
        'reg_date' :now
    }
    db.test.insert_one(doc)

    return jsonify({"result": "success",'msg':'포스팅 성공!'})


@app.route('/post', methods=['GET'])
def get_post():
    posts = list(db.test.find({},{'_id':False}))
    return jsonify({"posts": posts})


@app.route('/post', methods=['DELETE'])
def delete_post():
    idx = request.args.get('idx')
    db.test.delete_one({'idx': int(idx)})
    return {"result": "success"}


if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)