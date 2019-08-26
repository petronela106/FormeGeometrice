# FormeGeometrice

Sa se creeze urmatoarea structura de clase:
1. Clasa DimensiuneInvalidaException care extinde Exception, cu un constructor cu un parametru
String message care delega catre constructorul din Exception.
2. Clasa abstracta FormaGeometrica cu
a. atributul nume de tip String
b. constructor cu un parametru, de tip String, prin care se seteaza atributul nume
c. metoda abstracta getAria() care returneaza double
d. suprascrierea metodei toString() din Object pentru afisare nume forma si arie
(getAria())
3. Clasa abstracta FormaGeometrica implementeaza Comparable si determina ordinea formelor
geometrice in functie de rezultatul metodei getAria() (cele cu arie mai mica ar trebui sa apara
inaintea deloc cu arie mai mare)
4. Clasa Cerc, care extinde FormaGeometrica cu:
a. Atributul raza de tip double
b. Metoda suprascrisa getAria() care sa returneze raza * Math.PI
c. Constructor cu un parametru, double raza, care apeleaza super(“Cerc”);
d. constructorul valideaza ca raza este >= 0 inainte de asignare si altfel arunca
DimensiuneInvalidaException
e. Getter pentru campul raza
5. Clasa Patrat, care extinde FormaGeometrica cu:
a. Atributul latura de tip double
b. Metoda suprascrisa getAria() care sa returneze latura*latura
c. Constructor cu un parametru, double latura, care apeleaza super(“Patrat”);
d. constructorul valideaza ca latura este >= 0 inainte de asignare si altfel arunca
DimensiuneInvalidaException
e. Getter pentru campul latura
6. Clasa App cu o metoda main pentru executia aplicatiei:
a. Se va citi un numar de forme geometrice de la tastatura folosind Scanner
b. Se va initializa un array unidimensional de tip FormaGeometrica
c. Se va initializa un index int i = 0 si, intr-o bucla while:
i. Se va citi tipul obiectului nou creat (1- Cerc, 2- Patrat) si apoi dimensiunea.
ii. Intr-un try-catch(DimensiuneInvalidaException): se va initializa tipul de obiect
dorit in functie de ce s-a citit la pasul anterior, se va asigna pe pozitia i si se va
incrementa i.
d. Se va sorta array-ul folosind Arrays.sort()
e. Se for afisa toate elementele array-ului folosind System.out.println
