# @Authors: TAflouk, ABerry
# @Date:2021-11-02 10:30:40
# @LastModifiedBy: ABerry, TAflouk
# @Last Modified time:2021-11-06 11:33:20

# --- IMPORTS ---
from sense_emu import SenseHat
import random as r, time as t
import doctest



# --- GLOBAL ---
green = [0, 255, 0]
yellow = [255, 255, 0]
blue = [0, 0, 255]
red = [255, 0, 0]
white = [255,255,255]
nothing = [0,0,0]
pink = [255,105, 180]

s = SenseHat()
s.clear()
colours =  [green,yellow,
        blue,red,white
        ,nothing,pink
        ]


# --- FUCTIONS ---
def side_1():
    """side_1 Function is to create a few images for number 1 but with different images and colours

    Returns:
        [List]: [ints iside lists and all the lists inside one list]
    """
    for i in colours:
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
    rand_img = r.randint(0,len(images)-1)
    return images[rand_img]


def side_2():
    """side_2 Function is to create a few images for number 2 but with different images and colours

    Returns:
        [List]: [ints iside lists and all the lists inside one list]
    """
    for i in colours:
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
    image_2 = [
        Y, Y, Y, Y, Y, Y, Y, Y,
        Y, O, R, R, R, R, O, Y,
        Y, O, O, O, O, R, O, Y,
        Y, O, R, R, R, R, O, Y,
        Y, O, R, O, O, O, O, Y,
        Y, O, R, O, O, O, O, Y,
        Y, O, R, R, R, R, O, Y,
        Y, Y, Y, Y, Y, Y, Y, Y,
    ]
    image_3 = [
        R, R, R, R, R, R, R, R,
        R, O, Y, Y, Y, Y, O, R,
        R, O, O, O, O, Y, O, R,
        R, O, Y, Y, Y, Y, O, R,
        R, O, Y, O, O, O, O, R,
        R, O, Y, O, O, O, O, R,
        R, O, Y, Y, Y, Y, O, R,
        R, R, R, R, R, R, R, R,
    ]
    images = [image_1, image_2, image_3]
    rand_img = r.randint(0,len(images)-1)
    return images[rand_img]


def side_3():
    """side_3 Function is to create a few images for number 3 but with different images and colours

    Returns:
        [List]: [ints iside lists and all the lists inside one list]
    """
    for i in colours:
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
        B, R, Y, Y, Y, Y, R, B,
        B, O, O, O, O, Y, O, B,
        B, O, Y, Y, Y, Y, O, B,
        B, O, O, O, O, Y, O, B,
        B, O, Y, Y, Y, Y, O, B,
        B, R, O, O, O, O, R, B,
        B, B, B, B, B, B, B, B,
        ]
    image_2 = [
        R, R, R, R, R, R, R, R,
        R, G, Y, Y, Y, Y, G, R,
        R, O, O, O, O, Y, O, R,
        R, O, Y, Y, Y, Y, O, R,
        R, O, O, O, O, Y, O, R,
        R, O, Y, Y, Y, Y, O, R,
        R, G, O, O, O, O, G, R,
        R, R, R, R, R, R, R, R,
        ]
    image_3 = [
        G, G, G, G, G, G, G, G,
        G, G, Y, Y, Y, Y, G, G,
        G, O, O, O, O, Y, O, G,
        G, O, Y, Y, Y, Y, O, G,
        G, O, O, O, O, Y, O, G,
        G, O, Y, Y, Y, Y, O, G,
        G, G, O, O, O, O, G, G,
        G, G, G, G, G, G, G, G,
        ]
    images = [image_1, image_2, image_3]
    rand_img = r.randint(0,len(images)-1)
    return images[rand_img]


