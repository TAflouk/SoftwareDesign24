# @Authors: TAflouk, ABerry
# @Date:2021-12-17 10:30:40
# @LastModifiedBy: ABerry, TAflouk
# @Last Modified time:2021-12-20 11:33:20

# --- IMPORTS ---
from sense_emu import SenseHat


# --- GLOBAL ---
s = SenseHat()
blue = [0, 0, 255]
red = [255, 0, 0]
white = [255,255,255]
nothing = [0,0,0]

def  get_weather_data(name):
    celcius = round(s.get_temperature(),1)
    fahrenheit = round(1.8 *celcius + 32, 1)
    humidity = round(s.get_humidity(),1)
    pressure = round(s.get_pressure(),1)
    if name == 'celcius':
        return celcius
    elif name == 'fahrenheit':
        return fahrenheit
    elif name == 'humidity':
        return humidity
    elif name == 'pressure':
        return pressure
    #print(fahrenheit)
    
def red_light_img():
    R = red
    W = white
    O = nothing
    
    red_image = [
        W, R, R, R, R, R, R, W,
        R, O, O, O, O, O, O, R,
        R, O, R, R, R, R, O, R,
        R, O, R, R, R, R, O, R,
        R, O, R, R, R, R, O, R,
        R, O, R, R, R, R, O, R,
        R, O, O, O, O, O, O, R,
        W, R, R, R, R, R, R, W,
        ]
    return red_image


def blue_light_img():
    O = nothing
    B = blue
    W = white
    
    blue_image = [
        W, B, B, B, B, B, B, W,
        B, O, O, O, O, O, O, B,
        B, O, B, B, B, B, O, B,
        B, O, B, B, B, B, O, B,
        B, O, B, B, B, B, O, B,
        B, O, B, B, B, B, O, B,
        B, O, O, O, O, O, O, B,
        W, B, B, B, B, B, B, W,
        ]
    return blue_image

def display_light():
    image = None
    if get_weather_data('celcius') >= 24:
        #s.show_message(f"Temp: {get_weather_data('temperature.celcius')} Celcius or {get_weather_data('temperature.fahrenheit')} in Fahrenheite.\n", text_colour = [100, 150, 200])
        image = red_light_img()
    else:
        #s.show_message(f"Temp: {get_weather_data('temperature.celcius')} Celcius or {get_weather_data('temperature.fahrenheit')} in Fahrenheite. \n", text_colour = [250, 150, 50])
        image = blue_light_img()
    s.set_pixels(image)
    
    
#display_light()

        
    
        