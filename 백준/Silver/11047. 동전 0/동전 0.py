import sys
input = sys.stdin.readline
n , m= map(int, input().split())
coins = []
for _ in range(n):
    coin = int(input())
    if coin <= m:
        coins.append(coin)

idx = len(coins) - 1
cnt = 0
while idx >= 0 and n  > 0:
    val = m // coins[idx]
    cnt += val
    m = m % coins[idx]
    idx -= 1

print(cnt)
