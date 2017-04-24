import json
from cassandra.cluster import Cluster

with open('ingredients.json') as data_file:
        data = json.load(data_file)

cluster = Cluster()
session = cluster.connect('cheapchef')
category = data.keys()
index = 0
for i in range(0, len(category)-1):
    names = data[category[i]].keys()
    price = data[category[i]].values()
    for j in range(0, len(names)-1):
        index += 1
        ingredient_name = names[j]
        ingredient_price = price[j]
        ingredient_category = category[i]

        print names[j], ' costs: ', price[j]

        session.execute(
                """
                INSERT INTO ingredients_sortable (ingredient, ingredient_name, ingredient_price, category)
                VALUES (%s, %s, %s, %s)
                """,
                (index, ingredient_name, int(ingredient_price), ingredient_category)
                )
