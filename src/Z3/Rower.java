package Z3;
public class Rower extends UzytkownikDrogi{

	public Rower(int x, int y) {
		super(x,y);
	}

	@Override
	public void addX(UzytkownikDrogi point) {
        point.setX(point.getX()+2);
    }

	@Override
    public void minusX(UzytkownikDrogi point) {
        point.setX(point.getX()-2);
    }

	@Override
    public void addY(UzytkownikDrogi point) {
        point.setY(point.getY()+2);
    }

	@Override
    public void minusY(UzytkownikDrogi point) {
        point.setY(point.getY()-2);
    }
}
