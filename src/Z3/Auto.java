package Z3;
public class Auto extends UzytkownikDrogi{

	public Auto(int x, int y) {
		super(x,y);
	}

	@Override
	public void addX(UzytkownikDrogi point) {
        point.setX(point.getX()+3);
    }

	@Override
    public void minusX(UzytkownikDrogi point) {
        point.setX(point.getX()-3);
    }

	@Override
    public void addY(UzytkownikDrogi point) {
        point.setY(point.getY()+3);
    }

	@Override
    public void minusY(UzytkownikDrogi point) {
        point.setY(point.getY()-3);
    }
}
