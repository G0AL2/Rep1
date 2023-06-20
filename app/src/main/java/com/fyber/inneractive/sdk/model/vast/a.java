package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f17382a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17383b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17384c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17385d;

    public a(String str, String str2, String str3) {
        String trim = str != null ? str.trim() : null;
        this.f17382a = trim;
        String trim2 = str2 != null ? str2.trim() : null;
        this.f17383b = trim2;
        String trim3 = str3 != null ? str3.trim() : null;
        this.f17384c = trim3;
        this.f17385d = (TextUtils.isEmpty(trim) || TextUtils.isEmpty(trim2) || TextUtils.isEmpty(trim3) || !trim3.contains("[TIME]")) ? false : true;
    }
}
