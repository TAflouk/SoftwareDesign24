
#list in lists
grid = [[1,2,3],
        [4,5,6],
        [7,8,9],
        [4234]]

print(grid[3][0])

for row in grid:
    print(row)




for row in grid:
    for col in row:
        print(col)