
public class Transition {
	/**
	 * Diese Klasse repräsentiert eine Transition von einem Zustand q in einen Zustand p
	 * bei gelesenem Symbol 'symbol'.
	 */
	private String q;
	private String symbol;
	private String p;
	
	
	public Transition(String q, String symbol, String p){
		this.q=q;
		this.symbol=symbol;
		this.p=p;
	}
	
	
	public String getQ() {
		return q;
	}
	public String getSymbol() {
		return symbol;
	}
	public String getP() {
		return p;
	}
	
	

}

