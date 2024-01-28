# --IMPORTS--
from sense_emu import SenseHat
import time as t

# Settings for the game
sense = SenseHat()
ball_position = [3,4]
ball_velocity = [1,1]
white = (255, 255, 255)
blue = (0,0,255)
life = 10
bat_y = 2
score = 0
is_paused = False