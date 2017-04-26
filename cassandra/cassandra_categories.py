import json
from cassandra.cluster import Cluster

with open('categories.json') as data_file:
        data = json.load(data_file)

cluster = Cluster()
session = cluster.connect('cheapchef')

category = data.keys()
print category[0]
index = 0
for i in range(0, len(category)):
    names = data[category[i]].keys()
    price = data[category[i]].values()
    print names
    index += 1
    ingredient_name = names[0]
    ingredient_price = price[0]
    ingredient_category = category[i]

    print names[0], ' costs: ', price[0]

    session.execute(
            """
            INSERT INTO categories (ingredient, ingredient_name, ingredient_price, category)
            VALUES (%s, %s, %s, %s)
            """,
            (index, ingredient_name, int(ingredient_price), ingredient_category)
            )
