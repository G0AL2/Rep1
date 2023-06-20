package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.firebase.messaging.TopicOperation;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes3.dex */
final class v0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f23561d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f23562a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23563b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23564c;

    private v0(@TopicOperation.TopicOperations String str, String str2) {
        this.f23562a = d(str2, str);
        this.f23563b = str;
        this.f23564c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new v0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f23561d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f23563b;
    }

    public String c() {
        return this.f23562a;
    }

    public String e() {
        return this.f23564c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            return this.f23562a.equals(v0Var.f23562a) && this.f23563b.equals(v0Var.f23563b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f23563b, this.f23562a);
    }
}
