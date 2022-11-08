val salaries = Seq(20_000, 70_000, 40_000)

//Case 1
val doubleSalary = (x: Int) => x * 2
val case1Salaries = salaries.map(doubleSalary)

//Case 2
val case2Salaries = salaries.map(x => x * 2)

//Case 3
val case3Salaries = salaries.map(_ * 2)
