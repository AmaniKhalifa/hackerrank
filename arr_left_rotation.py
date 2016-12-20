# Solution of https://www.hackerrank.com/challenges/ctci-array-left-rotation
def array_left_rotation(a, n, k):
    ans = n*[0]
    for i in range(n):
        x = 0 if (i <= (n - 1 - k)) else n
        #print("x = " +str(x))
        #print(str(i) + " , " + str(i+k-1-x))
        ans[i] = a[i + k - x]
    return ans


n, k = map(int, input().strip().split(' '))
a = list(map(int, input().strip().split(' ')))
answer = array_left_rotation(a, n, k);
print(*answer, sep=' ')
