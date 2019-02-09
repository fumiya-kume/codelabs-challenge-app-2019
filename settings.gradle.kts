val rootModuleList = listOf(
    ":app",
    ":data"
)

rootModuleList.forEach {
    include(it)
}
