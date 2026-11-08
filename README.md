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

## 参考リンク

### 公式ドキュメント

- [Compose 総合](https://developer.android.com/compose)
- [公式コース](https://developer.android.com/courses/jetpack-compose/course)
- [Codelab 一覧](https://developer.android.com/courses/pathways/compose)
- [Thinking in Compose](https://developer.android.com/develop/ui/compose/mental-model)
- [State](https://developer.android.com/develop/ui/compose/state)
- [Side-effects](https://developer.android.com/develop/ui/compose/side-effects)
- [パフォーマンス](https://developer.android.com/develop/ui/compose/performance)
- [Navigation](https://developer.android.com/develop/ui/compose/navigation)
- [アーキテクチャガイド](https://developer.android.com/topic/architecture)
- [テスト](https://developer.android.com/develop/ui/compose/testing)
- [Compose API ガイドライン](https://github.com/androidx/androidx/blob/androidx-main/compose/docs/compose-api-guidelines.md)

### 実践コード

- [Now in Android](https://github.com/android/nowinandroid) (業務構成の手本)
- [Compose Samples](https://github.com/android/compose-samples)
- [Architecture Samples](https://github.com/android/architecture-samples)

### YouTube (チャンネル名で検索)

- Android Developers (公式、Google I/O、MAD Skills)
- Philipp Lackner
- Stevdza-San
- Coding in Flow

### 日本語

- Zenn / Qiita で「Jetpack Compose」を検索
- DroidKaigi の公開セッション

### おすすめの順番

1. 公式コースと Codelab で基礎を固める
2. Thinking in Compose / State / Side-effects を読む
3. Now in Android を読んで構成を真似る
4. 動画で実践アプリを写経する
