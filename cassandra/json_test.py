import json

with open('ingredients.json') as data_file:
        data = json.load(data_file)

        names = data.keys()
        costs = data.values()
        restrict = [False] * len(costs)

        print str(names[0]), ' costs: ', int(costs[0])
        print int(costs[0]) + 1
