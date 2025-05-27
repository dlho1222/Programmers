def solution(slice, n):
    answer = 0
    div = divmod(n, slice)
    answer = div[0] + 1 if div[1] > 0 else div[0]
    return answer