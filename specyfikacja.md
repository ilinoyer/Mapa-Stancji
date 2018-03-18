# Wstęp

Aplikacja internetowa umożliwiająca znalezienie mieszkania lub pokoju do wynajęcia z głównym naciskiem na lokalizację.
W internecie istnieje wiele serwisów ogłoszeniowych, jednak gdy szukamy mieszkania w konkretnej lokalizacji, przeglądanie pojedynczych ofert staje się uciążliwe.

Serwis kierowany jest dla studentów którzy nierzadko szukają tylko samego pokoju w współdzielonym mieszkaniu. Duże znaczenie na wybór lokum ma również bliskość uczelni. Dzięki serwisowi znalezienie dogodnej oferty będzie szybkie i wygodne.

Na mapę naniesione są również dodatkowe obiekty takie jak uczelnie, przystanki czy miejsca zamieszkania naszych znajomych. 

# Rozwinięcie

Aplikacja w formie strony internetowej. Głównym elementem interfejsu jest wielka interaktywna mapa na której znajdują się "pinezki" (tzw. markery) będące wyznacznikiem lokalizacji a także odnośnikiem do konkretnego ogłoszenia.

Witryna dostępna pod adresem subdomena.domena.pl, gdzie: subdomena oznacza rejon ogłoszeń
Przykład: krakow.mapastancji.pl - adres ten powinien otworzyć serwis z przybliżeniem na rejon Krakowa.

System logowania rozwiązany za pomocą integracji z serwisem Facebook. Dodawanie ogłoszeń dostępne jest po zalogowaniu.
Ogłoszenie staje się publiczne po akceptacji przez administratora w specjalnym panelu stanowiącym rozwinięcie panelu użytkownika.



# Wymagania funkcjonalne

- Aplikacja dostępna pod adresem *krakow.mapastancji.pl
  Subdomena oznacza rejon ogłoszeń. Powyższy adres powinien otworzyć serwis z przybliżeniem na rejon Krakowa.
- Aplikacja posiada panel użytkownika i panel administracyjny który jest rozszerzeniem panelu użytkownika

- Integracja serwisu z Facebook, szybkie logowanie.
  (serwis jest nowy, nie może zniechęcać użytkownika żmudnym procesem rejestracji)
  
- możliwość filtrowania wyświetlanych danych na mapie : wyświetl ikony uczelni, przystanków
- możliwość filtrowania ogłoszeń : mieszkanie/pokój(dla dziewczyny/ 1os./2os. balkon / nieprzechodni) /cena  

  FUNKCJE UŻYTKOWNIKA po zalogowaniu:
  * dodawanie ogłoszeń (wraz ze zdjęciami)
  * usuwanie ogłoszeń
  * aktywacja / dezaktywacja ogłoszenia (dane nie są usuwane z bazy)
  * edycja istniejących ogłoszeń
  * dodaj moją lokalizację
  * możliwość wyświetlenia lokalizacji znajomych (*w określonej grupie)
  
  FUNKCJE ADMINISTRATORA:
  * akceptowanie ogłoszeń
  * możliwość kasowania ogłoszeń
  * dodawanie niestandardowych markerów do mapy (prawdopodobnie przez podanie dł. szer. geograficznej)

# Zmiana styli wyświetlania map Google

Mapa posiada specjalnie zmodyfikowane style
![My image](https://i.imgur.com/JsJj18Y.png)

zmiany:
- widok zmieniony na styl "retro"
- uproszczone wyświetlanie dzielnic (Locality)
- podkolorowana woda i tereny zielone.
- ukrycie zbędnych informacji na mapie (Attraction)
- uczelnie w kolorze wypełnienia #fd9191 (School)
- obiekty sportowe w kolorze wypełnienia #ac92fc (Sports complex)
- autostrady zmiana grubości na 4 (Highway)
Niestety Uniwersytet Ekonomiczny jest dodany do Google Maps jako "business institution" a nie placówka uczelniana.

# Markery na mapie

Mapa posiadać będzie costumowe markery z biblioteki
http://map-icons.com/

![My image](https://i.imgur.com/vzwMiXy.png)

Przypadki:
- mieszkanie SQUARE_ROUNDED marker
- pokój x osobowy MAP_PIN z odpowiednią liczbą
- znajomy na mapie SQUARE_PIN ze zdjęciem profilowym znajomego

![My image](https://i.imgur.com/gKgcuOL.png)

- przystanek ROUTE z odpowiednią ikoną map-icon-transit-station
- uczelnia

Co w przypadku gdy w jednej lokalizacji są do wynajęcia 2 pokoje? (nie jako mieszkanie) lub markery nakładają się?
dodatkowy marker który "stackuje" ??

# Wygląd interfejsu

Ilustracja jest bardzo podglądowa, przedstawie wyświetlanie ogłoszenia po dodaniu
![My image](https://i.imgur.com/2mYbAvz.png)




