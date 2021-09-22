
public class Chapter05 {
	public static void main (String[] args) {
		
		long long1 = 92233L;
		double double1 = 22.33d;
		boolean boolean1 = true;
		
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);
		
		
		Float float2 = 5.555f;
		Integer integer2 = 5;
		Character character2 = 'う';
		
		System.out.println(float2);
		System.out.println(integer2);
		System.out.println(character2);
		
		int[] array1 = new int[5];  // 配列の宣言と生成
		array1[0] = 1;  // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[1] = 2;  
		array1[2] = 3;  
		array1[3] = 4;  
		array1[4] = 5;  
		
		int int2 = array1[3];  // インデックス番号「2」を指定して4番目の要素を取得y
		
		System.out.println(int2);

		int array2[] = null;  // []は変数名の後ろでも可
	}
}
