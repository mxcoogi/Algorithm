import sys
input = sys.stdin.readline
from collections import deque

n, m = map(int, input().split())
arr = [[] for _ in range(n)]
for _ in range(m):
    a, b = map(int, input().split())
    arr[a-1].append(b-1)
    arr[b-1].append(a-1)

def bfs(arr, v, visit, ls):
    q = deque([v])
    turn = 0
    q2 = deque()
    while q:
        val = q.popleft()
        if not visit[val]:
            visit[val] = True
            ls[val] = turn
            for i in arr[val]:
                q2.append(i)
        if not q and q2:
            while q2:
                q.append(q2.popleft())
            q2.clear()
            turn += 1

    
    

res = []
for i in range(n):
    visit = [False] * n
    ls = [0] * n
    bfs(arr, i, visit, ls)
    _min = sum(ls)
    res.append(_min)
print(res.index(min(res)) + 1)