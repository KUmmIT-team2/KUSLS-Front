//package com.konkuk.kusls.presentation.auth
//
//import android.content.Context
//import dagger.hilt.android.qualifiers.ApplicationContext
//import kotlinx.coroutines.flow.Flow
//import javax.inject.Inject
//
//class TokenManager @Inject constructor(@ApplicationContext private val context: Context) {
//
//    private val Context.dataStore by preferencesDataStore("user_prefs")
//    private val ACCESS_TOKEN = stringPreferencesKey("access_token")
//
//    suspend fun saveAccessToken(token: String) {
//        context.dataStore.edit { prefs ->
//            prefs[ACCESS_TOKEN] = token
//        }
//    }
//
//    val accessTokenFlow: Flow<String?> = context.dataStore.data.map { it[ACCESS_TOKEN] }
//}
