# EzLog
Resusable kotlin function can help logging easier
## How to use:
#### 1: Clone this repository
```
git clone https://github.com/LilyPadTeam/EzLog.git
```
or **copy source code in `src/main.kt`.**
#### 2: Add library source code to your code
After adding this library source code to your project. Import it:
```kotlin
import com.lpteam.ezLog.*
```
Call functions with values:
```kotlin
logInfo("starting app...")
// or other function existing on source code
```
> [!NOTE]
> This repository for people who know how to use kotlin
> 
> DO NOT open any issue about why you can't use it.
## Existing function:

- `logInfo("ur message")`
- `logError("msg")`
- `logNotice("msg")`
- `logDebug("msg")`
- `logWrn("msg")`
- `customPrefixLog("prefix", "msg")`
**More!**
