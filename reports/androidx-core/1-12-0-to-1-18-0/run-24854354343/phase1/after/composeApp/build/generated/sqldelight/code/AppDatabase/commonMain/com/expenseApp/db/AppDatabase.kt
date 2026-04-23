package com.expenseApp.db

import app.cash.sqldelight.Transacter
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import com.expenseApp.db.composeApp.newInstance
import com.expenseApp.db.composeApp.schema
import kotlin.Unit

public interface AppDatabase : Transacter {
  public val expensesDbQueries: ExpensesDbQueries

  public companion object {
    public val Schema: SqlSchema<QueryResult.Value<Unit>>
      get() = AppDatabase::class.schema

    public operator fun invoke(driver: SqlDriver): AppDatabase =
        AppDatabase::class.newInstance(driver)
  }
}
