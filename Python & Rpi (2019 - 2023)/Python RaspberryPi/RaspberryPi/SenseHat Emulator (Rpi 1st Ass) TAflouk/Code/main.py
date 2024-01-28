# @Authors: TAflouk, ABerry
# @Date:2021-11-02 10:30:40
# @LastModifiedBy: ABerry, TAflouk
# @Last Modified time:2021-11-06 11:33:20


# --- IMPORTS ---
from shake_emu import*

def main():
    greeting_msg = input("Enter your first name: ").title()
    s.show_message(f"Hello, {greeting_msg}", text_colour=[0, 255, 255])
    while True:
        x, y, z = s.get_accelerometer_raw().values()
        pos_x = abs(x)
        pos_y = abs(y)
        pos_z = abs(z)
        if pos_x > 1.4 or pos_y > 1.4 or pos_z > 1.4:
            #s.show_message(f"{rolling}", text_colour=[0, 255, 255])
            roll_dice()
            t.sleep(1)

if __name__ == "__main__":
    main()