from sys import stdin

arr = [-1 for _ in range(26)]
s = stdin.readline().rstrip()
for i in range(len(s)):
    if arr[ord(s[i]) - 97] == -1:
        arr[ord(s[i]) - 97] = i

print(*arr)