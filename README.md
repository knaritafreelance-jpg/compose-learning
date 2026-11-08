# Jetpack Compose Learning

Jetpack Compose を学ぶためのサンドボックスリポジトリです。レッスンごとに1ファイルで、アプリ上のリストから開けます。

## 使い方

1. Android Studio (最新の安定版) で、このフォルダを開く
2. Gradle Sync を実行 (Gradle Wrapper は Android Studio が生成します。必要なら `gradle wrapper` を実行)
3. エミュレーターまたは実機で `app` を実行、または各ファイルの `@Preview` を確認

## レッスン

| # | ファイル | テーマ |
|---|----------|--------|
| 01 | `Lesson01Text.kt` | Text と Modifier (順序が重要) |
| 02 | `Lesson02Layouts.kt` | Column / Row / Box、Arrangement と Alignment |
| 03 | `Lesson03State.kt` | remember、rememberSaveable、state hoisting |
| 04 | `Lesson04Lists.kt` | LazyColumn、key、リスト状態 |

場所: `app/src/main/java/com/example/composelearning/lessons/`

## レッスンの追加方法

1. `lessons/` に `LessonNN〜.kt` を作り、`@Composable` 関数を書く
2. `Lessons.kt` の `lessons` リストに1行追加する

## 次に学ぶ候補

- Navigation Compose
- ViewModel + StateFlow
- Animation (`animate*AsState`, `AnimatedVisibility`)
- Theming (Material 3 の ColorScheme / Typography)
- Side effects (`LaunchedEffect`, `DisposableEffect`)
- Compose UI テスト

## 参考

- https://developer.android.com/compose
- https://developer.android.com/courses/jetpack-compose/course
