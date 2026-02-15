def ispalindrome(s):
    revs=""
    for ch in s:
        revs = ch+revs
    return revs == s
s = input().strip()
print(ispalindrome(s))
