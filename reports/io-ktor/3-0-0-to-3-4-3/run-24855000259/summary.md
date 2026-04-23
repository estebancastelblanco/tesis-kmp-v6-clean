### Dependabot impact companion

- **Dependency:** `io.ktor`
- **Version change:** `3.0.0` → `3.4.3`
- **Risk:** **HIGH**
- **Recommendation:** Hold merge until impacted files are reviewed and targeted regression checks pass.
- **Static impact:** 18 files (4 direct / 14 transitive-or-expect-actual)
- **UI impact:** 15 screens
- **Dynamic analysis:** skipped
- **Full report:** generated as static artifact/site in `output/report/`

### Top impacted files

| File | Relation | Source set | RLOC | MCC |
|------|----------|------------|------|-----|
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/data/ExpenseRepoImpl.kt` | direct | commonMain | 102 | 4 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/di/appModule.kt` | direct | commonMain | 14 | 1 |
| `/tmp/output/phase1/before/tools/kmp-impact-analyzer/tests/fixtures/sample_kotlin/CommonModule.kt` | direct | common | 8 | 1 |
| `/tmp/output/phase1/before/tools/kmp-impact-analyzer/tools/kmp-impact-analyzer/tests/fixtures/sample_kotlin/CommonModule.kt` | direct | common | 8 | 1 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/AppTheme.kt` | transitive | commonMain | 45 | 11 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/ui/ExpensesDetailScreen.kt` | transitive | commonMain | 341 | 7 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/App.kt` | transitive | commonMain | 115 | 5 |
| `/tmp/output/phase1/before/composeApp/src/commonMain/kotlin/navigation/Navigator.kt` | transitive | commonMain | 49 | 3 |
| `/tmp/output/phase1/before/composeApp/src/commonTest/kotlin/ExpenseScreenUiTest.kt` | transitive | commonTest | 141 | 1 |
| `/tmp/output/phase1/before/composeApp/src/androidMain/kotlin/previews/ProjectPreviews.kt` | transitive | androidMain | 55 | 1 |
