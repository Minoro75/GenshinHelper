object Version {
    const val versionMajor = 1
    const val versionMinor = 5
    const val versionPatch = 1

    const val versionCode = versionMajor * 10000 + versionMinor * 1000 + versionPatch * 100
    const val versionName = "$versionMajor.$versionMinor.$versionPatch-beta"
}
