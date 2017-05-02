#import json
from cassandra.query import named_tuple_factory
from cassandra.cluster import Cluster


cluster = Cluster()
session = cluster.connect('cheapchef')

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (0, {39, 23, 38, 43}, 'tacos', 'www.allrecipes.com/tacos')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (1, {23, 45, 31, 24, 22}, 'sandwitch', 'www.allrecipes.com/sandwitch')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (2, {1, 23, 33, 16, 30, 21}, 'couscous salad', 'www.allrecipes.com/couscous-salad')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (3, {15, 24}, 'scrambled eggs', 'www.allrecipes.com/scrabled-eggs')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (4, {14, 23, 30, 34, 32}, 'vegetable soup', 'www.allrecipes.com/vegetable-soup')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (5, {23, 28, 22, 27, 32, 34}, 'salad', 'www.allrecipes.com/salad')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (6, {25, 20}, 'french fries', 'www.allrecipes.com/french-fries')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (7, {10, 11, 12, 9}, 'fruit salad', 'www.allrecipes.com/fruit-salad')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (8, {42, 33, 30, 21}, 'baked lamb', 'www.allrecipes.com/baked-lamb')")
session.execute(insert_statement)

insert_statement = session.prepare("INSERT INTO recipes (recipe_id, ingredients, recipe_name, recipe_url) VALUES (9, {44, 31, 22}, 'blt sandwitch', 'www.allrecipes.com/blt-sandwitch')")
session.execute(insert_statement)
