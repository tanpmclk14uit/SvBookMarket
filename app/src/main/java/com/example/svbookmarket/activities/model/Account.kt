package com.example.svbookmarket.activities.model

import android.provider.ContactsContract

data class Account(var email: String, var password: String, var user: User, var listDeliverAddress: List<UserDeliverAddress>)
