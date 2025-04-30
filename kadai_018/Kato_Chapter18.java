package kadai_018;

abstract public class Kato_Chapter18 {
	
	//各種フィールド作成
	public String familyName="加藤";
	public String givenName;
	public String address="東京都中野区〇×";
	
	//メソッド1 共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	
	//メソッド2 個別の紹介
	abstract void eachIntroduce();
	
	
	//メソッド3 
	public void exesIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	
	}
	
	//子クラスのメソッド
	public void setGivenName(String givenName) {
		this.givenName=givenName;
	}

}
