import sys
input = sys.stdin.readline
from pprint import pprint
from collections import deque
Y, X = map(int, input().split())
graph = []
res = []
for i in range(Y):
    row = list(map(int, input().split()))
    res.append([False] * X)
    if 2 in row:
        _x = row.index(2)
        _y = i
    graph.append(row)

def bfs(graph, y, x, res):
    q = deque([(y, x)])
    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0 ,0]
    graph[y][x] = 0
    while q:
        y, x = q.popleft()
        if not res[y][x]:
            res[y][x] = True
        else:
            continue
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < X and 0 <= ny < Y and not res[ny][nx]:
                if graph[ny][nx] == 0:
                    res[ny][nx] = True
                    continue
                graph[ny][nx] = graph[y][x] + 1
                q.append((ny, nx))


bfs(graph, _y, _x, res)
for i in range(Y):
    for j in range(X):
        if not res[i][j] and graph[i][j] != 0:
            graph[i][j] = -1
        print(graph[i][j], end= " ")
    print()
