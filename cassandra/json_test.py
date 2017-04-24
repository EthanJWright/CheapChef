import json

with open('ingredients.json') as data_file:
        data = json.load(data_file)

category = data.keys()
for i in range(0, len(category)-1):
    names = data[category[i]].keys()
    price = data[category[i]].values()
    for j in range(0, len(names)-1):
        print names[j], ' costs: ', price[j], ' in category: ', category[i]

#        print costs

#        print str(names[0]), ' costs: ', int(costs[0])
#        print int(costs[0]) + 1
