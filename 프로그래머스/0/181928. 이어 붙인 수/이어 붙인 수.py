def solution(num_list):
    answer = 0
    odd = "".join(str(n) for n in num_list if n % 2 != 0)
    even = "".join(str(n) for n in num_list if n % 2 == 0)
    answer = int(odd) + int(even)
    return answer