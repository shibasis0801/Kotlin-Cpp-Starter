package com.user.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform