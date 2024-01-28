# @Authors: TAflouk, ABerry
# @Date:2021-11-02 10:30:40
# @LastModifiedBy: ABerry, TAflouk
# @Last Modified time:2021-11-06 11:33:20

# --- IMPORTS ---
from shake_emu import*

# NOTE: this file is using the same idea of the main file but this for the JOYSTICK 
def main():
    greeting_msg = input("Enter your first name: ").title()
    s.show_message(f"Hello, {greeting_msg}.", text_colour=[0, 255, 255])
    while True:
        for event in s.stick.get_events():
            if event.action == "pressed":
                t.sleep(1)
                roll_dice()


if __name__ == "__main__":
    main()