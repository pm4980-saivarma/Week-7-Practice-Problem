# Week 7 Practice Problems

Five standalone Java solutions demonstrating encapsulation and immutability.
Each folder contains a `.java` source file and its compiled `.class` file.

| Folder | Class | Problem |
| --- | --- | --- |
| `PiggyBank` | `PiggyBank` | Add and withdraw savings without directly setting the balance. |
| `QuizScorecard` | `Scorecard` | Record quiz results privately and retrieve the total score. |
| `NicknameTag` | `NameTag` | Create an immutable nickname from a full name. |
| `LockerCode` | `Locker` | Change a locker code without exposing its current value. |
| `AttendanceSheet` | `AttendanceSheet` | Track present students without exposing the stored list. |

## Compile and run

Run these commands from the repository root. Each program includes a `main`
method demonstrating its sample behavior.

```text
javac PiggyBank/PiggyBank.java
java -cp PiggyBank PiggyBank

javac QuizScorecard/Scorecard.java
java -cp QuizScorecard Scorecard

javac NicknameTag/NameTag.java
java -cp NicknameTag NameTag

javac LockerCode/Locker.java
java -cp LockerCode Locker

javac AttendanceSheet/AttendanceSheet.java
java -cp AttendanceSheet AttendanceSheet
```
