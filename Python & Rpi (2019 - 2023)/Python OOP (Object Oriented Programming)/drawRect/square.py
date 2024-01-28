import arcade 
from settings import *
# Open the window and set the background
arcade.open_window(400, 400, "Complex Loops - Box")

arcade.set_background_color(arcade.color.WHITE)

# Start the render process. This must be done before any drawing commands.
arcade.start_render()

# Loop for each row
for row in range(6):
    # Loop for each column
    for column in range(12):
        # Calculate our location
        x = column * COLUMN_SPACING + LEFT_MARGIN
        y = row * ROW_SPACING + BOTTOM_MARGIN
        # Draw the item
        arcade.draw_rectangle_filled(x, y,WIDTH ,HEIGHT, arcade.color.AO,3,45)

# Finish the render.
arcade.finish_render()

# Keep the window up until someone closes it.
arcade.run()
