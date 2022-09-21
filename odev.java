
public class odev {

	public static void main(String[] args) {
		
		
		//JAVADA HELLO WORLD YAZIMI
		
		System.out.println("Merhaba java");
		System.out.println("merhaba java 2");
		
		//DEĞİŞKENLER 
		
		int ogrenciSayi = 48;
		String mesaj = "talebe sayısı : ";
		
		System.out.println(mesaj+ogrenciSayi );
		System.out.println(mesaj+ogrenciSayi);
		System.out.println(mesaj+ogrenciSayi );
		System.out.println(mesaj+ogrenciSayi);
		System.out.println(mesaj+ogrenciSayi );
		
		//VERİ TİPLERİ
		
		char karakter ='a';  // char tek karakter tutuyor.
		
		//IF BLOKLARI
		
		int sayi = 20;
		
		if(sayi<20)
			System.out.println("sayı 20 den küçüktür.");
		else if(sayi==20)
			System.out.println("sayı 20 ye eşittir.");
		else
			System.out.println("sayı 20 den büyüktür.");
		
		//Java Dersi 9 : ReCap Demo 1 En Büyük Sayı Hangisi
		
		int sayi1= 47;
		int sayi2 = 25;
		int sayi3 = 80;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2)
			enBuyuk = sayi2 ;
	
		if(enBuyuk<sayi3)
			enBuyuk = sayi3;

		
		System.out.println("en büyük sayı : "+enBuyuk);
		
		//Java Dersi 10 : Switch Bloklarıyla Çalışmak
		
		char grade = 'B';
		
		switch (grade) {
		case 'A':
			System.out.println("tebrikler geçtiniz.");
			break;
		case 'B':
			System.out.println("tebrikler 2.dereceyle geçtiniz");
			break;
		case 'C':
			System.out.println("geçtiniz 3.dereceyle.");
			break;
		case 'D':
			System.out.println("4.dereceyle geçtiniz");
			break;
		case 'F':
			System.out.println("maalesef kaldınız");
			break;
		default:
			System.out.println("geçersiz not");
		}
		
		//Java Dersi 11 : For Döngüsüyle Çalışmak
		
		for (int i=1;i<10;i=i+2)
			System.out.println(i);
			System.out.println("tek sayıların döngüsü bitti");
		
		//Java Dersi 12 : While Döngüsüyle Çalışmak
		int i=1;	
		while(i<10) {
			System.out.println(i);
			i++;     
			}
		System.out.println("while döngüsü bitti.");
		
		//Java Dersi 13 : Do-While Döngüsüyle Çalışmak
		int j = 100;
		do {
			System.out.println(j);
			j=j+2;
		}while(j<10);
		System.out.println("do-while döngüsü bitti.");
		//do-while farkı bir kere yazdırması.
		
		//Java Dersi 14 : Dizilerle Çalışmaya Başlamak
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "derin";
		ogrenciler[2] = "salih";
		ogrenciler[3] = "ahmet";
		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}
		
		System.out.println("-------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		//Java Dersi 15 : ReCap Demo 2 - Dizilerle Çalışmak
		
		double[] myList = {1.2,1.3,4.3,5.6};
		double total = 0;
		double max = myList[0];
		for(double number:myList) {
			if(max<number)
				max = number;
			total = total + number;
			System.out.println(number);
		}
		System.out.println("en büyük sayı : "+max);
		System.out.println( "toplam değeri : "+total);
		
		//Java Dersi 16 : Çok Boyutlu Dizilerle Çalışmak
		
		String[][] sehirler = new String [3][3];
		sehirler [0][0]= "İstanbul";
		sehirler [0][1]= "Bursa";
		sehirler [0][2]= "Bilecik";
		sehirler [1][0]= "Ankara";
		sehirler [1][1]= "Konya";
		sehirler [1][2]= "Kayseri";
		sehirler [2][0]= "Diyarbakır";
		sehirler [2][1]= "Şanlıurfa";
		sehirler [2][2]= "Gaziantep";
		
		for(int x = 0; x<=2;x++) {
			System.out.println("---------------");
			for(int y=0;y<=2;y++) {
				System.out.println(sehirler[x][y]);
			
				
			}
		}
		
		//Java Dersi 17 : Stringlerle Çalışmak 1
		
		String mesajj = " Bugün hava çok güzel. ";
	
		System.out.println(mesajj);
		System.out.println("Eleman Sayısı : "+mesajj.length());
		

		System.out.println("5.eleman : "+mesajj.charAt(4));
		
		System.out.println(mesajj.concat("Yaşasın bugün dışarı çıkabilirim."));
		String mesajj2 = mesajj.concat("Yaşasın bugün dışarı çıkabilirim.");
		System.out.println(mesajj2);
		
		System.out.println(mesajj.startsWith("B"));
		System.out.println(mesajj.endsWith("7"));
		
		char[] karrakterler = new char[5];
		mesajj.getChars(0, 5, karrakterler, 0);
		System.out.println(karrakterler);
		
		System.out.println(mesajj.indexOf("l"));
		
		System.out.println(mesajj.lastIndexOf("B"));
		 
		//Java Dersi 18 : Stringlerle Çalışmak 2
		
	System.out.println(mesajj.replace(' ', '-'));
	System.out.println(mesajj.substring(2,4));	
		
		
	for(String yenimesajj:mesajj.split(" ")) {	
		System.out.println(yenimesajj);
	}
		
	System.out.println(mesajj.toLowerCase());	//küçük harf yapıyo
		
	System.out.println(mesajj.toUpperCase());	//büyük yapıyo
		
	System.out.println(mesajj.trim());	//baş ve sondaki boşlukları atıyoruz.
		
		
	//Java Dersi 19 : Mini Proje 1 - Sayı Asal mı?
	
	int sayii =-1 ;
	int kalan = sayii % 2;
	boolean asallik = true;
	if(sayii==1) {
		System.out.println("sayı asal değildir");
		return;
	}
	if( sayii < 1) {
		System.out.println("geçersiz sayı girdiniz.");
		
	}
	for(int z=2;z<sayii;z++) {
		if(sayii % 2==0) {
			asallik=false;
			
		}
			
		
	}
		
		if(asallik==true) {
			System.out.println("sayı asaldır.");
		}
		else {
			System.out.println("sayı asal değildir.");
		}
		
		
//Java Dersi 20 : Mini Proje 2 - Kalın Sesli ve İnce Sesli Harfler
		
	char harf = 'A';
	
	switch (harf) {
	case 'A':
	case 'O':
	case 'U':
	case 'I':
		System.out.println("kalın sesli harf");
		break;
	default:
		System.out.println("ince sesli harf");
		
	}
		
	//Java Dersi 21 : Mini Proje 3 - Mükemmel Sayılar
		
	int say = 27;
	int ttotal = 0;
		
	for(int p = 1;p<say;p++) {
		if(say % p==0) {
			ttotal=ttotal+p;
		}
	}
		
		if(ttotal==say) {
			System.out.println("mükemmel sayı");
			
			}
		else {
			System.out.println("mükemmel sayı değildir.");
		}
		
		
		//Java Dersi 23 : Mini Proje 5 - Sayı Bulma
		
	int[]sayilarr = new int[] {1,2,5,7,9,0};
	int aranacak = 5;
	boolean varMi = false;
	 for(int sayiii:sayilarr) {
		 if(sayiii==aranacak) {
			 varMi=true;
			 break;
			 
		 }
		 
	 }
	
		if(varMi) {
			System.out.println("sayı mevcut");
		}else {
			System.out.println("sayı mevcut değildir.");

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		}	
	
	
	}
}

