package com.google.android.ads.mediationtestsuite.viewmodels;

import com.google.android.ads.mediationtestsuite.viewmodels.e;

/* compiled from: InfoLabelViewModel.java */
/* loaded from: classes2.dex */
public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private String f20957a;

    /* renamed from: b  reason: collision with root package name */
    private String f20958b;

    /* renamed from: c  reason: collision with root package name */
    private TestState f20959c;

    public d(String str, String str2) {
        this(str, str2, null);
    }

    public String a() {
        return this.f20958b;
    }

    public TestState b() {
        return this.f20959c;
    }

    public String c() {
        return this.f20957a;
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.e
    public e.a f() {
        return e.a.INFO_LABEL;
    }

    public d(String str, String str2, TestState testState) {
        this.f20957a = str;
        this.f20958b = str2;
        this.f20959c = testState;
    }
}
