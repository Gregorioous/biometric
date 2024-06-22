package com.ptoto.biometric

sealed interface BiometricResult {
    data object HardwareUnvalivable : BiometricResult
    data object FeatureUnvalivable : BiometricResult
    data class AuthenticationError(val error: String) : BiometricResult
    data object AuthenticationFailed : BiometricResult
    data object AuthenticationSuccess : BiometricResult
    data object AuthenticationNotSet : BiometricResult

}