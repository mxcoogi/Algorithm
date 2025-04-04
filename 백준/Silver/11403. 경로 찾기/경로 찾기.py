import sys
input = sys.stdin.readline
from pprint import pprint
from collections import deque


n = int(input())
graph = []
for _ in range(n):
    val = list(map(int, input().split()))
    graph.append(val)

def dfs(graph, start):
    for i in range(n):
        v = graph[start][i]
        if v == 0:
            continue
        if start == i:
            visit[i] = 1
        else:
            if not visit[i]:
                visit[i] = 1
                dfs(graph, i)
        

for start in range(n):
    visit = [0] * (n)
    dfs(graph, start)
    print(*visit)
