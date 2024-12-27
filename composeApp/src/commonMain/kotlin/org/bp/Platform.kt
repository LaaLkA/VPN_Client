package org.bp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform