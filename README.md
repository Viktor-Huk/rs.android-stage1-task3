# Task 3
:mortar_board: :mortar_board: :mortar_board: Task 3 состоит из шести задач. Все заготовки задач находятся в корне проекта в папке *src/main/kotlin*. В каждой заготовке вам дан класс с открытым методом, в который нужно написать код для решения поставленной задачи. Все - как и для Task 1 или 2.

<img alt="structure_of_tasks" src="/images/img1.PNG" />

Тесты находятся в папке *src/test/kotlin*. Тесты можно запускать различными способами. Например, выполнить таск Gradle: *Gradle -> Tasks -> verification -> test*. Тогда прогонятся все unit-тесты сразу:

<img alt="launch test via Gradle" src="/images/img_5.PNG" />

Или открыть класс с тестом и нажать на зелёный треугольник рядом с объявлением класса. Если все тесты пройдены успешно :smiley_cat:, они отмечаются зеленым значком :heavy_check_mark:, иначе :scream_cat: - красным :heavy_exclamation_mark:

:point_up: Чтобы тесты запускались без проблем:
- Используйте стабильную версию Android Studio
- Клонируйте проект через консоль и затем открывайте в студии.

В любом случае, запуск через пункт Gradle в студии или через консоль будет работать. 

Если вы пришли к выводу, что выполнили максимум того что могли сделать, то сделайте Submit задачи через 
https://app.rs.school/
</br></br>

## Условия задач

### 1) Polynomial

A polynomial function can be represented by a vector of its coefficients. For instance p(x) = 5x^3 + 2x + 3 can be described as (5, 0, 2, 3). The latter representation is more 'computational friendly', while the first representation is more human readable.

Your task is to create function, which converts array of coefficients to equation. The function takes an array with the *Int* coefficients as a parameter. The coefficients array starts with the highest degree. The function should return the polynomial in a simpel human readable form. This means you skip 0 coefficient terms completely and you not write down 1 coefficients.

Please note that numbers could be negative. In case the input array is empty, return *null*.

Here is the example:

Input array [4, 0, 5, 20] should return "4x^3 + 5x + 20".
</br></br>

### 2) Combinator

You know combinations: for example, if you take 5 cards from a 52 cards deck you have 2,598,960 different combinations.

In mathematics the number of x combinations you can take from a set of n elements is called the binomial coefficient of n and x, or more often n choose x.

HINT: one of formulas(for m = n choose x) from combinatorics could help you with solution.

You are a renowned poster designer and painter. You are asked to provide 6 posters all having the same design each in 2 colors. Posters must all have a different color combination and you have the choice of 4 colors: red, blue, yellow, green. How many colors can you choose for each poster?

The answer is two since 4 choose 2 = 6. The combinations will be: {red, blue}, {red, yellow}, {red, green}, {blue, yellow}, {blue, green}, {yellow, green}.

Now same question but you have 35 posters to provide and 7 colors available. How many colors for each poster? If you take combinations 7 choose 2 you will get 21 with the above formula. But 21 schemes aren't enough for 35 posters. If you take 7 choose 5 combinations you will get 21 too. Fortunately if you take 7 choose 3 or 7 choose 4 combinations you get 35 and so each poster will have a different combination of 3 colors or 5 colors. You will take 3 colors because it's less expensive.

Hence the problem is:

knowing m (number of posters to design), knowing n (total number of available colors), let us search x (number of colors for each poster so that each poster has a unique combination of colors and the number of combinations is exactly the same as the number of posters). In other words you should create a function which takes m(*Int*) and n(*Int*) and returns x(*Int*). Some more conditions: m >= 0 and n > 0. If many x are solutions give as result the smallest x. It can happen that when m is given at random there are no x satisfying equation (1) then return *null*.

Here's the examples:

[6, 4] would return 2

[4, 4] would return 1

[4, 2] would return *null* 
</br></br>

### 3) Array Calculator

Your task is to implement the method, which calculates a product of N integers in array.

Example:

If we have an array: [1,2,3,4,5,6,7,8,9,0] and N = 3, the result of the function should be equal 504 (7 * 8 * 9).

If we have an array: [-1, 2, -3, 4, -5, 6, -7] and N = 5, the result should be equal to 1680 (2 * 4 * -5 * 6 * -7).

• Positive, negative and zero integers are calculated.

• Non-integer values (string, etc.) should not be included in calculation.

• If N is higher than number of integers in array, include all available integers.
</br></br>

### 4) Square Decomposer

My younger sister came back home from school with the following task: given a squared sheet of paper she has to cut it in pieces which, when assembled, give squares the sides of which form an increasing sequence of numbers. At the beginning it was lot of fun but little by little we were tired of seeing the pile of torn paper. So we decided to write a program that could help us and protects trees.

Task

Given a positive integral number n, return a strictly increasing sequence (array) of numbers, so that the sum of the squares is equal to n².

If there are multiple solutions (and there will be), return as far as possible the result with the largest possible values:

Examples

decompose 11 must return [1, 2, 4, 10]. Note that there are actually two ways to decompose 11², 11² = 121 = 1 + 4 + 16 + 100 = 1² + 2² + 4² + 10² but don't return [2, 6, 9], since 9 is smaller than 10.

For decompose 50 don't return [1, 1, 4, 9, 49] but [1, 3, 5, 8, 49] since [1, 1, 4, 9, 49] doesn't form a strictly increasing sequence.

Note

Neither [n] nor [1, 1, 1, …, 1] are valid solutions. If no valid solution exists, return *null*.

The function "decompose" will take a positive *Int* n and return the decomposition of N = n² as [x1 ... xk]

If n is negative, return *null* as well.

Examples:

decompose 50 returns [1, 3, 5, 8, 49]

decompose 4 returns *null*
</br></br>

### 5) Telephone Finder

Started in 2008 and recently resurging in popularity, a game known as Number Neighbour or Text Door Neighbor has people sending a text message to phone numbers near their own.

Traditionally this was done for numbers ±1, so someone with the phone number 555-555-5555 has neighbors 555-555-5554 and 555- 555-5556.

We're going to take this a step further and think about neighbors based on a classic phone keypad.

First, let's take a look at the classic phone keypad:

<img alt="phone keypad" src="/images/PhoneKeypad.png" />

We can consider certain numbers adjacent if they appear directly next to or above/below each other. For example, 1 is adjacent to 2 and 4 (and nothing else), while 5 is adjacent to 2, 4, 6, and 8.

Let's look for phone numbers that are "neighbors" of a given phone number by having any one (and only one) of their digits be off-by-one as a number adjacent to the original.

By this definition, 555-555-5555 has both its original neighbors but also, e.g., 554-555-5555 and 555-555-5558.

Problem

Given a phone number of string from integers length N (1 ≤ N ≤ 10) as a number string (e.g. 555-555-5555 would be passed as "5555555555"), return an array of all phone numbers as number strings that would be considered neighbors of that phone number.

Examples

Given "1" returns ["2", "4"]

Given "8675309" returns ["5675309", "7675309", "9675309", "0675309", "8375309", "8575309", "8975309", "8645309", "8685309", "8672309", "8674309", "8676309", "8678309", "8675209", "8675609", "8675389", "8675306", "8675308"]

Notes

Do not wrap around a side of the keypad when finding adjacent
numbers. That is, do not consider 6 adjacent to 4 nor 0 adjacent
to 2.

Do not consider numbers that are diagonal to each other adjacent. In case input number is negative return *null*.

Do not worry about the order of number strings in the array being returned.
</br></br>


### 6) Full Binary Trees

A full binary tree is a binary tree where each node has exactly 0 or 2 children.

Return a list of all possible full binary trees with N nodes.

Each node of each tree in the answer must have its value set to 0.

You may return the final list of trees in any order.

Example:

Input: 7

Output:

[

[0,0,0,null,null,0,0,null,null,0,0],

[0,0,0,null,null,0,0,0,0],

[0,0,0,0,0,0,0],

[0,0,0,0,0,null,null,null,null,0,0],

[0,0,0,0,0,null,null,0,0]

]


For a visual explanation on the output have a look at the following example:

<img alt="example trees" src="/images/ExampleTrees.png" />

The order of images vs output lines is from left to right, from top to bottom.

Note: trailing null nodes are omitted from the output.
</br></br>
:trophy:
