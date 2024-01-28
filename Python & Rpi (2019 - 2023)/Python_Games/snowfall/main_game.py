import arcade 
from settings import *
import random
from snowfall import Snowflake
import math


class MyGame(arcade.Window):
    """ Main application class. """
    def __init__(self, width, height, title):
        """
        Initializer
        :param width:
        :param height:
        """
        # Calls "__init__" of parent class (arcade.Window) to setup screen
        super().__init__(width, height, title)

        # Sprite lists
        self.snowflake_list = None

    def start_snowfall(self):
        """ Set up snowfall and initialize variables. """
        self.snowflake_list = []

        for i in range(NUM_FLAKES):
            # Create snowflake instance
            snowflake = Snowflake()

            # Randomly position snowflake
            snowflake.x = random.randrange(SCREEN_WIDTH)
            snowflake.y = random.randrange(SCREEN_HEIGHT + 200)

            # Set other variables for the snowflake
            snowflake.size = random.randrange(4)
            snowflake.speed = random.randrange(20, 40)
            snowflake.angle = random.uniform(math.pi, math.pi * 2)

            # Add snowflake to snowflake list
            self.snowflake_list.append(snowflake)

        # Don't show the mouse pointer
        self.set_mouse_visible(False)

        # Set the background color
        arcade.set_background_color(arcade.color.BLACK)

    def on_draw(self):
        """
        Render the screen.
        """

        # This command is necessary before drawing
        arcade.start_render()

        # Draw the current position of each snowflake
        for snowflake in self.snowflake_list:
            arcade.draw_circle_filled(snowflake.x, snowflake.y,
                                      snowflake.size, arcade.color.WHITE)

    def on_update(self, delta_time):
        """
        All the logic to move, and the game logic goes here.
        """

        # Animate all the snowflakes falling
        for snowflake in self.snowflake_list:
            snowflake.update(delta_time)




def main():
    window = MyGame(SCREEN_WIDTH, SCREEN_HEIGHT, SCREEN_TITLE)
    window.start_snowfall()
    arcade.run()


if __name__ == "__main__":
    main()