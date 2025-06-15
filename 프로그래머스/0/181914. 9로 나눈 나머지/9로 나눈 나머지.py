def solution(number):
    
    strToint = int(number)
    sum = 0
    while strToint > 0:
        sum += strToint % 10
        strToint //= 10

    
    return sum % 9