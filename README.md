# ScrollingText

V tej nalogi sem naredil aplikacijo ScrollingText, ki prikazuje daljši članek v drsnem pogledu. Postavitev je razdeljena na dva stolpca: ožji levi stolpec za podnaslov in širši desni stolpec za besedilo članka. Na dnu zaslona je gumb, ki ob kliku prikaže sporočilo (Toast). Spremenil sem tudi privzeto ikono aplikacije.

## Cilji

- odpreti projekt ScrollingText v Android Studiu,
- v `activity_main.xml` uporabiti `ScrollView`, ki vsebuje natanko en neposredni element, vodoravni `LinearLayout`,
- v `LinearLayout` (`android:orientation="horizontal"`) postaviti dva gradnika `TextView`: podnaslov v levi stolpec (širina `100dp`) in besedilo članka v desni, širši stolpec (`layout_width="0dp"` in `layout_weight="1"`),
- naslov članka postaviti nad `ScrollView`, da ostane vedno viden,
- na sredino spodaj dodati gumb **Add Comment**, ki ob kliku s `Toast` izpiše **Comment submitted!**,
- vsa besedila (naslov, podnaslov, članek, gumb, sporočilo) shraniti v `strings.xml` in jih v postavitvi uporabiti prek sklicev `@string/...`,
- za besedilo članka dodati `android:autoLink="web"`, da je spletni naslov povezava,
- postavitvi dodati `android:fitsSystemWindows="true"`, da vsebina ni pod kamero in vrstico stanja,
- v `themes.xml` nastaviti temo `Theme.MaterialComponents.DayNight.DarkActionBar`, da ima vrstica **Scrolling Text** modro ozadje kot naslov,
- privzeto ikono zamenjati z lastno prek orodja *Image Asset Studio* (*New → Image Asset → Launcher Icons (Adaptive and Legacy)*),
- preizkusiti aplikacijo na napravi z Androidom in preveriti, da se celotno besedilo lahko navpično premika z drsenjem.

## Zaslonske slike aplikacije
<img width="407" height="853" alt="slikascroll3" src="https://github.com/user-attachments/assets/65c3eb3a-9cf0-49f2-b013-136116242c02" />


## Odgovori na vprašanja

1. **Koliko gradnikov lahko vsebuje ScrollView?**
   b) En gradnik View ali en gradnik ViewGroup. `ScrollView` ima lahko samo enega neposrednega otroka, zato je to običajno `ViewGroup` (npr. `LinearLayout`), ki vsebuje druge gradnike.
2. **Kateri XML atribut v LinearLayoutu uporabite, da se gradniki prikažejo drug ob drugem?**
   a) `android:orientation="horizontal"`
3. **Kateri XML atribut uporabite za določitev širine LinearLayouta znotraj drsnega pogleda?**
   b) `android:layout_width="match_parent"`

## Namestitev na telefon

1. V Android Studiu: *Build → Build Bundle(s) / APK(s) → Build APK(s)*.
2. Datoteka `app-debug.apk` je v mapi `app/build/outputs/apk/debug/`.
3. APK prenesem na telefon z Androidom in ga odprem (dovolim *Namestitev neznanih aplikacij*) ali ga namestim z ukazom `adb install -r app-debug.apk`.
