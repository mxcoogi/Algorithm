import sys
input = sys.stdin.readline
from collections import deque

n, m = map(int, input().split())
arr = []
visit = []
for i in range(n):
    line = list(map(int, input().rstrip()))
    arr.append(line)
    visit.append([False] * m)
dx = [0 , 0, -1, 1]
dy = [-1, 1, 0, 0]
def bfs(arr, visit):
    q = deque([(0,0)])
    while q:
        y, x = q.popleft()
        visit[y][x] = True
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < m and 0 <= ny < n and not visit[ny][nx]:
                if arr[ny][nx] == 1 :
                    arr[ny][nx] = arr[y][x] + 1
                    q.append((ny, nx))

bfs(arr, visit)
print(arr[n-1][m-1])