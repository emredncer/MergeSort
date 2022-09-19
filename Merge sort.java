#   [16,21,11,8,12,22] -> Merge Sort

#  1- Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
#  2- Big-O gösterimini yazınız.

#   Cevaplar
#  1- [16,21,11,8,12,22]
#   [16,21,11] - [8,12,22]
#   [16] , [21,11] - [8,12] , [22]
#   [16] , [11,21] - [8,12] , [22]
#   [16,11,21] - [8,12,22]
#   [16,11,21,8,12,22]
#  2-O(nlogn)