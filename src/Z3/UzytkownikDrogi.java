package Z3;
public abstract class UzytkownikDrogi {
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public UzytkownikDrogi(int x, int y) {
		setX(x);
		setY(y);
	}

	public void addX(UzytkownikDrogi point) {
        point.setX(point.getX());
    }

    public void minusX(UzytkownikDrogi point) {
        point.setX(point.getX());
    }

    public void addY(UzytkownikDrogi point) {
        point.setY(point.getY());
    }

    public void minusY(UzytkownikDrogi point) {
        point.setY(point.getY());
    }

}
