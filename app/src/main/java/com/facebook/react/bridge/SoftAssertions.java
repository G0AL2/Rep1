package com.facebook.react.bridge;

/* loaded from: classes.dex */
public class SoftAssertions {
    public static void assertCondition(boolean z10, String str) {
        if (z10) {
            return;
        }
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
    }

    public static <T> T assertNotNull(T t10) {
        if (t10 == null) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return t10;
    }

    public static void assertUnreachable(String str) {
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
    }
}
