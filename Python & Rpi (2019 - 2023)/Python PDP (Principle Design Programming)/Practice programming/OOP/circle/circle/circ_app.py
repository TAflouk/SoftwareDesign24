# ------------------------------------------------------------------------------
# Name:        circ_app.py
# Purpose:     An application to calculate areas for circles
# Author:      srattigan
# Created:     06/01/2019
# Revision:    1.00
# ------------------------------------------------------------------------------

# imports
import circ
import easygui as eg


def main():
    '''
    Main function of app
    '''
    # easygui.msgbox(msg='(Your message goes here)', title=' ', ok_button='OK', image=None, root=None)
    eg.msgbox(msg='Welcome to my new app', title='Circle App', ok_button='Grand')
    # Using easygui titlebox, messagebox and (for now) integerbox
    # show title of circle calculator
    # get user input for radius
    rad = eg.integerbox(msg='Enter the radius of the circle', title='Circle App')
    # show that the area of a circle with radius 'r' is 'x'
    my_circle = circ.Circle(rad)
    # Create options to get the area, circumference or area of a sector
    # use buttonbox(msg='', title=' ', choices=('Button[1]', 'Button[2]', 'Button[3]'), image=None, root=None, default_choice=None, cancel_choice=None)
    # and work out the logic to get and display each of the options
    choice = eg.buttonbox(msg='', title=' ', choices=('[A]rea', 'Button[2]', 'Button[3]'))
    output = "Not Set"
    if choice == '[A]rea':  # area chosen
        output = f"The circle with radius {my_circle.radius} has an area of {my_circle.area()}"
    elif choice == 'Button[2]':  # circumference chosen
        output = "The circumference is.."#
    elif choice == 'Button[3]':
        pass
    print(choice)
        # ask for the angle, calculate the area of the sector
    eg.msgbox(title="Circle App", msg = output, ok_button='Cool')


# main body
if __name__ == "__main__":
    main()