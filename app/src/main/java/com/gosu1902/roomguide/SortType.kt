package com.gosu1902.roomguide

enum class SortType {
    FIRST_NAME,
    LAST_NAME,
    PHONE_NUMBER;

    val title: String
        get() {
            return when (this) {
                FIRST_NAME -> "First Name"
                LAST_NAME -> "Last Name"
                PHONE_NUMBER -> "Phone Number"
            }
        }
}