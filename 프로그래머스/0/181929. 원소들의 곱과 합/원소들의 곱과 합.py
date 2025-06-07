def solution(num_list):
    sumNumber = sum(num_list)
    mutiple = 1
    for i in num_list:
        mutiple *= i
    if mutiple < sumNumber**2:
        return 1
    else:
        return 0