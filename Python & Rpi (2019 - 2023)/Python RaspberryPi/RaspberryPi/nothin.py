

# --- IMPORTS ---
from sense_hat import SenseHat
import time as t
import random as r

s = SenseHat()
s.low_light = True

green = (0, 255, 0)
yellow = (255, 255, 0)
blue = (0, 0, 255)
red = (255, 0, 0)
white = (255,255,255)
nothing = (0,0,0)
pink = (255,105, 180)

COLOURS =  [green,yellow,
        blue,red,white
        ,nothing,pink
        ]
  

def side_1():
    for i in COLOURS:
      if i == green:
        G = green
      elif i == yellow:
        Y = yellow
      elif i == blue:
        B = blue
      elif i == nothing:
        O = nothing
      elif i == red:
        R = red

    image_1 = [
    Y, Y, Y, Y, Y, Y, Y, Y,
    Y, O, O, O, B, O, O, Y,
    Y, O, O, B, B, O, O, Y,
    Y, O, B, O, B, O, O, Y,
    Y, O, O, O, B, O, O, Y,
    Y, O, O, O, B, O, O, Y,
    Y, O, O, O, B, O, O, Y,
    Y, Y, Y, Y, Y, Y, Y, Y,
    ]
    image_2 = [
    R, R, R, R, R, R, R, R,
    R, O, O, O, Y, O, O, R,
    R, O, O, Y, Y, O, O, R,
    R, O, Y, O, Y, O, O, R,
    R, O, O, O, Y, O, O, R,
    R, O, O, O, Y, O, O, R,
    R, O, O, O, Y, O, O, R,
    R, R, R, R, R, R, R, R,
    ]
    images = [image_1, image_2]
    for i in range(len(images)):
      rand_img = r.randint(0,len(images)-1)
    return images[rand_img]

def side_2():
  for i in COLOURS:
    if i == green:
      G = green
    elif i == red:
      R = red
    elif i == nothing:
      O = nothing
    elif i == blue:
        B = blue
    elif i == yellow:
      Y = yellow
  image_1 = [
    B, B, B, B, B, B, B, B,
    B, O, Y, Y, Y, Y, O, B,
    B, O, O, O, O, Y, O, B,
    B, O, Y, Y, Y, Y, O, B,
    B, O, Y, O, O, O, O, B,
    B, O, Y, O, O, O, O, B,
    B, O, Y, Y, Y, Y, O, B,
    B, B, B, B, B, B, B, B,
    ]
  image_1 = [
    Y, Y, Y, Y, Y, Y, Y, Y,
    Y, O, R, R, R, R, O, Y,
    Y, O, O, O, O, R, O, Y,
    Y, O, R, R, R, R, O, Y,
    Y, O, R, O, O, O, O, Y,
    Y, O, R, O, O, O, O, Y,
    Y, O, R, R, R, R, O, Y,
    Y, Y, Y, Y, Y, Y, Y, Y,
    ]
  return image_1

def side_3():
  for i in COLOURS:
    if i == green:
      G = green
    elif i == red:
      R = red
    elif i == nothing:
      O = nothing
    elif i == blue:
        B = blue
    elif i == yellow:
      Y = yellow
  image_1 = [
    B, B, B, B, B, B, B, B,
    B, O, Y, Y, Y, Y, O, B,
    B, O, O, O, O, Y, O, B,
    B, O, Y, Y, Y, Y, O, B,
    B, O, O, O, O, Y, O, B,
    B, O, Y, Y, Y, Y, O, B,
    B, O, O, O, O, O, O, B,
    B, B, B, B, B, B, B, B,
    ]
  return image_1

def side_4():
  for i in COLOURS:
    if i == green:
      G = green
    elif i == red:
      R = red
    elif i == nothing:
      O = nothing
    elif i == blue:
        B = blue
    elif i == yellow:
      Y = yellow
    elif i == white:
      W = white
  image_1 = [
    O, O, O, O, O, O, O, O, 
    O, O, Y, O, O, Y, O, O,
    O, O, Y, O, O, Y, O, O,
    O, O, Y, Y, Y, Y, O, O,
    O, O, O, O, O, Y, O, O,
    O, O, O, O, O, Y, O, O,
    O, O, O, O, O, Y, O, O,
    O, O, O, O, O, O, O, O,
    ]
  return image_1

def side_5():
  for i in COLOURS:
    if i == green:
      G = green
    elif i == red:
      R = red
    elif i == nothing:
      O = nothing
    elif i == blue:
        B = blue
    elif i == yellow:
      Y = yellow
    elif i == white:
      W = white
    elif i == pink:
      P = pink
  image_1 = [
    O, O, O, O, O, O, O, O,
    O, O, R, R, R, R, O, O,
    O, O, R, O, O, O, O, O,
    O, O, R, R, R, R, O, O,
    O, O, O, O, O, R, O, O,
    O, O, R, R, R, R, O, O,
    O, O, O, O, O, O, O, O,
    O, O, O, O, O, O, O, O,
    ]
  return image_1
  
def side_6():
  
  for i in COLOURS:
    if i == green:
      G = green
    elif i == red:
      R = red
    elif i == nothing:
      O = nothing
    elif i == blue:
        B = blue
    elif i == yellow:
      Y = yellow
    elif i == white:
      W = white
    elif i == pink:
      P = pink
      
  image_1 = [
    O, O, O, O, O, O, O, O,
    O, O, R, R, R, R, O, O,
    O, O, R, O, O, O, O, O,
    O, O, R, R, R, R, O, O,
    O, O, R, O, O, R, O, O,
    O, O, R, R, R, R, O, O,
    O, O, O, O, O, O, O, O,
    O, O, O, O, O, O, O, O,
    ]
  return image_1


def main():
  images = [side_1, side_2,
            side_3, side_4,
            side_5, side_6
            ]
  count = 0
  while True:
      s.set_pixels(images[count % len(images)]())
      t.sleep(.75)
      count += 1
      #if __name__ == "__main__"
      
      
if __name__ == "__main__":
  main()