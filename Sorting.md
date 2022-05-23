# Veri Yapıları ve Algoritmalar Proje

## Insertion Sort

###### [22,27,16,2,18,6] dizisinin sıralama aşamaları:

###### i:    [2,27,16,22,18,6]
###### ii:   [2,6,16,22,18,27]
###### iii:  [2,6,16,18,22,27]

###### Worst Case: Aranılan sayının her zaman en sonda olması  O(n^2)
###### Average Case: Aranılan sayının her zaman ortada olması O(n^2)
###### Best Case: Aranılan sayının en başta olduğu durumda O(n)

###### 18 Sayısı için average case uygundur

###### [7,3,5,8,2,9,4,15,6] dizisinin ilk 4 aşaması:

###### i:    [2,3,5,8,7,9,4,15,6]
###### ii:   [2,3,4,8,7,9,5,15,6]
###### iii:  [2,3,4,5,7,9,8,15,6]
###### iv:   [2,3,4,5,6,9,8,15,7]

## Merge Sort

###### [16,21,11,8,12,22] dizisinin sıralama aşamaları:
###### i:    [16,21,18][8,12,22]
###### ii:   [16][21,18][8][12,22]
###### iii:  [16][21][18][8][12][22]
###### iv:   [16][18,21][8][12,22]
###### v:    [16,18,21][8,12,22]
###### vi:   [8,12,16,18,21,22]

###### O(nlogn)


## Binary Tree

                7
            5       8
        1       6       9
    0        3
        2       4
