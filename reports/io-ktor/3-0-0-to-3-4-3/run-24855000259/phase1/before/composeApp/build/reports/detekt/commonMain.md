# detekt

## Metrics

* 68 number of properties

* 52 number of functions

* 27 number of classes

* 12 number of packages

* 22 number of kt files

## Complexity Report

* 1,521 lines of code (loc)

* 1,378 source lines of code (sloc)

* 889 logical lines of code (lloc)

* 9 comment lines of code (cloc)

* 98 cyclomatic complexity (mcc)

* 70 cognitive complexity

* 68 number of total code smells

* 0% comment source ratio

* 110 mcc per 1,000 lloc

* 76 code smells per 1,000 lloc

## Findings (68)

### complexity, LongMethod (4)

One method should have one responsibility. Long methods tend to handle many things at once. Prefer smaller methods to make them easier to understand.

[Documentation](https://detekt.dev/docs/rules/complexity#longmethod)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/App.kt:31:5
```
The function App is too long (72). The maximum length is 60.
```
```kotlin
28 import org.koin.compose.KoinContext
29 
30 @Composable
31 fun App(configDevice: CrossConfigDevice? = null) {
!!     ^ error
32     PreComposeApp {
33         KoinContext {
34             val colors = getColorsTheme()

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:67:5
```
The function ExpensesDetailScreen is too long (84). The maximum length is 60.
```
```kotlin
64 
65 @OptIn(ExperimentalMaterialApi::class, ExperimentalComposeUiApi::class)
66 @Composable
67 fun ExpensesDetailScreen(
!!     ^ error
68     expenseToEdit: Expense? = null,
69     categoryList: List<ExpenseCategory> = emptyList(),
70     addExpenseAndNavigateBack: (Expense) -> Unit

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:161:5
```
The function ExpenseAmount is too long (69). The maximum length is 60.
```
```kotlin
158 
159 @OptIn(ExperimentalComposeUiApi::class)
160 @Composable
161 fun ExpenseAmount(
!!!     ^ error
162     priceContent: Double,
163     onPriceChange: (Double) -> Unit,
164     keyboardController: SoftwareKeyboardController?

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:51:5
```
The function ExpensesScreen is too long (61). The maximum length is 60.
```
```kotlin
48 
49 @OptIn(ExperimentalFoundationApi::class)
50 @Composable
51 fun ExpensesScreen(
!!     ^ error
52     uiState: ExpensesUiState,
53     onExpenseClick: (expense: Expense) -> Unit,
54     onDeleteExpense: (expense: Expense) -> Unit

```

### exceptions, TooGenericExceptionCaught (4)

The caught exception is too generic. Prefer catching specific exceptions to the case that is currently handled.

[Documentation](https://detekt.dev/docs/rules/exceptions#toogenericexceptioncaught)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/presentacion/ExpensesViewModel.kt:35:18
```
The caught exception is too generic. Prefer catching specific exceptions to the case that is currently handled.
```
```kotlin
32         try {
33             val expenses = repo.getAllExpenses()
34             _uiState.value = ExpensesUiState.Success(expenses, expenses.sumOf { it.amount })
35         } catch (e: Exception) {
!!                  ^ error
36             _uiState.value = ExpensesUiState.Error(e.message ?: "Ocurrio un error")
37         }
38     }

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/presentacion/ExpensesViewModel.kt:45:22
```
The caught exception is too generic. Prefer catching specific exceptions to the case that is currently handled.
```
```kotlin
42             try {
43                 repo.addExpense(expense)
44                 updateExpenseList()
45             } catch (e: Exception) {
!!                      ^ error
46                 _uiState.value = ExpensesUiState.Error(e.message ?: "Ocurrio un error")
47             }
48         }

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/presentacion/ExpensesViewModel.kt:56:22
```
The caught exception is too generic. Prefer catching specific exceptions to the case that is currently handled.
```
```kotlin
53             try {
54                 repo.editExpense(expense)
55                 updateExpenseList()
56             } catch (e: Exception) {
!!                      ^ error
57                 _uiState.value = ExpensesUiState.Error(e.message ?: "Ocurrio un error")
58             }
59         }

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/presentacion/ExpensesViewModel.kt:67:22
```
The caught exception is too generic. Prefer catching specific exceptions to the case that is currently handled.
```
```kotlin
64             try {
65                 repo.deleteExpense(id)
66                 updateExpenseList()
67             } catch (e: Exception) {
!!                      ^ error
68                 _uiState.value = ExpensesUiState.Error(e.message ?: "Ocurrio un error")
69             }
70         }

```

### naming, FunctionNaming (15)

Function names should follow the naming convention set in the configuration.

[Documentation](https://detekt.dev/docs/rules/naming#functionnaming)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/App.kt:31:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
28 import org.koin.compose.KoinContext
29 
30 @Composable
31 fun App(configDevice: CrossConfigDevice? = null) {
!!     ^ error
32     PreComposeApp {
33         KoinContext {
34             val colors = getColorsTheme()

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:9:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
6  import data.SessionCache
7  
8  @Composable
9  fun AppTheme(content: @Composable () -> Unit) {
!      ^ error
10     MaterialTheme(
11         colors = MaterialTheme.colors.copy(primary = Color.Black),
12         shapes = MaterialTheme.shapes.copy(

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/navigation/Navigator.kt:19:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
16 import ui.ExpensesScreen
17 
18 @Composable
19 fun Navigation(navigator: Navigator) {
!!     ^ error
20 
21     val colors = getColorsTheme()
22     val viewModel = koinViewModel(ExpensesViewModel::class) { parametersOf() }

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:67:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
64 
65 @OptIn(ExperimentalMaterialApi::class, ExperimentalComposeUiApi::class)
66 @Composable
67 fun ExpensesDetailScreen(
!!     ^ error
68     expenseToEdit: Expense? = null,
69     categoryList: List<ExpenseCategory> = emptyList(),
70     addExpenseAndNavigateBack: (Expense) -> Unit

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:161:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
158 
159 @OptIn(ExperimentalComposeUiApi::class)
160 @Composable
161 fun ExpenseAmount(
!!!     ^ error
162     priceContent: Double,
163     onPriceChange: (Double) -> Unit,
164     keyboardController: SoftwareKeyboardController?

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:236:13
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
233 }
234 
235 @Composable
236 private fun ExpenseTypeSelector(
!!!             ^ error
237     categorySelected: String,
238     openBottomSheet: () -> Unit
239 ) {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:275:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
272 
273 @OptIn(ExperimentalComposeUiApi::class)
274 @Composable
275 fun ExpenseDescription(
!!!     ^ error
276     descriptionContent: String,
277     onDescriptionChange: (String) -> Unit,
278     keyboardController: SoftwareKeyboardController?

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:320:13
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
317 }
318 
319 @Composable
320 private fun CategoryBottomSheetContent(
!!!             ^ error
321     categories: List<ExpenseCategory>,
322     onCategorySelected: (ExpenseCategory) -> Unit
323 ) {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:338:13
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
335 }
336 
337 @Composable
338 private fun CategoryItem(category: ExpenseCategory, onCategorySelected: (ExpenseCategory) -> Unit) {
!!!             ^ error
339     Column(
340         modifier = Modifier.fillMaxWidth().padding(8.dp).clickable {
341             onCategorySelected(category)

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:51:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
48 
49 @OptIn(ExperimentalFoundationApi::class)
50 @Composable
51 fun ExpensesScreen(
!!     ^ error
52     uiState: ExpensesUiState,
53     onExpenseClick: (expense: Expense) -> Unit,
54     onDeleteExpense: (expense: Expense) -> Unit

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:124:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
121 }
122 
123 @Composable
124 fun ExpensesTotalHeader(total: Double) {
!!!     ^ error
125     Card(shape = RoundedCornerShape(30), backgroundColor = Color.Black, elevation = 5.dp) {
126         Box(
127             modifier = Modifier.fillMaxWidth().height(130.dp).padding(16.dp),

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:143:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
140 }
141 
142 @Composable
143 fun AllExpensesHeader() {
!!!     ^ error
144     val colors = getColorsTheme()
145 
146     Row(

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:170:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
167 }
168 
169 @Composable
170 fun ExpensesItem(expense: Expense, onExpenseClick: (expense: Expense) -> Unit) {
!!!     ^ error
171     val colors = getColorsTheme()
172 
173     Card(

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/utils/SwipeToDeleteContainer.kt:35:9
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
32 
33 @OptIn(ExperimentalMaterialApi::class)
34 @Composable
35 fun <T> SwipeToDeleteContainer(
!!         ^ error
36     item: T,
37     onDelete: (T) -> Unit,
38     animationDuration: Int = 500,

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/utils/SwipeToDeleteContainer.kt:82:5
```
Function names should match the pattern: [a-z][a-zA-Z0-9]*
```
```kotlin
79 
80 @OptIn(ExperimentalMaterialApi::class)
81 @Composable
82 fun DeleteBackground(
!!     ^ error
83     swipeDismissState: DismissState
84 ) {
85     val color = if (swipeDismissState.dismissDirection == DismissDirection.EndToStart) {

```

### naming, VariableNaming (6)

Variable names should follow the naming convention set in the projects configuration.

[Documentation](https://detekt.dev/docs/rules/naming#variablenaming)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:27:9
```
Variable names should match the pattern: [a-z][A-Za-z0-9]*
```
```kotlin
24 fun getColorsTheme(): DarkModeColors {
25     val isDarkMode = SessionCache.isDarkMode()
26 
27     val Purple = Color(0xFF6A66FF)
!!         ^ error
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
30     val TextColor = if (isDarkMode) Color.White else Color.Black

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:28:9
```
Variable names should match the pattern: [a-z][A-Za-z0-9]*
```
```kotlin
25     val isDarkMode = SessionCache.isDarkMode()
26 
27     val Purple = Color(0xFF6A66FF)
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
!!         ^ error
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
30     val TextColor = if (isDarkMode) Color.White else Color.Black
31     val AddIconColor = if (isDarkMode) Purple else Color.Black

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:29:9
```
Variable names should match the pattern: [a-z][A-Za-z0-9]*
```
```kotlin
26 
27     val Purple = Color(0xFF6A66FF)
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
!!         ^ error
30     val TextColor = if (isDarkMode) Color.White else Color.Black
31     val AddIconColor = if (isDarkMode) Purple else Color.Black
32     val ColorArrowRound = if (isDarkMode) Purple else Color.Gray.copy(alpha = .2f)

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:30:9
```
Variable names should match the pattern: [a-z][A-Za-z0-9]*
```
```kotlin
27     val Purple = Color(0xFF6A66FF)
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
30     val TextColor = if (isDarkMode) Color.White else Color.Black
!!         ^ error
31     val AddIconColor = if (isDarkMode) Purple else Color.Black
32     val ColorArrowRound = if (isDarkMode) Purple else Color.Gray.copy(alpha = .2f)
33 

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:31:9
```
Variable names should match the pattern: [a-z][A-Za-z0-9]*
```
```kotlin
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
30     val TextColor = if (isDarkMode) Color.White else Color.Black
31     val AddIconColor = if (isDarkMode) Purple else Color.Black
!!         ^ error
32     val ColorArrowRound = if (isDarkMode) Purple else Color.Gray.copy(alpha = .2f)
33 
34     return DarkModeColors(

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:32:9
```
Variable names should match the pattern: [a-z][A-Za-z0-9]*
```
```kotlin
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
30     val TextColor = if (isDarkMode) Color.White else Color.Black
31     val AddIconColor = if (isDarkMode) Purple else Color.Black
32     val ColorArrowRound = if (isDarkMode) Purple else Color.Gray.copy(alpha = .2f)
!!         ^ error
33 
34     return DarkModeColors(
35         purple = Purple,

```

### style, MagicNumber (25)

Report magic numbers. Magic number is a numeric literal that is not defined as a constant and hence it's unclear what the purpose of this number is. It's better to declare such numbers as constants and give them a proper name. By default, -1, 0, 1, and 2 are not considered to be magic numbers.

[Documentation](https://detekt.dev/docs/rules/style#magicnumber)

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:20:30
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
17     amount: Double,
18     categoryName: String,
19     description: String,
20   ) -> T): Query<T> = Query(-951_371_654, arrayOf("ExpenseEntity"), driver, "expensesDb.sq",
!!                              ^ error
21       "selectAll", """
22   |SELECT *
23   |FROM ExpenseEntity

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:29:24
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
26       cursor.getLong(0)!!,
27       cursor.getDouble(1)!!,
28       cursor.getString(2)!!,
29       cursor.getString(3)!!
!!                        ^ error
30     )
31   }
32 

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:43:61
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
40     )
41   }
42 
43   public fun categories(): ExecutableQuery<String> = Query(-769_681_593, driver, "expensesDb.sq",
!!                                                             ^ error
44       "categories", """
45   |SELECT "GROCERIES" AS categoryName
46   |UNION SELECT "SNACKS"

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:61:20
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
58     categoryName: String,
59     description: String,
60   ) {
61     driver.execute(14_573_924, """
!!                    ^ error
62         |INSERT INTO ExpenseEntity (amount, categoryName, description)
63         |VALUES (?,?,?)
64         """.trimMargin(), 3) {

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:64:27
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
61     driver.execute(14_573_924, """
62         |INSERT INTO ExpenseEntity (amount, categoryName, description)
63         |VALUES (?,?,?)
64         """.trimMargin(), 3) {
!!                           ^ error
65           bindDouble(0, amount)
66           bindString(1, categoryName)
67           bindString(2, description)

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:69:19
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
66           bindString(1, categoryName)
67           bindString(2, description)
68         }
69     notifyQueries(14_573_924) { emit ->
!!                   ^ error
70       emit("ExpenseEntity")
71     }
72   }

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:80:20
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
77     description: String,
78     id: Long,
79   ) {
80     driver.execute(359_520_116, """
!!                    ^ error
81         |UPDATE ExpenseEntity
82         |SET amount = ?,
83         |    categoryName = ?,

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:86:27
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
83         |    categoryName = ?,
84         |    description = ?
85         |WHERE id = ?
86         """.trimMargin(), 4) {
!!                           ^ error
87           bindDouble(0, amount)
88           bindString(1, categoryName)
89           bindString(2, description)

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:90:20
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
87           bindDouble(0, amount)
88           bindString(1, categoryName)
89           bindString(2, description)
90           bindLong(3, id)
!!                    ^ error
91         }
92     notifyQueries(359_520_116) { emit ->
93       emit("ExpenseEntity")

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:92:19
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
89           bindString(2, description)
90           bindLong(3, id)
91         }
92     notifyQueries(359_520_116) { emit ->
!!                   ^ error
93       emit("ExpenseEntity")
94     }
95   }

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:98:21
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
95    }
96  
97    public fun delete(id: Long) {
98      driver.execute(-137_092_010, """
!!                      ^ error
99          |DELETE FROM ExpenseEntity
100         |WHERE id = ?
101         """.trimMargin(), 1) {

```

* /tmp/output/phase1/before/composeApp/build/generated/sqldelight/code/AppDatabase/commonMain/com/expenseApp/db/ExpensesDbQueries.kt:104:20
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
101         """.trimMargin(), 1) {
102           bindLong(0, id)
103         }
104     notifyQueries(-137_092_010) { emit ->
!!!                    ^ error
105       emit("ExpenseEntity")
106     }
107   }

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/App.kt:87:60
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
84                                 onClick = {
85                                     navigator.navigate("/addExpenses")
86                                 },
87                                 shape = RoundedCornerShape(50),
!!                                                            ^ error
88                                 backgroundColor = colors.addIconColor,
89                                 contentColor = Color.White
90                             ) {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:27:24
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
24 fun getColorsTheme(): DarkModeColors {
25     val isDarkMode = SessionCache.isDarkMode()
26 
27     val Purple = Color(0xFF6A66FF)
!!                        ^ error
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
30     val TextColor = if (isDarkMode) Color.White else Color.Black

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:28:50
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
25     val isDarkMode = SessionCache.isDarkMode()
26 
27     val Purple = Color(0xFF6A66FF)
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
!!                                                  ^ error
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
30     val TextColor = if (isDarkMode) Color.White else Color.Black
31     val AddIconColor = if (isDarkMode) Purple else Color.Black

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:28:73
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
25     val isDarkMode = SessionCache.isDarkMode()
26 
27     val Purple = Color(0xFF6A66FF)
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
!!                                                                         ^ error
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
30     val TextColor = if (isDarkMode) Color.White else Color.Black
31     val AddIconColor = if (isDarkMode) Purple else Color.Black

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:29:49
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
26 
27     val Purple = Color(0xFF6A66FF)
28     val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
29     val BackgroundColor = if (isDarkMode) Color(0XFF1E1C1C) else Color.White
!!                                                 ^ error
30     val TextColor = if (isDarkMode) Color.White else Color.Black
31     val AddIconColor = if (isDarkMode) Purple else Color.Black
32     val ColorArrowRound = if (isDarkMode) Purple else Color.Gray.copy(alpha = .2f)

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:133:76
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
130             )
131             Spacer(modifier = Modifier.weight(1f))
132             Button(
133                 modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(45)),
!!!                                                                            ^ error
134                 onClick = {
135                     val expense = Expense(
136                         amount = price,

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:259:57
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
256             )
257         }
258         IconButton(
259             modifier = Modifier.clip(RoundedCornerShape(35)).background(colors.colorArrowRound),
!!!                                                         ^ error
260             onClick = {
261                 openBottomSheet.invoke()
262             }

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:326:35
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
323 ) {
324     LazyVerticalGrid(
325         modifier = Modifier.padding(16.dp),
326         columns = GridCells.Fixed(3),
!!!                                   ^ error
327         verticalArrangement = Arrangement.Center,
328         horizontalArrangement = Arrangement.Center
329     ) {

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:125:37
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
122 
123 @Composable
124 fun ExpensesTotalHeader(total: Double) {
125     Card(shape = RoundedCornerShape(30), backgroundColor = Color.Black, elevation = 5.dp) {
!!!                                     ^ error
126         Box(
127             modifier = Modifier.fillMaxWidth().height(130.dp).padding(16.dp),
128             contentAlignment = Alignment.CenterStart

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:158:40
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
155             color = colors.textColor
156         )
157         Button(
158             shape = RoundedCornerShape(50),
!!!                                        ^ error
159             onClick = { //Crear click mas adelante
160             },
161             colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:178:36
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
175             onExpenseClick(expense)
176         }.testTag(EXPENSE_SCREEN_SUCCESS_CLICK_ITEM_TEST_TAG.plus("_${expense.id}")),
177         backgroundColor = colors.colorExpenseItem,
178         shape = RoundedCornerShape(30)
!!!                                    ^ error
179     ) {
180         Row(
181             modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp),

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:186:44
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
183         ) {
184             Surface(
185                 modifier = Modifier.size(50.dp),
186                 shape = RoundedCornerShape(35),
!!!                                            ^ error
187                 color = colors.purple
188             ) {
189                 Image(

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/utils/SwipeToDeleteContainer.kt:92:67
```
This expression contains a magic number. Consider defining it to a well named constant.
```
```kotlin
89     Box(
90         modifier = Modifier
91             .fillMaxSize()
92             .background(color = color, shape = RoundedCornerShape(30))
!!                                                                   ^ error
93             .padding(horizontal = 16.dp),
94         contentAlignment = Alignment.CenterEnd
95     ) {

```

### style, MaxLineLength (1)

Line detected, which is longer than the defined maximum line length in the code style.

[Documentation](https://detekt.dev/docs/rules/style#maxlinelength)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:72:1
```
Line detected, which is longer than the defined maximum line length in the code style.
```
```kotlin
69         is ExpensesUiState.Success -> {
70             if (uiState.expenses.isEmpty()) {
71                 Box(
72                     modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp).testTag(EXPENSE_SCREEN_SUCCESS_EMPTY_TEST_TAG),
!! ^ error
73                     contentAlignment = Alignment.Center
74                 ) {
75                     Text(

```

### style, NewLineAtEndOfFile (13)

Checks whether files end with a line separator.

[Documentation](https://detekt.dev/docs/rules/style#newlineatendoffile)

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/App.kt:122:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/App.kt is not ending with a new line.
```
```kotlin
119     }
120 
121     return titleTopBar.value
122 }
!!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt:52:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt is not ending with a new line.
```
```kotlin
49     val textColor: Color,
50     val addIconColor: Color,
51     val colorArrowRound: Color
52 )
!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/CrossConfigDevice.kt:5:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/CrossConfigDevice.kt is not ending with a new line.
```
```kotlin
2 
3 interface CrossConfigDevice {
4     fun isDarkModeEnabled(): Boolean
5 }
!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/DatabaseDriverFactory.kt:7:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/DatabaseDriverFactory.kt is not ending with a new line.
```
```kotlin
4  
5  expect class DatabaseDriverFactory {
6      fun createDriver(): SqlDriver
7  }
!   ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/ExpenseManager.kt:84:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/ExpenseManager.kt is not ending with a new line.
```
```kotlin
81             ExpenseCategory.OTHER,
82         )
83     }
84 }
!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/ExpenseRepoImpl.kt:112:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/ExpenseRepoImpl.kt is not ending with a new line.
```
```kotlin
109         }
110     }
111 
112 }
!!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/SessionCache.kt:13:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/SessionCache.kt is not ending with a new line.
```
```kotlin
10     fun isDarkMode(): Boolean {
11         return configDevice?.isDarkModeEnabled() ?: isSystemInDarkTheme()
12     }
13 }
!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/TitleTopBarTypes.kt:7:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/TitleTopBarTypes.kt is not ending with a new line.
```
```kotlin
4      DASHBOARD("Dashboard"),
5      ADD("Add Expense"),
6      EDIT("Edit Expense")
7  }
!   ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/domain/ExpenseRepository.kt:12:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/domain/ExpenseRepository.kt is not ending with a new line.
```
```kotlin
9      suspend fun editExpense(expense: Expense)
10     fun getCategories(): List<ExpenseCategory>
11     suspend fun deleteExpense(id: Long)
12 }
!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/presentacion/ExpensesViewModel.kt:80:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/presentacion/ExpensesViewModel.kt is not ending with a new line.
```
```kotlin
77     fun getCategories(): List<ExpenseCategory> {
78         return repo.getCategories()
79     }
80 }
!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt:354:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt is not ending with a new line.
```
```kotlin
351         )
352         Text(text = category.name)
353     }
354 }
!!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt:220:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesScreen.kt is not ending with a new line.
```
```kotlin
217             )
218         }
219     }
220 }
!!!  ^ error

```

* /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/utils/SwipeToDeleteContainer.kt:102:2
```
The file /tmp/output/phase1/before/composeApp/src/commonMain/kotlin/utils/SwipeToDeleteContainer.kt is not ending with a new line.
```
```kotlin
99              tint = Color.White
100         )
101     }
102 }
!!!  ^ error

```

generated with [detekt version 1.23.7](https://detekt.dev/) on 2026-04-23 19:52:35 UTC
