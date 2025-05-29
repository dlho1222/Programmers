def solution(hp):
    answer = 0
    while hp > 0:
        if hp > 5:
            div = divmod(hp, 5)
            answer = div[0]
            hp = div[1]
        elif hp >= 3:
            div = divmod(hp, 3)
            answer += div[0]
            hp = div[1]
        else:
            div = divmod(hp, 1)
            answer += div[0]
            hp = div[1]

    return answer