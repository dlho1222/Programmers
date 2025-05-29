def solution(my_string):
    return sum([int(n_str) for n_str in my_string if n_str.isdigit()])