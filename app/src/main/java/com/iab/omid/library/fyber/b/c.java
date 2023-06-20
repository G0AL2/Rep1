package com.iab.omid.library.fyber.b;

import android.view.View;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.fyber.e.a f24046a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24047b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f24048c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24049d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24046a = new com.iab.omid.library.fyber.e.a(view);
        this.f24047b = view.getClass().getCanonicalName();
        this.f24048c = friendlyObstructionPurpose;
        this.f24049d = str;
    }

    public com.iab.omid.library.fyber.e.a a() {
        return this.f24046a;
    }

    public String b() {
        return this.f24047b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f24048c;
    }

    public String d() {
        return this.f24049d;
    }
}
