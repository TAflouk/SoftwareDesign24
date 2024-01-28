import arcade

#create a window screen
arcade.open_window(600, 600, 'mygame')
arcade.set_background_color(arcade.color.WHITE)

#fun to loop the screen
arcade.start_render()
#draw the circle
arcade.draw_circle_filled(300, 300, 200, arcade.color.YELLOW)

#circl face
arcade.draw_circle_filled(375, 350, 20, arcade.color.BLACK)

#eye 1
arcade.draw_circle_filled(230, 350, 20, arcade.color.BLACK)





#mouth
x = 300
y = 280
width = 120
height = 100
start_angle = 190
end_angle = 350
arcade.draw_arc_outline(x, y, width, height, arcade.color.BLACK, start_angle, end_angle, 20)




arcade.finish_render()


#loop function for the window
arcade.run()

