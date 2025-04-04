import sys
input = sys.stdin.readline
from collections import deque

n, m = map(int, input().split())
arr = []
visit = []
row, col = 0, 0
for i in range(n):
    line = input().rstrip()
    arr.append(line)
    visit.append([False] * m)
    if 'I' in line:
        col = line.index('I')
        row = i

def bfs(arr, i, col, cnt):
    q = deque([(row, col)])
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    while q:
        y, x = q.popleft()
        if not visit[y][x]:
            visit[y][x] = True
            if arr[y][x] == 'P':
                cnt += 1
            elif arr[y][x] == 'X':
                continue
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if 0 <= nx < m and 0 <= ny < n:
                    if not visit[ny][nx]:
                        q.append((ny, nx))
    
    return cnt
cnt = bfs(arr, row, col, 0)
if cnt == 0:
    print("TT")
else:
    print(cnt)