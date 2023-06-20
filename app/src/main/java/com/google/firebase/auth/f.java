package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public class f {
    public static AuthCredential a(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return new EmailAuthCredential(str, str2, null, null, false);
    }

    public static AuthCredential b(String str, String str2) {
        if (EmailAuthCredential.n1(str2)) {
            return new EmailAuthCredential(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
