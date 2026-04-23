package com.expenseApp.db

import kotlin.Double
import kotlin.Long
import kotlin.String

public data class ExpenseEntity(
  public val id: Long,
  public val amount: Double,
  public val categoryName: String,
  public val description: String,
)
