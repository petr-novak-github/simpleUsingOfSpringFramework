# simpleUsingOfSpringFramework
This app can connect to external web API and can show informations form this external API in my web.

Tato aplikace se umi pripojit k webu weatherstack.com a umi zobrazit data o pocasi na mem webu. Zatim jen ve formatu JSON. Je nutno si vytvorit ucet na weatherstack.com a ziskat API key. Pouziva k tomu Spring framework a java.net.URI. Spring framework pouziva pro svou praci javoskou vlastnost anotace. Napriklad anotaci @RequestMapping.

Po spusteni aplikace, se spusti lokalni server na mem pocitaci.
Kdyz zadam do weboveho prohlizece localhost:8090/hello zobrazi se mnou vytvorena html stranka.
Kdyz zadam do weboveho prohlizece localhost:8090/weather/Ostrava
stahnou se mi informace z webu weatherstack.com o aktualnim pocasi a zobrazi se na mem lokalnim serveru.
Misto ostrava mohu zadat jakekoliv mesto.
Zatim se mi zobrazi informace pouze ve formatu JSON. Ty muzeme dale zpracovat v programu, aby se zobrazily tak jak chceme.
