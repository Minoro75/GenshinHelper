object Version {
    const val versionMajor = 1
    const val versionMinor = 0
    const val versionPatch = 5

    const val versionCode = versionMajor * 10000 + versionMinor * 1000 + versionPatch * 100
    const val versionName = "$versionMajor.$versionMinor.$versionPatch-beta"
}
