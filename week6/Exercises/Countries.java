// X- Gercekten karindan gormeye tahammul ettigin muamele bu mu?
// Ahmet- Asik olmasaydim katlanmazdim
// X- Bak, sen bir erkeksin dimi?
// X- Ve bana diyorsun ki...
// ... karin seni sattiginda onu isirma istegini hic hissetmiyorsun?
// Ahmet- Bilmem
public class Countries {
	// BIRILERI GIDIP DISARIDA KEYFINE CIKIP
	// GITAR CALGISI DINLEYIP SONRASINDA ARKADASLARIYLA SOHBET EDERKEN
	// BEN BURADA KOD YAZIYORUM
	// Ama en azindan 2 gunluk ML calisip beni gecebilecegimi sanmiyorum
	// :)
	// ezik de anca gezsin tozsun ileride ben en iyi yerlerde tatillere cikicam
	// SENI DE EVDE BIRAKICAM SEN DE CALISSAYDIN ZAMANINDA
	// GITTIGIM ADALARDAN SANA FOTO ATARIM HMMMPH
	public static void main(String[] args){
		String[] countries = {"China","Egypt","France","Germany","Japan"};
		String[] capitals = {"Beijing","Cairo","Paris","Berlin","Tokyo"};
		String[] languages = {"Chinese","Arabic","French","German","Japanese"};
		int rand = (int)(Math.random()*(countries.length));
		System.out.println(countries[rand] + " " + capitals[rand] + " " + languages[rand]);
	}
}