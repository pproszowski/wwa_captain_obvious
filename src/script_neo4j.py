filename = './data'
lines = [line.rstrip('\n') for line in open(filename)]

groups = [];
group = [];

for line in lines:
    if len(line) == 0:
        groups.append(group)
        group = []
    else:
        group.append(line)

groups.append(group)


def getFineString(var):
    return var.replace(" ", "").replace(".", "").replace("-","").replace("/","").replace("\"","").replace("'","").replace(",","").replace("(","").replace(")","");

for g in groups:

    i = 0;

    for line in g:
        i = i + 1;
        if i != len(g) :
            print("CREATE(" + getFineString(line) + ":Category{name: \"" + getFineString(line) + "\"});") 
        else:
            print("CREATE(" + getFineString(line) + ":Product{name: \"" + getFineString(line) + "\"});") 

    for i in range(0,len(g) - 1):
        print("MATCH(p1{name:\"" + getFineString(g[len(g) - 1 - i]) + "\"}), (p2{name:\"" + getFineString(g[len(g) - i - 2]) + "\"})  CREATE (p1)-[:IS_A]->(p2);")


