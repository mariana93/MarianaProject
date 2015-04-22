/**
 * 
 */
package ana;

/**
 * @author anha
 *
 */
public class laporan1 {

	/**
	 * @param args
	 */
	static String Praktikum = "Praktikum Pertama";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ini adalah laporan pertama PBO");
		test();
		biodata();
		penjumlahan();
		pengurangan();
		perkalian();
		pembagian();
		
		
	}
	public static void test()
	{
		System.out.println(Praktikum);
	}
	//pemanggilan biodata
	public static void biodata()
	
	{
		String nama ="Mariana";
		String nim  ="60200112085";
		String matakuliah ="PBO";
		String jurusan ="Tekhnik Informatika";
		System.out.println("Nama"+":" + nama + "\nNIM "+ ":" + nim + "\nPraktikum "+matakuliah + "\njurusan "+":"+jurusan);
	}
	//penjumlahan
	public static void penjumlahan()
	{
		int i =20;
		int j =30;
		System.out.print("hasil penjumlahan "  +i + "+" + j + "=");
		System.out.print(i+j);
		
	}
	//pengurangan
	public static void pengurangan()
	{
		int l =40;
		int k =30;
		System.out.print("\nhasil pengurangan "  +l+ "-" +k+ "=");
		System.out.print(l-k);
		
		
	}
	//perkalian
		public static void perkalian()
		{
			int m =12;
			int n =13;
			System.out.print("\nhasil perkalian "  +m+ "*" +n+ "=");
			System.out.print(m*n);
			
			
		}
		//pembagian
		public static void pembagian()
		{
			float g =60;
			float h =12;
			System.out.print("\nhasil pembagian " +g+ "/" +h+ "=");
			System.out.print(g/h);
			
			
		}
}
