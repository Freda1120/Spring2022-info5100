# Q1

class Solution1:
    def valid(s):
        stack = []
        for c in s:
            if c == '(' or c == '[' or c == '{':
                stack.append(c)
            else:
                if not stack:
                    return False
                top = stack.pop()
                if c == ']' and top != '[':
                    return False
                elif c == ')' and top != '(':
                    return False
                elif c == '}' and top != '{':
                    return False
        if len(stack) == 0:
            return True
        return False

    print(valid("()[]{}"))
    print(valid("(]"))
    print(valid("()"))



# Q2

class Solution2:
    def compress(s): 
        chars = list(s)
        n = len(chars)
        i = 0
        count = 1
        for j in range(1, n+1):
            if j < n and chars[j] == chars[j-1]:
                count += 1
            else:
                chars[i] = chars[j-1]
                i += 1
                if count > 1:
                    for m in str(count):
                        chars[i] = m
                        i += 1
                count = 1
        res = chars[:i]
        for i in range(1, len(res)):
            if i == len(res)-1 and res[i].isalpha():
                res.append('1')
            elif res[i].isalpha() and res[i-1].isalpha():
                res.insert(i, '1')
        res = "".join(res)
            
        if len(res) >= len(s):
            return s
        
        else:
            return res

    print(compress("aabcccccaaa"))
    print(compress("ab"))
    print(compress("aaaabb"))
    


# Q3

class Solution3:
    def longest(s):
        if len(s) <= 1:
            return len(s)
        start = 0
        visit = set()
        res = 0
        for end in range(len(s)):
            while s[end] in visit:
                visit.remove(s[start])
                start += 1
            res = max(res, end-start+1)
            visit.add(s[end])
        return res

    print(longest("pwwkew"))
    print(longest("bbbbb"))



# Q4

class Solution4:
    def sumZero(n):
        res = []
        if n % 2 == 1:
            res.append(0)
        res.extend(i for i in range(1, n // 2 + 1))
        res.extend(-i for i in range(1, n // 2 + 1))
        return res

    print(sumZero(5))
    print(sumZero(4))
    print(sumZero(3))



# Q5

import heapq
class Solution5:
    def findKthLargest(nums, k):
        heap = []
        for num in nums:
            heapq.heappush(heap, num)
            if len(heap) > k:
                heapq.heappop(heap)
        return heap[0]

    print(findKthLargest([3,2,1,5,6,4], 2))
    print(findKthLargest([3,2,3,1,2,4,5,5,6], 4))
