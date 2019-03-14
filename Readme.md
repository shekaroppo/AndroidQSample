# Android Q Beta
## What's new
- Giving users more control over location
    - All time
    - While app in use
    - Deny
- More privacy protections in Android Q
    - Users will be able to control apps' access to the Photos and Videos or the Audio collections via new runtime permissions
    - For Downloads, apps must use the system file picker, which allows the user to decide which Download files the app can access.
    - Android Q will prevent apps from launching an Activity while in the background. If your app is in the background and needs to get the user's attention quickly -- such as for incoming calls or alarms -- you can use a high-priority notification and provide a full-screen intent.
    - We're limiting access to non-resettable device identifiers, including device IMEI, serial number, and similar identifiers.
    - Randomizing the device's MAC address when connected to different Wi-Fi networks by default -- a setting that was optional in Android 9 Pie.
- New ways to engage users
    - Foldables and innovative new screens
        - Android Emulator to support multiple-display type switching TBD
    - Sharing shortcuts
        - Let users jump directly into another app to share content Sample: https://github.com/googlesamples/android-SharingShortcuts
    - Settings Panels
        - A settings panel is a floating UI that you invoke from your app to show system settings that users might need, such as internet connectivity, NFC, and audio volume.
- Connectivity
    - Connectivity permissions, privacy, and security
    - Improved peer-to-peer and internet connectivity
    - Wi-Fi performance mode
- Camera, media, graphics
    - Dynamic depth format for photos
    - New audio and video codecs
    - Native MIDI API
- ANGLE on Vulkan
- Neural Networks API 1.2
- Strengthening Android's Foundations
 - ART performance
 - Security for apps
    - BiometricPrompt is unified authentication framework to support biometrics at a system level
    - Android Q adds support for TLS 1.3,
- Compatibility through public APIs
 - Modern Android: https://developer.android.com/distribute/best-practices/develop/target-sdk.html
 - Google Play will require 64-bit support in all apps.

## Resource
- https://android-developers.googleblog.com/2019/03/introducing-android-q-beta.html
- https://developer.android.com/preview/features