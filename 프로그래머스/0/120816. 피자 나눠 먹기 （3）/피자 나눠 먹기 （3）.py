def solution(slice, n):
    answer = 0
    d, m = divmod(n, slice)
    answer = d + 1 if m > 0 else d
    return answer