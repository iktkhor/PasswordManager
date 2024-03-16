package com.example.passwordsmanager

import androidx.room.Entity

@Entity
data class Site (var siteName: String = "",
                 var login: String = "",
                 var encryptPassword: String = ""
)