def secLargest(arr):
    first = sec = float('-inf')
    for i in arr:
       if i > first:
           sec = first
           first = i
       elif i > sec and i != first:
            sec = i
    return sec          
arr = list(map(int,input().split()))
print(secLargest(arr))
