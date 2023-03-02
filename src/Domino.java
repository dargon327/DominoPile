public class Domino {
    private int top,bottom;
    public Domino() {
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop() {
        return top;
    }
    public int getBottom() {
        return bottom;
    }
    public void setTop(int top) {
        this.top = top;
    }
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
    public String toString() {
        return "" + top + "/" + bottom;
    }
    public void flip() {
        int sub = top;
        top = bottom;
        bottom = sub;
    }
    public void settle() {
        if (bottom<top) {
            flip();
        }
    }
    public int compareTo(Domino other) {
        int thisDomino,otherDomino;
        if (top > bottom) {
            thisDomino = bottom;
        } else {
            thisDomino = top;
        }
        if (other.top > other.bottom) {
            otherDomino = other.bottom;
        } else {
            otherDomino = other.top;
        }
        if (thisDomino < otherDomino) {
            return -1;
        } else if (thisDomino > otherDomino) {
            return 1;
        } else {
            if (top < bottom) {
                thisDomino = bottom;
            } else {
                thisDomino = top;
            }
            if (other.top < other.bottom) {
                otherDomino = other.bottom;
            } else {
                otherDomino = other.top;
            }
            if (thisDomino < otherDomino) {
                return -1;
            } else if (thisDomino > otherDomino) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public int compareToWeight(Domino other) {
        int thisDomino = top + bottom;
        int otherDomino = other.top + other.bottom;
        if (thisDomino < otherDomino) {
            return -1;
        } else if (thisDomino > otherDomino) {
            return 1;
        } else {
            return 0;
        }
    }
    public boolean canConnect(Domino other) {
        if (top == other.top) {
            return true;
        } else if (top == other.bottom) {
            return true;
        } else if (bottom == other.top) {
            return true;
        } else if (bottom == other.bottom) {
            return true;
        }
        return false;
    }

}
