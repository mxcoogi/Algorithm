import sys
input = sys.stdin.readline
from collections import deque

n , k = map(int, input().split())
visit = [0] * (100001)

def bfs(v, visit,k):
    q = deque([v])
    while q:
        val = q.popleft()
        if val == k:
            return visit[val]
        for next in [val-1, val+1, val*2]:
            if 0 <= next < 100001 and not visit[next]:
                visit[next] = visit[val]+ 1
                q.append(next)

print(bfs(n, visit, k))
        