import sys
input = sys.stdin.readline
from collections import deque

n = int(input())
arr = []
for _ in range(n):
    line = list(input().rstrip())
    arr.append(line)

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

def bfs(arr, a, b):
    q = deque([(a, b)])
    global cnt
    while q:
        y, x = q.popleft()
        if arr[y][x] == '1':
            cnt += 1
            arr[y][x] = '0'
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if 0 <= nx < n and 0 <= ny < n and arr[ny][nx] == '1':
                    q.append((ny, nx))

ls = []
for i in range(n):
    for j in range(n):
        if arr[i][j] == '0':
            continue
        cnt  = 0
        bfs(arr,i,j)
        ls.append(cnt)
if len(ls) > 0:
    print(len(ls))
    ls.sort()
    for i in ls:
        print(i)
else:
    print(0)