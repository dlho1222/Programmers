def solution(num_list):
    lenth = len(num_list)
    multiple = 1
    if lenth >= 11:
        return sum(num_list)
    else:
        for i in num_list:
            multiple *= i
        return multiple