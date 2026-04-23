package com.expenseApp.db

import app.cash.sqldelight.ExecutableQuery
import app.cash.sqldelight.Query
import app.cash.sqldelight.TransacterImpl
import app.cash.sqldelight.db.SqlDriver
import kotlin.Any
import kotlin.Double
import kotlin.Long
import kotlin.String

public class ExpensesDbQueries(
  driver: SqlDriver,
) : TransacterImpl(driver) {
  public fun <T : Any> selectAll(mapper: (
    id: Long,
    amount: Double,
    categoryName: String,
    description: String,
  ) -> T): Query<T> = Query(-951_371_654, arrayOf("ExpenseEntity"), driver, "expensesDb.sq",
      "selectAll", """
  |SELECT *
  |FROM ExpenseEntity
  """.trimMargin()) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getDouble(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3)!!
    )
  }

  public fun selectAll(): Query<ExpenseEntity> = selectAll { id, amount, categoryName,
      description ->
    ExpenseEntity(
      id,
      amount,
      categoryName,
      description
    )
  }

  public fun categories(): ExecutableQuery<String> = Query(-769_681_593, driver, "expensesDb.sq",
      "categories", """
  |SELECT "GROCERIES" AS categoryName
  |UNION SELECT "SNACKS"
  |UNION SELECT "CAR"
  |UNION SELECT "COFFEE"
  |UNION SELECT "PARTY"
  |UNION SELECT "HOUSE"
  |UNION SELECT "OTHER"
  """.trimMargin()) { cursor ->
    cursor.getString(0)!!
  }

  public fun insert(
    amount: Double,
    categoryName: String,
    description: String,
  ) {
    driver.execute(14_573_924, """
        |INSERT INTO ExpenseEntity (amount, categoryName, description)
        |VALUES (?,?,?)
        """.trimMargin(), 3) {
          bindDouble(0, amount)
          bindString(1, categoryName)
          bindString(2, description)
        }
    notifyQueries(14_573_924) { emit ->
      emit("ExpenseEntity")
    }
  }

  public fun update(
    amount: Double,
    categoryName: String,
    description: String,
    id: Long,
  ) {
    driver.execute(359_520_116, """
        |UPDATE ExpenseEntity
        |SET amount = ?,
        |    categoryName = ?,
        |    description = ?
        |WHERE id = ?
        """.trimMargin(), 4) {
          bindDouble(0, amount)
          bindString(1, categoryName)
          bindString(2, description)
          bindLong(3, id)
        }
    notifyQueries(359_520_116) { emit ->
      emit("ExpenseEntity")
    }
  }

  public fun delete(id: Long) {
    driver.execute(-137_092_010, """
        |DELETE FROM ExpenseEntity
        |WHERE id = ?
        """.trimMargin(), 1) {
          bindLong(0, id)
        }
    notifyQueries(-137_092_010) { emit ->
      emit("ExpenseEntity")
    }
  }
}
