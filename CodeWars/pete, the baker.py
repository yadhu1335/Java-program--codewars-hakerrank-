def cakes(recipe, available):
    for i in recipe:
        if i not in available:
            return 0
    res = dict(recipe)
    for i in recipe:
        res[i] = available[i] // recipe[i]
    return min(res.values())

recipe = {"flour": 500, "sugar": 200, "eggs": 1}
available = {"flour": 1200, "sugar": 1200, "eggs": 5, "milk": 200}
print(cakes(recipe, available))