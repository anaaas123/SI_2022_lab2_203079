# SI_2022_lab2_203079
# Ana Servinovska 203079
1.CFD graph  ![cfd](https://user-images.githubusercontent.com/100706237/170230691-86adbb6d-6f98-4c3a-8516-25261534786e.jpg)
2.Цикломатска сложеност на делот за код е квантитативна мерка за бројот на линеарно независни патеки во него.
Цикломатската комплексност на овој код е 8, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=8, па цикломатската комплексност изнесува 9.

3.Every Statement    ![Screenshot (645)](https://user-images.githubusercontent.com/100706237/170249342-4fe521b7-42bc-4171-a917-e816d89a07d5.png)
4.Every Branch       ![Screenshot (647)](https://user-images.githubusercontent.com/100706237/170249412-66e52360-1195-49b1-ade8-f73bfc69fedc.png)
5.И со двата критериуми ги тестираме истите тест случаи.Имаме три тест случаи кои најпрво е празната листа која ќе врати исклучок одма по проверката дали големината на листата е поголема или еднаква на 0.Потоа во вториот тест случај условот rootOfN * rootOfN  != n не е исполнет и враќа исклучок.Во третиот случај имаме листа 
list = [ # 0 0 # # # # # 0 0 # # # 0 0 # # # 0 0 0 0 # # # ] која како матрица е претставена:
# 0 0 # #
# # # 0 0
# # # 0 0
# # # 0 0
0 0 # # #
треба да ја врати финалната листа: [ # 2 2 # # # # # 2 1 # # # 1 0 # # # 2 1 1 2 # # # ]
Финалната листа претставена како матрица е:
# 2 2 # #
# # # 2 1
# # # 1 0
# # # 2 1
1 2 # # #
            
