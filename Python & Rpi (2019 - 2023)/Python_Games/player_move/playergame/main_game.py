import arcade
from player import *
SPRITE_SCALING = 0.5

SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600
SCREEN_TITLE = "Better Move Sprite with Keyboard Example"

MOVEMENT_SPEED = 5

player_img = ":resources:images/animated_characters/female_person/femalePerson_idle.png"


class MyGame(arcade.Window):
    """
    Main application class.
    """

    def __init__(self, width, height, title):
        """
        Initializer
        """

        # Call the parent class initializer
        super().__init__(width, height, title)

        # Variables that will hold sprite lists
        self.player_list = None

        # Set up the player info
        self.player_sprite = None

        # Track the current state of what key is pressed
        # THESE WILL BECOME OBSOLETE/UNNECESSARY
        self.left_pressed = False
        self.right_pressed = False
        self.up_pressed = False
        self.down_pressed = False

        # Set the background color
        arcade.set_background_color(arcade.color.AMAZON)

    def setup(self):
        """ Set up the game and initialize the variables. """

        # Sprite lists
        self.player_list = arcade.SpriteList()

        # Set up the player
        self.player_sprite = Player()
        self.player_list.append(self.player_sprite)

    def on_draw(self):
        """
        Render the screen.
        """

        # This command has to happen before we start drawing
        arcade.start_render()

        # Draw all the sprites.
        self.player_list.draw()

    def on_update(self, delta_time):
        """ Movement and game logic """
        self.player_list.update()

    def on_key_press(self, key, modifiers):
        """Called whenever a key is pressed.
        for each player, the method wiill now check if the key 
        belongs to a player, and it does, call the key_nadler
        to let the instance know a key belonging to it was pressed
        """
        for player in self.player_list:
            if key in player.keys:
                player.key_handler(key, True)
            if key == arcade.key.P:
                print(player)
               


    def on_key_release(self, key, modifiers):
        """Called when the user releases a key.
            for each player, the method wiill now check if the key 
            belongs to a player, and it does, call the key_nadler
            to let the instance know a key belonging to it was pressed
        """    
        for player in self.player_list:
            if key in player.keys:
                player.key_handler(key, False)




def main():
    """ Main method """
    window = MyGame(SCREEN_WIDTH, SCREEN_HEIGHT, SCREEN_TITLE)
    window.setup()
    arcade.run()


if __name__ == "__main__":
    main()
    print(Player())
