n = int(input())

x = []
y = []

for i in range(n):
    _x, _y = map(int, input().split())
    x.append(_x)
    y.append(_y)
res = []
for i in range(n):
    _x = x[i]
    _y = y[i]
    cnt = 1
    for j in range(n):
        if j == i:
            continue
        if x[j] > _x and y[j] > _y:
            cnt += 1

    res.append(cnt)
print(*res)