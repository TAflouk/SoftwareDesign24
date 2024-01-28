# @Author:TAflouk
# @Date:2021-03-08 00:00:00
# @LastModifiedBy:TAflouk
# @Last Modified time:2021-03-08 00:00:00

# -- IMPORTS --
import arcade
import random as rnd
import easygui as eg
from player import Player
from block import Block
from settings import *
import time
import json
import doctest

# -- FUNCTIONS/CLASSES --
start_text = '''
this game is mix of breakout and space invaders
the control for the player 1 are:
    left-arrow(left)
    right_arrow(right)
    up_arrow(shoot/launch) '''

num_players = 0

def start_game_info():
    """
    Shows Game info at the game start
    """
    start_info_done = False
    eg.msgbox(msg=start_text,
              title='Breakup',
              ok_button='OK',
              image="images/arrow2.jpg",
              root=None)

def decide_num_players():
    """Function to let the player decide how many player 

    Returns:
        [int]: int
    """
    image = "images/players.png"
    msg = "Select 1 or 2 player game"
    choices = ["1 Player", "2 Player","3 player"]
    reply = eg.buttonbox(msg,
                         image="images/players.png",
                         choices=choices)
    return int(reply[0])

def read_scores(score_file):
    """
    Reads from json file
    >>> read_scores('ispy')  # 'scores/ispy.json'
    {10: ["ispy Test"], 40: ["Tereti Spaghetti", "Mary Magda", "Gosh Gollipop"], 51: ["Fin Perch"], 73: ["Alan Z"], 57: ["Jimbo Frosmindo"], 99: ["Gin Swim Kung"], 62: ["Ding Dong Tufu"]}

    Args:
        score_file (str): json file
    Returns:
        int: returns dictionary as a str
    """
    file_scr = f"scores/{score_file}.json"
    with open(file_scr, 'r') as outfile:
        score_data = json.load(outfile)  # 
        new_scores = {}
        for each in score_data:
            new_scores[int(each)] = score_data[str(each)]
    return new_scores


class MyGame(arcade.Window):
    """
    Main application class.
    """

    def __init__(self, width, height, title):
        """
        Initializer
        """
        super().__init__(width, height, title)
        self.player_list = None
        self.block_list = None
        self.background = None
        self.start_time = False
        arcade.set_background_color(arcade.color.BLACK)

    def setup(self):
        """ Set up the game and initialize the variables. """
        self.background = arcade.load_texture("images/space_img_bkr.jpg")
        self.player_list = arcade.SpriteList()
        self.block_list = arcade.SpriteList()
        start_x = 85.5 /2
        start_y = 600 
        for col in range(8):
            for row in range(8):
                blk = Block(SPRITESHEET, 19, 16, 171, 58, 19)
                blk.set_pos(start_x,
                           start_y)
                self.block_list.append(blk)
                start_x += blk.width
            print(blk)
            start_y -= blk.height
            start_x = 85.5 /2
        # Set up the player(s)
        for i in range(num_players):
            p = Player()
            self.player_list.append(p)

    def on_draw(self):
        """
        Render the screen.
        """
        arcade.start_render()
        if time.time() - self.start_time < 10:
            self.start_text()
        else:
        # Draw the background texture
            arcade.draw_lrwh_rectangle_textured(0, 0,
                                                SCREEN_WIDTH, SCREEN_HEIGHT- 150, # rectangle
                                                self.background)
            self.block_list.draw()
            self.player_list.draw()
            self.draw_info()  # all text drawing commands to go here

    def start_text(self):
        arcade.draw_text(start_text,50,SCREEN_WIDTH,
                         arcade.color.WHITE,16,
                         font_name=('Arial,Sans'))

    
    # for the title bar 
    def draw_info(self):
        """Method to draw information
        """
        #p.score and live
        p = self.player_list[0]
        
        output = f"Player {str(p.p_id).zfill(4)}                                                          HIGH SCORE\n score {str(p.score).zfill(4)}                                                         wwq\n live {p.live}"
        arcade.draw_text(output, 10, SCREEN_HEIGHT- 100,
                         arcade.color.WHITE, 20,
                         font_name=('font/ArcadeClassic.ttf', 'Sans'))

    def on_update(self, delta_time):
        """ Movement and game logic """
        self.player_list.update()
        # call update on other objects

    def on_key_press(self, key, modifiers):
        """Called whenever a key is pressed.
        For each player, the method will now check if the key
        belongs to a player, and if it does, call the key_handler
        to let the instance know a key belonging to it was pressed
        """
        # if key pressed is the letter "P", print player(s)
        for player in self.player_list:
            if key in player.keys:
                player.key_handler(key, True)

    def on_key_release(self, key, modifiers):
        """Called when the user releases a key.
        For each player, the method will now check if the key
        belongs to a player, and if it does, call the key_handler
        to let the instance know a key belonging to it was released
        """
        for player in self.player_list:
            if key in player.keys:
                player.key_handler(key, False)

def main():
    """ Main method """
    global num_players
    start_game_info()
    num_players = decide_num_players()
    print(f"{num_players} is {type(num_players)}")
    window = MyGame(SCREEN_WIDTH, SCREEN_HEIGHT, SCREEN_TITLE)
    window.setup()
    arcade.run()


if __name__ == "__main__":
    #print(read_scores("hi_scores"))
    main()
