def rev(s):
    revs=""
    for ch in s:
        revs = ch+revs
    return revs
s = input().strip()
print(rev(s))
