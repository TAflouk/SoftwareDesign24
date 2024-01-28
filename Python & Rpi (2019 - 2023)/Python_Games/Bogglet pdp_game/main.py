import game_utils as gu
import ispy
import scrambler
import jotto
import bogglette
import filefuncs


modules = {
    "iSpy": ispy,
    "Bogglette": bogglette,
    "Scrambler": scrambler,
    "Jotto": jotto,
    "High Scores": filefuncs,
    "Quit": None
}
# create a list of menu items from the dict- this is used to create the Menu object
opts = list(modules.keys())


def main():
    m = gu.Menu("Fun Word Games", opts)  # create Menu obj
    while True:
        choice = m.display()  # show the title and menu
        if opts[choice] == opts[-1]:
            if m.points > 0:
                gu.ask_user_save("main", m.points)
            input("Press Enter to exit.")
            break
        elif choice in range(5):  # idx 0-4
            # pass the points from the main game to the main of the module called, 
            # and whatever that module returns, set the points to that value.
            m.points = modules[opts[choice]].main(m.points)
        else:  # this should NEVER execute but if it did....
            input("Something went mad wrong. Press any key to continue")


if __name__ == "__main__":
    main()


