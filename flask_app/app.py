from flask import Flask, render_template, request, redirect, url_for
from werkzeug.utils import secure_filename
import os
import subprocess
from products import products, add_product

app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = 'uploads'

# -----------------------------
# 1️⃣ عرض المنتجات
# -----------------------------
@app.route('/')
def display_products():
    return render_template('display_products.html', products=products)

# -----------------------------
# 2️⃣ إضافة منتج
# -----------------------------
@app.route('/add', methods=['GET', 'POST'])
def add():
    if request.method == 'POST':
        name = request.form['name']
        price = request.form['price']
        description = request.form['description']
        image_file = request.files['image']
        image_filename = None

        if image_file:
            image_filename = secure_filename(image_file.filename)
            image_path = os.path.join(app.config['UPLOAD_FOLDER'], image_filename)
            image_file.save(image_path)

        add_product(name, price, description, image_filename)
        return redirect(url_for('display_products'))

    return render_template('add_product.html')

# -----------------------------
# 3️⃣ عرض تفاصيل منتج محدد
# -----------------------------
@app.route('/product/<int:index>')
def product_details(index):
    if 0 <= index < len(products):
        product = products[index]
        return render_template('product_details.html', product=product)
    return "Product not found", 404



if __name__ == '__main__':
    os.makedirs(app.config['UPLOAD_FOLDER'], exist_ok=True)
    app.run(debug=True)