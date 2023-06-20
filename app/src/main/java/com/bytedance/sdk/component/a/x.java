package com.bytedance.sdk.component.a;

import android.text.TextUtils;

/* compiled from: PermissionGroup.java */
/* loaded from: classes.dex */
public enum x {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x a(String str) {
        if (TextUtils.isEmpty(str)) {
            return PUBLIC;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals("protected", lowerCase)) {
            return PROTECTED;
        }
        if (TextUtils.equals("private", lowerCase)) {
            return PRIVATE;
        }
        return PUBLIC;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == PRIVATE ? "private" : this == PROTECTED ? "protected" : "public";
    }
}
