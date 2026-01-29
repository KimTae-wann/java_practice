package abstracts;

public class DepartmentStore extends AbstractMart{

	public DepartmentStore(int productPrice) {
		super(productPrice);
	}
	
	@Override
	public int usePoint(Guest guest) {
		int point = guest.getPoint();
		if (point >= 10000) {
			guest.usePoint(point);
			return point;
		}
		return 0;
	}
	
	@Override
	public void givePoint(Guest guest, int amount) {
		double pointPercent = 0;
		if (guest instanceof VVIP) {
			pointPercent = 3;
		}
		else if (guest instanceof VIP) {
			pointPercent = 0;
		}
		else {
			pointPercent = 0.5;
		}
		guest.addPoint((int)(amount * pointPercent * 0.01));
	}
	
	@Override
	public int discount(Guest guest, int amount) {
		double salePercent = 0;
		if (guest instanceof VVIP) {
			salePercent = 10;
		}
		else if (guest instanceof VIP) {
			salePercent = 3;
		}
		else {
			salePercent = 0;
		}
		return ((int)(amount * salePercent * 0.01));
	}

}
