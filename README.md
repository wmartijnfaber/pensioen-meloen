# pensioen-meloen
Ola amigos,

Bij deze de repo waar ik de geleverde case in ga maken.  Ik ga deze readme een beetje gebruiken als logfile, zo kunnen jullie zien hoe het ontwikkel (en denk proces) eeen beetje is verlopen . Zowel de front-end als back-end zullen leven in deze repo. Ik heb de opdracht een beetje doorgescand en ik ben van plan om de volgende opstelling te gaan bouwen.

Front-end
Alright, ik ga de nieuwste Angular versie gerbruiken icm met NGXS, en Material Design. Het zal geen promotie website worden voor Heineken of Nike, maar netjes genoeg voor de presentatie.  Ik doe wel even de aannamen dat jullie geloven dat ik een login scherm kan maken. Ik vind het een beetje zonde van de tijd om dat te gaan doen. Ik zal ook een paar test casejes maken om te laten zien hoe ik normaal een test opzet, maar ik ga de front-end niet helemaal aftesten. (niet het meest sexy werk)

Back-end
Hier zit natuurlijk de echte kicker. Ik heb wat ervarign met reactive programmeren (hoewel dit uit de front-end komt, en wat summier uit mijn werkzaamheden bij de NS), maar de meeste endpoints die ik heb gemaakt zijn imperatief. Na het lezen van de opdracht is het duidelijk dat er een non blockign opzet gemaakt moet worden, gezien er gebruik wordt gemaakt van een derde partij (IK VERTROUW NOOIT 3de PARTIJ CALLS :-) ). De opzet die ik wil gaan gebruiken is dus ook Spring icm met Reactor. 

Virtualisatie.
Ik probeer de test opzet te laten draaien in docker, wellicht allemaal in 1, wellicht 2 images, ff kiekn hoe het loopt.

Nou voor nu even genoeg getypt, tijd om dadelijk wat te coderen.

Ciao!


#####

Alright even een update. De grove lijn zit er nu wel een beetje in. Ja ik weet het ik heb nog niet voldoende test gemaakt (0 exact). Ik ben deze case ook niet helemaal aangevlogen zoals ik normaal werk, maar goed, we zijn nu hier. 

Momenteel zijn er 3 applicaties, frontend, backend, en een dummy backend die een random getal terug geeft. Ik zeg het eerlijk, de backend was ff geklooi met optuigen  dat zat er vooral in mn h2 database initiatie. Om 1 of andere vage reden kreeg ik de PK generatie niet helemaal lekker, enfin, koste wat tijd. 

Ik vraag me toch een beetje af of ik het goed heb gedaan. Gezien het object heb ik gekozen voor een Mono, we halen geen lijsten oid op. Ik gebruik Mono.zip omdat ik vanuit 3 bronnen (2 repo's en een externe call) 1 object ga maken, hier zit ook mijn twijfel, het voelt een beetje matig om te wachten op alle 3 de bronnen. Achteraf gezien was het makkelijker om losse calls te maken, maar dat voelde een beetje als valsspelen. 

Let aub niet op het data model, ik heb gekozen om het grof door tweeen te hakken, niet omdat het perce goed is, maar omdat ik zelf benieuwd was hoe ik dat ging oplossen. 

Eigenlijk heb ik de hele formule zoals in de case omschreven er nog niet inzitten. Komt de volgende ronde, ook staat docker nog op de planning.

Voor nu weer even genoeg, ga er morgen weer wat tijd aan besteden.

Ik hoop dat met jullie ook alles goed gaat :-)

Spater!

#### 09-02-22 ####
