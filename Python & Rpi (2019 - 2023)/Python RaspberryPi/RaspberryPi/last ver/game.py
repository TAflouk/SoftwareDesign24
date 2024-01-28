# --IMPORTS--
from settings import*

# draw ball Function to draw the bat and move it and check the ball against the bat 
def draw_ball(pos_x, pos_y, color):

    global ball_velocity, life, ball_position, score
    sense.set_pixel(pos_x, pos_y,color)
    ball_position[0] += ball_velocity[0]
    ball_position[1] += ball_velocity[1]
    
    if ball_position[0] == 7 or ball_position[0] == 0:
        ball_velocity[0] = -ball_velocity[0]
        
    if ball_position[1] == 7 or ball_position[1] == 0:
        ball_velocity[1] = -ball_velocity[1]
        
    if ball_position[0] == 1 and (bat_y -1) <= ball_position[1] <= (bat_y+1):
        ball_velocity[0] = -ball_velocity[0]
        score += 5
        
    if ball_position[0] == 0:
        sense.show_message("lives: " + str(life))
        sense.show_message("Scores: " + str(score))
        life -= 1
        ball_position = [3,4]
        ball_velocity = [1,1]
        score = 0

# Pause function to pause the game and resume it 
def pause(event):
    global is_paused
    if event.action == 'pressed':
        if is_paused  == True:
            is_paused  = False       
        else:
            is_paused  = True

# Function to draw bat like a paddle (Player)
def draw_bat(x_pos, y_pos,col):
    sense.clear()
    sense.set_pixel(x_pos, y_pos,col)
    sense.set_pixel(x_pos, y_pos+1,col)
    sense.set_pixel(x_pos, y_pos-1,col)   

# Move UP function to move up the bat
def move_up(event):
    global bat_y
    if event.action == 'pressed' and bat_y > 1:
        bat_y -= 1
        
# Move DOWN function to move down the bat
def move_down(event):
    global bat_y
    if event.action == 'pressed' and bat_y < 6:
        bat_y += 1
        
# main Func that contains the logic 
def main():
    global life
    while (life > 0):
        if not is_paused:
            draw_bat(0, bat_y, white)
            draw_ball(ball_position[0], ball_position[1],white)
            sense.stick.direction_up = move_up
            sense.stick.direction_down = move_down
            sense.stick.direction_middle = pause
            t.sleep(.2)
            if score >= 60:
                # increament the velocity and check the boundries 
                life = 5
                


if __name__ == '__main__':
    main()