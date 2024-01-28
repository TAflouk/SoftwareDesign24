import random 
#from curses import * # a libary to use create a window 
import curses
s = curses.initscr() # a func to create a window on the whole screen

curses.curs_set(0) # to set the visibtlity 

sh , sw = s.getmaxyx() # screen hight and width returns tuple (x,x)

w = curses.newin(sh , sw , 0, 0) # to start the new window with the x and  y

w.keypad(1)
w.timeout(100) # the screen will do refresh every 100m second

#neasted lists to set the positions 
snk_x = sw//4
snk_y = sh//2
snake = [
        [snk_y,snk_x],
        [snk_y, snk_x-1],
        [snk_y, snk_x-2]
        ]

food  = [sh//2, sw//2]
w.addch(food[0], food[1], curses.ACS_PI)

key = curses.KEY_RIGHT

while True:
    next_key = w.getch()
    key = key if next_key == -1 else next_key
    if snake[0][0] in [0,sh] or snake [0][1] in [0,sw] or snake[0] in snake[1:]:
        curses.endwin()
        quit
    new_head = [snake[0][0], snake[0][1]]
    if key == curses.KEY_DOWN:
        new_head[0]+=1
    if key == curses.KEY_UP:
        new_head[0]-=1    
    if key == curses.KEY_RIGHT:
        new_head[1]-=1 
    if key == curses.KEY_UP:
        new_head[1]+=1
    snake.insert(0,new_head)

    if snake[0] == food:
        food = None 
        while food is None:
            nf = [
                random.randint(1,sh-1),
                random.randint(1,sw-1)
            ]   
            food = nf if nf not in snake else None 
        w.addch(snake[0], food[1], curses.ACS_PI)
    else:
        tail = snake.pop()
        w.addch(tail[0], tail[1], ' ')

    w.addch(snake[0][0], food[0][1], curses.ACS_CKBOARD)