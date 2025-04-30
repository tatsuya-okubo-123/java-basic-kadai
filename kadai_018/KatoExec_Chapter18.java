package kadai_018;

public abstract class KatoExec_Chapter18 extends Kato_Chapter18{
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Kato_Chapter18 Ichiro=new KatoIchiro_Chapter18();
		Kato_Chapter18 Taro=new KatoTaro_Chapter18();
		Kato_Chapter18 Hanako=new KatoHanako_Chapter18();
		
		Taro.setGivenName("太郎");
		Ichiro.setGivenName("一郎");
		Hanako.setGivenName("花子");
		
		Ichiro.exesIntroduce();
        Taro.exesIntroduce();
        Hanako.exesIntroduce();



	}

}
