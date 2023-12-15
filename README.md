# Kursunterlagen f&uuml;r den Kurs 2023-2025 Systemintegration und Anwendungsentwicklung
## Klonen des Git-Repos 
0. Wechselt in den Ordner, in dem ihr das Repo haben möchtet.

`cd C:\Pfad\zum\Ordner`

1. Erstellen einer lokalen Kopie

`git clone https://github.com/kschreiblehner/bnw_23_25/`


## Tägliches Arbeiten mit Git
0. 0. Wechselt in den Ordner, in dem ihr das Repo habt.

`cd C:\Pfad\zum\Ordner`

1. Aktualisieren des Repository

`git pull`

2. Anzeigen aller Branches

`git branch -a`

4. Erstellen eines lokalen Referenzbranches.

`git checkout 2023_12_11`

Dazu muss der lokale Referenzbranch muss den Namen des Online-Branches besitzen.

ODER

`git checkout -b heutigerReferenzBranch --track origin/2023_12_11`

Falls ihr den lokalen Referenzbranch einen anderen Namen geben wollt.

5. Erstellen eines lokalen Arbeitsbranch vom lokalen Referenzbranch aus.

`git checkout -b heutigerArbeitsBranch`

Nun könnt ihr wie gewohnt damit lokal arbeiten.