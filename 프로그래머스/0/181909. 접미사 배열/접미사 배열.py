def solution(my_string):
    endLen = len(my_string)
    answer = []
    for i in range(1, endLen):
        answer.append(my_string[i:endLen])
   
    answer.append(my_string)
    return sorted(answer)