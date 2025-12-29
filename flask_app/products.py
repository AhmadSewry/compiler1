products = []

def add_product(name, price, description, image=None):
    product = {
        'name': name,
        'price': price,
        'description': description,
        'image': image
    }
    products.append(product)
