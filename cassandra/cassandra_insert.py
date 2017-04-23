import json
from cassandra.cluster import Cluster

with open('ingredients.json') as data_file:
        data = json.load(data_file)

        names = data.keys()
        costs = data.values()
        restricted = [False] * len(costs)


cluster = Cluster()
session = cluster.connect('cheapchef')
for i in range(0, len(names)):
    session.execute(
            """
            INSERT INTO ingredients (ingredient, ingredient_name, ingredient_price, ingredient_restricted)
            VALUES (%s, %s, %s, %s)
            """,
            (i, names[i], int(costs[i]), restricted[i])
            )
