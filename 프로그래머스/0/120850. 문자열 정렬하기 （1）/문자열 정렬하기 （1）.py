def solution(my_string):
    return sorted([int(n_str) for n_str in my_string if n_str.isdigit()])