def side_4():
    """side_3 Function is to create a few images for number 3 but with different images and colours

    Returns:
        [List]: [ints iside lists and all the lists inside one list]
    """
    for i in colours:
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
        R, W, W, W, W, W, W, R,
        W, O, Y, O, O, Y, O, W,
        W, O, Y, O, O, Y, O, W,
        W, O, Y, Y, Y, Y, O, W,
        W, O, O, O, O, Y, O, W,
        W, O, O, O, O, Y, O, W,
        W, O, O, O, O, Y, O, W,
        R, W, W, W, W, W, W, R,
        ]
    image_2 = [
        G, W, W, W, W, W, W, G,
        W, O, R, O, O, R, O, W,
        W, O, R, O, O, R, O, W,
        W, O, R, R, R, R, O, W,
        W, O, O, O, O, R, O, W,
        W, O, O, O, O, R, O, W,
        W, O, O, O, O, R, O, W,
        G, W, W, W, W, W, W, G,
        ]
    image_3 = [
        W, R, R, R, R, R, R, W,
        R, O, Y, O, O, Y, O, R,
        R, O, Y, O, O, Y, O, R,
        R, O, Y, Y, Y, Y, O, R,
        R, O, O, O, O, Y, O, R,
        R, O, O, O, O, Y, O, R,
        R, O, O, O, O, Y, O, R,
        W, R, R, R, R, R, R, W,
        ]
    images = [image_1, image_2, image_3]
    rand_img = r.randint(0,len(images)-1)
    return images[rand_img]


def side_5():
    """side_6 Function is to create a few images for number 6 but with different images and colours

    Returns:
        [List]: [ints iside lists and all inside one list ]
    """
    for i in colours:
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
    image_2 = [
        G, Y, Y, Y, Y, Y, Y, Y,
        G, O, R, R, R, R, O, W,
        G, O, R, O, O, O, O, W,
        G, O, R, R, R, R, O, W,
        G, O, O, O, O, R, O, W,
        G, O, R, R, R, R, O, W,
        G, O, O, O, O, O, O, W,
        B, B, B, B, B, B, B, W,
        ]
    image_3 = [
        W, W, W, W, W, W, W, W,
        W, O, Y, Y, Y, Y, O, W,
        W, O, Y, O, O, O, O, W,
        W, O, Y, Y, Y, Y, O, W,
        W, O, O, O, O, Y, O, W,
        W, O, Y, Y, Y, Y, O, W,
        W, O, O, O, O, O, O, W,
        W, W, W, W, W, W, W, W,
        ]
    images = [image_1, image_2, image_3]
    rand_img = r.randint(0,len(images)-1)
    return images[rand_img]


def side_6():
    """side_6 Function is to create a few images for number 6 but with different images and colours

    Returns:
        [List]: [list of numbers]
    """
    for i in colours:
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
    image_2 = [
        W, W, W, W, W, W, W, W,
        W, O, Y, Y, Y, Y, O, W,
        W, O, Y, O, O, O, O, W,
        W, O, Y, Y, Y, Y, O, W,
        W, O, Y, O, O, Y, O, W,
        W, O, Y, Y, Y, Y, O, W,
        W, O, O, O, O, O, O, W,
        W, W, W, W, W, W, W, W,
        ]
    image_3 = [
        W, W, W, W, W, W, W, W,
        W, O, G, G, G, G, O, R,
        W, O, G, O, O, O, O, R,
        W, O, G, G, G, G, O, R,
        W, O, G, O, O, G, O, R,
        W, O, G, G, G, G, O, R,
        W, O, O, O, O, O, O, R,
        W, R, R, R, R, R, R, R,
        ]
    return image_1


def roll_dice():
    """AI is creating summary for roll_dice Function is for this function is to generate a random number and then get an image from the images to display it in the main function

    Returns:
        [None]: [it does not return anything]
    """
    images = [side_1(), side_2(),
            side_3(), side_4(),
            side_5(), side_6()
            ]
    rand = r.randint(0,len(images)-1)
    s.set_pixels(images[rand])


def main():
    text_colour = [0, 255, 255]
    rolling = "Rollig..."
    greeting_msg = input("Enter your first name: ").title()
    s.show_message(f"Hello, {greeting_msg}.", text_colour=[0, 255, 255])
    while True:
        x, y, z = s.get_accelerometer_raw().values()
        pos_x = abs(x)
        pos_y = abs(y)
        pos_z = abs(z)
        if pos_x > 1.4 or pos_y > 1.4 or pos_z > 1.4:
            s.show_message(f"{rolling}", text_colour=[0, 255, 255])
            roll_dice()
        for event in s.stick.get_events():
            if event.direction == 'up' or event.direction == 'down' or event.direction == 'left' or event.direction == 'right' or event.action == "pressed":
                s.show_message(f"{rolling}", text_colour=[0, 255, 255])
                roll_dice()


if __name__ == "__main__":
    main()