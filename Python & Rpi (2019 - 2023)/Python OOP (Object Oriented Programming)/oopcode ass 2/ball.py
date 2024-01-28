# @Author:srattigan
# @Date:2021-02-01 11:19:37
# @LastModifiedBy:srattigan
# @Last Modified time:2021-02-01 11:19:37


import random as r
import math as m
import arcade


def rand_nums(lo, hi, num):
    bucket = []
    for i in range(num):
        bucket.append(r.randint(lo, hi))
    return tuple(bucket)


def are_nums(t):
    for n in t:
        if not (isinstance(n, int) or isinstance(n, float)):
            return False
    return True


def rad_from_vol(v):
    v = v / ((4 / 3) * m.pi)  # v = r^3
    r = v ** (1/3)
    return r


class Ball:
    def __init__(self, rad):
        """Constructor for class Ball

        Args:
            rad (num): the radius of the Ball instance
        Returns:
            [Ball]: a new instance of Ball
        """
        assert type(rad) is int or type(rad) is float, "Rad must be a num"
        assert rad > 0, "Radius must be a positive number"
        if rad < 1:
            rad = 1
        self.radius = rad
        self.color = rand_nums(30, 255, 3)
        self.pos = rand_nums(100, 700, 2)

    def __repr__(self):
        """A str rep of the Ball class

        Returns:
            [str]: a str showing the internals of the Ball
        """
        s = f"Ball obj: radius {self.radius}; color {self.color}; pos {self.pos}"
        return s

    def area(self):
        return 4 * m.pi * self.radius ** 2

    def volume(self):
        return (4/3) * m.pi * self.radius ** 3

    def set_pos(self, position):
        assert type(position) is tuple, "Pos must be a tuple of 2 nums"
        if len(position) == 2 and are_nums(position):
            self.pos = position
        else:
            raise ValueError("Pos must be a tuple of 2 nums")

    def set_color(self, col):
        """A setter for the color of the Ball

        Args:
            col (tuple of 3 int): an rgb color

        Raises:
            ValueError: Must be a tuple of 3 ints
        """
        assert type(col) is tuple, "Color must be a tuple of 3 nums"
        if len(col) == 3 and are_nums(col):
            self.color = col
        else:
            raise ValueError("Color must be a tuple of 2 nums")

    def __add__(self, other):
        assert isinstance(other, Ball), "Cannot add with non-Ball type"
        new_vol = self.volume() + other.volume()
        n = Ball(rad_from_vol(new_vol))
        n.set_pos(self.pos)
        return n

    def __sub__(self, other):
        new_vol = self.volume() - other.volume()
        new_vol = abs(new_vol)
        n = Ball(rad_from_vol(new_vol))
        n.pos = self.pos
        return n

    def __mul__(self, other):
        assert isinstance(other, int) or isinstance(other, float), "Other must be num"
        new_vol = self.volume() * other
        n = Ball(rad_from_vol(new_vol))
        n.pos = self.pos
        return n

    def __truediv__(self, other):
        assert isinstance(other, int) or isinstance(other, float), "Other must be num"
        new_vol = self.volume() / other
        n = Ball(rad_from_vol(new_vol))
        n.pos = self.pos
        return n

    def __eq__(self, other):
        assert isinstance(other, Ball), "Must compare with another Ball"
        return self.radius == other.radius


    def __ne__(self, other):
        assert isinstance(other, Ball), "Must compare with another Ball"
        return self.radius != other.radius

    def __gt__(self, other):
        assert isinstance(other, Ball), "Must compare with another Ball"
        return self.radius > other.radius

    def __lt__(self, other):
        assert isinstance(other, Ball), "Must compare with another Ball"
        return self.radius < other.radius

    def __ge__(self, other):
        assert isinstance(other, Ball), "Must compare with another Ball"
        return self.radius >= other.radius

    def __le__(self, other):
        assert isinstance(other, Ball), "Must compare with another Ball"
        return self.radius <= other.radius

    def draw(self):
        arcade.draw_circle_filled(self.pos[0],
                                  self.pos[1],
                                  self.radius,
                                  self.color)


if __name__ == "__main__":
    t = (1, 2, 4.8)
    print(rad_from_vol(33510.32164))
