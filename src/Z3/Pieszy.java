package Z3;
public class Pieszy extends UzytkownikDrogi{

	public Pieszy(int x, int y) {
		super(x,y);
	}

	@Override
	public void addX(UzytkownikDrogi point) {
        point.setX(point.getX()+1);
    }

	@Override
    public void minusX(UzytkownikDrogi point) {
        point.setX(point.getX()-1);
    }

	@Override
    public void addY(UzytkownikDrogi point) {
        point.setY(point.getY()+1);
    }

	@Override
    public void minusY(UzytkownikDrogi point) {
        point.setY(point.getY()-1);
    }
}
