# def solution(num_list):
#     lenth = len(num_list)
#     multiple = 1
#     if lenth >= 11:
#         return sum(num_list)
#     else:
#         for i in num_list:
#             multiple *= i
#         return multiple
from math import prod


def solution(num_list):
    return sum(num_list) if len(num_list) >= 11 else prod(num_list)