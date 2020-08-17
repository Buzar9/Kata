package eight;

/*
You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
If it is a square, return its area. If it is a rectangle, return its perimeter.
Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, otherwise it is a rectangle.
 */

public class AreaOrPerimeter {

    public int Solution (int l, int w) {
        return l == w ? l*l : 2 * ( l + w );
    }
}
