package PowerJavaCompact;

class Plain{
	private String producer, model;
	private int maxNumber;
	static int planes;
	
	public String getProducer() {		return producer;	}
	public void setProducer(String producer) {		this.producer = producer;	}
	public String getModel() {		return model;	}
	public void setModel(String model) {		this.model = model;		}
	public int getMaxNumber() {		return maxNumber;		}
	public void setMaxNumber(int maxNumber) {		this.maxNumber = maxNumber;		}
	
	Plain(){
		this.setMaxNumber(0);
		this.setModel("");
		this.setProducer("");
		planes++;
	}
	
	Plain(String pd, String md, int mN){
		this.setMaxNumber(mN);
		this.setModel(md);
		this.setProducer(pd);
		planes++;
	}
	
	static int getPlanes() {
		return planes;
	}
}

public class PlainTest {
	public static void main(String[] args) {
		Plain p1 = new Plain("1", "aa", 200);
		Plain p2 = new Plain("2", "bb", 300);
		Plain p3 = new Plain("3", "cc", 150);
		
		System.out.println("½Äº°¹øÈ£ : " + p1.getProducer() + " ¸ðµ¨ : " + p1.getModel() + " ½Â°´¼ö : " + p1.getMaxNumber());
		System.out.println("½Äº°¹øÈ£ : " + p2.getProducer() + " ¸ðµ¨ : " + p2.getModel() + " ½Â°´¼ö : " + p2.getMaxNumber());
		System.out.println("½Äº°¹øÈ£ : " + p3.getProducer() + " ¸ðµ¨ : " + p3.getModel() + " ½Â°´¼ö : " + p3.getMaxNumber());
		System.out.println(Plain.getPlanes());
	}
}
