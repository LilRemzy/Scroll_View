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
<img width="270" height="555" alt="slikascroll1" src="https://github.com/user-attachments/assets/8d5a936c-aded-4279-a238-8987097ed124" />
<img width="270" height="555" alt="slikascroll2" src="https://github.com/user-attachments/assets/761a55ec-0659-4209-be35-d8f378b404fd" />
<img width="270" height="555" alt="slikascroll3" src="https://github.com/user-attachments/assets/58777f99-c2c2-4a29-9979-222c47ac9549" />

